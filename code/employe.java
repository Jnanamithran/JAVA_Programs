import java.util.Scanner;
class employee
{
String name,address;
int age,salary;
long phone;
void printSalary(int a)
{
System.out.println("Salary is "+a);
}
void printDetails()
{
System.out.println("Name:"+name);
System.out.println("Address"+address);
System.out.println("Age:"+age);
System.out.println("Phone:"+phone);
printSalary(salary);
}
}

class office extends employee
{
String specialization;
void specPrint()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Sepcialization");
specialization=sc.nextLine();
System.out.println("Specialization:"+specialization);
}
}

class manager extends employee
{

String department;
void deptPrint()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Department:");
department=sc.nextLine();
System.out.println("Department:"+department);

}
}

public class employe
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
office o=new office();
System.out.println("Enter the Officer Details");
System.out.println("Enter Name");
o.name=sc.nextLine();
System.out.println("Enter Address");
o.address=sc.nextLine();
System.out.println("Enter age:");
o.age=sc.nextInt();
System.out.println("Enter phone:");
o.phone=sc.nextLong();
System.out.println("Enter Salary");
o.salary=sc.nextInt();
o.specPrint();
System.out.println("HERE ARE THE DETAILS OF THE OFFICER");
o.printDetails();
manager m=new manager();
Scanner s=new Scanner(System.in);
System.out.println("Enter Manager Details");
System.out.println("Enter your name");
m.name=s.nextLine();
System.out.println("Enter address:");
m.address=s.nextLine();
System.out.println("Enter Age");
m.age=s.nextInt();
System.out.println("Enter Phone");
m.phone=s.nextLong();
System.out.println("Enter Salary");
m.salary=s.nextInt();
m.deptPrint();
System.out.println("HERE ARE THE DETAILS OF MANAGER");
m.printDetails();
}
}

