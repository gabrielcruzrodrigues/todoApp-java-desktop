
package util;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import java.util.List;
import model.Task;

/**
 *
 * @author Gabriel
 */
public class TaskTableModel extends AbstractTableModel {
    
    String[] columns = {"Nome", "Descrição", "Prazo", "Tarefa Concluída", "Editar", "Excluir"};
    List<Task> tasks = new ArrayList();

    @Override
    public int getRowCount() {
        return tasks.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex) {
            case 1:
                return tasks.get(rowIndex).getName(); 
            case 2:
                return tasks.get(rowIndex).getDescription();
            case 3: 
                return tasks.get(rowIndex).getDeadLine();
            case 4: 
                return tasks.get(rowIndex).isIsCompleted();
            case 5: 
                return "";
            case 6:
                return "";
            default:
                return "Dados não encontrados";
        }
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
 