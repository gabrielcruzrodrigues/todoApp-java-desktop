
package controller;

import model.Task;
import java.util.List;
import util.ConnectionFactory;

import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TaskController {
    
    public void save(Task task) {
        String sql = "INSERT INTO tasks (idProject, name, description"
                + "completed, notes, deadLine, cratedAt, updatedAt) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(2, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadLine().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.execute();
            
        } catch(Exception ex) {
            throw new RuntimeException("Erro ao salvar task." + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
    }
    
    public void update(Task task) {
        
    }
    
    public void removeById(int taskId) throws SQLException { 
        String sql = "DELETE FROM tasks WHERE id = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, taskId);
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar a tarefa." + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }
    }
    
    public List<Task> getAll(int idProject) {
        return null;
    }
}
