package org.jlz.entity;

import javax.persistence.*;

@Entity
@Table(name = "productos_orden_de_compra")
public class ProductosOrdenesDeCompras {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  @Column(name = "id_productos_orden_de_compra")
  private Long idProductosOrdenDeCompra;

  @ManyToOne
  @Column(name = "id_producto")
  private Productos producto;

  @ManyToOne
  @Column(name = "id_orden_de_compra")
  private Productos idOrdenDeCompra;

  //Contructors
  public ProductosOrdenesDeCompras() {}

  public ProductosOrdenesDeCompras(Productos idOrdenDeCompra, Long idProductosOrdenDeCompra, Productos producto) {
    this.idOrdenDeCompra = idOrdenDeCompra;
    this.idProductosOrdenDeCompra = idProductosOrdenDeCompra;
    this.producto = producto;
  }

  // Getters and setters
  public Productos getIdOrdenDeCompra() {
    return idOrdenDeCompra;
  }

  public void setIdOrdenDeCompra(Productos idOrdenDeCompra) {
    this.idOrdenDeCompra = idOrdenDeCompra;
  }

  public Long getIdProductosOrdenDeCompra() {
    return idProductosOrdenDeCompra;
  }

  public void setIdProductosOrdenDeCompra(Long idProductosOrdenDeCompra) {
    this.idProductosOrdenDeCompra = idProductosOrdenDeCompra;
  }

  public Productos getProducto() {
    return producto;
  }

  public void setProducto(Productos producto) {
    this.producto = producto;
  }

  @Override
  public String toString() {
    return "ProductosOrdenesDeCompras{" +
        "idOrdenDeCompra=" + idOrdenDeCompra +
        ", idProductosOrdenDeCompra=" + idProductosOrdenDeCompra +
        ", producto=" + producto +
        '}';
  }
}

