package org.jlz.entity;

import jakarta.validation.constraints.Min;

import jakarta.persistence.*;
import java.util.Date;


enum TipoMovimiento {
  ENTRADA,
  SALIDA,
  AJUSTE
}

@Entity
@Table(name = "inventario")
public class Inventario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  @Column(name = "id_inventario")
  private Long idInventario;

  @ManyToOne
  @JoinColumn(name = "id_producto")
  private Productos producto;

  @ManyToOne
  @JoinColumn(name = "id_usuario")
  private Usuarios usuario;

  @ManyToOne
  @JoinColumn(name = "id_almacen")
  private Almacenes Almacen;

  @Column(name = "cantidad_disponible")
  @Min(value = 0, message = "La cantidad disponible debe ser mayor o igual a cero")
  private int cantidadDisponible;

  @Column(name = "fecha_movimiento")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaMovimiento;

  @Enumerated(EnumType.STRING)
  @Column(name = "tipo_movimiento")
  private TipoMovimiento tipoMovimiento;

  @Column(name = "id_documento")
  private String idDocumento;

  @Column(name = "observaciones")
  private String observaciones;

  // Contructors
  public Inventario() { }

  public Inventario(Almacenes almacen, int cantidadDisponible, Date fechaMovimiento, String idDocumento, Long idInventario, String observaciones, Productos producto, TipoMovimiento tipoMovimiento, Usuarios usuario) {
    Almacen = almacen;
    this.cantidadDisponible = cantidadDisponible;
    this.fechaMovimiento = fechaMovimiento;
    this.idDocumento = idDocumento;
    this.idInventario = idInventario;
    this.observaciones = observaciones;
    this.producto = producto;
    this.tipoMovimiento = tipoMovimiento;
    this.usuario = usuario;
  }

  //Seters and geters
  public Almacenes getAlmacen() {
    return Almacen;
  }

  public void setAlmacen(Almacenes almacen) {
    Almacen = almacen;
  }

  @Min(value = 0, message = "La cantidad disponible debe ser mayor o igual a cero")
  public int getCantidadDisponible() {
    return cantidadDisponible;
  }

  public void setCantidadDisponible(@Min(value = 0, message = "La cantidad disponible debe ser mayor o igual a cero") int cantidadDisponible) {
    this.cantidadDisponible = cantidadDisponible;
  }


  public Date getFechaMovimiento() {
    return fechaMovimiento;
  }

  public String getIdDocumento() {
    return idDocumento;
  }

  public void setIdDocumento(String idDocumento) {
    this.idDocumento = idDocumento;
  }

  public Long getIdInventario() {
    return idInventario;
  }

  public void setIdInventario(Long idInventario) {
    this.idInventario = idInventario;
  }

  public String getObservaciones() {
    return observaciones;
  }

  public void setObservaciones(String observaciones) {
    this.observaciones = observaciones;
  }

  public Productos getProducto() {
    return producto;
  }

  public void setProducto(Productos producto) {
    this.producto = producto;
  }

  public TipoMovimiento getTipoMovimiento() {
    return tipoMovimiento;
  }

  public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
    this.tipoMovimiento = tipoMovimiento;
  }

  public Usuarios getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuarios usuario) {
    this.usuario = usuario;
  }

  @Override
  public String toString() {
    return "Inventario{" +
        "Almacen=" + Almacen +
        ", idInventario=" + idInventario +
        ", producto=" + producto +
        ", usuario=" + usuario +
        ", cantidadDisponible=" + cantidadDisponible +
        ", fechaMovimiento=" + fechaMovimiento +
        ", tipoMovimiento=" + tipoMovimiento +
        ", idDocumento='" + idDocumento + '\'' +
        ", observaciones='" + observaciones + '\'' +
        '}';
  }
}
