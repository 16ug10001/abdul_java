class car
{
void run()
{
System.out.println("car is running");
}
}
class abdulbike extends car
{
void run()
{
System.out.println("bike is running fast");
}
public static void main(String[]args)
{
abdulbike obj= new abdulbike();
obj.run();
}
}

