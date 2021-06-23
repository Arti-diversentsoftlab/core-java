package firstproject.divergentsl;

import java.util.ArrayList;
import java.util.List;

public class Associationclasses {
	
	      
	 
	 
	      public static void main(String[] args) {
	            Statename state = new Statename();
	            state.setStateName("California");
	             
	             
	           cityname city = new cityname();
	           city.setCityname("Los Angeles");
	            cityname city2 = new cityname();
	            city2.setCityname("San Diago");
	             
	            List<cityname> empList = new ArrayList<cityname>();
	            empList.add(city);
	            empList.add(city2);
	             
	             
	            state.setState(empList);
	             
	             
	            System.out.println(state.getCities()+" are cities in the state " +state.getStateName());
	        }
	      
	 
	}


