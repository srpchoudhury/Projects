//Jio.java
public class Jio implements SIM{
	public String sendSMS(String msg,long mobilenumber){
		return "Jio:Your SMS send successfully";
	}
	public String dialCall(long mobilenumber){
		return "Jio:The number you are diling is busy,please dial after some time";
	}


}