package Tdd.epam.tdd;
public class removeChar1 {

	public String Remove(String string) {
		String r="";
		string=string.toUpperCase();
		if(string.charAt(0)=='A' && string.charAt(1)=='A') {
			r=r+string.substring(2);	
		}
		else if(string.charAt(0)=='A') {
			r=r+string.substring(1);
			
		}
		else if(string.charAt(1)=='A') {
			r=r+string.substring(0,1)+string.substring(2);
			
		}
		else {
			r=r+string;	
		}
		
		return r;	
	}

}