import java.util.*;
class ArrayEx4{
public static void main(String[] args)
{
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the row value:");
     int a= sc.nextInt();
     System.out.println("Enter the column value:");
     int b= sc.nextInt();
     int x[][]= new int[a][b];

     for(int i=0;i<a;i++){
     for(int j=0;j<b;j++){
     System.out.println("Enter the value:");
     x[i][j]= sc.nextInt();
    }
  }
     for(int i=0;i<a;i++){
     for(int j=0;j<b;j++){
     System.out.print(x[i][j] + " " );
   }
     System.out.println();
     }
   }
}

