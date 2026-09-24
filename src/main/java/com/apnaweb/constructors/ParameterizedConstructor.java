package com.apnaweb.constructors;

public class ParameterizedConstructor {
    private int acctID;
    private String name;
    private double salary;
    public ParameterizedConstructor(int id,String name,double sal){
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
        ParameterizedConstructor obj = new ParameterizedConstructor(1,"Rakesh",50000.0);
        obj.show();
    }
}
