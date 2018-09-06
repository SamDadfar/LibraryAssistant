package com.webApp.Demo.controller;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webApp.Demo.domain.Persone;
import com.webApp.Demo.exceptions.NotFoundStudentException;


@RestController
@RequestMapping("api")
public class PersoneController {
	@Autowired
	PersoneService service;
@RequestMapping("/")
public String showIndex() {
	return "index.html";
}

@RequestMapping({"/students","sts"})
public @ResponseBody Iterable<Persone> getAll(){
	return service.findAll();
}
@RequestMapping("/cool-students")
public Collection<Persone> coolStudent(){
	return service.findAll().stream().filter(this::isCool).collect(Collectors.toList());
}
private boolean isCool(Persone student) {
	return !student.getPersoneName().equals("sam");
}
@RequestMapping("/students/{id}")
public @ResponseBody Persone getById(@PathVariable long id){
	return service.findById(id);
}
@RequestMapping(method=RequestMethod.POST , value="/students")
public void addStudent(@RequestBody Persone student) {
	service.save(student);
}

@RequestMapping(method=RequestMethod.PUT , value="/students/{id}")
public void updateStudent(@RequestBody Persone student, @PathVariable long id){
	service.updateStudent(id, student);
}
@RequestMapping(method=RequestMethod.DELETE , value="/students/{id}")
public void updateStudent(@PathVariable long id){
	service.deleteById(id);
}
@RequestMapping(method=RequestMethod.DELETE , value="/students")
public void updateStudent(){
	service.deleteAll();
}
}

