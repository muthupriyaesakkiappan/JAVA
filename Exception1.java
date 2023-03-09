import java.io.*;
public class Exception1{
public static void main (String[] args)throws Exception
{
try{
int numeric;
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your name");
numeric= Integer.parseInt(in.readLine());
}
catch(NumberFormatException ex)
{
System.out.println("you are entered"+" "+ex.getMessage()+""+"Catch the Exception:Nonnumeric value.");
System.exit(0);
}
}
}