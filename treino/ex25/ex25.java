package ex25;

public class ex25 {
     public static void main(String[] args) {
        
        TV televisão1 = new TV();

        

        televisão1.ligar();
        televisão1.aumentarVolume();
        televisão1.aumentarVolume();


        
        System.out.println("Esta televisão é da marca" + televisão1.fabricante + "A televisão está" + (televisão1.ligado == true ? "ligada" : "desligada") + "Volume é " + televisão1.volume);
     }
}
