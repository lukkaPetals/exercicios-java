package poo7;

public class Launch {
    public static void main(String[] args) {
        Lutador l1[] = new Lutador[6];
        
        l1[0] = new Lutador("Wilx", "Grego", 20, 184, 60, 9, 0, 1);
        l1[1] = new Lutador("Caio", "Brasileiro", 20, 184, 60, 10, 0, 0);
        l1[2] = new Lutador("Rafael", "Brasileiro", 20, 184, 60, 8, 0, 2);
        l1[3] = new Lutador("Lucas", "Brasileiro", 20, 184, 60, 7, 2, 1);
        l1[4] = new Lutador("Hiro", "Brasileiro", 20, 184, 60, 6, 4, 0);
        l1[5] = new Lutador("Felipec", "Brasileiro", 20, 184, 60, 9, 1, 0);
        
        Luta c1 = new Luta();
        c1.marcarLuta(l1[0], l1[3]);
        c1.lutar();

        l1[0].status();
    }
}
