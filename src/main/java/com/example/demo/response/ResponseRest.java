package com.example.demo.response;

import java.util.ArrayList;
import java.util.HashMap;

public class ResponseRest {

	private ArrayList<HashMap<String, String>> metadata =  new ArrayList<>();

	public ArrayList<HashMap<String, String>> getMetadate() {
		return metadata;
	}

	public void setMetadata(String type, String code, String date) {
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("type", type);
		map.put("code", type);
		map.put("date", type);
	
		metadata.add(map);
	}
	
	
}
