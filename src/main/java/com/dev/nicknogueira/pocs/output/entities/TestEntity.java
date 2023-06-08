package com.dev.nicknogueira.pocs.output.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TEST_API")
public class TestEntity implements Serializable {
    @Id
    @GeneratedValue(generator = "SQ_Test", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SQ_Test", sequenceName = "seq_customer", allocationSize = 1)
    @Column(name = "id_test", nullable = false, unique = true, precision = 18)
    private Long id;

    @Column(name = "nm_test", length = 50)
    private String name;
}
