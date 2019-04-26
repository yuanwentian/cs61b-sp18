public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        while (x < 10) {
            int curr = x;
            sum = sum + curr;
            System.out.print(sum + " ");
            x = x + 1;
        }
    }
}
