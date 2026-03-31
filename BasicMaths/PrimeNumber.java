import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0; // count divisors!

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++; // found a divisor!
                break;
            }
        }

        if (count == 0) {
            System.out.println("Prime! ");
        } else {
            System.out.println("Not Prime! ");
        }
    }
}
