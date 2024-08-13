package org.jlz.repository;

import java.sql.SQLException;
import java.util.List;

public interface Repository<T> {
  // Listar
  List<T> findAll();
  // Leer por Id
  T getByUid(Integer id);
  // Salvar
  void save(T t);
  // Eliminar
  void delete(Integer id);
}
