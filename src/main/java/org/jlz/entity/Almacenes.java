package org.jlz.entity;

import javax.persistence.*;

@Entity
@Table (name= "almacenes")
public class Almacenes {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  @Column(name="id_almacen")
  private int idAlmacen;

  @Column(name="nombre")
  private String nombre;

  @Column(name="direccion")
  private String direccion;

  @Column(name="telefono")
  private String telefono;

  @Column(name="capacidad")
  private int capacidad;

  @Column(name="encargado")
  private String encargado;

  //Contructors
  public Almacenes() {}

  public Almacenes(int capacidad, String direccion, String encargado, int idAlmacen, String nombre, String telefono) {
    this.capacidad = capacidad;
    this.direccion = direccion;
    this.encargado = encargado;
    this.idAlmacen = idAlmacen;
    this.nombre = nombre;
    this.telefono = telefono;
  }

  public int getCapacidad() {
    return capacidad;
  }

  public void setCapacidad(int capacidad) {
    this.capacidad = capacidad;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getEncargado() {
    return encargado;
  }

  public void setEncargado(String encargado) {
    this.encargado = encargado;
  }

  public int getIdAlmacen() {
    return idAlmacen;
  }

  public void setIdAlmacen(int id_almacen) {
    this.idAlmacen = id_almacen;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  @Override
  public String toString() {
    return "Almacenes{" +
        "capacidad=" + capacidad +
        ", idAlmacen=" + idAlmacen +
        ", nombre='" + nombre + '\'' +
        ", direccion='" + direccion + '\'' +
        ", telefono='" + telefono + '\'' +
        ", encargado='" + encargado + '\'' +
        '}';
  }
}
