//Vodafone.java
public class Vodafone implements SIM{
	public String sendSMS(String msg,long mobilenumber){
		return "Vodafone:Your SMS send successfully";
	}
	public String dialCall(long mobilenumber){
		return "Vodafone:The number you are diling is busy,please dial after some time";
	}


}