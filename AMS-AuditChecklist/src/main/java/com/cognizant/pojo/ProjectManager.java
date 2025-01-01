package com.cognizant.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

/*
 * Used for the user , where he will have a userID, PWD and Token
 */
public class ProjectManager {

	private String userId;
	private String password;
	private String authToken;

}
