import service.TaskService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TaskService service = new TaskService();

        while (true) {
            System.out.println("1 - Criar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Mover tarefa");
            System.out.println("4 - Deletar tarefa");
            System.out.println("0 - Sair");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Descrição: ");
                    String desc = sc.nextLine();

                    service.criarTarefa(titulo, desc);
                    break;

                case 2:
                    service.listarTarefas();
                    break;

                case 3:
                    System.out.print("ID da tarefa: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Novo status (TODO / DOING / DONE): ");
                    String status = sc.nextLine();

                    service.moverTarefa(id, status);
                    break;

                case 4:
                    System.out.print("ID da tarefa: ");
                    int deleteId = sc.nextInt();

                    service.deletarTarefa(deleteId);
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}