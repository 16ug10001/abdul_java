class MultithreadingDemo extends Thread
{
public void run()
{
try
{
System.out.println("Thread" + Thread.currentThread().getId() + "is running");
}
catch(Exception e)
{
System.out.println("EXCEPTION CAUGHT");
}}}
public class abdulmultithread
{
public static void main(String[] args)
{
int n=8;
for(int i=0;i<8;i++)
{
MultithreadingDemo object=new MultithreadingDemo();
object.start();
}}}
