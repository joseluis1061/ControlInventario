package org.jlz.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "productos_ordenes_de_ventas")
public class ProductoOrdenesDeVentas {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  @Column(name = "id_producto_orden_de_venta")
  private Long idProductoOrdenDeVenta;

  @ManyToOne
  @Column(name = "id_producto")
  private Long idProducto;

  @ManyToOne
  @Column(name = "id_orden_de_venta")
  private Long idOrdenDeVenta;

  //Constructors
  public ProductoOrdenesDeVentas() {}

  public ProductoOrdenesDeVentas(Long idOrdenDeVenta, Long idProducto, Long idProductoOrdenDeVenta) {
    this.idOrdenDeVenta = idOrdenDeVenta;
    this.idProducto = idProducto;
    this.idProductoOrdenDeVenta = idProductoOrdenDeVenta;
  }

  // Setters and getters

  public Long getIdOrdenDeVenta() {
    return idOrdenDeVenta;
  }

  public void setIdOrdenDeVenta(Long idOrdenDeVenta) {
    this.idOrdenDeVenta = idOrdenDeVenta;
  }

  public Long getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(Long idProducto) {
    this.idProducto = idProducto;
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
        "idOrdenDeVenta=" + idOrdenDeVenta +
        ", idProductoOrdenDeVenta=" + idProductoOrdenDeVenta +
        ", idProducto=" + idProducto +
        '}';
  }
}
