package com.iqmsoft.mm.dao;

import com.fi.ls.entity.Language;
import com.fi.ls.entity.Lecturer;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class LecturerDaoImpl implements LecturerDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void create(Lecturer l) {
		em.persist(l);
	}

	@Override
	public Lecturer findById(Long id) {
		return em.find(Lecturer.class, id);
	}

	@Override
	public Lecturer update(Lecturer l) {
		return em.merge(l);
	}

	@Override
	public void remove(Lecturer l) {
		Lecturer toRemove = em.getReference(Lecturer.class, l.getId());
		em.remove(toRemove);
	}

	@Override
	public Set<Lecturer> findAll() {
		return new HashSet<>(em.createNamedQuery("Lecturer.findAll", Lecturer.class).getResultList());
	}

        @Override
        public Set<Language> findAllLecturerLanguages(Lecturer l) {
                return new HashSet<>(em.createNamedQuery("Lecturer.findAllLecturerLanguages", Language.class).setParameter("lID", l.getId()).getResultList());
        }

}
