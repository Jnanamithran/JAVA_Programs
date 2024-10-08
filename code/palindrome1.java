import java.util.Scanner;
class palindrome
{
void mal()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine();
int flag=0;
int len=str.length();
for(int i=0;i<len;i++)
{
if(str.charAt(i)!=str.charAt(len-i-1))
{ 
flag=1;
break;
}
}
if(flag==0)
System.out.println("palindrome");
else 
System.out.println("not palindrome");
}
}
class palindrome1
{
public static void main(String args[])
{
palindrome obj=new palindrome();
obj.mal();
}
}
