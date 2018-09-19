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


class Test3
{
public static void main(String args[])
{
SBI s=new SBI();
System.out.println("SBI INTEREST =" +s.getRateOfInterest());

}
}
