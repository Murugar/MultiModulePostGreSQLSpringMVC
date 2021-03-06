package com.iqmsoft.mm.service;

import com.fi.ls.entity.Language;
import com.fi.ls.exceptions.ServiceLayerException;
import com.iqmsoft.mm.dao.LanguageDao;

import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import javax.validation.ConstraintViolationException;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;


@Service
public class LanguageServiceImpl implements LanguageService {
    
    private LanguageDao languageDao;
    
    @Inject
    public LanguageServiceImpl(LanguageDao languageDao){
    	this.languageDao = languageDao;
    }
    
    @Override
    public Language create(Language lan) {
        if(lan == null)
            throw new IllegalArgumentException("Language parameter is null");
        
        try {
            languageDao.create(lan);
            return lan;
        }
        catch(  PersistenceException |
                ConstraintViolationException |
                DataAccessException ex) {
            throw new ServiceLayerException("Problem with creating Language, see inner exception.", ex);
        }
    }

    @Override
    public Set<Language> findAll() {
        try {
            return languageDao.findAll();
        }
        catch(  PersistenceException |
                DataAccessException ex) {
            throw new ServiceLayerException("Problem with finding Language, see inner exception.", ex);
        }
    }

    @Override
    public Language findById(Long id) {
        if(id == null)
            throw new IllegalArgumentException("Id parameter is null");
        
        try {
            return languageDao.findById(id);
        }
        catch(  PersistenceException |
                DataAccessException ex) {
            throw new ServiceLayerException("Problem with finding Language, see inner exception.", ex);
        }
    }

    @Override
    public void remove(Language lan) {
        if(lan == null)
            throw new IllegalArgumentException("Language parameter is null");
        
        try {
            languageDao.remove(lan);
        }
        catch(  PersistenceException |
                DataAccessException ex) {
            throw new ServiceLayerException("Problem with removing Language, see inner exception.", ex);
        }
    }

    @Override
    public Language update(Language lan) {
        if(lan == null)
            throw new IllegalArgumentException("Language parameter is null");
        
        try {
            return languageDao.update(lan);
        }
        catch(  PersistenceException |
                ConstraintViolationException |
                DataAccessException ex) {
            throw new ServiceLayerException("Problem with updating Language, see inner exception.", ex);
        }
    }
}
