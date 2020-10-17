import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
       int bolaSorte [] = new int [38]; 
       int contador; 
       int soma; 
       int resultado;
       int divisao;
       int final;


        for (contador = 0; contador <3; contador++) {
            bolaSorte[contador] =
            Double.parseDouble(JOptionPane.showInputDialog ("Insira três  " +
            (contador+1) +" numeros da sorte entre 0 e 38 :D "));

            if  (!bolaSorte.equals <=38 ) {
                System.out.println(Por favor, Digite um numero entre 0 e 38”);
                bolaSorte[contador] =
                Double.parseDouble(JOptionPane.showInputDialog ("Insira três  " +
                (contador+1) +" numeros da sorte entre 0 e 38 :D "));
                break;
        }

        if (bolaSorte[contador] % 4 == 0) {     
            for(contador = 0; contador <3; contador ++) {
                soma = soma + bolaSorte[contador];
                divisao = soma /3;
                switch (final) {

                    case (divisao <=0):
            JOptionPane.showInputDialog (null, "Você não ganhou nenhum prêmio, mais sorte da próxima vez");
            break;

                case (divisao <=20):
            JOptionPane.showInputDialog (null, "Você ganhou o prêmio Comun, parabéns");
            break;

            case (divisao <=25):
            JOptionPane.showInputDialog (null, "Você ganhou o prêmio Maximo, parabéns");
            break;


                }
     else{
            JOptionPane.showMessageDialog(null, "Por favor, digite pelo menos um numero divível por 4");
                
        } 

    }
}