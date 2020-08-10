public class HW5task2MinSum {

    public static void main(String[] args) {

        int A = 1, B = 5, sum = 0;
        for (int i = A + 1; i < B; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
