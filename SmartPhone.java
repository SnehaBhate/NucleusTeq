/*Create a class phone which is having to method call() and sms(), create an interface camera which having abstract method click() and record(), create another interface MusicPlayer having abstract class play() and stop() method.

Create concrete class SmartPhone which extends class phone and implements interface camera and MusicPlayer and display all the mentioned method by creating object and references*/

class Phone {

    public void call() {

        System.out.println("Calling..");
    }

    public void sms() {
        System.out.println("Messsage Sending..");
    }

}

interface Camera {

    void click();

    void record();

}

interface MusicPlayer extends Camera {

    void play();

    void stop();

}

public class SmartPhone extends Phone implements MusicPlayer {

    public void click() {
        System.out.println("Clicked");
    }

    public void record() {
        System.out.println("Recording");
    }

    public void play() {
        System.out.println("Music is Playing");
    }

    public void stop() {
        System.out.println("Music has been stoppped");

    }

    public static void main(String args[]) {
        SmartPhone obj = new SmartPhone();

        obj.call();
        obj.sms();
        obj.click();
        obj.record();
        obj.play();
        obj.stop();
    }
}