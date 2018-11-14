import java.util.*;
class Customexception extends Exception
{
Customexception()
{
System.out.println("There is an error");
}
}
public class demo
{
public static void main(String args[])
{
Scanner b=new Scanner(System.in);
System.out.println("Enter the args");
String a=b.next();
System.out.println("Enter the name");
String d=b.next();
try
{
if(a.equals ("40") && d.equals ("Rahul"))
System.out.println("You are Rahul");
else
throw new Customexception();
}
catch(Exception e)
{
System.out.println();
}
}
}

