package loose_coupling;

/*
This code demonstrates loose coupling in a simple way:

- msgService is an interface (a blueprint) that defines how to send a message, but doesn't specify if it's an email or SMS.
- emailService and smsService are concrete classes that implement this interface – one sends emails, the other sends SMS.
- msgProcessor is a class that processes messages. It doesn't create or know about specific services (like email or SMS). Instead, it accepts any object that follows the msgService interface through its constructor (this is called dependency injection).
- In the main method, we create msgProcessor objects and "inject" either an emailService or smsService into them. The processor then calls the same method (sendMsg) on whatever service it was given.

Why is this loose coupling?
The msgProcessor is not tightly tied to any specific service. If you want to add a new way to send messages (like WhatsApp), you just create a new class that implements msgService and inject it into msgProcessor – no changes needed to the processor itself. The parts are independent and flexible, so changes in one don't break the others. This makes the code easier to maintain and extend.
*/

public class main {

    public static void main(String[] args) {
        emailService e = new emailService();
        smsService s = new smsService();

        msgProcessor m = new msgProcessor(e);
        msgProcessor m1 = new msgProcessor(s);
        m.process("hello world");
        m1.process("hello world");
    }

}
