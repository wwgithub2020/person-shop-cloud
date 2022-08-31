package com.shop.order.convert;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @Date: 2022/7/24 17:14
 * @Description: OrderConvert
 * @Version 1.0.0
 */
@Mapper
public interface OrderConvert {
    OrderConvert INSTANCE = Mappers.getMapper(OrderConvert.class);
}
