package oops.Inheritance;
/* Static and non static members can be inherit 
but IIB,Constructor , SIb cannot be inherit to sub class*/


class C extends Object
{
C()
{
System.out.println("C()");	
}
}
class D extends C{
	
	D()
	{
		System.out.println("D()");
	}
}

public class I3 extends D{

	I3()
	{
		System.out.println("I3()");
	}
	
	public static void main(String[] args) {
	
		C obj1 = new C();
		System.out.println("-----");
		D obj2 = new D();
		System.out.println("-----");
		I3 obj3 = new I3();
	
}
}
