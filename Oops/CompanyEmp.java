class Employee{
    String name;
    int YearofJob;
    int salary;
    String address;
}

public class CompanyEmp {
    public static void main(String args[]){
        Employee a = new Employee();
        a.name = "Robert";
        a.YearofJob = 1994;
        a.address = "64C- WallsStreet";
        Employee b = new Employee();
        b.name = "Sam";
        b.YearofJob = 2000;
        b.address = "64D- WallsStreet";
        Employee c = new Employee();
        c.name = "John";
        c.YearofJob = 1999;
        c.address = "26B- WallsStreet";
        System.out.println("Name"+"\t"+ "Year of Joining"+ "\t"+ "Address");
        System.out.println(a.name+"\t"+ a.YearofJob+ "\t"+ a.address);
        System.out.println(b.name+"\t"+ b.YearofJob+ "\t"+ b.address);
        System.out.println(c.name+"\t"+ c.YearofJob+ "\t"+ c.address);
    }
    
}
