package com.harrisonbrock.zoomagment.repositories;

import com.harrisonbrock.zoomagment.domain.Zoo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZooRepository extends JpaRepository<Zoo, Long> {
}
