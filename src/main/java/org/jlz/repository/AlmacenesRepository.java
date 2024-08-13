package org.jlz.repository;

import java.util.List;

import org.jlz.entity.Almacenes;
import org.jlz.util.UtilEntity;

import javax.persistence.EntityManager;

public class AlmacenesRepository implements Repository<Almacenes> {
  private final EntityManager entityManager;
  // Constructor
  public AlmacenesRepository() {
    entityManager = UtilEntity.getEntityManager();
  }

  @Override
  public List<Almacenes> findAll(){
    return entityManager.createQuery("SELECT a FROM almacenes a", Almacenes.class).getResultList();
  }

  @Override
  public Almacenes getByUid(Integer id){
    return entityManager.find(Almacenes.class, id);
  }

  @Override
  public void save(Almacenes almacen){
    entityManager.getTransaction().begin();
    if (almacen.getIdAlmacen() == null) {
      // Si no tiene ID, es una nueva entidad, por lo tanto, persistimos
      entityManager.persist(almacen);
    } else {
      // Si tiene ID, es una entidad existente, por lo tanto, actualizamos
      entityManager.merge(almacen);
    }
    entityManager.getTransaction().commit();
  }

  @Override
  public void delete(Integer id){
    Almacenes almacen = entityManager.find(Almacenes.class, id);
    if (almacen != null) {
      entityManager.getTransaction().begin();
      entityManager.remove(almacen);
      entityManager.getTransaction().commit();
    }
  }
}
