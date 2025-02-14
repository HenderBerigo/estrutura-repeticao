import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {

        double mesada = 100.00;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.println("Valor Doce: R$ "+ valorDoce + ". Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: R$ "+mesada);

        System.out.println("Joãozinho gastou toda sua mesada em doces.");
    }

    public static double valorAleatorio(){
        double valor = ThreadLocalRandom.current().nextDouble(2,15);
        return Math.round(valor * 100.0) / 100.0;
    }
}
