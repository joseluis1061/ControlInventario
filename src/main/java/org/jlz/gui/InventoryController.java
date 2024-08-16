package org.jlz.gui;
import javax.swing.*;

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
  private JTable almacenesTable;
  private JPanel Almacenes;

  public InventoryController(){
    setContentPane(contentPane);
    setTitle("GUI control de inventarios");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(300, 200);
    setLocationRelativeTo(null);
    setVisible(true);


  }

  public static void main(String[] args) {
    new InventoryController();
  }
}
