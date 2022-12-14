package com.shop.order.service;

import com.shop.order.model.vo.request.OrderCreateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Date: 2022/7/24 17:12
 * @Description: OrderServiceImpl
 * @Version 1.0.0
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderService orderService;

    @Override
    public Integer create(OrderCreateVO createVO) {
        return orderService.create(createVO);
    }

    @Override
    public Boolean delete(Long id) {
        return orderService.delete(id);
    }
}
