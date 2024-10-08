package org.jlz.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "proveedores")
public class Proveedores {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  @Column(name = "id_proveedor")
  private Long idProveedor;

  @Column(name = "nombre")
  private String nombre;
  @Column(name = "direccion")
  private String direccion;
  @Column(name = "telefono")
  private String telefono;
  @Column(name = "email")
  private String email;

  //Contructors
  public Proveedores() {}

  public Proveedores(String direccion, String email, Long idProveedor, String nombre, String telefono) {
    this.direccion = direccion;
    this.email = email;
    this.idProveedor = idProveedor;
    this.nombre = nombre;
    this.telefono = telefono;
  }

  //Getters and setters
  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Long getIdProveedor() {
    return idProveedor;
  }

  public void setIdProveedor(Long idProveedor) {
    this.idProveedor = idProveedor;
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
    return "Proveedores{" +
        "direccion='" + direccion + '\'' +
        ", idProveedor=" + idProveedor +
        ", nombre='" + nombre + '\'' +
        ", telefono='" + telefono + '\'' +
        ", email='" + email + '\'' +
        '}';
  }
}
