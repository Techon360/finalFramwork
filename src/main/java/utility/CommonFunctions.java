package utility;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;


public class CommonFunctions {
	
	
	 // generate random mobile number
	 public  String randommobilenumber()
	 {
		 int a=RandomUtils.nextInt(1000000000, 1200000000);
			String b= String.valueOf(a);
			return b;
		 
	 }
	 
	 //generate random first and last name
	 public  String randoname()
	 {
		
		  return RandomStringUtils.randomAlphabetic(6);
	 }
	 

}
