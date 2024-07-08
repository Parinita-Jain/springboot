//this interface containing only one method 
//is called functional interface
@FunctionalInterface
interface Messaging{
    void createMessage();
}

//1. Implementation to the method of the functional interface
//using normal class that implements the interface

class MessagingImpl implements Messaging{
    @Override
    public void createMessage() {
        System.out.println("Message created in the normal class");
    }
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        MessagingImpl m = new MessagingImpl();
        m.createMessage();

        //2. Implemention to the method of the functional
        //interface using anonymous class
        //Here m1 is referring to the object of the 
        //nameless/anonymous class that implements
        //Messaging interface
        Messaging m1 = new Messaging() {
            @Override
            public void createMessage() {
                System.out.println("Message created in the anonymous class");
            }
        };

        m1.createMessage();

        //Normal class and Anonymous class can be used 
        //to implement any interface not restricted on
        //functional interface
    }
}
