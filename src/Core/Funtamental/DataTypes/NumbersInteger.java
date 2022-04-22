package Core.Funtamental.DataTypes;

import javax.swing.*;

/**
 * showing how to use numbers integers
 * @version 1.02 2022-04-22
 * @author Carlos Santiago
 */
public class NumbersInteger {
    public static void main(String[] args) {
        int numInt;
        short numShort;
        long numLong;
        byte numByte;
        int unumByte;


        numInt = 1968;
        numLong = 2022;
        numByte = 53;
        unumByte = Byte.toUnsignedInt(numByte);

        System.out.printf("inteiro int: %d\n",numInt);
        System.out.println("inteiro long: " + numLong);
        System.out.println("inteiro byte: "+ numByte);
        System.out.printf("inteiro sem sinal: %d",unumByte);

    }
}
