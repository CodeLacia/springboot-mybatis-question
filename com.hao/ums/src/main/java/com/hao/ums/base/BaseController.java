package com.hao.ums.base;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/** 
* @author TANG 
* @version 创建时间：2020年8月3日 下午11:13:35  
*/
public class BaseController {
	
	@Autowired
	protected ObjectMapper objectMapper;

	protected Object success() {
		return Result.success();
	}
	
	protected Object success(Object data) {  
		Result result = Result.success();
		if (data != null) {
			if(data instanceof Page) {
				Page<?> page = (Page<?>) data;
				Map<String, Object> table = Maps.newHashMap();
				table.put("total", page.getTotal());
				table.put("rows", page.getRecords());
				result.setData(table);
			}else {
				result.setData(data);
			}
		}
		return result;
	}
	
	protected Object success2(Object data) {  
		Result result = Result.success();
		if (data != null) {
			result.setData(data);
		}
		return result;
	}
	
	protected Object success3(String message) {  
		Result result = Result.success();
		if (message != null) {
			result.setMessage(message);
		}
		return result;
	}
	
	protected Object fail(String message) {
		return Result.fail(message);
	}
	
}
