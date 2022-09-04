// Abstract Class
abstract class Bike {
    abstract void applyBrake();
}

// Different Implementations are possible through abstraction. Also helps in hiding unnecessary details
class MountainBike extends Bike {
    void applyBrake() {
        System.out.println("Implementation of MountainBike's Brake");
    }
}

class UtilityBike extends Bike {
    void applyBrake() {
        System.out.println("Implementation of UtilityBike's Brake");
    }
}

// Main
class Abstraction {
    public static void main(String[] args) {
        MountainBike object1 = new MountainBike();
        UtilityBike object2 = new UtilityBike();
        object1.applyBrake();
        object2.applyBrake();
    }
}
