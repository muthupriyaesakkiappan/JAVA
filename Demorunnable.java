class Batch13 implements Runnable{
public void run()
{
int a=56,b=9;
System.out.println("Thread Batch13: "+(a*b));
}
}
class Demorunnable{
public static void main(String args[])
{
Batch13 b= new Batch13();
Thread t1 = new Thread(b);
t1.start();
}
}