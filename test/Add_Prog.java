public class Add_Prog
{
   int num1=65;
   int num2=25;
   int num3;
 static int add_One()
 {
int num3 = num1+num2;
System.out.println("value of num3="+num3);
return num3;
}
public static void main(String[] args)
{
Add_Prog demo=new Add_Prog();
System.out.println("jvm is starting");

int addrep=demo.add_One();
}
}