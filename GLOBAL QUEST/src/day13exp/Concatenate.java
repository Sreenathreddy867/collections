package day13exp;


/**
 * 
 */
public class Concatenate {
	public String Concate(String s1,String s2 ) {
		return s1+s2;
	}

	
	  public String Concate(String s1,String s2,String s3) {
		  return s1+s2+s3; 
	}
	 
//	Concatenate
	public static void main(String[] args) {
		Concatenate s=new Concatenate();
		System.out.println(s.Concate("Sree"," Siri"));
		System.out.println(s.Concate("Welcome"," to the"," World"));
	}

}
