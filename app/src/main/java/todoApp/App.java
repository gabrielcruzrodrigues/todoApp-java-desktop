
package todoApp;

import controller.ProjectController;
import model.Project;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        ProjectController projectController = new ProjectController();
        
        List<Project> projects = projectController.getAll();
        
        System.out.println("--------------------------------------");
        
        for (Project project : projects) {
            System.out.println(project.getName());
            System.out.println(project.getDescription());
            System.out.println("--------------------------------------");
        }
        
        System.out.println("Total de projetos: " + projects.size());  
    }
}
