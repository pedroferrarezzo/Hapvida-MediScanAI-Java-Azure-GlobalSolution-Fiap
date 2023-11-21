package br.com.mediscan.ai.azure.api;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public abstract class CustomVisionAPI {
	
	public static String getJsonString(String url_image) {
		String body = "{\"url\": \"" + url_image + "\"}";
		URL url = null;
		try {
			url = new URL(
					"https://aimediscan-prediction.cognitiveservices.azure.com/customvision/v3.0/Prediction/5174e6fc-ddcd-4113-ada6-69896be1562d/classify/iterations/Iteration5/url");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpsURLConnection conn = null;
		try {
			conn = (HttpsURLConnection) url.openConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.setRequestMethod("POST");
		} catch (ProtocolException e) {
			e.printStackTrace();
		}
		conn.setDoOutput(true);
		conn.addRequestProperty("Prediction-Key", "b6114e9bcfd5454ebc5accebb0721eac");
		conn.setRequestProperty("Content-Type", "application/json");
		// conn.setRequestProperty("User-Agent", "Mozilla/5.0");

		try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
			dos.writeBytes(body);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String line = null;
		try (BufferedReader bf = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
			line = bf.readLine();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return line;
	};
};