package com.weipch.po;

import lombok.Data;

/**
 * @Author 方唐镜
 * @Create 2024-07-04 20:00
 * @Description
 */
@Data
public class User {
 
 
	private Integer id;
	private String username;
	private String password;
	private Boolean enabled;
}
