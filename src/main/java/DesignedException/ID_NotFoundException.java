package DesignedException;

public class ID_NotFoundException extends RuntimeException{
    public ID_NotFoundException(){
        super();
    }
    public ID_NotFoundException(String message) {
        super(message);
    }
}
