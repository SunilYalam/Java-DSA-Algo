import java.util.Scanner;

class aOfRectangle{
    int length;
    int breadth;
    public aOfRectangle(int L, int B){
        length = L;
        breadth = B;
    }
    public int getArea(){
        return length*breadth;
    }
}

public class Area {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int L, B;
        System.out.println("Enter length:");
        L = sc.nextInt();
        System.out.println("Enter breadth:");
        B = sc.nextInt();
        aOfRectangle a = new aOfRectangle(L, B);
        System.out.println("Area :" +a.getArea());
        sc.close();
    }
    
}
