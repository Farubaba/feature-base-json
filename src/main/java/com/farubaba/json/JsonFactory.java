package com.farubaba.json;

import com.farubaba.json.JsonService;

public class JsonFactory {
	
	private static JsonFactory instance = new JsonFactory();
	private JsonService defaultService;
	private JsonService gsonService;
	private JsonService fastJsonService;
	private JsonService moshiService;
	private JsonService jacksonService;
	
	private JsonFactory() {
		
	}
	
	public JsonService getDefaultService() {
		return defaultService;
	}
	
	public JsonFactory setDefaultService(JsonService defaultService) {
		this.defaultService = defaultService;
		return this;
	}
	
	public static JsonFactory getInstance() {
		return instance;
	}

	public JsonService getGsonService() {
		return gsonService;
	}

	public JsonFactory setGsonService(JsonService gsonService) {
		this.gsonService = gsonService;
		return this;
	}

	public JsonService getFastJsonService() {
		return fastJsonService;
	}

	public JsonFactory setFastJsonService(JsonService fastJsonService) {
		this.fastJsonService = fastJsonService;
		return this;
	}

	public JsonService getJacksonService() {
		return jacksonService;
	}

	public JsonFactory setJacksonService(JsonService jacksonService) {
		this.jacksonService = jacksonService;
		return this;
	}

	public JsonService getMoshiService() {
		return moshiService;
	}

	public JsonFactory setMoshiService(JsonService moshiService) {
		this.moshiService = moshiService;
		return this;
	}

	public static void setInstance(JsonFactory instance) {
		JsonFactory.instance = instance;
	}
	
}
