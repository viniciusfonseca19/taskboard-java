package service;

import config.TaskDAO;
import model.Task;

import java.util.List;

public class TaskService {

    private TaskDAO dao = new TaskDAO();

    public void criarTarefa(String titulo, String descricao) {
        Task task = new Task(titulo, descricao, "TODO");
        dao.create(task);
    }

    public void listarTarefas() {
        List<Task> tasks = dao.findAll();

        for (Task t : tasks) {
            System.out.println("ID: " + t.getId());
            System.out.println("Título: " + t.getTitle());
            System.out.println("Descrição: " + t.getDescription());
            System.out.println("Status: " + t.getStatus());
            System.out.println("------------------------");
        }
    }

    public void moverTarefa(int id, String status) {
        dao.updateStatus(id, status);
    }

    public void deletarTarefa(int id) {
        dao.delete(id);
    }
}