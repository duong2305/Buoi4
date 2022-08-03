package Bai4;

import java.util.Scanner;
public class Employee
{
    String id;
    String name;
    int age;
    int workingDays;
    double salary;
    int PRICE = 50;

    public Employee() {

    }
    public Employee(String id,String name, int age, int workingDays){
        this.id = id;
        this.name = name;
        this.age = age;
        this.workingDays = workingDays;
    }
    public String getId(){
        return id;
    }
    public void setId(String ids){
        id = ids;
    }
    public String getName(){
        return name;
    }
    public void setName(String names){
        name = names;
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(int ages){
        age = ages;
    }
    public Integer getWorkingDays(){
        return workingDays;
    }
    public void setWorkingDays(int workingDayss){
        workingDays = workingDayss;
    }

    public void Input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhap ma nhan vien: ");
        id = scanner.nextLine();
        System.out.print("Nhap ten nhan vien: ");
        name = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap so ngay lam viec: ");
        workingDays = scanner.nextInt();
    }

    public void Output(){
        System.out.printf("%-20s%-20s%-20s%-20s\n","Id", "Name","Age","WorkingDays");
        System.out.printf("%-20s%-20s%-20d%-20d\n", id, name, age, workingDays);
    }
    public double salary(){
        return workingDays*PRICE;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Employee a = new Employee();
        Employee b = new Employee("02719","Truong",21,26);
        a.setId("20214124");
        a.setName("Hoa");
        a.setAge(22);
        a.setWorkingDays(28);
        a.Output();
        System.out.print("Salary= "+ a.salary());

        a.Input();
        a.Output();
        System.out.print("Salary= "+ a.salary());

    }
}
