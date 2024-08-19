package org.jlz.gui.controller;
import javax.swing.*;
import java.awt.*;

public class InventoryController extends JFrame{
  private JPanel contentPane;
  private JButton almacenesButton;
  private JButton categoriasButton;
  private JButton clientesButton;
  private JButton inventarioButton;
  private JButton ordenDeCompraButton;
  private JButton ordenDeVentaButton;
  private JButton productosButton;
  private JButton proveedoresButton;
  private JButton usuariosButton;
  private JTabbedPane tabbedPane1;
  private JPanel asideNavigate;
  private JPanel Almacenes;
  private JTable almacenesTable;
  private JButton button1Button;
  private JButton button2Button;

  private Container panel;
  private JButton boton1;
  private JButton boton2;

  private String[] columnNames = {"First Name",
      "Last Name",
      "Sport",
      "# of Years",
      "Vegetarian"};

  public InventoryController(){
    super("Control de inventario"); // Titulo
    setContentPane(contentPane);  // Contenedor que se llama al instanciar la clase
    setTitle("Control de inventarios");  // Titulo
    setDefaultCloseOperation(EXIT_ON_CLOSE); // Accion al dar click en la X == Cerrar
    setSize(600, 700); // Tamaño por defecto
    //setBounds(0,0, 1200, 968); //Tamaño por defecto y posición donde se muestre al abrir
    setLocationRelativeTo(null);
    setVisible(true); // Verse en pantalla
  }

  public static void main(String[] args) {
    new InventoryController();
  }
}
