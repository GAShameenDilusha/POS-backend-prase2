package lk.ijse.posbackendprase2.dao;

import lk.ijse.posbackendprase2.entity.impl.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailDao extends JpaRepository<OrderDetail, String> {
}
