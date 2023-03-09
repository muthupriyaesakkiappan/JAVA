import java.util.*;
public class LinkedHashsetex1{
public static void main(String[] args)
{
LinkedHashSet<String> set=new LinkedHashSet<String>();
set.add("Ravi");
set.add("Priya");
set.add("Renu");
set.add("Raju");
set.add("Priya");
Iterator<String> itr= set.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
 