<?php
$PAID_SOFTWARE_PATH = __DIR__ . '/military-grade-licensed.db';
$RECORDS_PATH = __DIR__ . '/records.db';

$software_db = new SQLite3("${PAID_SOFTWARE_PATH}");
$records_db = new SQLite3("${RECORDS_PATH}");
$crypto_name = 'AES';

// load the enterprise-ready code that we have paid a lot of money for
eval(base64_decode($software_db->querySingle("SELECT code FROM proprietary_software WHERE name = '$crypto_name'")));

$secret_key = $software_db->querySingle("SELECT code FROM proprietary_software WHERE name = 'KEY'");

eval(base64_decode('ZnVuY3Rpb24gYWVzMjU2KCRpbikgeyByZXR1cm4gc3RyX3JvdDEzKCRpbik7IH0K'));

function encrypt($message) {
  global $secret_key;

  return aes256_encrypt($secret_key, $message);
}

function decrypt($message) {
  global $secret_key;

  return aes256_decrypt($secret_key, $message);
}


function nonononono() {
  echo "No, you cannot do that.\n";
}


class Record {
  public function __construct($identifier, $record) {
    if ($identifier === NULL) {
      $this->record = $record;
      $this->_generate_identifier();
    } else {
      $this->identifier = $identifier;
    }
  }

  public function store() {
    global $records_db;

    $this->time = time();
    $this->writeQuery = "INSERT INTO record VALUES ('{$this->identifier}', '{$this->record}', '{$this->time}');";
    $records_db->exec($this->writeQuery);
  }

  public function retrieve() {
    global $records_db;

    $query = $records_db->prepare('SELECT record FROM record WHERE identifier=:identifier');
    $query->bindValue(':identifier', $this->identifier);
    $result = $query->execute();
    $this->record = $result->fetchArray()[0];
  }

  private function _generate_identifier() {
    $data = openssl_random_pseudo_bytes(16);
    $data[6] = chr(ord($data[6]) & 0x0f | 0x40);
    $data[8] = chr(ord($data[8]) & 0x3f | 0x80);
    $this->identifier = vsprintf('%s%s-%s-%s-%s-%s%s%s', str_split(bin2hex($data), 4));
  }

  /**
  // we should not implement a destruct! Otherwise, using unserialize may get insecure ...
  // (luckliy, it is perfectly secure to use unserialize with user-provided content when there is no destruct method)
  public function __destruct() {
  }
  */
}
