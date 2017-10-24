package com.niit.furnitio.dao;



import com.niit.furnitio.model.UserOrder;

public interface OrderDAO {
	void addOrder(UserOrder userOrder);
    double getOrderGrandTotal(int cartId);
}


