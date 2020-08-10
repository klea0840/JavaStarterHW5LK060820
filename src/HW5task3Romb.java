public class HW5task3Romb {

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
        for (int i = tri - 1; i >= 0; i--) {
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
