public class ComplexCalculation  {

    public static void addComplexNumber(ComplexNumber first, ComplexNumber second){

        double sumOfRealNumber = first.realNumber + second.realNumber;
        double sumOfImgNumber = first.imaginaryNumber +second.imaginaryNumber ;
        System.out.println("The sum is :"+sumOfRealNumber+" + ( "+sumOfImgNumber+"i )");
    }

    public static void subComplexNumber(ComplexNumber first,ComplexNumber second ){

        double subOfRealNumber = first.realNumber - second.realNumber;
        double subOfImgNumber = first.imaginaryNumber - second.imaginaryNumber ;
        System.out.println("The sub is :"+subOfRealNumber+" + ( " +subOfImgNumber+"i )");

    }

    public static void mulComplexNumber(ComplexNumber first, ComplexNumber second){
        double multiplicationOfRealNumber = (first.realNumber* second.realNumber)-(first.imaginaryNumber* second.imaginaryNumber);
        double multiplicationOfImgNumber = (first.realNumber* second.imaginaryNumber)+(first.imaginaryNumber* second.realNumber);
        System.out.println("The multiplication is: "+ multiplicationOfRealNumber + " + ( "+multiplicationOfImgNumber+"i )");
    }

    public static void divComlexNumber(ComplexNumber first, ComplexNumber second){
        double divOfRealNumber = ((first.realNumber* second.realNumber)+(first.imaginaryNumber* second.imaginaryNumber))/(Math.pow((second.realNumber),2)+Math.pow(second.imaginaryNumber, 2));
        double divOfImgNumber = ((first.imaginaryNumber* second.realNumber)-(first.realNumber* second.imaginaryNumber))/ (Math.pow((second.realNumber),2)+Math.pow(second.imaginaryNumber, 2));
        System.out.println("The div is "+ divOfRealNumber + " + ( "+ divOfImgNumber +"i )");
    }



}
