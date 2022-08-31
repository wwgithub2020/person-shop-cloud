package com.shop.order.dal;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Date: 2022/7/24 17:07
 * @Description: 订单属性
 * @Version 1.0.0
 */
@Data
@TableName("shop_order")
@NoArgsConstructor
@AllArgsConstructor
public class OrderDO implements Serializable {


    /**
     * 主键ID
     */
    public Integer oid;

    /**
     * 订单数量
     */
    public Integer number;

    /**
     * 父级ID
     */
    public Integer pid;

    /**
     * 商品名称
     */
    public String shopName;

    /**
     * 用户ID
     */
    public Integer uid;

    /**
     * 用户名
     */
    public String username;
}
