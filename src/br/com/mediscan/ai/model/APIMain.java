package br.com.mediscan.ai.model;

import org.json.JSONArray;
import org.json.JSONObject;

import br.com.mediscan.ai.azure.api.CustomVisionAPI;
import br.com.mediscan.ai.json.JSONObjects;

public class APIMain {

	public static void main(String[] args) {
		String string_json =  CustomVisionAPI.getJsonString("https://ecommerce.cdn.genera.com.br/uploads/2022/08/Vitiligo-2-scaled.jpg");
		JSONObject json_object = JSONObjects.getJSONObject(string_json);
		JSONArray predictions_json_array = json_object.getJSONArray("predictions");

		
		// Iterar sobre as previsões
		for (int i = 0; i < predictions_json_array.length(); i++) {
			
			JSONObject prediction = predictions_json_array.getJSONObject(i);

			// Extrair valores individuais dentro de cada previsão
			double probability = prediction.getDouble("probability");
			String tagId = prediction.getString("tagId");
			String tagName = prediction.getString("tagName");

			// Faça o que quiser com esses valores, por exemplo, imprimi-los
			System.out.println("Prediction " + (i + 1) + ":");
			System.out.println("  Probability: " + probability);
			System.out.println("  Tag ID: " + tagId);
			System.out.println("  Tag Name: " + tagName);
		}
		
	}

}
