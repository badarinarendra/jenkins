package com.connecttwogurukul.base.vo.security;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class SchoolVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String schoolName;
	private Set roleVOs = new HashSet(0);
	private Set userVOs = new HashSet(0);
	private Set moduleVOs = new HashSet(0);
	private Long userId;
	private Long[] selectedRoles;
	private Long[] selectedModules;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public Set getRoleVOs() {
		return roleVOs;
	}
	public void setRoleVOs(Set roleVOs) {
		this.roleVOs = roleVOs;
	}
	public Set getUserVOs() {
		return userVOs;
	}
	public void setUserVOs(Set userVOs) {
		this.userVOs = userVOs;
	}
	public Set getModuleVOs() {
		return moduleVOs;
	}
	public void setModuleVOs(Set moduleVOs) {
		this.moduleVOs = moduleVOs;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long[] getSelectedRoles() {
		return selectedRoles;
	}
	public void setSelectedRoles(Long[] selectedRoles) {
		this.selectedRoles = selectedRoles;
	}
	public Long[] getSelectedModules() {
		return selectedModules;
	}
	public void setSelectedModules(Long[] selectedModules) {
		this.selectedModules = selectedModules;
	}

}
