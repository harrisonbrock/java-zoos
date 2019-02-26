package com.harrisonbrock.zoomagment.services;

import com.harrisonbrock.zoomagment.domain.Zoo;
import com.harrisonbrock.zoomagment.repositories.ZooRepository;
import org.springframework.stereotype.Service;

@Service
public class ZooService {

    private final ZooRepository repository;

    public ZooService(ZooRepository repository) {
        this.repository = repository;
    }

    public Zoo addNewZoon(Zoo zoo) {

        return repository.save(zoo);
    }
}
