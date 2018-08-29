package com.connecttwogurukul.base.vo.security;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ModuleVO implements Serializable, Comparable<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String moduleName;
	private String description;
	private String link;
	private Boolean default_;
	private long level;
	private long parentId;
	private Boolean access;
	private Set schools = new HashSet(0);
	private Set roleModules = new HashSet(0);
	private List<ModuleVO> moduleVOs = new ArrayList<ModuleVO>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
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
	public Set getSchools() {
		return schools;
	}
	public void setSchools(Set schools) {
		this.schools = schools;
	}
	public Set getRoleModules() {
		return roleModules;
	}
	public void setRoleModules(Set roleModules) {
		this.roleModules = roleModules;
	}
	public List<ModuleVO> getModuleVOs() {
		return moduleVOs;
	}
	public void setModuleVOs(List<ModuleVO> moduleVOs) {
		this.moduleVOs = moduleVOs;
	}
	public Boolean getAccess() {
		return access;
	}
	public void setAccess(Boolean access) {
		this.access = access;
	}
	
	@Override
	public int hashCode() {
		return this.id.intValue();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.id.longValue() == ((ModuleVO)obj).id.longValue();
	}
	@Override
	public int compareTo(Long o) {
		if (this.id.longValue() == o.longValue()) {
			return 1;
		}
		return 0;
	}
	

}
