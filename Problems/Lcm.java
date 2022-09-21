import java.util.Scanner;

public class Lcm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter A: ");
    int a = sc.nextInt();
    System.out.print("Enter B: ");
    int b = sc.nextInt();
    if (a == 0 || b == 0) {
      System.out.println("Not Defined");
    } else {
      int max = a > b ? a : b;
      while (!(max % a == 0 && max % b == 0)) {
        max++;
      }
      System.out.println("LCM is " + max);
    }
    sc.close();
  }
}
