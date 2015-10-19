import javax.swing.table.AbstractTableModel;

class ProductTableModel extends AbstractTableModel {
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Product ID" , "Product Name" , "Quantity", "Yearly Sales" };

    private Object[][] data = {
        { "1", "Red Gnome", 15433, 70100},
        { "2", "Blue Gnome",12001, 78965},
        { "3", "Green Gnome", 22970, 55465},
        { "4", "Zombie Gnome", 2245, 38556},
        { "5", "Angry Gnome", 11745, 24132},
        { "6", "Fat Gnome",12445, 84556},
        { "7", "Christmas Gnome", 20001, 15001},
        { "8", "Football Gnome", 23889, 63918},
        { "9", "Basketball Gnome", 15446, 24084 },
        { "10", "Drunken Gnome", 6554, 127553},
        { "11", "Wizard Gnome", 28001, 58966},
        { "12", "Warrior Gnome", 14336, 13001},
        { "13", "Nerdy Gnome", 38999, 86033},
        { "14", "Garden Table",1290, 2338},
        { "15", "Rake", 7665, 12778},
        { "16", "Stool", 1450, 2361},
        { "17", "Garden Kit", 776, 1001},
        { "18", "Jacuzzi", 120, 340}};

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
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public Class getColumnClass(int c) {
      return getValueAt(0, c).getClass();
    }

    /*
     * Don't need to implement this method unless your table's editable.
     */
    public boolean isCellEditable(int row, int col) {
      //Note that the data/cell address is constant,
      //no matter where the cell appears onscreen.
      if (col < 3) {
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
