package lk.ijse.posbackendprase2.service;



import lk.ijse.posbackendprase2.dto.CustomerStatus;
import lk.ijse.posbackendprase2.dto.impl.CustomerDto;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDto dto);
    void deleteCustomer(String id);
    List<CustomerDto> getAllCustomers();
    CustomerStatus getCustomer(String id);
    void updateCustomer(CustomerDto dto, String id);
}
