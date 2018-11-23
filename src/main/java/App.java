/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile("Mobile","color", "brand");
        mobile.printMsg("__I am a mobile__");
        mobile.printBasicInformation();

        System.out.println("---------------");
        Mobile iphone = new IPhone("Iphone","white", "Apple");
        iphone.printMsg("__I am a iphone__");
        iphone.printBasicInformation();
        iphone.printMsg("__I am a iphone__"+" a very long msg");

        System.out.println("---------------");
        Mobile andriod = new Andriod("Andriod","black", "Samsung");
        andriod.printMsg("__I am a andriod__");
        andriod.printBasicInformation();
        andriod.printMsg("__I am a andriod__"+" a very long msg");

        System.out.println("---------------");
        Person person = new Person("Person",iphone);
        person.call();
        person.setMobile(andriod);
        person.call();

        System.out.println("---------------");
        IphoneRobot iphoneRobot = new IphoneRobot("IphoneRobot",(IPhone)iphone);
        iphoneRobot.call();
    }
}


