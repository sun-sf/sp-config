package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	/**
	 * ��ȡ�û�����
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
