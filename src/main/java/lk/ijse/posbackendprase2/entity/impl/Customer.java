package lk.ijse.posbackendprase2.entity.impl;

import jakarta.persistence.*;
import lk.ijse.posbackendprase2.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customers")
@Entity
public class Customer implements SuperEntity {
    @Id
    private String customerId;
    private String customerName;
    private String customerAddress;
    private String customerPhone;
}
