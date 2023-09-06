
package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;

/**
 *
 * @author Gabriel
 */
public class DeadlineColumnCellReader extends DefaultTableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        //Cells are by default rendered as a JLabel.
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        label.setHorizontalAlignment( CENTER );

        //Get the status for the current row.
        TaskTableModel taskModel = (TaskTableModel) table.getModel();
        Task task = taskModel.getTasks().get(row);

        if (task.getDeadLine().equals(new Date())) {
            label.setBackground(Color.YELLOW);
        } else {
            if (task.getDeadLine().after(new Date())) {
                label.setBackground(Color.GREEN);
            } else {
                label.setBackground(Color.RED);
            }
        }
        //Return the JLabel which renders the cell.
        return label;
    }
}
