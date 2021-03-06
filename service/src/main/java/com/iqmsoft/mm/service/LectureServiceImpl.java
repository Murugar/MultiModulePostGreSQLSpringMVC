package com.iqmsoft.mm.service;

import com.fi.ls.entity.Lecture;
import com.fi.ls.exceptions.ServiceLayerException;
import com.iqmsoft.mm.dao.LectureDao;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import javax.validation.ConstraintViolationException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;


@Service
public class LectureServiceImpl implements LectureService {
    
    private LectureDao lectureDao;
    
    @Inject
    public LectureServiceImpl(LectureDao lectureDao){
        
    	this.lectureDao = lectureDao;
        
    }

    @Override
    public Lecture create(Lecture lecture) {
        
        if(lecture == null) {
            
            throw new IllegalArgumentException("Param can not be null!");
            
        }
        try {
            
            lectureDao.create(lecture);
            return lecture;
            
        } catch (ConstraintViolationException | InvalidDataAccessApiUsageException | JpaSystemException | PersistenceException e) {
            
            throw new ServiceLayerException("Creating Lecture failed!", e);
            
        }
        
        
    }

    @Override
    public Lecture findById(Long id) {
        
        if(id == null) {
            
            throw new IllegalArgumentException("Param can not be null!");
            
        }
        try {
            
            return lectureDao.findById(id);
            
        } catch (InvalidDataAccessApiUsageException |JpaSystemException | PersistenceException  e) {
            
            throw new ServiceLayerException("An error occured while finding the Lecture!", e);
            
        }
        
    }

    @Override
    public Lecture update(Lecture lecture) {
        
        if(lecture == null) {
            
            throw new IllegalArgumentException("Param can not be null!");
            
        }
        try {
            
            return lectureDao.update(lecture);
        
        } catch (ConstraintViolationException | InvalidDataAccessApiUsageException | JpaSystemException | NoSuchElementException | PersistenceException e) {
            
            throw new ServiceLayerException("An error occured while updating the Lecture!", e);
            
        }
        
    }

    @Override
    public void remove(Lecture lecture) {
        
        if(lecture == null) {
            
            throw new IllegalArgumentException("Param can not be null!");
            
        }
        try {
            
            lectureDao.remove(lecture);
            
        } catch (InvalidDataAccessApiUsageException | JpaSystemException | PersistenceException e) {
            
            throw new ServiceLayerException("An error occured while removing the Lecture!", e);
            
        }
            
    }

    @Override
    public Set<Lecture> findAll() {
        
        try {
            
            return lectureDao.findAll();
            
        } catch (JpaSystemException | PersistenceException e) {
            
            throw new ServiceLayerException("An error occured while getting all Lectures!", e);
            
        }
        
    }
    
}