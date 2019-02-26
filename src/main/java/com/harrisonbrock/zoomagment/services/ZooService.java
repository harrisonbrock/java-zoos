package com.harrisonbrock.zoomagment.services;

import com.harrisonbrock.zoomagment.domain.Zoo;
import com.harrisonbrock.zoomagment.repositories.ZooRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZooService {

    private final ZooRepository repository;

    public ZooService(ZooRepository repository) {
        this.repository = repository;
    }

    public Zoo addNewZoo(Zoo zoo) {

        return repository.save(zoo);
    }

    public List<Zoo> getAllZoos() {
        return repository.findAll();
    }
}
