class LongestCommonPrefix {
  public static void main(String[] args) {
    String[] strs = { "flower", "flow", "flight" };
    int shortestLength = Integer.MAX_VALUE;
    for (String i : strs) {
      if (i.length() < shortestLength)
        shortestLength = i.length();
    }

  }
}
