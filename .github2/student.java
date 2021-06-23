package firstproject.divergentsl;

public class student {
	 private String fname;
	 private String lastname;
    private student(String fname, String lastname) {
    	this.fname=fname;
    	this.lastname=lastname;
	}

	public static student valueOf(String fname,String lastname)
    {
        return new student(fname,lastname );
    }
 
   
    public static void main(String[] args)
    {
        student n = student.valueOf("Arti","parge");
         System.out.println(n.fname + "," + n.lastname);
    }
}



