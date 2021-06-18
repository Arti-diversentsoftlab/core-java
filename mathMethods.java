public class mathMethods {
	public static void main(String[] args) {
    int x = 10000;
    int y = 10000;
    Object z;
    z=Math.multiplyExact(x, y);
    System.out.println("multiply:="+z);
    z = Math.addExact(x, y);
    System.out.println("addExact: = " + z);
    z = Math.subtractExact(x, y);
    System.out.println("subtractExact: = " + z);
    z = Math.multiplyExact(x, y);
    System.out.println("multiplyExact:  = " + z);
    z = Math.incrementExact(x);
    System.out.println("incrementExact: " + z);
    z = Math.decrementExact(y);
    System.out.println("decrementExact: " + z);
    z = Math.negateExact(x);
    System.out.println("negateExact: " + x + " * -1 = " + z);

}
}
