public class MaxArray {
  /** Returns the maximum value from m. */
  public static int max(int[] m) {
    int m_length = m.length;
    int max_number = 0;
    for (int i = 0; i <= m_length - 1; i += 1) {
      if (m[i] > max_number){
        max_number = m[i];
      }
    }
    return max_number;
  }
  public static void main(String[] args) {
    int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};  
    System.out.println(max(numbers));
  }
}