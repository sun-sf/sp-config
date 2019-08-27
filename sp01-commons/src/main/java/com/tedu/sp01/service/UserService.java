package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	/**
	 * 获取用户数据
	 * @param id
	 * @return
	 */
	User getUser(Integer id);
	/**
	 * 
	 * @param id
	 * @param score
	 */
	void addScore(Integer id, Integer score);

}
