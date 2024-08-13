package org.jlz.entity;

import jakarta.persistence.*;
import org.apache.commons.codec.digest.DigestUtils;

enum TipoUsuarios {
  CLIENTE,
  ADMIN
}

@Entity
@Table(name = "usuarios")
public class Usuarios {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  @Column(name = "id_usuario")
  private Long idUsuario;

  @ManyToOne
  @JoinColumn(name = "id_cliente")
  private Clientes cliente;

  @Column(name = "nombre_usuario")
  private String nombreUsuario;

  @Column(name = "contrasena")
  private String contrasenaHash;

  @Column(name = "tipo_usuario")
  private TipoUsuarios tipoUsuario;

  // Constructors
  public Usuarios() { }

  public Usuarios(Clientes cliente, String contrasenaHash, Long idUsuario, String nombreUsuario, TipoUsuarios tipoUsuario) {
    this.cliente = cliente;
    this.contrasenaHash = contrasenaHash;
    this.idUsuario = idUsuario;
    this.nombreUsuario = nombreUsuario;
    this.tipoUsuario = tipoUsuario;
  }

  // Setters and Getters

  public Clientes getCliente() {
    return cliente;
  }

  public void setCliente(Clientes cliente) {
    this.cliente = cliente;
  }

  public String getContrasenaHash() {
    return contrasenaHash;
  }

  public void setContrasenaHash(String contrasenaHash) {
    this.contrasenaHash = contrasenaHash;
  }

  public Long getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  public String getNombreUsuario() {
    return nombreUsuario;
  }

  public void setNombreUsuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
  }

  public TipoUsuarios getTipoUsuario() {
    return tipoUsuario;
  }

  public void setTipoUsuario(TipoUsuarios tipoUsuario) {
    this.tipoUsuario = tipoUsuario;
  }

  @Override
  public String toString() {
    return "Usuarios{" +
        "cliente=" + cliente +
        ", idUsuario=" + idUsuario +
        ", nombreUsuario='" + nombreUsuario + '\'' +
        ", contrasenaHash='" + contrasenaHash + '\'' +
        ", tipoUsuario=" + tipoUsuario +
        '}';
  }

  // Methods
  // Método para encriptar la contraseña antes de guardarla
  public void setContrasena(String contrasena) {
    this.contrasenaHash = DigestUtils.sha256Hex(contrasena); // Usamos SHA-256
  }

  // Método para verificar la contraseña
  public boolean verificarContrasena(String contrasena) {
    return contrasenaHash.equals(DigestUtils.sha256Hex(contrasena));
  }
}
