package lk.ijse.posbackendprase2.service;

import lk.ijse.posbackendprase2.dto.impl.OrderDto;

import java.util.List;

public interface OrderService {
    void saveOrder(OrderDto orderDto);
    OrderDto getOrderById(String orderId);
    List<OrderDto> getAllOrders();
    void updateOrder(String orderId, OrderDto orderDto);
    void deleteOrder(String orderId);
}
