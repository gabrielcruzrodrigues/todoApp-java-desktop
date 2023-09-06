
package util;

import java.text.SimpleDateFormat;
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
    
    //recebe um object da interface e transforma em boolean
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        tasks.get(rowIndex).setIsCompleted((boolean) aValue);
    }
    
    //retorna os nomes das colunas
    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }
    
    //defini que apenas a coluna 3 (tarefas concluidas sejam editáveis)
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 3;
    }
    
    //retorna o tipo da classe do primeiro campo da coluna e se fir boolean os transforma em check
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        
        if (tasks.isEmpty()) {
            return Object.class;
        }
        
        return this.getValueAt(0, columnIndex).getClass();
    }

    //model para tasks
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex) {
            case 0:
                return tasks.get(rowIndex).getName(); 
            case 1:
                return tasks.get(rowIndex).getDescription();
            case 2: 
                
                //Colocando a data no formato dd/mm/yyyy
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                //retornando a data formatada
                return dateFormat.format(tasks.get(rowIndex).getDeadLine());
                
            case 3: 
                return tasks.get(rowIndex).isIsCompleted();
            case 4: 
                return "";
            case 5:
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
 