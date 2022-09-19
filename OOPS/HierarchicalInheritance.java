// Simple Demonstration
class A {

  void breathe() {
    System.out.println("I'm breathing");
  }

}

class Human extends A {

  void speakEnglish() {
    System.out.println("I can speak english");
  }

}

class Animal extends A {

  void detectEnergy() {
    System.out.println("I can detect different forms of energy");
  }

}

public class HierarchicalInheritance {
  public static void main(String[] args) {
    Human euler = new Human();
    euler.breathe();
    euler.speakEnglish();

    Animal dusky = new Animal();
    dusky.breathe();
    dusky.detectEnergy();

  }
}
