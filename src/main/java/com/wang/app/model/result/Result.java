package com.wang.app.model.result;

import com.wang.app.model.result.common.CommonHead;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

@Getter
@Setter
public class Result<T> implements Serializable {
    private Head head;
    private T body;

    public static Result<String> success() {
        Result<String> result = new Result<>();
        result.head = CommonHead.SUCCESS;
        result.body = StringUtils.EMPTY;
        return result;
    }

    public static <T> Result<T> success(T body) {
        Result<T> result = new Result<>();
        result.head = CommonHead.SUCCESS;
        result.body = body;
        return result;
    }

    public static <T> Result<T> error(Head head) {
        Result<T> result = new Result<>();
        result.head = head;
        return result;
    }

    public static Result<String> error(Head head, String message) {
        Result<String> result = new Result<>();
        result.head = head;
        result.body = message;
        return result;
    }
}
