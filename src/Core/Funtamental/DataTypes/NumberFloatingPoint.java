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
    }
}
