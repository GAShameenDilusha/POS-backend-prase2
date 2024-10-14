package lk.ijse.posbackendprase2.dto.impl;


import lk.ijse.posbackendprase2.dto.ItemStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto implements ItemStatus {
    private String itemCode;
    private String description;
    private String qty;
    private String price;
}
