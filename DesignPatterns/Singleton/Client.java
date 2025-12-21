// author: redshock (Akash Ayyadevara)

// Singleton Design Pattern

/*

We want that in the entire application, there should be a single bean of a class so in such scenarios we implement singleton design pattern.

How to make?

First we will see, what are the issues because of which objects gets created multiple times

1. Constructor ----> so we will make it private so that no one can create objects

Now if constructor is private so how will other people create objects?
-> they have to use the getter of our class

Also, if we create object in getter so if they call getter 100 times, object will be created 100 times. So we need to check this as well

*/

// Implementation 1

/*

LAZY Initialization - Object was created when client requested it for the first time

*/

/*
class Resource {
    private static Resource resource = null;

    private Resource() {}

    public static Resource getResource() {
        if (resource == null) {
            resource = new Resource();
        }
        return resource;
    }
}

public class Client {
    public static void main(String args[]) {
        Resource r1 = Resource.getResource();
        System.out.println(r1.hashCode());

        Resource r2 = Resource.getResource();
        System.out.println(r2.hashCode());
    }
}
*/

// Implementation 2

/*

Eager Initialization - Object was created the moment class was loaded in the application

*/


/*
class Resource {
    private static Resource resource = new Resource();

    private Resource() {}

    public static Resource getResource() {
        return resource;
    }
}

public class Client {
    public static void main(String args[]) {
        Resource r1 = Resource.getResource();
        System.out.println(r1.hashCode());

        Resource r2 = Resource.getResource();
        System.out.println(r2.hashCode());
    }
}
*/

// Implementation 3 (For Mulithreaded Environment)

class Resource {
    private static Resource resource = null;

    private Resource() {}

    public static Resource getResource() {
        if (resource == null) {
            synchronized(Resource.class){
                if (resource==null) {
                    resource = new Resource();
                }
            }
        }
        return resource;
    }
}

// I am not creating two threads and making them create the resource.. You can do it, cause it's simple

public class Client {
    public static void main(String args[]) {
        Resource r1 = Resource.getResource();
        System.out.println(r1.hashCode());

        Resource r2 = Resource.getResource();
        System.out.println(r2.hashCode());
    }
}
