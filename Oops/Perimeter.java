
class Triangle{
    int a, b, c;
    public double getArea(){
        double area = (a+b+c)/2.0;
        return Math.pow((area*(area-a)*(area-b)*(area-c)),.5);
    }
    public double getperimeter(){
        return (a+b+c)/2.0;
    }
}

public class Perimeter {
    public static void main(String args[]){
        Triangle t = new Triangle();
        t.a = 6;
        t.b = 2;
        t.c = 9;
        System.out.println(t.getArea());
        System.out.println(t.getperimeter());
    }
}
