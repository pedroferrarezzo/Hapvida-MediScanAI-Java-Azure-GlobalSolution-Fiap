package br.com.mediscan.ai.model;
import org.json.JSONArray;

public class Prediction {
	private double probability;
	private String tag_id;
	private String tag_name;
	private JSONArray array_prediction;
	
	public Prediction(){};
	
	public Prediction(double probability, String tag_id, String tag_name) {
		super();
		this.probability = probability;
		this.tag_id = tag_id;
		this.tag_name = tag_name;
	}

	public double getProbability() {
		return probability;
	}

	public void setProbability(double probability) {
		this.probability = probability;
	}

	public String getTag_id() {
		return tag_id;
	}

	public void setTag_id(String tag_id) {
		this.tag_id = tag_id;
	}

	public String getTag_name() {
		return tag_name;
	}

	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}

	public JSONArray getArray_prediction() {
		return array_prediction;
	}

	public void setArray_prediction(JSONArray array_prediction) {
		this.array_prediction = array_prediction;
	}
}
