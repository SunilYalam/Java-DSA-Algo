import java.util.Scanner;

public class Fibonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int x = 1;
        int y = 1;
        for(int i = 1; i<=n; i++){
            System.out.print(x + "");
            int sum = x + y;
            x = y;
            y = sum;
            sc.close();
        }
    }
}