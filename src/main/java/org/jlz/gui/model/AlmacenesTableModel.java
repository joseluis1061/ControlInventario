package org.jlz.gui.model;
import org.jlz.entity.Almacenes;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class AlmacenesTableModel  extends AbstractTableModel{
  private final String[] columnNames = {"ID", "Nombre", "Dirección", "Teléfono", "Capacidad", "Encargado"};
  private List<Almacenes> almacenes;

  public AlmacenesTableModel(List<Almacenes> almacenes) {
    this.almacenes = almacenes;
  }

  @Override
  public int getRowCount() {
    return almacenes.size();
  }

  @Override
  public int getColumnCount() {
    return columnNames.length;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex)
  {
    Almacenes almacen = almacenes.get(rowIndex);
    switch (columnIndex) {
      case 0:
        return almacen.getIdAlmacen();
      case 1:
        return almacen.getNombre();
      case 2:
        return almacen.getDireccion();
      case 3:
        return almacen.getTelefono();
      case 4:
        return almacen.getCapacidad();
      case 5:
        return almacen.getEncargado();
      default:
        return null;
    }
  }

  @Override
  public String getColumnName(int column) {
    return columnNames[column];
  }
}
