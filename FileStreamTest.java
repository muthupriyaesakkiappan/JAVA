import java.io.*;
public class FileStreamTest{   //create a class
public static void main(String[] args[]){
try{
byte bWrite [] ={11,21,3,40,5};// []-using array to declare multiple value.
OutputStream os = new FileOutputStream("test.txt");   //create a object -name is os and the file name test.txt.
for(int x=0; x<bWrite.length ;x++){  //using for loop assume value is  x=0 and then x is less than bwrite.length means the condition is true and value is increment .  
                                     if the length is more than 6 means the condition false.          
os.write( bWrite[x] );   //
}
os.close();  //close the file
InputStream is = new FileInputStream("test.txt"); //inputstream means -
int size = is.available(); // is.available -- it is used to check the space or capacity.
for(int i=0;i<size;i++){   // using for loop if the size is less than i means condition is true . once the condition 
System.out.print((char)is.read() + " ");
}
is.close();
}
catch(IOException e){
System.out.print("Exception");
}
}
}