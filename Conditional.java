import java.util.Scanner;

public class Conditional {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length:");
        int l = sc.nextInt();
        System.out.println("Enter the value of breadth:");
        int b = sc.nextInt();
        if(l == b){
            System.out.println("it is a square");
        }else{
            System.out.println("it is not a square");
        }

        // 2. to print absolute value
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if(num<0){
            num = num*-1;
        }
        System.out.println("the absolute value is:" +num);

        // 3. cost price and selling price calculate
        System.out.println("Enter the cost price:");
        int cp = sc.nextInt();
        System.out.println("Enter the selling price:");
        int sp = sc.nextInt();
        int total;
        if(cp > sp){
            total = sp - cp;
            System.out.println("the loss is:" +total);
        }else if(cp >sp){
            total = sp - cp;
            System.out.println("the profit is:" +total);
        }else{
            System.out.println("no profit & no loss");
        }

        // 4. use positive number
        System.out.println("Enter the number:");
        int x = sc.nextInt();
        if(x>=0){
            System.out.println("You enter a positive number:");
        }else{
            System.out.println("You enter number is negative and is skipped:");
        }

        // 5. use calculator
        System.out.println("Enter an operator:(+, -, *, /,)");
        char op = sc.next().charAt(0);
        System.out.println("Enter first number:");
        Double num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        Double num2 = sc.nextDouble();
        Double ans;
        switch (op){
            case '+':
            ans = num1 + num2;
            System.out.println(ans);
            break;

            case '-':
            ans = num1 - num2;
            System.out.println(ans);
            break;

            case '*':
            ans = num1 * num2;
            System.out.println(ans);
            break;

            case '/':
            ans = num1 / num2;
            System.out.println(ans);
            break;
            default:
            System.out.println("Error! incorrect operator:");
            break;

        }
        // 6. calculate marks 
        System.out.println("Enter Your marks:");
        int marks = sc.nextInt();
        if(marks>=90){
            System.out.println("Your grade is A+:");
        }else if(marks>=80){
            System.out.println("Your grade is A:");
        }else if(marks>=70){
            System.out.println("Your grade is B+:");
        }else if(marks>=60){
            System.out.println("Your grade is B");
        }else if(marks>=50){
            System.out.println("Your grade is C");
        }else if(marks>=30){
            System.out.println("Your grade is D:");
        }else if(marks<30){
            System.out.println("You are Fail:");
        }
        sc.close();
    }
    
}
