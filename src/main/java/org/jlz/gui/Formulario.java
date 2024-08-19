package org.jlz.gui;

import javax.swing.*;

public class Formulario {
  private JFrame frame;
  private JPanel Principal;
  private JButton abrirParaIngresarComidaButton;
  private JButton a7Button;
  private JButton a8Button;
  private JButton a9Button;
  private JButton a4Button;
  private JButton a5Button;
  private JButton a6Button;
  private JButton a1Button;
  private JButton a2Button;
  private JButton a3Button;
  private JButton agregarButton;
  private JButton a0Button;
  private JButton cancelarButton;
  private JPanel Botones;
  private JTextField tiempo;

  public Formulario(){
    frame = new JFrame();
    frame.setContentPane(Principal);
    frame.setTitle("FORMULARIO");
    frame.setSize(600,400);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Formulario();
  }
}
