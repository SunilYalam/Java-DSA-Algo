import java.util.Scanner;

public class DiscardedPrint {
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int sum = 0;
        if(num>=0){
            sum += num;
        }else{
            sum = -1;

        }
        System.out.println(sum);
        sc.close();
    }
    
}
