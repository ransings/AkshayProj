package com.team62.springbootecommerce.dto;

import lombok.Data;

import java.util.Set;

import com.team62.springbootecommerce.entity.Address;
import com.team62.springbootecommerce.entity.Customer;
import com.team62.springbootecommerce.entity.Order;
import com.team62.springbootecommerce.entity.OrderItem;

@Data
public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;
}
