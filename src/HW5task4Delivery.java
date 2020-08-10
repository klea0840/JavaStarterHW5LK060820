public class HW5task4Delivery {

    public static void main(String[] args) {

        int N = 5;
        int F = 1;

        do {
            F *= N--;
        } while (N > 0);
        
        System.out.println("Possible options: " + F);
    }
}
