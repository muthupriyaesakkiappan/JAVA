import java.util.*;
class LinkedHashMapExample{
public static void main(String[] args)
{
LinkedHashMap<String,String> hm = new LinkedHashMap<String,String>();
hm.put("100","Amit");
hm.put("101 ","Priya");
hm.put("101","Priya");
hm.put("117","Priya");
hm.put("120","Priya");
for(Map.Entry m:hm.entrySet()){
System.out.println(m.getKey()+" " +m.getValue());
}

}
}