

public class calculadora {
    private String marca;
    private static boolean esCientifica;
    private static double primerValor;
    private static double segundoValor;
    static double s=0;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEsCientifica() {
        return esCientifica;
    }

    public void setEsCientifica(boolean esCientifica) {
        this.esCientifica = esCientifica;
    }

    public double getPrimerValor() {
        return primerValor;
    }

    public void setPrimerValor(double primerValor) {
        this.primerValor = primerValor;
    }

    public double getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(double segundoValor) {
        this.segundoValor = segundoValor;
    }

    public calculadora(String marca, boolean esCientifica) {
        this.marca = marca;
        this.esCientifica = esCientifica;
    }

    @Override
    public String toString() {
        if(esCientifica==false){
            return "La calculadora es de marca: " + marca
                    + " y no es cientifica";
        }else{
            return "La calculadora es de marca: " + marca
                    + " y es cientifica";
        }

    }

    public static double sumar(){

        s=primerValor+segundoValor;


        return s;
    }
    public static double resta(){

        s=primerValor-segundoValor;
        return s;
    }
    public static double multiplicar(){
        s=primerValor*segundoValor;
        return s;
    }
    public static double dividir(){
        if(segundoValor==0){
            s=0;
            return s;
        }else{
            s=primerValor/segundoValor;
            return s;
        }

    }
    public static String elevarAPotencia(){
        if (esCientifica==false){
            return "Tu calculadora no es cientifica, no puede realizar esta operacion";
        }else {
            s=Math.pow(primerValor,segundoValor);
            return ""+ s;
        }

    }

}
