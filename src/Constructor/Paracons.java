package Constructor;

public class Paracons {
    private int acctID;
    private String name;
    private double salary;
    public Paracons(int id,String name,double sal){
        acctID = id;
        this.name = name;
        salary = sal;
        System.out.println("Object initialized");
    }
    public void show(){
        System.out.println("Account ID : "+acctID+"\nName : "+name+"\nSalary : "+salary);
    }
}

class UseParacons{
    public static void main(String []args){
        Paracons obj = new Paracons(1,"Rakesh",50000.0);
        obj.show();
    }
}
