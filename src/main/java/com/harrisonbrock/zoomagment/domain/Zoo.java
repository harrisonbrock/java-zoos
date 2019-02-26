package com.harrisonbrock.zoomagment.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Setter
@Getter
@Table(name = "zoos")
public class Zoo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "zooName")
    @NotBlank
    private String name;

    @OneToMany(mappedBy = "zoo")
    @JsonIgnoreProperties("zoo")
    private Set<TelephoneNumber> telephoneNumbers = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "telephoneNumbers",
            joinColumns = {@JoinColumn(name = "zooId")},
            inverseJoinColumns = {@JoinColumn(name = "zooId")})
    @JsonIgnoreProperties("zoos")
    private Set<Animal> animals = new HashSet<>();

}
