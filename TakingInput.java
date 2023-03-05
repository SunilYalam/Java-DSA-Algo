import java.util.Scanner;

public class TakingInput{
    // 1.
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name, rolNumber, and Interest of sub., in one line:");
        String fName = sc.next();
        String lName = sc.next();
        int rol_number = sc.nextInt();
        String Interest = sc.next();
        System.out.println("Name:" +fName +"" +lName);
        System.out.println("Roll Number:" +rol_number);
        System.out.println("Field of interest:" +Interest);

        // 2. Two Different String 
        System.out.println("Enter first string:");
        System.out.println("Enter the Sencond string");
        String Name1 = sc.next();
        String Name2 = sc.next();

        System.out.println(Name1 +""+Name2);

        // 3.  Marks of Robert in three Subjects

        System.out.println("Enter the First Sub. marks out of 100:");
        int Sub_1 = sc.nextInt();

        System.out.println("Enter the Second Sub. marks out of 100:");
        int Sub_2 = sc.nextInt();

        System.out.println("Enter the Third Sub. marks out of 100:");
        int Sub_3 = sc.nextInt();

        int Total = Sub_1 + Sub_2 + Sub_3;
        System.out.println("Total Marks:" +Total);

        int Parcentage =  ( Sub_1 + Sub_2 + Sub_3)*100/300;
        System.out.println("Parcentage Marks:" +Parcentage +"%");

        // 4. Given two numbers
        int num1 , num2, sum;
        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter second number:");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println(sum);

        // 5. Concatenate the string
        System.out.println("Enter two words:");
        String a = sc.next();
        String b = sc.next();
        System.out.println(a+b);


        sc.close();

    }
}
