 class Addition_program_test
{
 static int num1=65;
 static int num2=25;

static void addDemo()
{
int result= num1 + num2;
System.out.println("addition of two numbers is" +result );
return result;
}
public static void main(String[] args)
{
System.out.println("jvm is started");
int add= addDemo();
}
}