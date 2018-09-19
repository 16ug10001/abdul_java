class Employee
{
int a;
int getWage()
{ 
return 0;
}
}
class FullTime extends Employee
{
int a=9;
int getWage()
{
return a*300;
}
}
class PartTime extends Employee
{
int a=10;
int getWage()
{
return a*100;
}
}

class Test4
{
public static void main(String args[])
{
FullTime a= new FullTime();
System.out.println("FullTime Wage=" +a.getWage());
PartTime b= new PartTime();
System.out.println("PartTime Wage=" +b.getWage());
}
}
