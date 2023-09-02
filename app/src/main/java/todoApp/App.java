
package todoApp;

import controller.ProjectController;
import model.Project;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        ProjectController projectController = new ProjectController();
        Project project = new Project();
        project.setName("aprender java");
        project.setDescription("teste para o meu aprendizado em java");
        projectController.save(project);
        
//        project.setName("new name");
//        projectController.update(project);
//        
//        List<Project> projects = projectController.getAll();
//        System.out.println("Total de projetos" + projects.size());  
    }
}
