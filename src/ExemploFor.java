public class ExemploFor {
    public static void main(String[] args) {
        for(int carneirinhos = 1; carneirinhos <=20; carneirinhos++){
            if(carneirinhos == 10){
                System.out.println("Quase dormindo");
                continue;
            }

            if (carneirinhos == 20) {
                System.out.println("Dormiu");
                continue;
            }
            System.out.println("Contando carneirinhos: "+carneirinhos);
        }

    }
}
