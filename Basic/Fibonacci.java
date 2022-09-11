import java.util.Scanner;

class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("How many elements: ");
    int n = sc.nextInt();
    int e1, e2, temp;
    e1 = 0;
    e2 = 1;
    System.out.print(e1 + " " + e2 + " ");
    for (int i = 0; i < n - 2; i++) { // n-2 because already 2 elements are printed above
      temp = e1 + e2;
      System.out.print(temp + " ");
      e1 = e2;
      e2 = temp;
    }
    sc.close();
  }
}
