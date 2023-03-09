class EnumEx
{
public enum Subject{HTML,CSS,JAVA,JAVASCRIPT}
public static void main(String args[])
{
for(Subject s: Subject.values())
System.out.println(s);
}
}