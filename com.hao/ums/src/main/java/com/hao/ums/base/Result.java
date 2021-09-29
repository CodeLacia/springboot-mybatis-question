package com.hao.ums.base;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.Map;

/** 
* @author TANG 
* @version 创建时间：2020年7月31日 上午9:35:24  
*/
@Data
public class Result implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int code;
	
	private String message;
	
	private Object data;

	private Map<Object, Object> extra;

	private Boolean defaultAction = false;

	private long timestamp = System.currentTimeMillis();
	
	public Result() {
		this.defaultAction = false;
		this.timestamp = System.currentTimeMillis();
	}

	public Result(int code, String message) {
		this.code = code;
		this.message = message;
		this.defaultAction = false;
		this.timestamp = System.currentTimeMillis();
	}

	public Result(int code, String message,Boolean defaultAction) {
		this.code = code;
		this.message = message;
		this.defaultAction = defaultAction;
		this.timestamp = System.currentTimeMillis();
	}

	public Result(int code, String msg, Object data) {
		this(code, msg);
		this.data = data;
	}

	public static Result successDef(){
		return new Result(HttpStatus.OK.value(), HttpStatus.OK.name(),true);
	}

	public static Result success() {
		return new Result(HttpStatus.OK.value(), HttpStatus.OK.name());
	}

	public static Result success(Object obj) {
		return new Result(HttpStatus.OK.value(), HttpStatus.OK.name(), obj);
	}

	public static Result fail(String message) {
		return new Result(HttpStatus.BAD_REQUEST.value(), message);
	}

	public static Result error(String message) {
		return new Result(HttpStatus.INTERNAL_SERVER_ERROR.value(), message);
	}
	
	public static Result authorized(String message) {
		return new Result(HttpStatus.UNAUTHORIZED.value(), message);
	}

}
