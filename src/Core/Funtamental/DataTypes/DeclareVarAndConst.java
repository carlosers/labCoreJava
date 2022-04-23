package Core.Funtamental.DataTypes;

public class DeclareVarAndConst {

    public static final double PI = 3.14159;

    public static void main(String[] args) {
        int yearNew, yearsOld;
        yearNew = 2022;
        yearsOld = 1968;
        System.out.printf("Sua idade é %d\n",(yearNew-yearsOld));
        var name = "Carlos Santiago";
        char[] letras;
        letras = name.toCharArray();
        var sizeName = name.length();
        var idade= 53;
        var salaryMin = 1_240.34;
        var fgts = salaryMin * 8/100;
        System.out.println(name);
        for (char n : letras
             ) {
            System.out.print('=');
        }
        System.out.println();
        System.out.println("Idade:"+idade);
        System.out.println("Valor do salário mínimo:R$"+salaryMin);
        System.out.println("Valor do fgts: R$"+fgts);

        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: "
                + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);

        System.out.println("O valor do pi é "+PI);
    }
}
