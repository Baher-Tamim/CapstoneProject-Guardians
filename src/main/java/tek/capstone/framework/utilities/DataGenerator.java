package tek.capstone.framework.utilities;

public class DataGenerator {

	 public static String emailGenerator() {
	    	String prefix = "capstone_baher";
	    	String suffix = "@gmail.com";
	    	int random = (int)(Math.random()*10000);
	    	String email = prefix + random + suffix;
	    	return email;
	    }
	 public static String getPhoneNumber() {
			String phoneNumber ="510";
			for(int i = 0; i < 7; i++) {
				phoneNumber += (int)(Math.random()*10);
			}
			return phoneNumber;
		}
	 public static String getCardNumber() {
		 String cardNumber = "";
		 for(int i = 0; i <16; i++) {
			 cardNumber += (int)(Math.random()*10);
			}
		 return cardNumber;
	 }
	 public static String getZipCode() {
		 String zipcode ="";
		 for (int i =1; i<=5; i++) {
			 zipcode += (int)(Math.random()*10);
		 }
		 return zipcode;
	 }

}
