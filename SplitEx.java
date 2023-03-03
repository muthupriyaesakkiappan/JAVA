import java.util.Scanner;
class SplitEx
{
public static void main(String[] args)
{
  String a = "fullstack@development@Batch13";
       String [] arr = a.split("@", -3);

	 for (String b : arr)
{
	    System.out.println("Mahe - 1 :" + b);
}
}
}