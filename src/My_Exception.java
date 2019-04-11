public class My_Exception extends Exception {
    public My_Exception(String message , Throwable throwable){
        super(message,throwable);
    }

    public My_Exception(String message){
        super(message);
    }

    public My_Exception(Throwable throwable){
        super(throwable);
    }
}
