package org.jlz.entity;

import javax.persistence.*;

@Entity
@Table(name = "categorias")
public class Categorias {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  @Column(name = "id_categoria")
  private Long idCategoria;

  @Column(name = "nombre")
  private int nombre;

  @Column(name = "descripcion")
  private int descripcion;

  //Contructors
  public Categorias() {}

  public Categorias(int descripcion, Long idCategoria, int nombre) {
    this.descripcion = descripcion;
    this.idCategoria = idCategoria;
    this.nombre = nombre;
  }

  public int getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(int descripcion) {
    this.descripcion = descripcion;
  }

  public Long getIdCategoria() {
    return idCategoria;
  }

  public void setIdCategoria(Long idCategoria) {
    this.idCategoria = idCategoria;
  }

  public int getNombre() {
    return nombre;
  }

  public void setNombre(int nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Categorias{" +
        "descripcion=" + descripcion +
        ", idCategoria=" + idCategoria +
        ", nombre=" + nombre +
        '}';
  }
}
