package com.apnaweb.constructors;

public class ConstructorOverloading {
    private int id;
    private String name;
    private double salary;
    private String projName ="Not alloted";
    public ConstructorOverloading(int id,String name,double sal,String prname){
        this.id = id;
        this.name = name;
        this.salary = sal;
        projName = prname;
    }
    public ConstructorOverloading(int id,String name,String prname){
        this.id = id;
        this.name = name;
        this.salary = 50000;
        projName = prname;
    }
    public ConstructorOverloading(int id,String name,double sal){
        this.id = id;
        this.name = name;
        this.salary = sal;
    }
    public ConstructorOverloading(int id,String name,String prname,double sal){
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
        ConstructorOverloading obj = new ConstructorOverloading(1,"Rajesh",60000.0,"Chat Application");
        ConstructorOverloading obj1 = new ConstructorOverloading(2,"Suman","Chat Application");
        ConstructorOverloading obj2 = new ConstructorOverloading(3,"Prakash",80000.0);
        ConstructorOverloading obj3 = new ConstructorOverloading(4,"Rajesh","Chat Application",90000.0);
        obj.show();
        obj1.show();
        obj2.show();
        obj3.show();
    }
}
