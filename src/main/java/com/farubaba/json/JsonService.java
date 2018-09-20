package com.farubaba.json;

import java.util.List;

public interface JsonService{
	
	public JsonType getJsonType(String jsonString);
	
	public <T> T fromJson(String jsonString, Class<T> clazz);
	
	public <A> List<A> fromJsonToList(String jsonString, Class<A> clazz);
	
	public <E> String toJsonString(E e);
	
	public <B> void handleJson(String jsonString, Class<B> clazz);
	
	public boolean isValidJson(JsonType jsonType);
	public boolean isValidJsonObject(JsonType jsonType);
	public boolean isValidJsonArray(JsonType jsonType);
	public boolean isValidJsonNull(JsonType jsonType);
	public boolean isValidJsonPrimitive(JsonType jsonType);

}
