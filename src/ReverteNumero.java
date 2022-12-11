import java.util.Scanner;
public class ReverteNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int invertido = inverter(sc.nextInt());
        System.out.print("O número digitado de forma é inversa é igual a " + invertido);
        sc.close();
    }
    public static int inverter(int numero) {
        String invertido = new StringBuilder(Integer.toString(numero)).reverse().toString();
        return Integer.parseInt(invertido);
    }
}
