package com.harrisonbrock.zoomagment.controller;

import com.harrisonbrock.zoomagment.domain.Zoo;
import com.harrisonbrock.zoomagment.services.MapValidationErrorService;
import com.harrisonbrock.zoomagment.services.ZooService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/zoos")
public class ZooController {

    private final ZooService zooService;
    private final MapValidationErrorService errorService;

    public ZooController(ZooService service, MapValidationErrorService errorService) {
        this.zooService = service;
        this.errorService = errorService;
    }

    @PostMapping
    public ResponseEntity<?> createNewZoo(@Valid @RequestBody Zoo newZoo, BindingResult result) {

        ResponseEntity<?> errorMap = errorService.mapValidationService(result);

        if (errorMap != null) return  errorMap;
        Zoo zoo = zooService.addNewZoon(newZoo);
        return new ResponseEntity<>(zoo, HttpStatus.CREATED);
    }
}
