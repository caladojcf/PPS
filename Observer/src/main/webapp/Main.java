package br.edu.ifpb.pps.observer;

public class Main {

	public static void main(String[] args) {
		
		WeatherData wd = new WeatherData();
		
		Check1 check1  = new Check1(wd);
		Check2 check2  = new Check2(wd);
		Check3 check3  = new Check3(wd);

		wd.setTemperature(20);//Celsius
		wd.setPressure(120);//Bar
		wd.setHumidity(72);//Percent
		
	}
}