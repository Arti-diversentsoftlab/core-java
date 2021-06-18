public class avoidnullpointer {
    public static void main(String[] args) {
        String str =  null;
        Dummy d = null;
        if(str!=null && str.equals("My Input")) {
            System.out.println("This doesn't throw exception");
        }
        System.out.println("last if didn't throw exception");
        try{
            if(str.equals("My Input") && str!=null ) {
                System.out.println("This throws exception");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    	}
	
}
