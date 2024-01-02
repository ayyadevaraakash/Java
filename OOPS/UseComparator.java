import java.util.Arrays;

class Student {
  String name;
  int marks;
  int age;

  Student(String name, int marks, int age) {
    this.name = name;
    this.marks = marks;
    this.age = age;
  }

  @Override
  public String toString() {
    return "{" +
        " name='" + name + "'" +
        ", marks='" + marks + "'" +
        ", age='" + age + "'" +
        "}";
  }

}

public class UseComparator {
  public static void main(String[] args) {
    Student[] students = new Student[3];
    students[0] = new Student("Akash", 560, 23);
    students[1] = new Student("Sneha", 600, 22);
    students[2] = new Student("Jitendra", 520, 20);

    Arrays.sort(students, (a, b) -> b.marks - a.marks);

    for (Student s : students) {
      System.out.println(s.toString());
    }
  }
}

// Notes

/*
 * 1. (a, b) -> a - b single line comparator is the most simplest kind of
 * comparator
 * 2. Comparators only work with objects. So convert all primitive data type
 * containers into objects via wrapper class
 */