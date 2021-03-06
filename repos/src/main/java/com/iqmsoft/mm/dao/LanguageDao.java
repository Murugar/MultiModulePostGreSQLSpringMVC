package com.iqmsoft.mm.dao;

import com.fi.ls.entity.Language;
import java.util.List;
import java.util.Set;


public interface LanguageDao {
    
	/**
	 * create new Language in database 
	 * @param lan specific Language to be created
	 */
	public void create(Language lan);
	
	/**
	 * finds specific Language by id
	 * @param id of a Language that would be returned
	 * @return specific Language by id
	 */
	public Language findById(Long id);
	
	/**
	 * updates given Language
	 * @param lan Language that has to be updated
	 * @return updated Language
	 */
	public Language update(Language lan);
	
	/**
	 * removes given Language
	 * @param lan Language that has to be removed
	 */
	public void remove(Language lan);
	
	/**
	 * Returns all Languages
	 * @return List of Languages
	 */
	public Set<Language> findAll();
    
}
