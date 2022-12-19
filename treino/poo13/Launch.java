package poo13;

public class Launch {
    public static void main(String[] args) {
        Gafanhoto g = new Gafanhoto(19, "Lucas", 'M');
        Video v = new Video("Dragon Ball AF");

        v.play();
        v.like();
        v.setAvaliacao(5);

        g.ganharExp();
    }
}
