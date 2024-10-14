package lk.ijse.posbackendprase2.service.impl;


import lk.ijse.posbackendprase2.customStatusCodes.SelectedCustomerErrorStatus;
import lk.ijse.posbackendprase2.dao.CustomerDao;
import lk.ijse.posbackendprase2.dto.CustomerStatus;
import lk.ijse.posbackendprase2.dto.impl.CustomerDto;
import lk.ijse.posbackendprase2.entity.impl.Customer;
import lk.ijse.posbackendprase2.exception.CustomerNotFoundException;
import lk.ijse.posbackendprase2.exception.DataPersistException;
import lk.ijse.posbackendprase2.service.CustomerService;
import lk.ijse.posbackendprase2.util.AppUtil;
import lk.ijse.posbackendprase2.util.Mapping;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao dao;

    @Autowired
    private Mapping mapping;

    @Override
    public void saveCustomer(CustomerDto dto) {
        dto.setCustomerId(AppUtil.generateCustomerId());
        Customer savedCustomer = dao.save(mapping.toCustomerEntity(dto));

        if (savedCustomer == null){
            throw new DataPersistException("Customer has not saved");
        }
    }

    @Override
    public void deleteCustomer(String id) {
        Optional<Customer> foundCustomer = dao.findById(id);

        if (!foundCustomer.isPresent()){
            throw new CustomerNotFoundException("Customer Not Found");
        }
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        List<Customer> allCustomer = dao.findAll();
        return mapping.asCustomerDto(allCustomer);
    }

    @SneakyThrows
    @Override
    public CustomerStatus getCustomer(String id) {
        if (dao.existsById(id)){
            Customer selectedCustomer = dao.getReferenceById(id);
            return mapping.toCustomerDto(selectedCustomer);
        } else {
            return new SelectedCustomerErrorStatus(2, "Selected Customer Not Found");
        }
    }

    @Override
    public void updateCustomer(CustomerDto dto, String id) {
        Optional<Customer> byId = dao.findById(id);

        if (!byId.isPresent()){
            throw new CustomerNotFoundException("Customer Not Found");
        } else {
            byId.get().setCustomerName(dto.getCustomerName());
            byId.get().setCustomerAddress(dto.getCustomerAddress());
            byId.get().setCustomerPhone(dto.getCustomerPhone());
        }
    }
}
