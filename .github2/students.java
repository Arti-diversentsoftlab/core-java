package firstproject.divergentsl;

public class students {
	private String name;
	private int rollnumber;
private int age;
public students (String name,int rollnumber,int age) {
	this.name=name;
	this.rollnumber=rollnumber;
	this.age=age;
	
}
	public static void main(String[] args) {
		students s=new students("aarti",101,20);
		System.out.println(s.name+","+s.rollnumber+","+s.age);
	}

}
