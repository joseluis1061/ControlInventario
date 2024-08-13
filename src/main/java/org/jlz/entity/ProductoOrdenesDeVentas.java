package org.jlz.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "productos_ordenes_de_ventas")
public class ProductoOrdenesDeVentas {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  @Column(name = "id_producto_orden_de_venta")
  private Long idProductoOrdenDeVenta;

  @ManyToOne
  @JoinColumn(name = "id_producto")
  private Productos producto;

  @ManyToOne
  @JoinColumn(name = "id_orden_de_venta")
  private OrdenesDeVenta ordenesDeVenta;

  //Constructors
  public ProductoOrdenesDeVentas() {}

  public ProductoOrdenesDeVentas(OrdenesDeVenta ordenesDeVenta, Productos producto, Long idProductoOrdenDeVenta) {
    this.ordenesDeVenta = ordenesDeVenta;
    this.producto = producto;
    this.idProductoOrdenDeVenta = idProductoOrdenDeVenta;
  }

  // Setters and getters

  public OrdenesDeVenta getIdOrdenDeVenta() {
    return ordenesDeVenta;
  }

  public void setIdOrdenDeVenta(OrdenesDeVenta idOrdenDeVenta) {
    this.ordenesDeVenta = idOrdenDeVenta;
  }

  public Productos getIdProducto() {
    return producto;
  }

  public void setIdProducto(Productos producto) {
    this.producto = producto;
  }

  public Long getIdProductoOrdenDeVenta() {
    return idProductoOrdenDeVenta;
  }

  public void setIdProductoOrdenDeVenta(Long idProductoOrdenDeVenta) {
    this.idProductoOrdenDeVenta = idProductoOrdenDeVenta;
  }

  @Override
  public String toString() {
    return "ProductoOrdenesDeVentas{" +
        "OrdenesDeVenta=" + ordenesDeVenta +
        ", idProductoOrdenDeVenta=" + idProductoOrdenDeVenta +
        ", producto=" + producto +
        '}';
  }
}
