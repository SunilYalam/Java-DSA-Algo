import java.util.Scanner;

public class Switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for(int i=1; i*i<= n; i++){
            System.out.print(i*i + " ");
        }
        sc.close();
    }
    
}
