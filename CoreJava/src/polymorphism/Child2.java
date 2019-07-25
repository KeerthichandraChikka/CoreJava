package polymorphism;

public class Child2 extends Parent {
public void printValue() {
	System.out.println(a);
}

public static void main(String[] args) {
	
	Parent p = new Parent();
	System.out.println(p.a);
	Parent p1= new Child1();
	
	p1.printValue();
	
//	System.out.println(p1.printValue());
	Parent p2= new Child2();
	p2.printValue();
	
//	System.out.println(p2.a);
	
}
}
