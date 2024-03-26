package com.rest.api.SpringMagic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.api.SpringMagic.Model.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
    // spring provides all the basic crud operations. No Coding!
}