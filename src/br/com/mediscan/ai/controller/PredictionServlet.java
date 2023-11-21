package br.com.mediscan.ai.controller;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import br.com.mediscan.ai.azure.api.CustomVisionAPI;
import br.com.mediscan.ai.json.JSONObjects;
import br.com.mediscan.ai.model.Prediction;


@WebServlet("/Prediction")
public class PredictionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PredictionServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		prediction(request, response);
	}
	
	
	protected void prediction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url_image = (String) request.getParameter("url_image");
		
		String string_json =  CustomVisionAPI.getJsonString(url_image);
		JSONObject json_object = JSONObjects.getJSONObject(string_json);
		JSONArray predictions_json_array = json_object.getJSONArray("predictions");
		Prediction prediction_object_model = null;
		List<Prediction> prediction_array_list = new ArrayList<Prediction>();
		
		for (int i = 0; i < 2; i++) {
			prediction_object_model = new Prediction();
			JSONObject prediction = predictions_json_array.getJSONObject(i);
			
			double probability = prediction.getDouble("probability");
			String tagId = prediction.getString("tagId");
			String tagName = prediction.getString("tagName");
			
			prediction_object_model.setProbability(probability);
			prediction_object_model.setTag_id(tagId);
			prediction_object_model.setTag_name(tagName);
			
			prediction_array_list.add(prediction_object_model);
		}
		
		request.setAttribute("predictions", prediction_array_list);
		request.setAttribute("url_image", url_image);
		
		request.getRequestDispatcher("assets/pages/result.jsp").forward(request, response);
		
		
	}

}
