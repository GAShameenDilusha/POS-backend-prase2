package lk.ijse.posbackendprase2.entity.impl;

import jakarta.persistence.*;
import lk.ijse.posbackendprase2.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_details")
public class OrderDetail implements SuperEntity {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private lk.ijse.posbackendprase2.entity.impl.Order order;

    @ManyToOne
    @JoinColumn(name = "item_code", nullable = false)
    private lk.ijse.posbackendprase2.entity.impl.Item item;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private double unitPrice;
}
