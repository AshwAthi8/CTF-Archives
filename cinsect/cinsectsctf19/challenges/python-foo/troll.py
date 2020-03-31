#!/usr/bin/env python3
import os
import sys

from crypto import *
from string import digits
from time import time
from typing import Iterable
from uuid import uuid4

import fasteners


@fasteners.interprocess_locked('lock-file')
def store_record(record: str):
    global RECORDS

    # for security reasons, records are stored encrypted on disk and in memory.
    identifier = str(uuid4())

    encrypted_record = ':'.join((str(time()), encrypt(record)))

    # maybe a bit has flipped due to aliens or something like that.
    RECORDS = load_or_initialize_records()

    records_2 = load_or_initialize_records()
    records_3 = load_or_initialize_records()
    records_4 = load_or_initialize_records()

    # these aliens are very rude, sometimes. better safe than sorry
    try:
        assert RECORDS == records_2 == records_3 == records_4, 'there are aliens'
    except AssertionError:
        debug(2)  # write operation

    RECORDS[identifier] = encrypted_record

    now = time()
    with open('records', 'w') as records_file:
        records_file.write('\n'.join([
            ','.join((identifier, record)) for identifier, record in RECORDS.items()
            if now - float(record.split(':')[0]) <= 20 * 60
        ]))

    print(f'Your identifier: {identifier} - have fun!')


@fasteners.interprocess_locked('lock-file')
def load_records() -> Iterable[str]:
    if not os.path.isfile('records'):
        return []

    with open('records', 'r') as records_file:
        records = records_file.read().split('\n')
        # for record in records:
        #    try:
        #        yield decrypt(record)
        #    except:
        #        continue
        return records


def load_or_initialize_records():
    try:
        return dict(
            record.split(',') for record in load_records()
        )
    except:
        return {}


RECORDS = load_or_initialize_records()


def debug(op: int):
    print('operation: ', op)
    print('Global variables:')
    print('\n'.join(
        f'{k}: {v}'
        for k, v in globals().items()
        # make sure that we do not leak the key
        if k.isupper() and k != 'KEY'))


def navigation():
    print('Welcome!')

    print('''You can do the following:
    0) encrypt
    1) decrypt
    2) store new record
    3) retrieve your record
    4) exit
    ''')

    op = input('What do you want to do? ')

    if any(c not in digits for c in op):
        print('No, you cannot do that.')
        return

    try:
        op = int(op)
    except ValueError:
        print('No, you cannot do that.')
        return

    if op > 4:
        print('No, you cannot do that.')
        return

    if op == 0:
        print('# encrypt')
        message = input('enter message: ')
        try:
            print(f'{message} is {encrypt(message)}')
        except:
            print('No, you cannot do that.')
            return
    elif op == 1:
        print('# decrypt')
        ciphertext = input('enter ciphertext: ')
        try:
            print(f'{ciphertext} is {decrypt(ciphertext)}')
        except:
            print('No, you cannot do that.')
            return
    elif op == 2:
        print('# store new record')
        record = input('Enter the record to add: ')

        try:
            store_record(record)
        except:
            print('No, you cannot do that.')
            return
    elif op == 3:
        print('# retrieve your record')
        identifier = input('Enter your identifier: ')

        try:
            record = RECORDS[identifier].split(':', maxsplit=1)[1]
            print(f'There you are: {decrypt(record)}')
        except:
            print('No, you cannot do that.')
            return

    elif op == 4:
        print('# exit')
        sys.exit(0)
    else:
        print('Hrm. This should not happen. Debugging information:')
        debug(op)


if __name__ == '__main__':
    while True:
        navigation()
