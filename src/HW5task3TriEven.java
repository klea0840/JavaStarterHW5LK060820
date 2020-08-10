public class HW5task3TriEven {

    public static void main(String[] args) {

        int tri = 5;

        for (int i = 0; i <= tri; i++) {
            for (int j = tri; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
