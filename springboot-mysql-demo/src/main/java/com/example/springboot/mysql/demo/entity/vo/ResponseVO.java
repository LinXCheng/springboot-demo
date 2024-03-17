package com.example.springboot.mysql.demo.entity.vo;

import com.example.springboot.mysql.demo.utils.Constants;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ResponseVO<T> {
    private Integer code;
    private Boolean success;
    private T data;
    private String message;

    public void setCode(Integer code) {
        this.code = code;
        if (code == 200) {
            this.success = true;
        } else {
            this.success = false;
        }
    }

    public static <T> ResponseVO ok(T data) {
        ResponseVO<T> responseVO = new ResponseVO();
        responseVO.setCode(HttpStatus.OK.value());
        responseVO.setData(data);
        responseVO.setMessage(Constants.SUCCESS);
        return responseVO;
    }

    public static <T> ResponseVO ok() {
        ResponseVO<T> responseVO = new ResponseVO();
        responseVO.setCode(HttpStatus.OK.value());
        responseVO.setMessage(Constants.SUCCESS);
        return responseVO;
    }

    public static <T> ResponseVO fail(String message) {
        ResponseVO<T> responseVO = new ResponseVO();
        responseVO.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        responseVO.setMessage(message);
        return responseVO;
    }
}
