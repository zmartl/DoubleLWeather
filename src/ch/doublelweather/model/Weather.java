/**
 * 
 */
package ch.doublelweather.model;

import javax.swing.Icon;

/**
 * @description The weather modal class from the program
 * @author luca.marti, luca.zatti
 * @year 2016
 * @version 1.0
 */
public class Weather {
	private Icon icon;
	private String weatherDescription;
	private double minTemp;
	private double maxTemp;

	/**
	 * @return the icon
	 */
	public Icon getIcon() {
		return this.icon;
	}

	/**
	 * @param icon
	 *            the icon to set
	 */
	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	/**
	 * @return the weatherDescription
	 */
	public String getWeatherDescription() {
		return this.weatherDescription;
	}

	/**
	 * @param weatherDescription
	 *            the weatherDescription to set
	 */
	public void setWeatherDescription(String weatherDescription) {
		this.weatherDescription = weatherDescription;
	}

	/**
	 * @return the minTemp
	 */
	public double getMinTemp() {
		return this.minTemp;
	}

	/**
	 * @param minTemp
	 *            the minTemp to set
	 */
	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}

	/**
	 * @return the maxTemp
	 */
	public double getMaxTemp() {
		return this.maxTemp;
	}

	/**
	 * @param maxTemp
	 *            the maxTemp to set
	 */
	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}
}
