package day6.assignment;

public class overloading {
	public int printvalue(int a) {
		System.out.println(a);
		return a;
	}
	public int printvalue(int a,int b) {
		System.out.println(a+b);
		return a+b;
	}
	public int printvalue(int a,int b,int c) {
		System.out.println(a+b+c);
		return a+b+c;
	}

	public static void main(String[] args) {
		int a=2,b=3,c=4;
		overloading o=new overloading();
		o.printvalue(a);
		o.printvalue(a,b);
		o.printvalue(a,b,c);
	}

}
