class DifficultNumber {
  public static void main(String[] args) {
    int n = 4;
    int counter = 1;
    int anotherCounter = 1;
    int spaceCounter = n * 2 - 2;

    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= i; j++) {
        System.out.print(counter++);
      }
      anotherCounter = counter - 1;

      for (int k = 0; k < spaceCounter; k++) {
        System.out.print(" ");
      }

      for (int m = 1; m <= i; m++) {
        System.out.print(anotherCounter--);
      }

      counter = 1;
      spaceCounter -= 2;
      System.out.println();
    }

  }
}
