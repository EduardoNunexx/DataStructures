import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num_operations = sc.nextInt();
        int num_bytes = sc.nextInt();
        int fps = sc.nextInt();
        int min_time = sc.nextInt();
        int max_capacity = sc.nextInt();

        FilaCircular buffer = new FilaCircular(max_capacity);

        for (int i = 0; i < num_operations; i++) {
            if (sc.next().charAt(0) == 'q'){
                buffer.solicitarDados(num_bytes, fps, min_time);
            } else {
                buffer.inserirDados(sc.nextInt(), sc.next());
            }
        }
        sc.close();
    }
}