public class transport{
    public static void main(String[] args) {
        Transport t;

        t = new Truck();
        t.deliver();

        t = new Ship();
        t.deliver();

        t = new Airplane();
        t.deliver();
    }
}

class Transport {
    public void deliver() {
        System.out.println("Generic transport delivery");
    }
}

class Truck extends Transport {
    public void deliver() {
        System.out.println("Truck delivering goods by road");
    }
}

class Ship extends Transport {
    public void deliver() {
        System.out.println("Ship delivering goods by sea");
    }
}

class Airplane extends Transport {
    public void deliver() {
        System.out.println("Airplane delivering goods by air");
    }
}