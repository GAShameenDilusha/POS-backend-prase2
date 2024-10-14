package lk.ijse.posbackendprase2.util;

import lk.ijse.posbackendprase2.entity.impl.OrderDetail;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Mapping {
    @Autowired
    private ModelMapper modelMapper;

    //Customer DTO, Entity & List of Customers
    public lk.ijse.posbackendprase2.entity.impl.Customer toCustomerEntity(lk.ijse.posbackendprase2.dto.impl.CustomerDto dto){
        return modelMapper.map(dto, lk.ijse.posbackendprase2.entity.impl.Customer.class);
    }

    public lk.ijse.posbackendprase2.dto.impl.CustomerDto toCustomerDto(lk.ijse.posbackendprase2.entity.impl.Customer customer){
        return modelMapper.map(customer, lk.ijse.posbackendprase2.dto.impl.CustomerDto.class);
    }

    public List<lk.ijse.posbackendprase2.dto.impl.CustomerDto> asCustomerDto(List<lk.ijse.posbackendprase2.entity.impl.Customer> customerList){
        return modelMapper.map(customerList, new TypeToken<List<lk.ijse.posbackendprase2.dto.impl.CustomerDto>>() {}.getType());
    }


    //Item DTO, Entity & List of Items
    public lk.ijse.posbackendprase2.entity.impl.Item toItemEntity(lk.ijse.posbackendprase2.dto.impl.ItemDto dto){
        return modelMapper.map(dto, lk.ijse.posbackendprase2.entity.impl.Item.class);
    }

    public lk.ijse.posbackendprase2.dto.impl.ItemDto toItemDto(lk.ijse.posbackendprase2.entity.impl.Item item){
        return modelMapper.map(item, lk.ijse.posbackendprase2.dto.impl.ItemDto.class);
    }

    public List<lk.ijse.posbackendprase2.dto.impl.ItemDto> asItemDto(List<lk.ijse.posbackendprase2.entity.impl.Item> itemList) {
        return modelMapper.map(itemList, new TypeToken<List<lk.ijse.posbackendprase2.dto.impl.ItemDto>>() {}.getType());
    }

    //Order DTO, Entity & List of Orders
    public lk.ijse.posbackendprase2.entity.impl.Order toOrderEntity(lk.ijse.posbackendprase2.dto.impl.OrderDto dto){
        return modelMapper.map(dto, lk.ijse.posbackendprase2.entity.impl.Order.class);
    }

    public lk.ijse.posbackendprase2.dto.impl.OrderDto toOrderDto(lk.ijse.posbackendprase2.entity.impl.Order order){
        return modelMapper.map(order, lk.ijse.posbackendprase2.dto.impl.OrderDto.class);
    }

    public List<lk.ijse.posbackendprase2.dto.impl.OrderDto> asOrderDto(List<lk.ijse.posbackendprase2.entity.impl.Order> orderList){
        return modelMapper.map(orderList, new TypeToken<List<lk.ijse.posbackendprase2.dto.impl.OrderDto>>() {}.getType());
    }

    //Order Details DTO, Entity & List of Order Details
    public OrderDetail toOrderDetailEntity(lk.ijse.posbackendprase2.dto.impl.OrderDetailDto dto){
        return modelMapper.map(dto, OrderDetail.class);
    }

    public lk.ijse.posbackendprase2.dto.impl.OrderDetailDto toOrderDetailDto(OrderDetail orderDetail){
        return modelMapper.map(orderDetail, lk.ijse.posbackendprase2.dto.impl.OrderDetailDto.class);
    }

    public List<lk.ijse.posbackendprase2.dto.impl.OrderDetailDto> asOrderDetailDto(List<OrderDetail> orderDetailList){
        return modelMapper.map(orderDetailList, new TypeToken<List<OrderDetail>>() {}.getType());
    }
}
