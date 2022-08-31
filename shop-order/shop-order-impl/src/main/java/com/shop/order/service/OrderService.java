package com.shop.order.service;

import com.shop.order.vo.request.OrderCreateVO;

/**
 * @Date: 2022/7/24 17:12
 * @Description: OrderService
 * @Version 1.0.0
 */
public interface OrderService {

    Integer create(OrderCreateVO createVO);
}
