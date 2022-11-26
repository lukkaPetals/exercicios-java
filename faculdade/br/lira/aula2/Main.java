public class Main {
    public static void main(String[] args) {

        BancoDeDados ola = new BancoDeDados();
        
        ola.create("Luvas");
        ola.create("Jair");
        ola.create("junior");

        ola.read();

        ola.update(0, "Lucas");

        ola.read();

        System.out.println("DELETANDO:");

        ola.delete(1);
        ola.read();
    }
}
