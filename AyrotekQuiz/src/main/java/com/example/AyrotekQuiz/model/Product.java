package com.example.AyrotekQuiz.model;

import lombok.*;
import javax.persistence.*;


@Entity
@Table(name = "product")
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private String brand;
    private Long price;
    private Integer unitsInStock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;



}