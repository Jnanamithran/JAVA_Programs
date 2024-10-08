import java.io.*;
class file_implement
{
public static void main(String args[])
{
try
{
FileReader fr1=new FileReader("/home/np-27/Desktop/Jnanamithran M/mk.java");
FileReader fr2=new FileReader("/home/np-27/Desktop/Jnanamithran M/mk1.java");
FileWriter fw=new FileWriter("/home/np-27/Desktop/Jnanamithran M/b.java");
int i;
while((i=fr1.read())!=-1)
{
fw.write(i);
}
while((i=fr2.read())!=-1)
{
fw.write(i);
}
fr1.close();
fr2.close();
fw.close();
}
catch(IOException e)
{
System.out.println(e.getMessage());
}
}
}
