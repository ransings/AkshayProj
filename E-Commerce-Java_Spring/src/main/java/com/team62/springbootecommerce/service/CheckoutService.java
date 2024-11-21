package com.team62.springbootecommerce.service;

import com.team62.springbootecommerce.dto.Purchase;
import com.team62.springbootecommerce.dto.PurchaseResponse;

public interface CheckoutService {


    PurchaseResponse  placeOrder(Purchase purchase);
}
