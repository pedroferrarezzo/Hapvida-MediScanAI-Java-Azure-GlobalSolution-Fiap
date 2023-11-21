package br.com.mediscan.ai.json;

import org.json.JSONObject;

public abstract class JSONObjects {
	
	public static JSONObject getJSONObject(String string_json) {
		JSONObject jsonResponse = new JSONObject(string_json);
		
		return jsonResponse;
	}
	
}
