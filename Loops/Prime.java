import java.util.Scanner;

public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if(isPrime(n) && isPrime(n-2)){
            System.out.print(true);
        }else{
            System.out.print(false);
        }
        sc.close();
    }
    public static boolean isPrime(int n){
        if(n <= 1)
        return false;
        for(int i=2; i*i <=n; i++){
            if(n%i == 0)
            return false;
        }
        return true;
    }
    
}
