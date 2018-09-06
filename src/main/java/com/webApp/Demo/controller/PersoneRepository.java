package com.webApp.Demo.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.webApp.Demo.domain.Persone;

@Component
public interface PersoneRepository extends JpaRepository<Persone,Long>{
}
