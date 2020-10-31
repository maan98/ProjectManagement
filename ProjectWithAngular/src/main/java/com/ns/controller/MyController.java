package com.ns.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ns.model.Project;
import com.ns.service.ProjectService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins="http://localhost:4200")
public class MyController {
	
	@Autowired
	ProjectService ps;
	
	
	@GetMapping("/projects")
	public List<Project> getAllProjects(){
		return ps.getAllProjects();
	}
	
	@GetMapping("/projects/{id}")
	public Project getprojectById(@PathVariable int id) {
		return ps.getprojectById(id);
	}
	
	@PostMapping("/projects")
	public Project insertProject(@RequestBody Project p) {
		return ps.insertProject(p);
	}
	
	
	  @PutMapping("/projects")
	  public Project updateProject(@RequestBody Project p) {
	  return ps.updateproject(p); }
	 
	
	@GetMapping("/projects/afterDelete/{id}")
		public List<Project> deleteProject(@PathVariable int id) {
			ps.deleteProject(id);
			return ps.getAllProjects();
		}

}
