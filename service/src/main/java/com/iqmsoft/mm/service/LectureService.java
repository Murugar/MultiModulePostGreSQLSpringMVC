package com.iqmsoft.mm.service;

import com.fi.ls.entity.Lecture;
import java.util.List;
import java.util.Set;


public interface LectureService {

    /**
     * creates new Lecture in database 
     * @param lecture Lecture to be created
     * @return created Lecture
     */
    public Lecture create(Lecture lecture);
	
    /**
     * finds Lecture specified by its id
     * @param id of a Lecture
     * @return found Lecture or NULL
     */
    public Lecture findById(Long id);
	
    /**
     * updates specified Lecture
     * @param lecture Lecture to be updated
     * @return updated Lecture
     */
    public Lecture update(Lecture lecture);
	
    /**
     * removes specified Lecture
     * @param lecture Lecture to be removed
     */
    public void remove(Lecture lecture);
	
    /**
     * returns all Lectures
     * @return List of Lectures
     */
    public Set<Lecture> findAll();
    
}