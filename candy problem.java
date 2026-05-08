import java.util.Scanner;

public class CandyJar {
    public static void main(String[] args) {
      
        int N = 10; 
        int K = 5;  
        
        Scanner sc = new Scanner(System.in);
        

        if (sc.hasNextInt()) {
            int order = sc.nextInt();
            
           
            if (order >= 1 && order <= N) {
                // Update JAR after purchase
                int candiesSold = order;
                int remaining = N - order;
                
                System.out.println("Number of Candies Sold: " + candiesSold);
                
                
                if (remaining <= K) {
                    remaining = N;
                }
                
                System.out.println("Number of Candies available: " + remaining);
            } else {// Return invalid input for 0, negative, or orders > capacity
                System.out.println("INVALID INPUT");
                System.out.println("Number of Candies available: " + N);
            }
        }
        sc.close();
    }
}
