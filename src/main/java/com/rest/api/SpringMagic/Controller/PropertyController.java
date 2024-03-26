package com.rest.api.SpringMagic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rest.api.SpringMagic.Model.Property;
import com.rest.api.SpringMagic.Service.PropertyService;

import java.util.List;

@RestController
public class PropertyController {

    private final PropertyService propertyService;

    @Autowired
    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @PostMapping("properties")
    public ResponseEntity<Property> createProperty(@RequestBody Property property) {
        Property savedProperty = propertyService.saveProperty(property);
        return new ResponseEntity<>(savedProperty, HttpStatus.CREATED);
    }
}