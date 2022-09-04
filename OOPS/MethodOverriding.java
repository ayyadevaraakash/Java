class A {
    void doSomething() {
        System.out.println("I like Algebra");
    }
}

class B extends A {
    @Override
    void doSomething() {
        System.out.println("Ah method with a same name. Anyways, I like geometry");
    }
}

class MethodOverriding {
    public static void main(String[] args) {
        B object1 = new B();
        object1.doSomething();
    }
}
