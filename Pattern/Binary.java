class Binary {
  public static void main(String[] args) {
    int n = 6, flag = 0;
    for (int i = 0; i < n; i++) {
      flag = i % 2 == 0 ? 1 : 0;
      for (int j = 0; j < n; j++) {
        System.out.print(flag);
        flag = flag == 0 ? 1 : 0;
      }
      System.out.println();
    }
  }
}
