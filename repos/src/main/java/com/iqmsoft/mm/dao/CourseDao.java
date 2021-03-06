package com.iqmsoft.mm.dao;

import java.util.List;

import com.fi.ls.entity.Course;
import java.util.Set;


public interface CourseDao {

	/**
	 * create new course in database 
	 * @param c specific Course to be created
	 */
	public void create(Course c);
	
	/**
	 * finds specific course by id
	 * @param id of a course that would be returned
	 * @return specific course by id
	 */
	public Course findById(Long id);
	
	/**
	 * finds specific course by name
	 * @param name of a course that would be returned
	 * @return specific course by name 
	 */
	public Course findByName(String name);
	
	/**
	 * updates given course
	 * @param c course that has to be updated
	 * @return updated course
	 */
	public Course update(Course c);
	
	/**
	 * removes given course
	 * @param c course that has to be removed
	 */
	public void remove(Course c);
	
	/**
	 * Returns all courses in language school
	 * @return List of courses which are in language school
	 */
	public Set<Course> findAll();
	
}
