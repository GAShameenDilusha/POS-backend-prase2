package lk.ijse.posbackendprase2.dto.impl;

import lk.ijse.posbackendprase2.dto.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements UserStatus {
    private String userId;
    private String username;
    private String email;
    private String password;
    private List<lk.ijse.posbackendprase2.dto.impl.CustomerDto> customerDto;
    private List<lk.ijse.posbackendprase2.dto.impl.ItemDto> itemDto;
}
