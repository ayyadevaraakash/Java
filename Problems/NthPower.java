// Problem: Calculate nth root of a number (not to use any built-in method)

class NthPower {

  static int multiplier(int a, int b) {
    int answer = a;
    for (int i = 1; i < b; i++) {
      answer = answer * a;
    }
    return answer;
  }

  public static void main(String[] args) {
    int number = 27, root = 3, low = 1;
    int high = number, answer = -1;

    while (high > low) {
      int mid = (low + high) / 2;
      int res = multiplier(mid, root);
      if (res == number) {
        answer = mid;
        break;
      } else if (res < number)
        low = mid;
      else
        high = mid;
    }

    System.out.println("Result: " + answer);

  }
}
