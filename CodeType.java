package com.cy.module.sys.po;

import com.cy.common.persistence.BaseEntity;

public class CodeType extends BaseEntity<CodeType> {


	/**
	 * 
	 */
	private String code;
	private String name   ;
	private String status ;


	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
