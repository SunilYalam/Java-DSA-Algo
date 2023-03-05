import java.util.Scanner;

public class Operators {
    // 1. a program to add 8 to the number x
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number 2345:");
        int x = sc.nextInt();
        System.out.println((((x+8)/3 )%5)*5);

        // 2. Swap two numbers without third number
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

        // 3. clc the sum of digit of 3-digit number
        System.out.println("Enter any 3 didit number:");
        int X = sc.nextInt();
        int sum = 0;
        while(X > 0){
            sum += X % 10;
            X /= 10;
        }
        System.out.println(sum);

        // 4. Value of variable a and b
        int a1 = 55;
        int b1 = 70;
        System.out.println(a1 < 50 && a1 < b1);

        int a2 = 55;
        int b2 = 70;
        System.out.println(a2 < 50 || a2 < b2);

        // 5. to flipped to convert a to b
        System.out.println("Enter the first number:");
        int a3 = sc.nextInt();
        System.out.println("Enter the second number:");
        int b3 = sc.nextInt();
        int n = a3 ^ b3;
        int total = 0;
        while (n != 0){
            n = n& (n - 1);
            total++;
        }
        System.out.println(total);
        sc.close();
    }
    
}
