import java.util.Scanner;

public class NumberSystem {

    public static void ConvertBinary(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int n = sc.nextInt();
        int pow = 0;
        int binNum = 0;
        while(n>0){
            int rem = n%2;
            binNum = binNum+(rem*(int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("Binary number is:" +binNum);
        sc.close();

    }

    // 2. Convert binary to decimal
    public static void binaryToDec(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number:");
        int n = sc.nextInt();
        int dec = 0;
        int pow = 1;
        while(n>0){
            int rem = n%2;
            dec += rem*pow;
            pow *= 2;
            n /= 10;
        }
        System.out.print(dec);
        sc.close();
    }

    // 3. add two numbers given different base
    public static void decBinary(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int x = sc.nextInt();
        System.out.println("Enter the binary number:");
        int y = sc.nextInt();
        int dec = 0;
        int pow = 1;
        while(y>0){
            int rem = y%2;
            dec += rem * pow;
            pow *= 2;
            y /= 10;

        }
        System.out.print(x + dec);
        sc.close();
    }

    // Multiply two numbers given different base
    public static void Multiply(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int m = sc.nextInt();
        System.out.println("Enter the binary number:");
        int n = sc.nextInt();
        int dec = 0;
        int pow = 1;
        while(n>0){
            int rem = n%2;
            dec += rem * pow;
            pow *= 2;
            n /= 10;

        }
        System.out.print(m * dec);
        sc.close();
    }
    // 5. Binary string for upto k precision digits
    public static void PrecisionDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal numbers:");
        double n = sc.nextDouble();
        System.out.println("Enter the number of precision digits:");
        int k = sc.nextInt();
        int dec = (int)n;
        double fractional = n-dec;
        int binary = 0;
        int pow = 1;
        while(dec >0){
            int rem = dec % 2;
            binary += rem * pow;
            pow *= 10;
            dec /= 2;
        }
        String sn = Integer.toString(binary) + ".";
        while(k>0 && fractional !=0){
            fractional *= 2;
            int digit = (int)fractional;
            sn += digit;
            fractional = fractional - digit;
            k--;
        }
        System.out.print(sn);
        sc.close();
    }

    public static void main(String args[]){
        ConvertBinary();
        binaryToDec();
        decBinary();
        Multiply();
        PrecisionDigits();

    }
    
}
