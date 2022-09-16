package exceptions;

public class NegativeWeightException extends RuntimeException{

    public NegativeWeightException(){
        System.out.println("El peso no puede ser negativo");
    }
}
