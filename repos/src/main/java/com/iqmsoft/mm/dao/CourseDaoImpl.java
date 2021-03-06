package com.iqmsoft.mm.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import com.fi.ls.entity.Course;
import java.util.HashSet;


@Repository
public class CourseDaoImpl implements CourseDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void create(Course c) {
		em.persist(c);
	}

	@Override
	public Course findById(Long id) {
		return em.find(Course.class, id);
	}

	@Override
	public Course update(Course c) {
		return em.merge(c);
	}

	@Override
	public void remove(Course c) {
		em.remove(em.getReference(Course.class, c.getId()));
	}

	@Override
	public Course findByName(String name) {
		return em.createQuery("SELECT c FROM Course c WHERE c.name=:name", Course.class).setParameter("name", name)
				.getSingleResult();
	}

	@Override
	public Set<Course> findAll() {
		return new HashSet<>(em.createNamedQuery("Course.findAll", Course.class).getResultList());
	}
}
