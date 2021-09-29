package com.hao.ums.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
* 
* @author LinLinTang
* @since  2019年11月18日 下午1:42:17 
*/
@SuppressWarnings("serial")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GlobalException extends RuntimeException{

	 private int code;

	 private String message;
	 
	 private String method;
	 
	 private String desc;
	 
	 public GlobalException(int code,String message) {
		 this.code = code;
		 this.message = message;
	 }
}
