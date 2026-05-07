import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int j = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();

        if (n <= 0 || k <= 0 || j <= 0 || m < 0 || p < 0) {
            System.out.println("INVALID INPUT");
            return;
        }

        int bananaMonkeys = (m % k == 0) ? (m / k) : (m / k) + 1;
        int peanutMonkeys = (p % j == 0) ? (p / j) : (p / j) + 1;

        int totalMonkeysAte = bananaMonkeys + peanutMonkeys;
        int monkeysLeft = n - totalMonkeysAte;

        if (monkeysLeft < 0) {
            monkeysLeft = 0;
        }

        System.out.println("Number of Monkeys left on the tree:" + monkeysLeft);
    }
}
