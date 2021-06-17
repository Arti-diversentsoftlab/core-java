public class VowelandConsonent {
public static void main(String[] args) {
        
        int Count = 0 ;   //this is for counting of vowel
          int count1=0;   //for consonent counting  
        String str = "English Language";    
            
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                Count++;    
            } else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                count1++;    
            }    
            	
            }
        System.out.println("Number of vowels: " + Count);    
        System.out.println("Number of consonent: " + count1);    

        }    
    }    
 
