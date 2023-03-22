FROM amazoncorretto:17

WORKDIR /app

COPY twilio-9.2.5-jar-with-dependencies.jar .

COPY SendSmsMessage.java .

RUN javac -cp twilio-9.2.5-jar-with-dependencies.jar SendSmsMessage.java

CMD java -cp .:twilio-9.2.5-jar-with-dependencies.jar SendSmsMessage
