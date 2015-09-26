// SRM 144 DIV 2 200

public class Time {
	
	public String whatTime(int seconds) {
		StringBuilder result = new StringBuilder();

		int hours = seconds/3600;
		result.append(hours + ":");

		int minutes = (seconds - (hours * 3600)) / 60;
		result.append(minutes + ":");

		int mySeconds = seconds - (minutes * 60) - (hours * 3600);
		result.append(mySeconds + "");

		return result.toString();
	}
}
