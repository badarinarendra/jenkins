package com.connecttwogurukul.base.vo.security;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class UserVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private SchoolVO school;
	private Boolean issuperadmin;
	private Set roleVOs = new HashSet(0);
	private Long[] selectedRoles;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SchoolVO getSchool() {
		return school;
	}
	public void setSchool(SchoolVO school) {
		this.school = school;
	}
	public Boolean getIssuperadmin() {
		return issuperadmin;
	}
	public void setIssuperadmin(Boolean issuperadmin) {
		this.issuperadmin = issuperadmin;
	}
	public Set getRoleVOs() {
		return roleVOs;
	}
	public void setRoleVOs(Set roleVOs) {
		this.roleVOs = roleVOs;
	}
	public Long[] getSelectedRoles() {
		return selectedRoles;
	}
	public void setSelectedRoles(Long[] selectedRoles) {
		this.selectedRoles = selectedRoles;
	}
	
}
