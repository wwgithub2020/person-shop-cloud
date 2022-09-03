package com.shop.order.controller;

import com.shop.common.framework.domain.CommonResult;
import com.shop.order.service.OrderService;
import com.shop.order.model.vo.request.OrderCreateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Date: 2022/7/24 16:59
 * @Description: 订单控制层
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public CommonResult<Integer> create(OrderCreateVO createVO) {
        return CommonResult.success(orderService.create(createVO));
    }

    @DeleteMapping("/delete/{id}")
    public CommonResult<Boolean> delete(@PathVariable("id") Long id) {
        return CommonResult.success(orderService.delete(id));
    }
}
