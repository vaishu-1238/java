public class Cellphone {
    void ring() {
        System.out.println("ringing...");
    }
    void vibrate() {
        System.out.println("vibrating...");
    }
    void call() {
        System.out.println("calling...");
    }
    void turnOn() {
        System.out.println("turning on...");
    }
    public static void main(String[] args) {
        Cellphone myPhone = new Cellphone();
        myPhone.turnOn();
        myPhone.ring();
        myPhone.vibrate();
        myPhone.call();
    }
}