package view;

import java.util.List;
import java.awt.Color;
import java.awt.Font;
import controller.ProjectController;
import model.Project;
import controller.TaskController;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import model.Task;
import util.TaskTableModel;
import model.Task;
import util.ButtonColumnCellRederer;
import util.DeadlineColumnCellReader;

/**
 *
 * @author Gabriel
 */
public class MainScream extends javax.swing.JFrame {

    ProjectController projectController;
    TaskController taskController;

    //modelo da jList visual padrao
    DefaultListModel projectsModel;
    TaskTableModel taskModel;

    public MainScream() {
        initComponents();
        initDataController();
        initComponentsModel();
        decorateTableTask();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();
        tooBar = new javax.swing.JPanel();
        tooBarTitle = new javax.swing.JLabel();
        tooBarSubtitle = new javax.swing.JLabel();
        projectsPanel = new javax.swing.JPanel();
        projectsTitle = new javax.swing.JLabel();
        projectsAdd = new javax.swing.JLabel();
        tasksPanel = new javax.swing.JPanel();
        tasksTitle = new javax.swing.JLabel();
        tasksAdd = new javax.swing.JLabel();
        projectsList = new javax.swing.JPanel();
        jScrollListProjects = new javax.swing.JScrollPane();
        jListProjects = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jPanelEmptyList = new javax.swing.JPanel();
        jLabelEmptyListIcon = new javax.swing.JLabel();
        jLabelEmptyListTitle = new javax.swing.JLabel();
        jLabelEmptyListSubtitle = new javax.swing.JLabel();

        jTableTasks.setBackground(new java.awt.Color(255, 255, 255));
        jTableTasks.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Tarefa Concluída"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTasks.setGridColor(new java.awt.Color(255, 255, 255));
        jTableTasks.setRowHeight(50);
        jTableTasks.setSelectionBackground(new java.awt.Color(0, 204, 51));
        jTableTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTasks.setShowHorizontalLines(true);
        jTableTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTasksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTasks);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 800));

        tooBar.setBackground(new java.awt.Color(0, 153, 102));
        tooBar.setForeground(new java.awt.Color(0, 102, 0));

        tooBarTitle.setFont(new java.awt.Font("JetBrains Mono", 1, 48)); // NOI18N
        tooBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        tooBarTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check 1.png"))); // NOI18N
        tooBarTitle.setText("Todo App");

        tooBarSubtitle.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        tooBarSubtitle.setForeground(new java.awt.Color(255, 255, 255));
        tooBarSubtitle.setText("         Anote tudo, não esqueça de nada!");

        javax.swing.GroupLayout tooBarLayout = new javax.swing.GroupLayout(tooBar);
        tooBar.setLayout(tooBarLayout);
        tooBarLayout.setHorizontalGroup(
            tooBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tooBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tooBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tooBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tooBarSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tooBarLayout.setVerticalGroup(
            tooBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tooBarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tooBarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tooBarSubtitle)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        projectsPanel.setBackground(new java.awt.Color(255, 255, 255));
        projectsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        projectsTitle.setBackground(new java.awt.Color(0, 153, 102));
        projectsTitle.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        projectsTitle.setForeground(new java.awt.Color(0, 153, 102));
        projectsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        projectsTitle.setText("Projetos");

        projectsAdd.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        projectsAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        projectsAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        projectsAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectsAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout projectsPanelLayout = new javax.swing.GroupLayout(projectsPanel);
        projectsPanel.setLayout(projectsPanelLayout);
        projectsPanelLayout.setHorizontalGroup(
            projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(projectsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(projectsAdd)
                .addGap(17, 17, 17))
        );
        projectsPanelLayout.setVerticalGroup(
            projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, projectsPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(projectsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectsAdd))
                .addGap(15, 15, 15))
        );

        tasksPanel.setBackground(new java.awt.Color(255, 255, 255));
        tasksPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tasksTitle.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        tasksTitle.setForeground(new java.awt.Color(0, 153, 102));
        tasksTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tasksTitle.setText("Tarefas");

        tasksAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tasksAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        tasksAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tasksAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tasksAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tasksPanelLayout = new javax.swing.GroupLayout(tasksPanel);
        tasksPanel.setLayout(tasksPanelLayout);
        tasksPanelLayout.setHorizontalGroup(
            tasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasksPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(tasksTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tasksAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tasksPanelLayout.setVerticalGroup(
            tasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasksPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(tasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tasksAdd)
                    .addComponent(tasksTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        projectsList.setBackground(new java.awt.Color(255, 255, 255));
        projectsList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jListProjects.setBackground(new java.awt.Color(255, 255, 255));
        jListProjects.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jListProjects.setForeground(new java.awt.Color(0, 0, 0));
        jListProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListProjects.setFixedCellHeight(50);
        jListProjects.setSelectionBackground(new java.awt.Color(0, 153, 102));
        jListProjects.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jListProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListProjectsMouseClicked(evt);
            }
        });
        jScrollListProjects.setViewportView(jListProjects);

        javax.swing.GroupLayout projectsListLayout = new javax.swing.GroupLayout(projectsList);
        projectsList.setLayout(projectsListLayout);
        projectsListLayout.setHorizontalGroup(
            projectsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectsListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollListProjects)
                .addContainerGap())
        );
        projectsListLayout.setVerticalGroup(
            projectsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectsListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollListProjects)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanelEmptyList.setBackground(new java.awt.Color(255, 255, 255));

        jLabelEmptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N

        jLabelEmptyListTitle.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabelEmptyListTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelEmptyListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListTitle.setText("Nenhuma tarefa por aqui :D");

        jLabelEmptyListSubtitle.setForeground(new java.awt.Color(153, 153, 153));
        jLabelEmptyListSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListSubtitle.setText("Clique no botão \" + \" para adicionar uma nova tarefa.");

        javax.swing.GroupLayout jPanelEmptyListLayout = new javax.swing.GroupLayout(jPanelEmptyList);
        jPanelEmptyList.setLayout(jPanelEmptyListLayout);
        jPanelEmptyListLayout.setHorizontalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmptyListLayout.createSequentialGroup()
                .addGroup(jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelEmptyListSubtitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEmptyListTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEmptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelEmptyListLayout.setVerticalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabelEmptyListIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEmptyListTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEmptyListSubtitle)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jPanel5.add(jPanelEmptyList, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tooBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(projectsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(projectsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tasksPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tooBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projectsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tasksPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(projectsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void projectsAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectsAddMouseClicked
        // TODO add your handling code here:
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
        projectDialogScreen.setVisible(true);
        
        //adicionando window Listener para quando o evento de fechar janela acontecer, chamar o metodo loadProjects
        projectDialogScreen.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                loadProjects();
            }
        });
        
    }//GEN-LAST:event_projectsAddMouseClicked

    private void tasksAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasksAddMouseClicked
        // TODO add your handling code here:
        TaskDialogScreen taskDialogScreen = new TaskDialogScreen(this, rootPaneCheckingEnabled);
        
        //setando o id do projeto
        int projectIndex = jListProjects.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        taskDialogScreen.setProject(project);        
        
        taskDialogScreen.setVisible(true);
        
        taskDialogScreen.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                int projectIndex = jListProjects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTasks(project.getId());
            }
        });
    }//GEN-LAST:event_tasksAddMouseClicked

    private void jTableTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTasksMouseClicked
        // Descobrir onde ocorreu o clique
        int rowIndex = jTableTasks.rowAtPoint(evt.getPoint());
        int columnIndex = jTableTasks.columnAtPoint(evt.getPoint());
        Task task = taskModel.getTasks().get(rowIndex);

        switch(columnIndex) {
            case 3:
                taskController.update(task);
                break;
            case 4:
                break;
            case 5:
                taskController.removeById(task.getId());
                taskModel.getTasks().remove(task);
                
                int projectIndex = jListProjects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTasks(project.getId());
                break;
        }
    }//GEN-LAST:event_jTableTasksMouseClicked

    private void jListProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProjectsMouseClicked
        // Retorna o indice do item clicado
        int projectIndex = jListProjects.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        loadTasks(project.getId());
    }//GEN-LAST:event_jListProjectsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScream.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScream.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScream.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScream.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScream().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelEmptyListIcon;
    private javax.swing.JLabel jLabelEmptyListSubtitle;
    private javax.swing.JLabel jLabelEmptyListTitle;
    private javax.swing.JList<String> jListProjects;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelEmptyList;
    private javax.swing.JScrollPane jScrollListProjects;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTasks;
    private javax.swing.JLabel projectsAdd;
    private javax.swing.JPanel projectsList;
    private javax.swing.JPanel projectsPanel;
    private javax.swing.JLabel projectsTitle;
    private javax.swing.JLabel tasksAdd;
    private javax.swing.JPanel tasksPanel;
    private javax.swing.JLabel tasksTitle;
    private javax.swing.JPanel tooBar;
    private javax.swing.JLabel tooBarSubtitle;
    private javax.swing.JLabel tooBarTitle;
    // End of variables declaration//GEN-END:variables

    //customizando o header da table de tarefas
    public void decorateTableTask() {
        jTableTasks.getTableHeader().setFont(new Font("JetBrains Mono", Font.BOLD, 14));
        jTableTasks.getTableHeader().setBackground(new Color(0, 153, 102));
        jTableTasks.getTableHeader().setForeground(new Color(255, 255, 255));

        //criando um short autom�tico funcionalidade de ordena��o de campo da table
        jTableTasks.setAutoCreateRowSorter(true);
        
        jTableTasks.getColumnModel().getColumn(4).setCellRenderer(new ButtonColumnCellRederer("edit"));
        jTableTasks.getColumnModel().getColumn(5).setCellRenderer(new ButtonColumnCellRederer("delete"));
        
        //selecionando a segunda coluna da table e adicionando o novo renderizador para fazer essas coisas 
        jTableTasks.getColumnModel().getColumn(2).setCellRenderer(new DeadlineColumnCellReader());
        
    }

    public void initDataController() {
        projectController = new ProjectController();
        taskController = new TaskController();
    }

    //metodo executado quando a tela e criada
    public void initComponentsModel() {
        projectsModel = new DefaultListModel();
        loadProjects();
        
        taskModel = new TaskTableModel();
        jTableTasks.setModel(taskModel);
        
        //forca o primeiro projeto da lista a ser selecionado
        if (!projectsModel.isEmpty()) {
            jListProjects.setSelectedIndex(0);
            int projectIndex = jListProjects.getSelectedIndex();
            Project project = (Project) projectsModel.get(projectIndex);
            loadTasks(project.getId());
        }
    }
    
    private void showjTableTasks(boolean hasTasks) {

        if (hasTasks) {
            //remove a mensagem de lista vazia
            if(jPanelEmptyList.isVisible()) {
                jPanelEmptyList.setVisible(false);
                jPanel5.remove(jPanelEmptyList);
            }
            
            //adiciona o jScrollPane1 ao painel principal(jpanel5)
            jPanel5.add(jScrollPane1);
            jScrollPane1.setVisible(true);
            jScrollPane1.setSize(jPanel5.getWidth(), jPanel5.getHeight());
        } else {
            //esconde o jScrollPane1 e adiciona a mensagem de lista vazia
            if (jScrollPane1.isVisible()) {
                jScrollPane1.setVisible(false);
                jPanel5.remove(jScrollPane1);
            }
            
            jPanel5.add(jPanelEmptyList);
            jPanelEmptyList.setVisible(true);
            jPanelEmptyList.setSize(jPanel5.getWidth(), jPanel5.getHeight());
        }
    }
    
    public void loadTasks(int idProject) {
        List<Task> tasks = taskController.getAll(idProject);
        taskModel.setTasks(tasks);
        showjTableTasks(!tasks.isEmpty());
    }

    public void loadProjects() {
//        System.out.println("passou 2 - loadProjects");
        List<Project> projects = projectController.getAll();
        
        //limpar os projects que ja existiam e mostrar os novos atualizados
        projectsModel.clear();

        for (int i = 0; i < projects.size(); i++) {
            projectsModel.addElement(projects.get(i));
        }
        
        jListProjects.setModel(projectsModel);
    }
}
