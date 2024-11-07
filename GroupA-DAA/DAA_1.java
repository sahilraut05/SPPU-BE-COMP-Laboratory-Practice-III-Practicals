public class DAA_1 {
    public static int recursive(int n) {
        if (n <= 1) return n;
        return recursive(n - 1) + recursive(n - 2);
        //Time Complexity: O(2^n)
        //Space Complexity: O(n)
    }
    public static int iterative(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
        //Time Complexity: O(n)
        //Space Complexity: O(1)
    }
    public static void main(String[] args) {
        System.out.println(recursive(10));
        System.out.println(iterative(10));
    }
}