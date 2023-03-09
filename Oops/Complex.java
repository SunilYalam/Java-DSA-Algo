import java.util.Scanner;

class complex{
    int real;
    int img;
    public complex(int r, int i){
        real = r;
        img = i;
    }
    public static complex add(complex a, complex b){
        return new complex((a.real +b.real), (a.img + b.img));
    }
    public static complex diff(complex a, complex b){
        return new  complex((a.real-b.real),(a.img-b.img));
    }
    public static complex product(complex a, complex b){
        return new complex((a.real*b.real)-(a.img*b.img), (a.real*b.img)+(a.img*b.real));
    }
    public void printcomplex(){
        if(real == 0 && img != 0){
            System.out.println(img + "i");
        }else if(img == 0 && real != 0){
            System.out.println(real);
        }else{
            System.out.println(real + "+" +img+ "i");
        }
    }
}

public class Complex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real complex number:");
        int real1 = sc.nextInt();
        System.out.println("Enter complex number:");
        int comp1 = sc.nextInt();
        System.out.println("Enter real complex number2:");
        int real2 = sc.nextInt();
        System.out.println("Enter complex number2:");
        int comp2 = sc.nextInt();
        complex c = new complex(real1, comp1);
        complex d = new complex(real2, comp2);
        complex e = complex.add(c,d);
        complex f = complex.diff(c,d);
        complex g = complex.product(c,d);
        e.printcomplex();
        f.printcomplex();
        g.printcomplex();
        sc.close();

    }
    
}
