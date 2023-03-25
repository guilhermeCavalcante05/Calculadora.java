import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double valor1, valor2, resultado;
        int operacao;

        System.out.println("Informe qual operação deseja realizar:\n1) Soma\n2) Subtração\n3) Divisão\n4) Mutiplicação");
        operacao = sc.nextInt();      
       
        System.out.println("Informe o primeira valor entre 1 a 10:");
        valor1 = sc.nextInt();

        System.out.println("Informe o segundo valor entre 1 a 10:");
        valor2 = sc.nextInt();

        if (valor1 > 1 || valor1 < 10 || valor2 > 1 || valor2 < 10){
            switch (operacao) {
                case 1:
                resultado = (valor1 + valor2);
                System.out.println("O Resultado da soma foi " + resultado);
                break;

                case 2:
                resultado = (valor1 - valor2);
                System.out.println("O Resultado da subtração foi " + resultado);
                break;

                case 3:
                resultado = (valor1 / valor2);
                System.out.println("O Resultado da divisão foi " + resultado);
                break;

                case 4:
                resultado = (valor1 * valor2);
                System.out.println("O Resultado da mutiplicação foi " + resultado);
                break;
            
                default:
                System.out.println("Valor fora de intervalo");
                    break;
            }
        }
        


    


        
    }
}














