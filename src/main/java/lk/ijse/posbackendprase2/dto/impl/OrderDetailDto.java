package lk.ijse.posbackendprase2.dto.impl;

import lk.ijse.posbackendprase2.dto.OrderDetailStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailDto implements OrderDetailStatus {
    private Long id;
    private String itemCode;
    private int quantity;
    private double unitPrice;
}
