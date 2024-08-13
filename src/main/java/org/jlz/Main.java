package org.jlz;
import jakarta.persistence.EntityManager;

import org.jlz.entity.Almacenes;
import org.jlz.util.UtilEntity;

import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    try (EntityManager em = UtilEntity.getEntityManagerFactory()) {
      List<Almacenes> almacenes = em.createQuery("SELECT a FROM Almacenes a", Almacenes.class).getResultList();
      System.out.println("------- Listar Datos -------");
      almacenes.forEach(System.out::println);
      System.out.println("----------------------------\n");
    } catch (Exception e) {
      e.printStackTrace();
      // Manejo de excepciones específico
    }
  }
}

