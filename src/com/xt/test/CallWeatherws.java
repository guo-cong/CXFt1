package com.xt.test;

import java.util.List;

import com.xt.wearther.ArrayOfString;
import com.xt.wearther.WeatherWS;
import com.xt.wearther.WeatherWSSoap;

public class CallWeatherws {
	public static void main(String[] args) {
		WeatherWS factory = new WeatherWS();
		WeatherWSSoap weather = factory.getWeatherWSSoap();
		ArrayOfString as = weather.getWeather("ÏÌÄþ", null);
		List<String> list = as.getString();
		for (String str : list) {
			System.out.println(str);
		}

		ArrayOfString regionProvince = weather.getRegionProvince();
		List<String> string = regionProvince.getString();
		for (int i = 0; i < string.size(); i++) {
			System.out.println(string);
		}
	}
}
