package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

public interface OrderService {
	void addOrder(Order order);
	Order getOrder(String orderId);
}
