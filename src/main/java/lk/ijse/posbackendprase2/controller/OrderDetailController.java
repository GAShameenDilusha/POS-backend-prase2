package lk.ijse.posbackendprase2.controller;

import lk.ijse.posbackendprase2.dto.impl.OrderDetailDto;
import lk.ijse.posbackendprase2.exception.OrderDetailNotFoundException;
import lk.ijse.posbackendprase2.service.OrderDetailService;
import lk.ijse.posbackendprase2.util.RegexUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/order-details")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> saveOrderDetail(@RequestBody OrderDetailDto orderDetailDto) {
        try {
            orderDetailService.saveOrderDetail(orderDetailDto);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/{orderDetailId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrderDetailDto> getOrderDetailById(@PathVariable("orderDetailId") String orderDetailId) {
        if (!RegexUtil.isValidOrderDetailId(orderDetailId)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try {
            OrderDetailDto orderDetailDto = orderDetailService.getOrderDetailById(orderDetailId);
            return new ResponseEntity<>(orderDetailDto, HttpStatus.OK);
        } catch (OrderDetailNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OrderDetailDto> getAllOrderDetails() {
        return orderDetailService.getAllOrderDetails();
    }

    @PutMapping(value = "/{orderDetailId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateOrderDetail(@PathVariable("orderDetailId") String orderDetailId, @RequestBody OrderDetailDto orderDetailDto) {
        if (!RegexUtil.isValidOrderDetailId(orderDetailId)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try {
            orderDetailService.updateOrderDetail(orderDetailId, orderDetailDto);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (OrderDetailNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(value = "/{orderDetailId}")
    public ResponseEntity<Void> deleteOrderDetail(@PathVariable("orderDetailId") String orderDetailId) {
        if (!RegexUtil.isValidOrderDetailId(orderDetailId)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try {
            orderDetailService.deleteOrderDetail(orderDetailId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (OrderDetailNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
