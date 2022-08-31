package com.shop.order.vo.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Date: 2022/7/24 18:05
 * @Description: OrderCreateVO
 * @Version 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderCreateVO {
    /**
     * 商品名称
     */
    public String shopName;

    /**
     * 订单数量
     */
    public Integer number;
}
