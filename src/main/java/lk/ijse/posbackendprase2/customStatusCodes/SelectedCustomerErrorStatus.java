package lk.ijse.posbackendprase2.customStatusCodes;

import lk.ijse.posbackendprase2.dto.CustomerStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedCustomerErrorStatus implements CustomerStatus {
    private int status;
    private String statusMessage;
}
