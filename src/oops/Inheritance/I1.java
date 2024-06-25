package oops.Inheritance;
class A{
	int i=10;
	void test() {
		
		System.out.println("class C");
	}
}
public class I1 extends A {
	int j=20;
	void test2()
{
		
System.out.println("classD");		

}
	public static void main(String[] args) {
		I1 i= new I1();
		System.out.println(i.j);
		System.out.println(i.i);
		i.test2();
		i.test();
	
}
}
