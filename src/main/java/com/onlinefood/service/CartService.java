package com.onlinefood.service;

import com.onlinefood.model.Cart;

public interface CartService {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
