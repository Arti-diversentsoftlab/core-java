package firstproject.divergentsl;

public class finalstaticvar {
    final static String name = "john";//1 st place 
    final static int x;
    static 
    {
        x = 10;
    }
    
public static void main(String[] args) {
	finalstaticvar v=new finalstaticvar();
	System.out.println(v.name);
	System.out.println(v.x);
}

}
