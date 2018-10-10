
interface Student
{
void rollno();
void name();
void branch();
}
class STUDENT1 implements Student
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
}
class STUDENT2 implements Student
{
public void rollno()
{
System.out.println("4567");
}
public void name()
{
System.out.println("DEF");
}
public void branch()
{
System.out.println("ITE");
}
public static void main(String[] args)
{
STUDENT2 s=new STUDENT2();
System.out.println("ROLL NO");
s.rollno();
System.out.println("NAME");
s.name();
System.out.println("BRANCH");
s.branch();
}
}
