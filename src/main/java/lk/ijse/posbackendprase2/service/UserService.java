package lk.ijse.posbackendprase2.service;

import lk.ijse.posbackendprase2.dto.impl.UserDto;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    UserDto getUserById(String userId);
    List<UserDto> getAllUsers();
    void updateUser(String userId, UserDto userDto);
    void deleteUser(String userId);
}
