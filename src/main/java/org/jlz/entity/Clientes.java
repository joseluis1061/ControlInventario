package org.jlz.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Clientes {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  @Column(name = "id_cliente")
  private Long idCliente;


  @Column(name = "nombre")
  private String nombre;

  @Column(name = "apellido")
  private String apellido;

  @Column(name = "direccion")
  private String direccion;

  @Column(name = "telefono")
  private String telefono;

  @Column(name = "email")
  private String email;

  // Contructors
  public Clientes() {}

  public Clientes(String apellido, String direccion, String email, Long idCliente, String nombre, String telefono) {
    this.apellido = apellido;
    this.direccion = direccion;
    this.email = email;
    this.idCliente = idCliente;
    this.nombre = nombre;
    this.telefono = telefono;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

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

  public Long getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(int id_cliente) {
    this.idCliente = idCliente;
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
    return "Clientes{" +
        "apellido='" + apellido + '\'' +
        ", idCliente=" + idCliente +
        ", nombre='" + nombre + '\'' +
        ", direccion='" + direccion + '\'' +
        ", telefono='" + telefono + '\'' +
        ", email='" + email + '\'' +
        '}';
  }
}
