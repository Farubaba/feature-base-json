package com.farubaba.json;

public abstract class BaseJsonService implements JsonService {

	@Override
	public boolean isValidJson(JsonType jsonType) {
		if(jsonType == null) {
			return false;
		}else {
			return jsonType.isValid();
		}
	}

	@Override
	public boolean isValidJsonObject(JsonType jsonType) {
		if(jsonType == null) {
			return false;
		}else {
			return jsonType.isObject();
		}
	}

	@Override
	public boolean isValidJsonArray(JsonType jsonType) {
		if(jsonType == null) {
			return false;
		}else {
			return jsonType.isArray();
		}
	}

	@Override
	public boolean isValidJsonNull(JsonType jsonType) {
		if(jsonType == null) {
			return false;
		}else {
			return jsonType.isJsonNull();
		}
	}

	@Override
	public boolean isValidJsonPrimitive(JsonType jsonType) {
		if(jsonType == null) {
			return false;
		}else {
			return jsonType.isPrimitive();
		}
	}

}
