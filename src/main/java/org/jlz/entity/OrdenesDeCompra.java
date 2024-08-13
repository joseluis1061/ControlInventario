package org.jlz.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ordenes_de_compra")
public class OrdenesDeCompra {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  @Column(name = "id_orden_de_compra")
  private Long idOrdenDeCompra;

  @Column(name = "fecha")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fecha;

  @Column(name = "total")
  private Float total;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_proveedor", nullable = false)
  private Proveedores proveedor;

  //Contructors
  public OrdenesDeCompra() { }

  public OrdenesDeCompra(Date fecha, Long idOrdenDeCompra, Proveedores proveedor, Float total) {
    this.fecha = fecha;
    this.idOrdenDeCompra = idOrdenDeCompra;
    this.proveedor = proveedor;
    this.total = total;
  }

  // Setters adn Getters

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public Long getIdOrdenDeCompra() {
    return idOrdenDeCompra;
  }

  public void setIdOrdenDeCompra(Long idOrdenDeCompra) {
    this.idOrdenDeCompra = idOrdenDeCompra;
  }

  public Proveedores getProveedor() {
    return proveedor;
  }

  public void setProveedor(Proveedores proveedor) {
    this.proveedor = proveedor;
  }

  public Float getTotal() {
    return total;
  }

  public void setTotal(Float total) {
    this.total = total;
  }


}
