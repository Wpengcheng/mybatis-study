package com.weipch.mapper;

import com.weipch.po.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 方唐镜
 * @Create 2024-07-04 20:01
 * @Description
 */
public interface UserMapper{

	User getUserById(@Param("id") Integer id);
	
	void updateUser(User user);
	
	void insertUser(User user);
	
	void deleteUserById(@Param("id") Integer id);


}
