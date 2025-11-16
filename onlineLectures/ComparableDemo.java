import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return name + " " + roll;
    }

    @Override
    public int compareTo(Student b) {
        Student a = this;
        // ASCENDING order of ROLL number
        return Integer.compare(a.roll, b.roll);

        // DESCENDING order of ROLL number
//        return Integer.compare(b.roll, a.roll);

        // ASCENDING order of name
//        return a.name.compareTo(b.name);

        // DESCENDING order of name
//        return b.name.compareTo(a.name);
    }
}

public class ComparableDemo {
    public static void main(String[] args) {

        Student s1 = new Student("akash", 21);
        Student s2 = new Student("ruchi", 17);
        Student s3 = new Student("bharath", 7);

        List<Student> ds = Arrays.asList(s1, s2, s3);
        Collections.sort(ds);
        System.out.println(ds);


//        List<Integer> ds1 = Arrays.asList(2,1,7,3,5,4);
//        Collections.sort(ds1);
//        System.out.println(ds1);
    }
}
