package com.harrisonbrock.zoomagment.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@Setter
@Getter
@Table(name = "telephoneNumbers")
public class TelephoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phoneId")
    private long id;

    @NotBlank
    private String phoneType;

    @NotBlank
    private  String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "zooId")
    @JsonIgnoreProperties("zoos")
    private Zoo zoo;
}
