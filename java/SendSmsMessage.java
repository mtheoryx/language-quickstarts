// Install the Java helper library from twilio.com/docs/java/install

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SendSmsMessage {
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");
    public static final String TWILIO_PHONE_NUMBER = System.getenv("TWILIO_PHONE_NUMBER");
    public static final String MY_PHONE_NUMBER = System.getenv("MY_PHONE_NUMBER");

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(MY_PHONE_NUMBER), //TO
                new com.twilio.type.PhoneNumber(TWILIO_PHONE_NUMBER), //FROM
                "This sms message was sent by the Twilio Java SDK!")
            .create();

        System.out.println(message.getSid());
    }
}
