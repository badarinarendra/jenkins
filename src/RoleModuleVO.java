package com.connecttwogurukul.base.vo.security;

import java.io.Serializable;

public class RoleModuleVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private RolesVO roleVO;
	private ModuleVO moduleVO;
	private Boolean allow;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public RolesVO getRoleVO() {
		return roleVO;
	}
	public void setRoleVO(RolesVO roleVO) {
		this.roleVO = roleVO;
	}
	public ModuleVO getModuleVO() {
		return moduleVO;
	}
	public void setModuleVO(ModuleVO moduleVO) {
		this.moduleVO = moduleVO;
	}
	public Boolean getAllow() {
		return allow;
	}
	public void setAllow(Boolean allow) {
		this.allow = allow;
	}

}
