package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/**
	 * 通过订单id来获取商品列表
	 * @param orderId
	 * @return
	 */
	List<Item> getItems(String orderId);
	/**
	 * 在保存订单时删减商品
	 * @param order
	 */
	void decreaseNumbers(List<Item> list);

}
