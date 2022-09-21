import java.util.Scanner;

public class Fascinating {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] occurence = new int[9];
    System.out.print("Enter any positive number: ");
    int inputNumber = sc.nextInt();
    int timesTwo = inputNumber * 2;
    int timesThree = inputNumber * 3;
    String concatAll = String.valueOf(inputNumber) + String.valueOf(timesTwo) + String.valueOf(timesThree);
    System.out.println("Concatenated: " + concatAll);

    for (int i = 1; i < 10; i++) {
      for (int j = 0; j < concatAll.length(); j++) {
        if (concatAll.charAt(j) == (char) (i) + '0')
          occurence[i - 1] += 1;
      }
    }

    boolean flag = true;
    for (int i = 0; i < 9; i++) {
      if (occurence[i] > 1 || occurence[i] == 0) {
        flag = false;
        break;
      }
    }

    if (flag)
      System.out.println("It's a fascinating number");
    else
      System.out.println("Not a fascinating number");

    sc.close();
  }
}
