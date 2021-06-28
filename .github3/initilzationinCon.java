package day6.assignment;

public class initilzationinCon {
	String name;// any name and age just for initialize value in oject of this class.
	int age ;
	public initilzationinCon( String name , int age) {
		this.name=name;
		this.age=age;
		System.out.println("initialization done...");
	}
	public static void main(String[] args) {
		System.out.println("star");
		initilzationinCon con=new initilzationinCon("aarti",20);
		System.out.println("finish");
	}
}
