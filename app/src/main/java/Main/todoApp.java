package Main;

import controller.ProjectController;
import model.Project;
import java.util.List;

public class todoApp {

    public static void main(String[] args) {

        try {
            ProjectController projectController = new ProjectController();

            List<Project> projects = projectController.getAll();

            System.out.println("--------------------------------------");

            for (Project project : projects) {
                System.out.println(project.getName());
                System.out.println(project.getDescription());
                System.out.println("--------------------------------------");
            }

            System.out.println("Total de projetos: " + projects.size());
        } catch (Exception ex) {
            throw new RuntimeException("erro main: " + ex.getMessage(), ex);
        }
    }
}
