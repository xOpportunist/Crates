package red.reddington.Crates.Exceptions;

/**
 * Created by Ryan on 5/4/2014.
 */
public class NotValidKeyException extends RuntimeException {
    public NotValidKeyException(){
        super();
    }
    public NotValidKeyException(String message){
        super(message);
    }
}
