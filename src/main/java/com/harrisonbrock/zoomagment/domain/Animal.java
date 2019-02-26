package com.harrisonbrock.zoomagment.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Setter
@Getter
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "animalId")
    private long Id;

    private String animalType;

    @ManyToMany
    @JsonIgnoreProperties("animals")
    private Set<Zoo> zoos = new HashSet<>();
}
