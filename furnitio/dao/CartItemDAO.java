package com.niit.furnitio.dao;



import com.niit.furnitio.model.Cart;
import com.niit.furnitio.model.CartItem;

public interface CartItemDAO {
	void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByItemId (int itemId);

}
