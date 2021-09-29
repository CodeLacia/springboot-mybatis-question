package com.hao.ums.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class BaseEntity<T extends Model<T>> extends Model<T>{

	private static final long serialVersionUID = 1L;
	
	private String id;
	
	//版本
	@Version
	@TableField(fill = FieldFill.INSERT)
	private Integer version;
	
	//逻辑删除
	@TableLogic
	@TableField(fill = FieldFill.INSERT)
	private Integer deleted;
	
	//创建时间
	@TableField(fill = FieldFill.INSERT)
	private Date createdTime;
	
	//更新时间
	@TableField(update = "now()")
	private Date updatedTime;
	
	//创建人
	@TableField(fill = FieldFill.INSERT)
	private String createdBy;
	
	//更新人
	private String updatedBy;
	
	private String def1;
	
	private String def2;
	
	private String def3;
	
//	@Override
//	protected Serializable pkVal() {
//	    return this.id;
//	}
}
