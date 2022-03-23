public class Practice {
  public static void main(String[] args) {
    boolean result = compareInt(3, 3);

    System.out.println(result);

    int[] arr = new int[] { 1, 2, 3, 4, 5 };

    System.out.println(arr); // [I@555590
  }

  public static boolean compareInt(int a, int b) {
    return a == b;
  }

  // 数组反转
  // public static int[] arrReverse(int[] arr) {
  // for(int start_index = 0)
  // }
}
