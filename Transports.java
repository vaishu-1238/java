public class Transports {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.move();
        bus.carryPassengers();

        Truck truck = new Truck();
        truck.move();
        truck.carryGoods();
    }
}

class Transport {
    public void move() {
        System.out.println("Transport is moving");
    }
}

class Bus extends Transport {
    public void carryPassengers() {
        System.out.println("Bus is carrying passengers");
    }
}

class Truck extends Transport {
    public void carryGoods() {
        System.out.println("Truck is carrying goods");
    }
}