package org.jlz.entity;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Productos {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  @Column(name = "productos")
  private Long id_producto;

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "descripcion")
  private String descripcion;

  @Column(name = "precio_compra")
  private Float precioCompra;

  @Column(name = "precio_venta")
  private Float precioVenta;

  @Column(name = "cantidad")
  private int cantidad;

  @ManyToOne
  @Column(name = "id_categoria")
  private Categorias categoria;

  @Column(name = "unidad_de_medida")
  private String unidadDeMedida;

  //Constructos
  public Productos() { }

  public Productos(int cantidad, Categorias categoria, String descripcion, Long id_producto, String nombre, Float precioCompra, Float precioVenta, String unidadDeMedida) {
    this.cantidad = cantidad;
    this.categoria = categoria;
    this.descripcion = descripcion;
    this.id_producto = id_producto;
    this.nombre = nombre;
    this.precioCompra = precioCompra;
    this.precioVenta = precioVenta;
    this.unidadDeMedida = unidadDeMedida;
  }

  //Getters and setters

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public Categorias getCategoria() {
    return categoria;
  }

  public void setCategoria(Categorias categoria) {
    this.categoria = categoria;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Long getId_producto() {
    return id_producto;
  }

  public void setId_producto(Long id_producto) {
    this.id_producto = id_producto;
  }

  public Float getPrecioCompra() {
    return precioCompra;
  }

  public void setPrecioCompra(Float precioCompra) {
    this.precioCompra = precioCompra;
  }

  public Float getPrecioVenta() {
    return precioVenta;
  }

  public void setPrecioVenta(Float precioVenta) {
    this.precioVenta = precioVenta;
  }

  public String getUnidadDeMedida() {
    return unidadDeMedida;
  }

  public void setUnidadDeMedida(String unidadDeMedida) {
    this.unidadDeMedida = unidadDeMedida;
  }

  @Override
  public String toString() {
    return "Productos{" +
        "cantidad=" + cantidad +
        ", id_producto=" + id_producto +
        ", nombre='" + nombre + '\'' +
        ", descripcion='" + descripcion + '\'' +
        ", precioCompra=" + precioCompra +
        ", precioVenta=" + precioVenta +
        ", categoria=" + categoria +
        ", unidadDeMedida='" + unidadDeMedida + '\'' +
        '}';
  }
}
