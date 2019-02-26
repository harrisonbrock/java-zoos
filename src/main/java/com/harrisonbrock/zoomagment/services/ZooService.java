package com.harrisonbrock.zoomagment.services;

import com.harrisonbrock.zoomagment.domain.Zoo;
import com.harrisonbrock.zoomagment.exceotions.ZooIdException;
import com.harrisonbrock.zoomagment.repositories.ZooRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Zoo findZooById(long id) {
        Optional<Zoo> zoo = repository.findById(id);

        if (zoo.isEmpty()) {
            throw new ZooIdException("Zoo ID '" + id + "' does not exist");
        }
        else {
            return zoo.get();
        }
    }
}
