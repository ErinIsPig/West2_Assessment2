package Assessment2.question1;

public class AnimalNotFoundException extends RuntimeException {
    public AnimalNotFoundException(){
        super();
    }
    public AnimalNotFoundException(String message,Throwable cause){
        super(message,cause);
    }
    public AnimalNotFoundException(String message){
        super(message);
    }
    public AnimalNotFoundException(Throwable cause){
        super(cause);
    }
}
