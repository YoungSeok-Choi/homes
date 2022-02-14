package com.pluto.homes.repository;

import com.pluto.homes.domain.Admin;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AdminRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Admin admin) {
        em.persist(admin);
        return admin.getId();
    }

    public Admin find(Long id) {
        return em.find(Admin.class, id);
    }

}
