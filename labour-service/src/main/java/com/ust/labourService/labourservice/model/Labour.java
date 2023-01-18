package com.ust.labourService.labourservice.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "labours")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Labour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long labourId;
    private String labourName;
    private String labourAddress;
    private String labourCode;
}
