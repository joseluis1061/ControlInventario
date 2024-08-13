package org.jlz.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UtilEntity {

  // EntityManagerFactory estático y final para toda la aplicación
  private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();

  // Método privado para construir el EntityManagerFactory
  private static EntityManagerFactory buildEntityManagerFactory() {
    // Crea y retorna un EntityManagerFactory usando la unidad de persistencia especificada
    try {
      return Persistence.createEntityManagerFactory("persistenceInventory");
    }
    catch (Exception e) {
      // Manejo de excepciones adecuado
      throw new RuntimeException("Error creating EntityManagerFactory", e);
    }
  }
  // Método público para obtener un nuevo EntityManager
  public static EntityManager getEntityManagerFactory() {
    // Crea y retorna un nuevo EntityManager usando el EntityManagerFactory
    return entityManagerFactory.createEntityManager();
  }
}
