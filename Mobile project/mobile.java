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