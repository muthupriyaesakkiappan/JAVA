import java.util.Scanner;  
public class ArrayInput
{  
public static void main(String[] args)   
{  
int m;  
Scanner input =new Scanner(System.in);  
System.out.print("Enter the String : ");  
m=input.nextInt();
int[] array = new int[10];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<m; i++)  
{
array[i]=input.nextInt();  
}  
System.out.println("Array elements are: "); 
for (int i=0; i<m; i++)   
{  
System.out.println(array[i]);  
}  
}  
}  