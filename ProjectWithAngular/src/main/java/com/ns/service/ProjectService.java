package com.ns.service;

import java.util.List;

import com.ns.model.Project;

public interface ProjectService {

	public List<Project> getAllProjects();
	public Project getprojectById(int id);
	public Project insertProject(Project p);
	public void deleteProject(int id);
	public Project updateproject(Project p);

}
