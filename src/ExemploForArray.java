public class ExemploForArray {
    public static void main(String[] args) {
        String[] alunos = {"Hender","José", "Laila","Meg"};

        // for(int i = 0; i < alunos.length; i++){
        //     System.out.println("O aluno no índice: "+ i +" é "+ alunos[i]+".");
        // }

        for (String aluno : alunos) {
            System.out.println("Aluno: "+aluno);
        }
        
    }
}
