class Bank
{
int a,b,c;
int getRateOfInterest()
{ 
return 0;
}
}
class SBI extends Bank
{
int a=9;
int getRateOfInterest()
{

return a;
}
}
class ICICI extends SBI
{
int b=8;
int getRateOfInterest()
{

return a+b;
}
}
class AXIS extends ICICI
{
int c=-3;
int getRateOfInterest()
{

return b+c;
}
}
class Test2
{
public static void main(String args[])
{
SBI s=new SBI();
ICICI i=new ICICI();
AXIS a=new AXIS();
System.out.println("SBI INTEREST =" +s.getRateOfInterest());
System.out.println("ICICI INTEREST =" +i.getRateOfInterest());
System.out.println("AXIS INTEREST =" +a.getRateOfInterest());
}
}
