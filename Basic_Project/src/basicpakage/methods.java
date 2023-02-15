package basicpakage;

public class methods {

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
	}
}
