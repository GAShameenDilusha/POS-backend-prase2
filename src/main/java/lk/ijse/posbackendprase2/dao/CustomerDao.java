package lk.ijse.posbackendprase2.dao;

import lk.ijse.posbackendprase2.entity.impl.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<Customer, String> {
}
