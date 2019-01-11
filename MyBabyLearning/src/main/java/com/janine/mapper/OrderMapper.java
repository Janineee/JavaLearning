package com.janine.mapper;

import com.janine.pojo.Order;
import com.janine.pojo.OrderUser;

import java.util.List;

public interface OrderMapper {
    List<Order> getOrderList();
    List<OrderUser> getOrderUser();
    List<Order> getOrderUserMap();


}
