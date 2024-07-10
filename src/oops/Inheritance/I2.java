package oops.Inheritance;
class B
{
	static int i = 10;
	static void test1()
	{
		System.out.println("class B");
	}
}
public class I2   extends B{
	static int j= 20;
	static void test2()
	{
		System.out.println("class I2");
	}
public static void main(String[] args) {
	 I2 obj = new I2();
	 System.out.println(obj.i);
	 System.out.println(obj.j);
	 
	 obj.test1();
	 obj.test2();
}
}
 