 class Addition_program_test1
{
public int num1=65;
public int num2=25;
public static String name="HardWork";
public int addition(){
int result= num1 + num2;
System.out.println("result is" +result );
return result;
}
public static int additionOne()
{
int resultOne=65+95;
System.out.println("result is " +resultOne);
return resultOne;
}
public static void main(String[] RAMESHSOFT)
{
System.out.println("JVM is started");
String nameResp = name;
System.out.println("String is " +nameResp);
int addResp = additionOne();
System.out.println("additionOneResp is " +addResp);
System.out.println("execution done ");
}
}