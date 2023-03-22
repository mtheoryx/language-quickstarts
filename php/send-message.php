<?php

// Update the path below to your autoload.php,
// see https://getcomposer.org/doc/01-basic-usage.md
require_once './vendor/autoload.php';

use Twilio\Rest\Client;

// Find your Account SID and Auth Token at twilio.com/console
// and set the environment variables. See http://twil.io/secure
$sid = getenv("TWILIO_ACCOUNT_SID");
$token = getenv("TWILIO_AUTH_TOKEN");
$from = getenv("TWILIO_PHONE_NUMBER");
$to = getenv("MY_PHONE_NUMBER");

$twilio = new Client($sid, $token);

$message = $twilio->messages
	->create($to, // to
		[
				"body" => "This SMS was sent using the Twilio SDK for PHP!",
				"from" => $from
		]
	);

print($message->sid);
