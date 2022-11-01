//Airtel.java
public class Airtel implements SIM{
	public String sendSMS(String msg,long mobilenumber){
		return "Airtel:Your SMS send successfully";
	}
	public String dialCall(long mobilenumber){
		return "Airtel:The number you are diling is busy,please dial after some time";
	}


}