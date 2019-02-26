package com.harrisonbrock.zoomagment.repositories;

import com.harrisonbrock.zoomagment.domain.Zoo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ZooRepository extends JpaRepository<Zoo, Long> {

    Optional<Zoo> findZooByName(String name);
}
