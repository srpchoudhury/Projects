
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
