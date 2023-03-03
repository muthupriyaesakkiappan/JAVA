import java.util.Scanner;
class MultiArray{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.println("ether the table value");
int a = input.nextInt();
System.out.println("Enter the row");
int b = input.nextInt();
System.out.println("Enter the column");
int c = input.nextInt();
int x[][][]= new int[a][b][c];

for(int i=0;i<a;i++){
for(int j=0;j<b;j++){
for(int k=0;k<c;k++)
{
System.out.println("Enter the value: ");
x[i][j][k]= input.nextInt();
}
}
}

for(int i=0;i<a;i++){
for(int j=0;j<b;j++){
for(int k=0;k<c;k++){
System.out.print(x[i][j][k] +" ");
}
System.out.print("\t");
}
System.out.println();
}
}
}
 


