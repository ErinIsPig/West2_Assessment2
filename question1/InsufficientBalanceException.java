package Assessment2.question1;

public class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(){
        super();
    }
    public InsufficientBalanceException(String message,Throwable throwable){
        super(message,throwable);
    }
    public InsufficientBalanceException(String message){
        super(message);
    }
    public InsufficientBalanceException(Throwable throwable){
        super(throwable);
    }
}
