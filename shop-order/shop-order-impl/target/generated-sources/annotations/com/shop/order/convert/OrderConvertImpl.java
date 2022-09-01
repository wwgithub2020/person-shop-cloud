package com.shop.order.convert;

import com.shop.order.dal.OrderDO;
import com.shop.order.model.vo.request.OrderCreateVO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-01T22:13:19+0800",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_281 (Oracle Corporation)"
)
public class OrderConvertImpl implements OrderConvert {

    @Override
    public OrderDO convert(OrderCreateVO createVO) {
        if ( createVO == null ) {
            return null;
        }

        OrderDO orderDO = new OrderDO();

        orderDO.setNumber( createVO.getNumber() );
        orderDO.setShopName( createVO.getShopName() );

        return orderDO;
    }
}
