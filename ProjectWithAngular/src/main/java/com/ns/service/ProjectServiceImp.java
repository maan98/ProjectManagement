package com.ns.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ns.model.Project;
import com.ns.repository.ProjectRepository;

@Service
public class ProjectServiceImp implements ProjectService {

	@Autowired
	ProjectRepository prepo;
	
	@Override
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return prepo.findAll();
	}
    
	@Override
	public Project getprojectById(int id) {
		// TODO Auto-generated method stub
		  Optional<Project> project=prepo.findById(id);
		return project.get();
	}

	@Override
	public Project insertProject(Project p) {
		
		return prepo.save(p);
	}

	@Override
	public void deleteProject(int id) {
		prepo.deleteById(id);
		
	}

	@Override
	public Project updateproject(Project p) {
		Optional<Project> project=prepo.findById(p.getId());
		Project pro=project.get();
		pro.setDescription(p.getDescription());
		pro.setDomain(p.getDomain());
		return prepo.save(pro);
	}

}
