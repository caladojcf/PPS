package br.edu.ifpb.pps.observer;

import java.util.Observable;
import java.util.Observer;

public class Check2 implements Observer {

	Observable wd;

	int value;

	public Check2(Observable wd) {
		this.wd = wd;
		wd.addObserver(this);
	}

	@Override
	public void update(Observable check, Object arg1) {
		if (check instanceof WeatherData) {
			WeatherData wd = (WeatherData) check;
			value = wd.getPressure();
			System.out.println("A pressão atual é : " + value);
		}
	}
}
