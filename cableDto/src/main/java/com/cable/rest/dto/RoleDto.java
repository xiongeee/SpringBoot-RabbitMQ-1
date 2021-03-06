package com.cable.rest.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleDto implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Getter	@Setter	
	protected Long roleId;
	
	@Getter	@Setter	
	protected String roleName;
	
	@Getter	@Setter	
	protected Boolean roleActive = false;

}
