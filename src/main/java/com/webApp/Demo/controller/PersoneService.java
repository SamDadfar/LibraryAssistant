package com.webApp.Demo.controller;

import java.util.List;
import java.util.Optional;

import com.webApp.Demo.domain.Persone;
import com.webApp.Demo.exceptions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class PersoneService {
	@Autowired
	PersoneRepository repository;
	
	public List<Persone> findAll(){
		return repository.findAll();
	}
	public void save(Persone student) {
		repository.save(student);
	}
	public Persone findById(long id) {
		return repository.findById(id).orElseThrow(()->new RuntimeException());
	}
	public void updateStudent(long id,Persone student) {
		Optional<Persone> temp=null;
		try {
		temp=repository.findById(id);
		repository.save(temp.orElseThrow(()->new RuntimeException()));
		}catch(NotFoundStudentException e) {new NotFoundStudentException();}
		
	}
	public void deleteById(long id) {
		repository.deleteById(id);
	}
	public void deleteAll() {
		repository.deleteAll();
	}
}
