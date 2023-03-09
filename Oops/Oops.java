class Student{
    String name;
    int roll_no;
}

public class Oops{
    public static void main(String args[]){
        Student student = new Student();
        student.name = "John";
        student.roll_no = 2;
        System.out.println("name of the student:" +student.name+ "roll number is:" +student.roll_no);
    }
}