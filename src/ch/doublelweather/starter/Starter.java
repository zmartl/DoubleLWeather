/**
 * 
 */
package ch.doublelweather.starter;

import ch.doublelweather.controller.DoubleLEWeatherController;
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
		DoubleLEWeatherController controller = new DoubleLEWeatherController();
		controller.handleUrl();
		controller.printResult();
		
		GUI gui = new GUI();
		gui.setVisible(true);
		gui.setSize(700, 500);
	}

}
