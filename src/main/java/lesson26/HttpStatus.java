package lesson26;

public enum HttpStatus {
    OK(200,"OK"),
    NOT_FOUND(404,"Not found"),
    INTERNAL_SERVER_ERROR(500,"Internal Server Error");
    private  final int code;
    private final String message;

    HttpStatus(int code, String message){
        this.code = code;
        this.message =  message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
