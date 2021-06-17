import java.util.ArrayList;
public class countduplicay {
public static void main(String[] args) {
        String str = "aartiparge";  
        int count;  //for counting
        char arr[] = str.toCharArray();  //string to character array
        System.out.println("Duplicate char in a given string: ");  
        for(int i = 0; i <arr.length; i++) {  
            count = 1;  
            for(int j = i+1; j <arr.length; j++) {  
            if(arr[i] == arr[j] && arr[i] != ' ') {  
              count++;    
               arr[j] = '0'; //Set arr[j] to 0 to avoid printing visited char 
                }  
            }    
            if(count > 1 && arr[i] != '0')   //A character is considered as duplicate if count is greater than 1
                System.out.println(arr[i]);  
        }  
    }  
}  
