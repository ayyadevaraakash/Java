import java.util.Scanner;

public class Hcf {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter A: ");
    int a = sc.nextInt();
    System.out.print("Enter B: ");
    int b = sc.nextInt();
    if (a == 0 && b == 0) {
      System.out.println("Not Defined");
    } else if (a == 0 || b == 0) {
      System.out.println("GCD is " + ((a == 0) ? b : a));
    } else {
      int min = (a < b) ? a : b;
      while (!(a % min == 0 && b % min == 0)) {
        min--;
      }
      System.out.println("GCD is " + min);
    }
    sc.close();
  }
}
