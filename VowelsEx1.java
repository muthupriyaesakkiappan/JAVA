import java.util.*;
class VowelsEx1{
public static void main(String[] args)
{
String line;
Scanner input= new Scanner(System.in);
System.out.println("Enter the sentence");
line = input.nextLine();
int vowels=0,consonant=0,degit=0,numberofcharector=0,symbol=0,space=0,count=0;

line =line.toLowerCase();

for(int i=0;i<line.length();++i){
char ch= line.charAt(i);
if(line.charAt(i) != ' ')
{    
     count++;    
        }

if(ch=='a'|| ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
{
++vowels;
}
 
else if(ch>='a' &&ch<='z')
{
++consonant;
}
else if(ch>='0' && ch<='9')
{
++degit;
}
else if(ch==' ')
{
++space;
}
else
++symbol;
}


System.out.println("Vowels :"+vowels);
System.out.println("Consonant :" +consonant);
System.out.println("degit :" +degit);
System.out.println("Space :" +space);
System.out.println("Special charecter :"+ symbol);
System.out.println("number of charector :" +count);
}
}

