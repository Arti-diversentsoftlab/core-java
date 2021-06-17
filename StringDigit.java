public class stringDigit {
public static void main(String[] args) {
	String str="78i5234";
	int count=0;
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)>='0'&& str.charAt(i)<='9'){
			count++;
		}else{
			System.out.println("false");
			break;
		}
		
	}
	if(count==str.length()){
		System.out.println("true");
	}
}

}
