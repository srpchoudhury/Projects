//Airtel.java
public class Airtel implements SIM{
	public String sendSMS(String msg,long mobilenumber){
		return "Airtel:Your SMS send successfully";
	}
	public String dialCall(long mobilenumber){
		return "Airtel:The number you are diling is busy,please dial after some time";
	}


}

//Jio.java
public class Jio implements SIM{
	public String sendSMS(String msg,long mobilenumber){
		return "Jio:Your SMS send successfully";
	}
	public String dialCall(long mobilenumber){
		return "Jio:The number you are diling is busy,please dial after some time";
	}


}

//Vodafone.java
public class Vodafone implements SIM{
	public String sendSMS(String msg,long mobilenumber){
		return "Vodafone:Your SMS send successfully";
	}
	public String dialCall(long mobilenumber){
		return "Vodafone:The number you are diling is busy,please dial after some time";
	}


}

//sim.java
public interface SIM{
     public String sendSMS(String msg,long mobilenumber);
	 public String dialCall(long mobilenumber);
}


//mobile.java
public class mobile {
	private SIM sim;

	public void insertSIM(String simName) throws Exception {
		// reflection api
		Class simclass = Class.forName(simName);
		Object simobject = simclass.newInstance();

		if (simobject instanceof SIM) {
			sim = (SIM) simobject;
		} else {
			throw new Exception("Invalid  SIM");
		}
	}

	public String sendSMS(String msg, long mobilenumber) {
		return sim.sendSMS(msg, mobilenumber);
	}

	public String dialCall(long mobilenumber) {
		return sim.dialCall(mobilenumber);
	}
}


//mobileUser.java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MobileUser {
	public static void main(String[] args) throws Exception {
		mobile iphone = new mobile();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Insert SIM : ");
		String simName = br.readLine();

		iphone.insertSIM(simName);
		System.out.println();

		System.out.println("Type 1 and press <Enter> key to send SMS");
		System.out.println("Type 2 and press <Enter> key to make Call\n");

		System.out.print("Enter option: ");
		String option = br.readLine();

		String resp;

		if (option.contains("1")) {
			System.out.println("Type message and press <Enter> key: ");
			String msg = br.readLine();

			System.out.println("Type mobile number and press <Enter> key: ");
			String mobilenumber = br.readLine();

			resp = iphone.sendSMS(msg, Long.parseLong(mobilenumber));
			System.out.println(resp);
		} else if (option.contains("2")) {
			System.out.println("Type mobile number and press <Enter> key:");
			String mobilenumber = br.readLine();

			resp = iphone.dialCall(Long.parseLong(mobilenumber));
			System.out.println(resp);
		} else {
			System.out.println("Invalid Option");
		}
	}
}
