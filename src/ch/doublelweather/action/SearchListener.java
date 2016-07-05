/**
 * 
 */
package ch.doublelweather.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import ch.doublelweather.controller.DoubleLWeatherController;

/**
 * @description
 * @author luca.marti
 * @year 2016
 * @version 1.0
 */
public class SearchListener implements ActionListener {

	private JTextField inputField;
	private JLabel day1_min;
	private JLabel day1_max;
	private JLabel day1_description;
	private JLabel day2_min;
	private JLabel day2_max;
	private JLabel day2_description;
	private JLabel day3_min;
	private JLabel day3_max;
	private JLabel day3_description;
	private JLabel day4_min;
	private JLabel day4_max;
	private JLabel day4_description;
	private JLabel day5_min;
	private JLabel day5_max;
	private JLabel day5_description;
	private JLabel pic_day1;
	private JLabel pic_day2;
	private JLabel pic_day3;
	private JLabel pic_day4;
	private JLabel pic_day5;

	/**
	 * 
	 */
	public SearchListener(JTextField textField, JLabel day1_min, JLabel day1_max, JLabel day1_description, JLabel day2_min, JLabel day2_max, JLabel day2_desc, JLabel day3_min, JLabel day3_max, JLabel day3_desc, JLabel day4_min, JLabel day4_max, JLabel day4_desc, JLabel day5_min, JLabel day5_max, JLabel day5_desc, JLabel pic_day1, JLabel pic_day2, JLabel pic_day3, JLabel pic_day4, JLabel pic_day5) {
		this.inputField = textField;
		this.day1_min = day1_min;
		this.day1_max = day1_max;
		this.day1_description = day1_description;
		this.day2_min = day2_min;
		this.day2_max = day2_max;
		this.day2_description = day2_desc;
		this.day3_min = day3_min;
		this.day3_max = day3_max;
		this.day3_description = day3_desc;
		this.day4_min = day4_min;
		this.day4_max = day4_max;
		this.day4_description = day4_desc;
		this.day5_min = day5_min;
		this.day5_max = day5_max;
		this.day5_description = day5_desc;
		this.pic_day1 = pic_day1;
		this.pic_day2 = pic_day2;
		this.pic_day3 = pic_day3;
		this.pic_day4 = pic_day4;
		this.pic_day5 = pic_day5;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Search")) {
			DoubleLWeatherController controller = new DoubleLWeatherController();
			controller.setCity(inputField.getText());
			controller.handleUrl();
			day1_min.setText("" + controller.weatherList.get(1).getMinTemp());
			day1_max.setText("" + controller.weatherList.get(1).getMaxTemp());
			day1_description.setText("" + controller.weatherList.get(1).getWeatherDescription());
			day2_min.setText("" + controller.weatherList.get(2).getMinTemp());
			day2_max.setText("" + controller.weatherList.get(2).getMaxTemp());
			day2_description.setText("" + controller.weatherList.get(2).getWeatherDescription());
			day3_min.setText("" + controller.weatherList.get(3).getMinTemp());
			day3_max.setText("" + controller.weatherList.get(3).getMaxTemp());
			day3_description.setText("" + controller.weatherList.get(3).getWeatherDescription());
			day4_min.setText("" + controller.weatherList.get(4).getMinTemp());
			day4_max.setText("" + controller.weatherList.get(4).getMaxTemp());
			day4_description.setText("" + controller.weatherList.get(4).getWeatherDescription());
			day5_min.setText("" + controller.weatherList.get(5).getMinTemp());
			day5_max.setText("" + controller.weatherList.get(5).getMaxTemp());
			day5_description.setText("" + controller.weatherList.get(5).getWeatherDescription());
			
			System.out.println(controller.weatherList.get(1).getIcon());
			pic_day1.setIcon(new ImageIcon(controller.weatherList.get(1).getIcon()));
			pic_day2.setIcon(new ImageIcon(controller.weatherList.get(2).getIcon()));
			pic_day3.setIcon(new ImageIcon(controller.weatherList.get(3).getIcon()));
			pic_day4.setIcon(new ImageIcon(controller.weatherList.get(4).getIcon()));
			pic_day5.setIcon(new ImageIcon(controller.weatherList.get(5).getIcon()));
	
		}
	}

}
