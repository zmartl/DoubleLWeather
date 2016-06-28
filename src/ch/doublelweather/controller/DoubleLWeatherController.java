/**
 * 
 */
package ch.doublelweather.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

import javax.sound.midi.ControllerEventListener;
import javax.swing.Icon;

import org.json.JSONArray;
import org.json.JSONObject;

import ch.doublelweather.gui.GUI;
import ch.doublelweather.model.Weather;

/**
 * @description the controller class from the program. Handle the JSON Data and
 *              push it to the view/model
 * @author luca.marti, luca.zatti
 * @year 2016
 * @version 1.0
 */
public class DoubleLWeatherController {

	private GUI gui;
	private ArrayList<Weather> weatherList = new ArrayList<Weather>();
	private String city = "Zürich,Schweiz";
	private String url = "http://api.openweathermap.org/data/2.5/forecast/daily?&mode=json&units=metric&lang=en&cnt=7&cnt=3&appid=502fdfcd2e5228445432c9535089bb2b&q="
			+ city;

	/**
	 * handle the parsed JSON data and save it to the model
	 */
	public void handleUrl() {
		try {
			JSONObject json = new JSONObject(readUrl(url));

			JSONArray weatherArray = json.getJSONArray("list");

			for (int day = 1; day < weatherArray.length(); day++) {
				JSONObject weatherObject = weatherArray.getJSONObject(day);
				JSONObject tempObject = weatherObject.getJSONObject("temp");
				JSONArray weatherDetailArray = weatherObject.getJSONArray("weather");
				JSONObject weatherDetailObject = weatherDetailArray.getJSONObject(0);

				Weather weather = new Weather();
				weather.setMinTemp(tempObject.getDouble("min"));
				weather.setMaxTemp(tempObject.getDouble("max"));
				weather.setWeatherDescription(weatherDetailObject.getString("description"));
				// weather.setIcon(getIconString(weatherDetailObject.getString("main")));

				weatherList.add(weather);
				this.setValueInGui();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createGui() {
		gui = new GUI();
		gui.setVisible(true);
		gui.setSize(700, 500);
		this.handleUrl();
	}

	private String getIconString(String input) {
		String icon;
		switch (input) {
		case "Rain":
			icon = "images/rain.png";
			break;
		case "Clear":
			icon = "images/sun.png";
			break;
		case "Cloud":
			icon = "images/cloud.png";
			break;
		default:
			icon = "images/error.png";
			break;
		}
		return icon;
	}

	private void setValueInGui() {
		for (int i = 0; i < weatherList.size() - 1; i++) {
			gui.getMin().get(i).setText("" + weatherList.get(i).getMinTemp());
			gui.getMax().get(i).setText("" + weatherList.get(i).getMaxTemp());
			gui.getDescription().get(i).setText("" + weatherList.get(i).getWeatherDescription());
		}
	}

	/**
	 * @description Parse the data from the base URL
	 * @param urlString
	 * @return buffered string
	 * @throws Exception
	 */
	private String readUrl(String urlString) throws Exception {
		BufferedReader reader = null;
		try {
			URL url = new URL(urlString);
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
			StringBuffer buffer = new StringBuffer();
			int read;
			char[] chars = new char[1024];
			while ((read = reader.read(chars)) != -1) {
				buffer.append(chars, 0, read);
			}

			return buffer.toString();
		} finally {
			if (reader != null)
				reader.close();
		}
	}
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
}
