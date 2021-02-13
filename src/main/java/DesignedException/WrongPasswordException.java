package DesignedException;

public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException(String wrong_message){
        super(wrong_message);
    }
    public WrongPasswordException(){
        super();
    }
}
