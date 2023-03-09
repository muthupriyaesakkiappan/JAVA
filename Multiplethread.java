class Data1 extends Thread{
 public void run(){
 int a=10,b=12;
  System.out.println("Thread 1 - Addition" +(a+b));
}
}
class Data2 extends Thread{
 public void run(){
 int a=10,b=12;
  System.out.println("Thread 1 - Subtraction" +(a-b));
}
}
class Data3 extends Thread{
 public void run(){
 int a=10,b=12;
  System.out.println("Thread 1 - Multiplication" +(a*b));
}
}
class Data4 extends Thread{
 public void run(){
 int a=10,b=12;
  System.out.println("Thread 1 - Division" +(a/b));
}
}
class Multiplethread{
public static void main(String args[])
{
Data1 a= new Data1();
Data2  b= new Data2();
Data3 c= new Data3();
Data4 d= new Data4();
 a.start();
 b.start();
 c.start();
 d.start();
}
}

