package com.maykermiyanaga.webpager.order.domain;

import jakarta.persistence.Entity;
import lombok.Getter;

@Getter
@Entity
public class Order {
    private String name;
    private String code;
}
