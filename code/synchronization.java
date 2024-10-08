import java.util.Scanner;
class Table{
synchronized void printTable(int n){
System.out.println("printing the table for"+n);
for(int i=1;i<=10;i++)
{
System.out.println(n*i);
try{
Thread.sleep(400);
}
catch(Exception e){
}
}
}
}
class MyThread1 extends Thread{
Table t;
MyThread1(Table t){
this.t=t;
}
public void run(){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number for thread1 and");
int a=sc.nextInt();
t.printTable(a);
}
}
class MyThread2 extends Thread{
Table t;
MyThread2(Table t){
this.t=t;
}
public void run(){
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
t.printTable(b);
}
}
public class synchronization
{
public static void main(String args[])
{
Table obj=new Table();
MyThread1 t1=new MyThread1(obj);
MyThread2 t2=new MyThread2(obj);
t1.start();
t2.start();
}
}




