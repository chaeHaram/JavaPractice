public class StackUnwinding {
	public static void main(String[] args) {
		try {
			f();
		} catch(Exception ex) {
			Exception ex3 = new Exception();
			System.out.print("main(): ");
			ex3.printStackTrace();
		}
	}
	static void f() throws Exception {
		try {
			g();
		} catch(Exception ex) {
			Exception ex2 = new Exception();
			System.out.println("f(): ");
			ex2.printStackTrace();
			throw ex2;
		}
		System.out.println("This is f().");
	}
	static void g() throws Exception {
		Exception ex = new Exception();
		System.out.println("g(): ");
		ex.printStackTrace();
		throw ex;
	}
}
