package ir.iust.trello_framework.excetion;

public enum ExceptionCode {

    EX_OBJECT_NOT_FOUND(1000);

    private Integer code;

    public Integer getCode() {
        return code;
    }


    ExceptionCode(Integer code) {
        this.code = code;
    }

    }
