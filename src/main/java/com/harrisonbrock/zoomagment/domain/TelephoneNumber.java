package com.harrisonbrock.zoomagment.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Embeddable
public class TelephoneNumber {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "phoneId")
//    private long id;

    @NotBlank
    private String phoneType;

    @NotBlank
    private  String phoneNumber;

    public TelephoneNumber() {
    }

    public TelephoneNumber(@NotBlank String phoneType, @NotBlank String phoneNumber) {
        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //    @ManyToOne
//    @JoinColumn(name = "zooId")
//    @JsonIgnoreProperties("zoos")
//    private Zoo zoo;
}
