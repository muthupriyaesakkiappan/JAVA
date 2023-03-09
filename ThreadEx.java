import java.util.*;
class Data extends Thread{
public void run()
{

Scanner input= new Scanner(System.in);
System.out.println("Enter the number:");
int n = input.nextInt();
boolean flag=false;
for(int i=2;i<=n/2;++i)
{
if(n%2==0)
{
flag = true;
break;
}
}
if(!flag)
{
System.out.println("The given number is prime");
}
else
{
System.out.println("The given number is prime");
}
}
}
class ThreadEx {
public static void main(String[] args)
{
Data obj = new Data();
obj.start();
}
}

