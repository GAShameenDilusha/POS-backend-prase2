package lk.ijse.posbackendprase2.customStatusCodes;

import lk.ijse.posbackendprase2.dto.ItemStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedItemErrorStatus implements ItemStatus {
    private int status;
    private String statusMessage;
}
