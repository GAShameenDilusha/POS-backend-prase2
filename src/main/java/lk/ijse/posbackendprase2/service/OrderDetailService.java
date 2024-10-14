package lk.ijse.posbackendprase2.service;



import lk.ijse.posbackendprase2.dto.impl.OrderDetailDto;

import java.util.List;

public interface OrderDetailService {
    void saveOrderDetail(OrderDetailDto orderDetailDto);
    OrderDetailDto getOrderDetailById(String orderDetailId);
    List<OrderDetailDto> getAllOrderDetails();
    void updateOrderDetail(String orderDetailId, OrderDetailDto orderDetailDto);
    void deleteOrderDetail(String orderDetailId);
}
