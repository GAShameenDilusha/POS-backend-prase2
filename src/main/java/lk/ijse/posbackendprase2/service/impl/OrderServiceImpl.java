package lk.ijse.posbackendprase2.service.impl;


import lk.ijse.posbackendprase2.dto.impl.OrderDto;
import lk.ijse.posbackendprase2.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public void saveOrder(OrderDto orderDto) {

    }

    @Override
    public OrderDto getOrderById(String orderId) {
        return null;
    }

    @Override
    public List<OrderDto> getAllOrders() {
        return List.of();
    }

    @Override
    public void updateOrder(String orderId, OrderDto orderDto) {

    }

    @Override
    public void deleteOrder(String orderId) {

    }
}
