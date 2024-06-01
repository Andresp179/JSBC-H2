package Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
