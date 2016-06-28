/**
 * 
 */
package ch.doublelweather.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import ch.doublelweather.controller.DoubleLWeatherController;

/**
 * @description
 * @author luca.marti
 * @year 2016
 * @version 1.0
 */
public class SearchListener implements ActionListener {

	private JTextField inputField;
	
	/**
	 * 
	 */
	public SearchListener(JTextField textField) {
		this.inputField = textField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Search")){
			
		}
	}

}
