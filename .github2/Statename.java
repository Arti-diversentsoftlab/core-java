package firstproject.divergentsl;

import java.util.List;

public class Statename {
    private String stateName;
    
    List<cityname> citys;
  
    public String getStateName() {
        return stateName;
    }
  
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    public List<cityname> getCities() {
        return citys;
    }
    public void setState(List<cityname> citys) {
        this.citys = citys;
    }
     
}


