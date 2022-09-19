// Simple Demonstration
class A {

  void drink() {
    System.out.println("I can drink");
  }

}

class B extends A {

  void eat() {
    System.out.println("I can eat");
  }

}

class Human extends B {

  void walk() {
    System.out.println("I can walk");
  }

}

class MultilevelInheritance {
  public static void main(String[] args) {
    Human jacob = new Human();
    jacob.drink();
    jacob.eat();
    jacob.walk();
  }
}
