import java.util.*;
public class StackEx{
public static void main(String[] args)
{
Stack<String> stack = new Stack <String>();
stack.push("Ayush");
stack.push("Priya");
stack.push("Surya");
stack.push("Renu");
stack.push("Amit");
stack.pop();
Iterator<String> itr= stack.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}
