package org.jlz.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilEntity {

  // EntityManagerFactory estático y final para toda la aplicación
  private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();

  // Método privado para construir el EntityManagerFactory
  private static EntityManagerFactory buildEntityManagerFactory() {
    // Crea y retorna un EntityManagerFactory usando la unidad de persistencia especificada
    return Persistence.createEntityManagerFactory("persistenceInventory");
  }

  // Método público para obtener un nuevo EntityManager
  public static EntityManager getEntityManagerFactory() {
    // Crea y retorna un nuevo EntityManager usando el EntityManagerFactory
    return entityManagerFactory.createEntityManager();
  }
}
