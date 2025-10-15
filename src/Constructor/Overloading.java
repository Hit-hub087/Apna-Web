package Constructor;

public class Overloading {
    private int id;
    private String name;
    private double salary;
    private String projName ="Not alloted";
    public Overloading(int id,String name,double sal,String prname){
        this.id = id;
        this.name = name;
        this.salary = sal;
        projName = prname;
    }
    public Overloading(int id,String name,String prname){
        this.id = id;
        this.name = name;
        this.salary = 50000;
        projName = prname;
    }
    public Overloading(int id,String name,double sal){
        this.id = id;
        this.name = name;
        this.salary = sal;
    }
    public Overloading(int id,String name,String prname,double sal){
        this.id = id;
        this.name = name;
        this.salary = sal;
        projName = prname;
    }
    public void show(){
        System.out.println("ID: "+id+"\nName: "+name+"\nSalary: "+salary+"\nProject Name: "+projName);
    }
}

class UseEmp{
    public static void main(String[] args) {
        Overloading obj = new Overloading(1,"Rajesh",60000.0,"Chat Application");
        Overloading obj1 = new Overloading(2,"Suman","Chat Application");
        Overloading obj2 = new Overloading(3,"Prakash",80000.0);
        Overloading obj3 = new Overloading(4,"Rajesh","Chat Application",90000.0);
        obj.show();
        obj1.show();
        obj2.show();
        obj3.show();
    }
}
