package com.farubaba.json;

/**
 * JSON格式数据的类型
 * 
 * @author violet
 *
 */
public class JsonType {
	
	private boolean valid;
	private boolean array;
	private boolean object;
	private boolean primitive;
	private boolean jsonNull;
	
	public boolean isValid() {
		if(valid) {
			return valid;
		}else {
			//默认如果是这四种类型之一，都认为是合法的JSON字符串
			if(isArray() || isObject() || isPrimitive() || isJsonNull()) {
				valid = true;
				return valid;
			}
		}
		return false;
	}
	
	public JsonType setValid(boolean valid) {
		this.valid = valid;
		if(!valid) {
			setObject(false).setArray(false).setPrimitive(false).setJsonNull(false);
		}
		return this;
	}
	
	public boolean isArray() {
		return array;
	}
	public JsonType setArray(boolean array) {
		this.array = array;
		if(array) {
			setValid(array);
		}
		return this;
	}
	public boolean isObject() {
		return object;
	}
	public JsonType setObject(boolean object) {
		this.object = object;
		if(object) {
			setValid(object);
		}
		return this;
	}
	public boolean isPrimitive() {
		return primitive;
	}
	public JsonType setPrimitive(boolean primitive) {
		this.primitive = primitive;
		if(primitive) {
			setValid(primitive);
		}
		return this;
	}
	public boolean isJsonNull() {
		return jsonNull;
	}
	public JsonType setJsonNull(boolean jsonNull) {
		this.jsonNull = jsonNull;
		if(jsonNull) {
			setValid(jsonNull);
		}
		return this;
	}
	
}	
