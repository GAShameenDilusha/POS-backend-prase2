package lk.ijse.posbackendprase2.customStatusCodes;

import lk.ijse.posbackendprase2.dto.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedUserErrorStatus implements UserStatus {
    private int status;
    private String statusMessage;
}
