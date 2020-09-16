package com.meninno.reddit.gallery.network.pojo;

import com.google.gson.annotations.SerializedName;

public class RedditResponse {

	@SerializedName("data")
	private Data data;

	@SerializedName("kind")
	private String kind;

	public Data getData(){
		return data;
	}

	public String getKind(){
		return kind;
	}
}