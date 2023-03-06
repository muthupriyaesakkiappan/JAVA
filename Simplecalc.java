import java.util.*;
class Simplecalc{
public static void main(String[] args)
{
char operator;
Double result,number1,number2;
Scanner input= new Scanner(System.in);
System.out.println("Enter a value");
number1 = input.nextDouble();
System.out.println("Enter a value");
number2=  input.nextDouble();
System.out.println("Operator: is +,-,*,/,%");
operator = input.next().charAt(0);
switch(operator)
{
case '+' :
result= number1+ number2;
System.out.println(number1 + "+" + number2 + "=" + result);

break;
case '-':
result= number1 - number2;
System.out.println(number1 + "-" + number2 + "=" +result);
break;
case '*':
result= number1 * number2;
System.out.println(number1 + "*" + number2 + "=" + result);
break;
case '/':
result= number1 / number2;
System.out.println(number1 + "/" + number2 + "=" + result);
break;
case '%':
result= number1 % number2;
System.out.println(number1 + "%" + number2 + "=" +  result);
break;
default:
System.out.println("Invalid number");
break;
}
input.close();
}
}
