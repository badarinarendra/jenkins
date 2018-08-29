package com.connecttwogurukul.base.vo.security;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class RolesVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String roleName;
	private String description;
	private Boolean default_;
	private long level;
	private long parentId;
	private Set userVOs = new HashSet(0);
	private Set schoolVOs = new HashSet(0);
	private Set roleModuleVOs = new HashSet(0);
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getDefault_() {
		return default_;
	}
	public void setDefault_(Boolean default_) {
		this.default_ = default_;
	}
	public long getLevel() {
		return level;
	}
	public void setLevel(long level) {
		this.level = level;
	}
	public long getParentId() {
		return parentId;
	}
	public void setParentId(long parentId) {
		this.parentId = parentId;
	}
	public Set getUserVOs() {
		return userVOs;
	}
	public void setUserVOs(Set userVOs) {
		this.userVOs = userVOs;
	}
	public Set getSchoolVOs() {
		return schoolVOs;
	}
	public void setSchoolVOs(Set schoolVOs) {
		this.schoolVOs = schoolVOs;
	}
	public Set getRoleModuleVOs() {
		return roleModuleVOs;
	}
	public void setRoleModuleVOs(Set roleModuleVOs) {
		this.roleModuleVOs = roleModuleVOs;
	}
	
	
	
}
