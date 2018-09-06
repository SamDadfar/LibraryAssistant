package com.webApp.Demo.controller;

import java.util.List;
import java.util.Optional;

import com.webApp.Demo.domain.Persone;
import com.webApp.Demo.exceptions.*;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
		return repository.findOne(id);
	}
	public void updateStudent(long id,Persone student) {
		Persone temp=null;
		try {
		temp=repository.findOne(id);
		repository.save(temp);
		}catch(NotFoundStudentException e) {new NotFoundStudentException();}
		
	}
	public void deleteById(long id) {
		repository.delete(id);
	}
	public void deleteAll() {
		repository.deleteAll();
	}
}
