/**
 * 
 */
package ch.doublelweather.starter;

import ch.doublelweather.controller.DoubleLEWeatherController;

/**
 * @description
 * @author luca.marti
 * @year 2016
 * @version 1.0
 */
public class Starter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLEWeatherController controller = new DoubleLEWeatherController();
		controller.handleUrl();
		controller.printResult();
	}

}
