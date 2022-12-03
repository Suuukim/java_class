package example02;
//getter , setter
public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(10);
		System.out.println(t.getHour());
	}
}

class Time{
	private int hour, minute, second;
	//alt + shift + s + r

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	
}
