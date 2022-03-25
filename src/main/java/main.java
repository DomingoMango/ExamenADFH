public class main {
    public static void main(String[] args) {
        calculadora basica = new calculadora("patito",false);


        basica.setPrimerValor(284.9);
        basica.setSegundoValor(0.0);

        System.out.println("Suma de " + basica.getPrimerValor() + " + "
                +basica.getSegundoValor()+" = "+basica.sumar());
        System.out.println("Resta de " + basica.getPrimerValor() + " - "
                +basica.getSegundoValor()+" = "+basica.resta());
        System.out.println("Multiplicacion de " + basica.getPrimerValor() + " * "
                +basica.getSegundoValor()+" = "+basica.multiplicar());
        System.out.println("Division de " + basica.getPrimerValor() + " / "
                +basica.getSegundoValor()+" = "+basica.dividir());
        System.out.println("Potencia de " + basica.getPrimerValor() + " ^ "
                +basica.getSegundoValor()+" = "+basica.elevarAPotencia());
        System.out.println(basica.toString());
        calculadora cientifica = new calculadora("casio",true);
        cientifica.setPrimerValor(45.83);
        cientifica.setSegundoValor(13.6);
        System.out.println("Suma de " + cientifica.getPrimerValor() + " + "
                +cientifica.getSegundoValor()+" = "+cientifica.sumar());
        System.out.println("Resta de " + cientifica.getPrimerValor() + " - "
                +cientifica.getSegundoValor()+" = "+cientifica.resta());
        System.out.println("Multiplicacion de " + cientifica.getPrimerValor() + " * "
                +cientifica.getSegundoValor()+" = "+cientifica.multiplicar());
        System.out.println("Division de " + cientifica.getPrimerValor() + " / "
                +cientifica.getSegundoValor()+" = "+cientifica.dividir());
        System.out.println("Potencia de " + cientifica.getPrimerValor() + " ^ "
                +cientifica.getSegundoValor()+" = "+cientifica.elevarAPotencia());
        System.out.println(cientifica.toString());

    }
}
