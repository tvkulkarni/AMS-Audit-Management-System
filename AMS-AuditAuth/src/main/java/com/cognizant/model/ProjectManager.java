package com.cognizant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
 * 
 * This class will be used for storing the user credentials in database and then using it to authenticate the user
 */
@Entity
@Table(name="ProjectManager")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProjectManager {
	
	@Id
	@Column(name="userid" ,length=20)
	private String userId;
	@Column(name="upassword",length=20)
	private String password;
	@Column(name="authtoken")
	private String authToken;
		

	

	
	
	
}
