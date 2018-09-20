package com.farubaba.json;

import com.farubaba.json.JsonService;
/**
 * Json解析库的工厂类，通常在使用之前，需要先在App初始化时将该工厂实际使用到的JsonService子类通过set方法注入。
 * 
 * @author violet
 *
 */
public class JsonFactory {
	
	private static JsonFactory instance = new JsonFactory();
	/**
	 * 原本只需要一个接口，便可以支持多种实现，但是为了向要方便地同时支持两种以上的json库，
	 * 所以定义了多个JsonService对象
	 */
	private JsonService jsonService;
	//private JsonService gsonService;
	//private JsonService fastJsonService;
	//private JsonService moshiService;
	//private JsonService jacksonService;
	/**
	 * 扩展其他未明确支持的json库,为了能够让单例JsonFactory同时支持两种json库。
	 * 如果根据需要，或者项目中已经集成了2种以上的json库，那么应该优先统一json库，使用一种，
	 * 实在无法统一，可以扩展此类，增加更多的JsonService属性来支持更多的json库，但并不推荐这样做。
	 */
	private JsonService extJsonService;
	
	private JsonFactory() {
		
	}
	public static JsonFactory getInstance() {
		return instance;
	}
	
	public JsonService getJsonService() {
		return jsonService;
	}
	
	public JsonFactory setJsonService(JsonService jsonService) {
		this.jsonService = jsonService;
		return this;
	}
	
	public JsonService getExtJsonService() {
		return extJsonService;
	}
	
	public JsonFactory setExtJsonService(JsonService extJsonService) {
		this.extJsonService = extJsonService;
		return this;
	}
	
}
