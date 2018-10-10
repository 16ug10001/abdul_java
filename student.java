interface Sturoll
{
void rollno();
}
interface Stuname extends Sturoll
{
void name();
}
interface Stubranch extends Sturoll
{
void branch();
}
class STUDENT implements Stuname
{
public void rollno()
{
System.out.println("1234");
}
public void name()
{
System.out.println("ABC");
}
public void branch()
{
System.out.println("CSE");
}
public static void main(String[] args)
{
STUDENT s=new STUDENT();
System.out.println("rollno");
s.rollno();
System.out.println("name");
s.name();
System.out.println("branch");
s.branch();
}
}

