class Doctor
{
void run()
{
System.out.println("it has a good treatment");
}
}
class abdhospital extends Doctor
{
void run()
{
System.out.println("it is a CloudNine hospital");
}
public static void main(String[] args)
{
abdhospital obj= new abdhospital();
obj.run();
}
}

