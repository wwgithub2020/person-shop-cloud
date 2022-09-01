package com.shop.order.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Date: 2022/9/1 22:14
 * @Description: OrderCreateDTO
 * @Version 1.0.0
 */
@Data
@NoArgsConstructor
public class OrderCreateDTO {
    /**
     * 商品名称
     */
    public String shopName;

    /**
     * 订单数量
     */
    public Integer number;
}
