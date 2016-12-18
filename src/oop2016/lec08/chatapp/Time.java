package oop2016.lec08.chatapp;

public class Time {
	int hour;
	int minute;
	
	Time(int hour, int minute){
		this.hour = hour;
		this.minute = minute;
	}
	
	Time(String timeString) {
		String[] timeStrings = timeString.split(":");
		this.hour = Integer.valueOf(timeStrings[0]);
		this.minute = Integer.valueOf(timeStrings[1]);
	}
	
	String getTime() {
		return String.format("%d:%d", hour, minute);
	}
	
}
