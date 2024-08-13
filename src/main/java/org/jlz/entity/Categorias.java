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
  private String nombre;

  @Column(name = "descripcion")
  private String descripcion;

  //Contructors
  public Categorias() {}

  public Categorias(String descripcion, Long idCategoria, String nombre) {
    this.descripcion = descripcion;
    this.idCategoria = idCategoria;
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public Long getIdCategoria() {
    return idCategoria;
  }

  public void setIdCategoria(Long idCategoria) {
    this.idCategoria = idCategoria;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
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
