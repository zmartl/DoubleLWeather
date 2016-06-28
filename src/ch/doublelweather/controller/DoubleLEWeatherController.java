/**
 * 
 */
package ch.doublelweather.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

import ch.doublelweather.model.Weather;

/**
 * @description
 * @author luca.marti
 * @year 2016
 * @version 1.0
 */
public class DoubleLEWeatherController {

	private ArrayList<Weather> weatherList = new ArrayList<Weather>();
	private final String URL = "http://api.openweathermap.org/data/2.5/forecast/daily?q=Z%C3%BCrich,SChweiz&mode=json&units=metric&lang=de&cnt=7&cnt=3&appid=502fdfcd2e5228445432c9535089bb2b";

	public void handleUrl() {
		try {
			JSONObject json = new JSONObject(readUrl(URL));
			
			JSONArray weatherArray = json.getJSONArray("list");
			
			for(int day = 1; day < weatherArray.length(); day++){
				JSONObject weatherObject = weatherArray.getJSONObject(day);
				JSONObject tempObject = weatherObject.getJSONObject("temp");
				JSONArray weatherDetailArray = weatherObject.getJSONArray("weather");
				JSONObject weatherDetailObject = weatherDetailArray.getJSONObject(0);
				
				Weather weather = new Weather();
				weather.setMinTemp(tempObject.getDouble("min"));
				weather.setMaxTemp(tempObject.getDouble("max"));
				weather.setWeatherDescription(weatherDetailObject.getString("description"));
				//weather.setWindSpeed(weatherDetailArray.getDouble(1));
				
				weatherList.add(weather);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printResult(){
		for(int i = 0; i < weatherList.size(); i++){
			Weather weather = weatherList.get(i);
			System.out.println("Max");
			System.out.println(weather.getMaxTemp());
			System.out.println("Min");
			System.out.println(weather.getMinTemp());
			System.out.println("Descr");
			System.out.println(weather.getWeatherDescription());
			System.out.println("Wind");
			System.out.println(weather.getWindSpeed());
		}
	}

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
}
