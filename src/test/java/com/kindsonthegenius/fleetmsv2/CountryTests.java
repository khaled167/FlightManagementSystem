package com.kindsonthegenius.fleetmsv2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.fms.parameters.models.Country;
import com.fms.parameters.repositories.CountryRepository;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CountryTests {

    @Autowired
    private CountryRepository repository;

    //FindByID
    @Test
    public void testFindById(){
        Country country = repository.findById(2).orElse(null);
        assertNotNull(country);
    }

    @Test
    public void testFindByIdEmpty(){
        Country country = repository.findById(100).orElse(null);
        assertNotNull(country);
    }


    @Test
    public void testFindByIdNull(){
        Country country = repository.findById(100).orElse(null);
        assertNull(country);
    }

    //FindByIdEmp


}
