package org.jlz.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ordenes_de_venta")
public class OrdenesDeVenta {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  @Column(name = "id_ordenes_de_venta")
  private Long idOrdenesDeVenta;

  @Column(name = "fecha")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fecha;

  @Column(name= "total")
  private Float total;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_cliente", nullable = false)
  private Clientes  cliente;

  // Constructors
  public OrdenesDeVenta() {}

  public OrdenesDeVenta(Clientes cliente, Date fecha, Long idOrdenesDeVenta, Float total) {
    this.cliente = cliente;
    this.fecha = fecha;
    this.idOrdenesDeVenta = idOrdenesDeVenta;
    this.total = total;
  }

  // Getters and setters
  public Clientes getCliente() {
    return cliente;
  }

  public void setCliente(Clientes cliente) {
    this.cliente = cliente;
  }

  public Date getFecha() {
    return fecha;
  }

  public Long getIdOrdenesDeVenta() {
    return idOrdenesDeVenta;
  }

  public void setIdOrdenesDeVenta(Long idOrdenesDeVenta) {
    this.idOrdenesDeVenta = idOrdenesDeVenta;
  }

  public Float getTotal() {
    return total;
  }

  public void setTotal(Float total) {
    this.total = total;
  }

  @Override
  public String toString() {
    return "OrdenesDeVenta{" +
        "cliente=" + cliente +
        ", idOrdenesDeVenta=" + idOrdenesDeVenta +
        ", fecha=" + fecha +
        ", total=" + total +
        '}';
  }
}
