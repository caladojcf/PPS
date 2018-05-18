package br.edu.ifpb.pps.observer;

import java.util.Observable;
import java.util.Observer;

public class Check1 implements Observer {

	Observable wd;

	int value;

	public Check1(Observable wd) {
		this.wd = wd;
		wd.addObserver(this);
	}

	@Override
	public void update(Observable check, Object arg1) {
		if (check instanceof WeatherData) {
			WeatherData wd = (WeatherData) check;
			value = wd.getTemperature();
			System.out.println("A temperatura atual é : " + value);
		}
	}
}
