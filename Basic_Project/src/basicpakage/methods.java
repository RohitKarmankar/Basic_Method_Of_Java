package basicpakage;

public class methods {
    int a=20;
    int b=20;
	public static void staticmethod() {
	System.out.println("static method");	
	}
	public void nonstaticmethod() {
	System.out.println("non static method");	
	}
	public void secondnonstaticmethod() {
	System.out.println("second non static method");	
	}
	public static void main(String[] args) {
    staticmethod();
    methods kk=new methods();
    kk.nonstaticmethod();
    kk.nonstaticmethod();
    int c=kk.a+kk.b;
    System.out.println(c);
	}
}
