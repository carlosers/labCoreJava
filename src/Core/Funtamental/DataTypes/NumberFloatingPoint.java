package Core.Funtamental.DataTypes;

/**
 * Create number of the type floating-point
 * @version 1.03 2022-04-22
 * @author Carlos Santiago
 */
public class NumberFloatingPoint {
    public static void main(String[] args) {
        float numFloat;
        double numDob;

        numFloat = 4250 * 20 / 100;
        numDob = numFloat * 12345;

        System.out.printf("Número do tipo float: %f\n",numFloat);
        System.out.printf("Numero do tipo double: %f\n",numDob);

        // para testes se um numero é not a number, finito ou infinito
        if (Double.isNaN(Math.sqrt(-20))){
            System.out.println("Erro, sou um NaN");
        }
        if (Double.isNaN(0.0/0.0)){
            System.out.println("Erro, sou um NaN");
        }

        if (Double.isFinite(numDob))
            System.out.println("Opa, sou um número finito!");

        if (Double.isInfinite(1.0/0.0)){
            System.out.println("Erro, sou um número infinito");
        }
        if (Double.isInfinite(-1.0/0.0))
            System.out.println("Erro, sou um número negativo infinito!");
    }
}
