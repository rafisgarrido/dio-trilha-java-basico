
public class Contador {

    public static void main(String[] args) {
        try{
            if (args.length != 2){
                System.out.println("Por favor, forneça dois números inteiros");
                return;
            }

            int numeroUm = Integer.parseInt(args[0]);
            int numeroDois = Integer.parseInt(args[1]);

            if (numeroUm > numeroDois){
                throw new ParametrosInvalidosException ( "O segundo parametro deve ser maior que o primeiro");
            }

            for (int i = numeroUm; i <= numeroDois; i++){
                System.out.println("Imprimindo o número " + i);
            }
        } catch ( NumberFormatException e){
            System.out.println("Por favor fornaça número inteiros válidos como argumentos.");
        } catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
    }
}