import javax.swing.table.AbstractTableModel;

class ProductTableModel extends AbstractTableModel {
    private String[] columnNames = { "Product ID" , "Product Name" , "Current Quantity" };

    private Object[][] data = {
        { "Mary", "Campione", "Snowboarding" },
        { "Alison", "Huml","sha"},
        { "Kathy", "Walrath", "Knitting"},
        { "Sharon", "Zakhour", "Speed reading"},
        { "Philip", "Milne", "Pool" }};

    public int getColumnCount() {
      return columnNames.length;
    }

    public int getRowCount() {
      return data.length;
    }

    public String getColumnName(int col) {
      return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
      return data[row][col];
    }

    /*
     * JTable uses this method to determine the default renderer/ editor for
     * each cell. If we didn't implement this method, then the last column
     * would contain text ("true"/"false"), rather than a check box.
     */
    public Class getColumnClass(int c) {
      return getValueAt(0, c).getClass();
    }

    /*
     * Don't need to implement this method unless your table's editable.
     */
    public boolean isCellEditable(int row, int col) {
      //Note that the data/cell address is constant,
      //no matter where the cell appears onscreen.
      if (col < 2) {
        return false;
      } else {
        return true;
      }
    }

    /*
     * Don't need to implement this method unless your table's data can
     * change.
     */
 
  }
