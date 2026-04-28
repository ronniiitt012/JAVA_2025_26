package practical;
public class Main {
	public static void main(String[] args) {
		int a=3;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e){
			System.out.println("cannot divide by zero");
		}finally {
			System.out.println("code finally executed");
		}
	}
}
