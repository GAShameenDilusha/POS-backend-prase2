package lk.ijse.posbackendprase2.customStatusCodes;

import lk.ijse.posbackendprase2.dto.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedOrderErrorStatus implements OrderStatus {
    private int status;
    private String statusMessage;
}
