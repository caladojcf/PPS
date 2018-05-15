package br.edu.ifpb.pps.observer;

import java.util.Observable;

public class WeatherData extends Observable {

	private int temperature;
	private int humidity;
	private int pressure;

	public WeatherData() {
		super();
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int Temperature) {
		this.Temperature = Temperature;
		setChanged();
		notifyObservers();
	}

	public int getHumidity() {
		return umidity;
	}

	public void setHumidity(int umidity) {
		this.umidity = umidity;
		setChanged();
		notifyObservers();
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
		setChanged();
		notifyObservers();
	}

}   
