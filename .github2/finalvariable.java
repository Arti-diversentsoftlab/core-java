package firstproject.divergentsl;

public class finalvariable {
	private final  String name="aarti";//first place where we can write final instance var
public final int rolln;//2nd way we can use block for final Intance var
{
	rolln=12;
	}
final int  age;
 public finalvariable(){// 3rd way ,we can use constructor
	age=24;
}
public static void main(String[] args) {
	finalvariable vb=new finalvariable();
System.out.println(" 1st:"+vb.name);
System.out.println("2nd:"+vb.rolln);
System.out.println("3rd:"+vb.age);

}
}