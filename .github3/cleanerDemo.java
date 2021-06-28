package day6.assignment;
import java.util.Date;

public class cleanerDemo {
	private String customerName;
	    private Date joiningDate;
	    public cleanerDemo(String customerName) {
	        this.customerName = customerName;
	        this.joiningDate = new Date();
	    }

	    public String getCustomerName() { 
	        return this.customerName; 
	    }

	    public Date getJoiningDate() {
	        return this.joiningDate;
	    }
	}


