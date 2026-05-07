import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0,temp=num;
        while(num > 0) {
            int rem = num % 10;
            sum = sum +(rem*rem*rem);
            num = num / 10;
        }
        System.out.println(sum);
       
        if(sum == temp) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
