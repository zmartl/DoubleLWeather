/**
 * 
 */
package ch.doublelweather.starter;

import ch.doublelweather.controller.DoubleLWeatherController;
import ch.doublelweather.gui.GUI;

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
		DoubleLWeatherController controller = new DoubleLWeatherController();
		controller.createGui();
		//controller.printResult();
	}

}
