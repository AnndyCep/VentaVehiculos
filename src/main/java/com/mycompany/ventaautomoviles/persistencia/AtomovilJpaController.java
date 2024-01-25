
package com.mycompany.ventaautomoviles.persistencia;

import com.mycompany.ventaautomoviles.logica.Atomovil;
import com.mycompany.ventaautomoviles.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class AtomovilJpaController implements Serializable {

    public AtomovilJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public AtomovilJpaController(){
        emf = Persistence.createEntityManagerFactory("autoUP");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Atomovil atomovil) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(atomovil);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Atomovil atomovil) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            atomovil = em.merge(atomovil);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = atomovil.getId_automovil();
                if (findAtomovil(id) == null) {
                    throw new NonexistentEntityException("The atomovil with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Atomovil atomovil;
            try {
                atomovil = em.getReference(Atomovil.class, id);
                atomovil.getId_automovil();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The atomovil with id " + id + " no longer exists.", enfe);
            }
            em.remove(atomovil);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Atomovil> findAtomovilEntities() {
        return findAtomovilEntities(true, -1, -1);
    }

    public List<Atomovil> findAtomovilEntities(int maxResults, int firstResult) {
        return findAtomovilEntities(false, maxResults, firstResult);
    }

    private List<Atomovil> findAtomovilEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Atomovil.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Atomovil findAtomovil(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Atomovil.class, id);
        } finally {
            em.close();
        }
    }

    public int getAtomovilCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Atomovil> rt = cq.from(Atomovil.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
