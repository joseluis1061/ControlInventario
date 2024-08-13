package org.jlz.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "productos_proveedores")
public class ProductosProveedores {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  @Column(name = "id_productos_proveedores")
  private Long idProductosProveedores;

  @ManyToOne
  @JoinColumn(name = "id_producto")
  private Productos producto;

  @ManyToOne
  @JoinColumn(name = "id_proveedor")
  private Proveedores proveedor;

  //Contructors
  public ProductosProveedores() {}

  public ProductosProveedores(Long idProductosProveedores, Productos producto, Proveedores proveedor) {
    this.idProductosProveedores = idProductosProveedores;
    this.producto = producto;
    this.proveedor = proveedor;
  }

  //Getters and Setters

  public Productos getProducto() {
    return producto;
  }

  public void setProducto(Productos producto) {
    this.producto = producto;
  }

  public Long getIdProductosProveedores() {
    return idProductosProveedores;
  }

  public void setIdProductosProveedores(Long idProductosProveedores) {
    this.idProductosProveedores = idProductosProveedores;
  }

  public Proveedores getProveedor() {
    return proveedor;
  }

  public void setProveedor(Proveedores proveedor) {
    this.proveedor = proveedor;
  }

  @Override
  public String toString() {
    return "ProductosProveedores{" +
        "idProductosProveedores=" + idProductosProveedores +
        ", producto=" + producto +
        ", proveedor=" + proveedor +
        '}';
  }
}
