package com.niit.furnitio.dao;


import java.io.IOException;

import com.niit.furnitio.model.Cart;


public interface CartDAO {
	 Cart getCartById (int cartId);
Cart validate(int cartId) throws IOException;
	   void update(Cart cart);
}

