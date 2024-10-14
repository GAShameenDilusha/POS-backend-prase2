package lk.ijse.posbackendprase2.dao;

import lk.ijse.posbackendprase2.entity.impl.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDao extends JpaRepository<Item, String> {
}
