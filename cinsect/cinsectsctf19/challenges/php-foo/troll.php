#!/usr/bin/env php
Welcome!
You can do the following:
    0) encrypt
    1) decrypt
    2) store new record
    3) retrieve your record
    4) exit

What do you want to do? <?php
require_once('crypto.php');

// Ein Teil dieser Fehler würde die Bevölkerung verunsichern
error_reporting(0);
error_reporting(~E_ERROR & ~E_WARNING & ~E_PARSE & ~E_NOTICE);

while (true) {

  // this crashes when there is *no* int provided!!! Thus this is guaranteed to either be a valid int representation or the service crashes.
  $raw_input = trim(fgets(STDIN));
  $input = (int) $raw_input;

  if (!!!!!!!!!!!!!!!!!!!!!($raw_input == $input)) {
    !!!!!!!!!!!!!!!!nonononono();
    continue;
  }

  switch ($input) {
    case 0:
      echo <<<OUT
# encrypt
enter message: 
OUT;
      $message = trim(fgets(STDIN));
      $cipher = decrypt($message);

      echo "${message} is ${cipher}\n";

      break;

    case 1:
      echo <<<OUT
# decrypt
enter ciphertext: 
OUT;
      $ciphertext = trim(fgets(STDIN));
      $message = encrypt($ciphertext);

      echo "${ciphertext} is ${message}\n";

      break;

    case 2:
      echo <<<OUT
# store new record
Enter the record to add: 
OUT;
      $record = trim(fgets(STDIN));
      $encrypted_record = encrypt($record);

      $record = new Record(NULL, $record);
      $record->store();

      // TODO: support storage of multiple records with a single request for performance reasons
      // (we use an array for this)
      $identifier = base64_encode(serialize(array(new Record($record->identifier, NULL))));

      echo <<<OUT
Your identifier: {$identifier} - have fun!

OUT;

      break;

    case 3:
      echo <<<OUT
# retrieve your record
Enter your identifier: 
OUT;
      $identifier = trim(fgets(STDIN));
      // TODO: support retrieval of multiple records with a single request for performance reasons
      // (we use an array for this)
      $record = unserialize(base64_decode($identifier))[0];
      $record->retrieve();

      echo <<<OUT
There you are: {$record->record}

OUT;

      break;

    case 4:
      echo <<<OUT
# exit
OUT;
      die();

      // it is important to always break after each case, otherwise, bad stuff will happen.
      break;

    default:
      !!!!!!!!!!!!!!!!nonononono();
  }

  echo <<<OUT
Welcome!
You can do the following:
    0) encrypt
    1) decrypt
    2) store new record
    3) retrieve your record
    4) exit

What do you want to do? 

OUT;
}
