import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n = sc.nextInt();
        int num = 1;
        while(num<=n){
            int count = 0;
            int i = num;
            while(i>0){
                count++;
                i /= 10;
            }
            int adm = num;
            int sum = 0;
            while(adm>0){
                int digit = adm%10;
                sum += Math.pow(digit, count);
                adm /= 10;
                if(sum>adm){
                    continue;
                }
            }
            if(sum == num){
                System.out.println(num);
            }
            num++;
        }
        sc.close();
    }
    
}
