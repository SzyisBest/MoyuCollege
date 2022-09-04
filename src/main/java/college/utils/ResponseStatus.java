package college.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;


/**
 * @program: web
 * @description: JSON返回类型(需要支持fastJSON)
 * @author: Mr.Sheng
 * @create: 2021-12-03 14:34
 **/
public class ResponseStatus implements Serializable {
    private static final long serialVersionUID = 1824076384156716080L;
    /**
    * @Description: 默认的成功信息
    * @Param:
    * @return:
    * @Author: Shengzhenyu
    * @Date: 2021/12/9
    **/
    private static final String DEFAULT_SUCCESS_MESSAGE = "数据操作执行成功";
    /**
    * @Description: 默认的错误信息
    * @Param:
    * @return:
    * @Author: Shengzhenyu
    * @Date: 2021/12/9
    **/
    private static final String DEFAULT_FAILURE_MESSAGE = "数据操作执行失败";
    /**
    * @Description: 默认的成功CODE
    * @Param:
    * @return:
    * @Author: Shengzhenyu
    * @Date: 2021/12/9
    **/
    private static final int DEFAULT_SUCCESS_CODE = 200;
    /**
    * @Description: 默认的错误CODE
    * @Param:
    * @return:
    * @Author: Shengzhenyu
    * @Date: 2021/12/9
    **/
    private static final int DEFAULT_FAILURE_CODE = 701;

    /**
     * @Description: 数据状态
     **/
    private boolean status;

    /**
     * @Description: 数据状态码
     **/
    private int code;

    /**
     * @Description: 数据状态信息
     **/
    private String message;

    /**
     * @Description: 返回参数对象 Object
     **/
    private transient Object object;

    public ResponseStatus(boolean status, int code, String message, Object object) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.object = object;
    }

    public ResponseStatus(boolean status, int code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public ResponseStatus() {
    }

    /**
     * @Description: 返回默认成功信息
     * @Param: null
     * @return: JSONObject
     * @Author: Shengzhenyu
     * @Date: 2021/12/9
     **/
    public static JSONObject createSuccessStatus() {
        ResponseStatus result = new ResponseStatus(true, ResponseStatus.DEFAULT_SUCCESS_CODE, ResponseStatus.DEFAULT_SUCCESS_MESSAGE);
        return (JSONObject) JSON.toJSON(result);
    }

    /**
     * @Description: 自定义返回成功信息
     * @Param: String successMessage
     * @return: JSONObject
     * @Author: Shengzhenyu
     * @Date: 2021/12/9
     **/
    public static JSONObject createSuccessStatus(String successMessage) {
        ResponseStatus result = new ResponseStatus(Boolean.TRUE, 200, successMessage);
        return (JSONObject) JSON.toJSON(result);
    }

    /**
     * @Description: 自定义返回数据
     * @Param: Object object
     * @return: JSONObject
     * @Author: Shengzhenyu
     * @Date: 2021/12/9
     **/
    public static JSONObject createSuccessStatus(Object object) {
        ResponseStatus result = new ResponseStatus(Boolean.TRUE, ResponseStatus.DEFAULT_SUCCESS_CODE, ResponseStatus.DEFAULT_SUCCESS_MESSAGE, object);
        return (JSONObject) JSON.toJSON(result);
    }

    /**
     * @Description: 自定义返回成功信息和成功code
     * @Param: String successMessage,int code
     * @return: JSONObject
     * @Author: Shengzhenyu
     * @Date: 2021/12/9
     **/
    public static JSONObject createSuccessStatus(String successMessage, int code) {
        ResponseStatus result = new ResponseStatus(Boolean.TRUE, code, successMessage);
        return (JSONObject) JSON.toJSON(result);
    }

    /**
     * @Description: 自定义返回成功信息和数据
     * @Param: String successMessage,Object object
     * @return: JSONObject
     * @Author: Shengzhenyu
     * @Date: 2021/12/9
     **/
    public static JSONObject createSuccessStatus(String successMessage, Object object) {
        ResponseStatus result = new ResponseStatus(Boolean.TRUE, ResponseStatus.DEFAULT_SUCCESS_CODE, successMessage, object);
        return (JSONObject) JSON.toJSON(result);
    }

    /**
     * @Description: 自定义返回成功信息和成功code和数据
     * @Param: String successMessage,int code,Object object
     * @return: JSONObject
     * @Author: Shengzhenyu
     * @Date: 2021/12/9
     **/
    public static JSONObject createSuccessStatus(String successMessage, int code, Object object) {
        ResponseStatus result = new ResponseStatus(Boolean.TRUE, code, successMessage, object);
        return (JSONObject) JSON.toJSON(result);
    }

    /**
     * @Description: 返回默认失败信息
     * @Param: null
     * @return: JSONObject
     * @Author: Shengzhenyu
     * @Date: 2021/12/9
     **/
    public static JSONObject createFailureStatus() {
        ResponseStatus result = new ResponseStatus(Boolean.FALSE, ResponseStatus.DEFAULT_FAILURE_CODE, ResponseStatus.DEFAULT_FAILURE_MESSAGE);
        return (JSONObject) JSON.toJSON(result);
    }

    /**
     * @Description: 自定义返回失败信息
     * @Param: String errorMessage
     * @return: JSONObject
     * @Author: Shengzhenyu
     * @Date: 2021/12/9
     **/
    public static JSONObject createFailureStatus(String errorMessage) {
        ResponseStatus result = new ResponseStatus(Boolean.FALSE, ResponseStatus.DEFAULT_FAILURE_CODE, errorMessage);
        return (JSONObject) JSON.toJSON(result);
    }

    /**
     * @Description: 自定义返回失败的数据
     * @Param: String errorMessage,Object object
     * @return: JSONObject
     * @Author: Shengzhenyu
     * @Date: 2021/12/9
     **/
    public static JSONObject createFailureStatus(Object object) {
        ResponseStatus result = new ResponseStatus(Boolean.FALSE, ResponseStatus.DEFAULT_FAILURE_CODE, ResponseStatus.DEFAULT_FAILURE_MESSAGE, object);
        return (JSONObject) JSON.toJSON(result);
    }

    /**
     * @Description: 自定义返回成功信息和成功code
     * @Param: String successMessage,int code
     * @return: JSONObject
     * @Author: Shengzhenyu
     * @Date: 2021/12/9
     **/
    public static JSONObject createFailureStatus(String errorMessage, int code) {
        ResponseStatus result = new ResponseStatus(Boolean.FALSE, code, errorMessage);
        return (JSONObject) JSON.toJSON(result);
    }

    /**
     * @Description: 自定义返回失败信息和数据
     * @Param: String errorMessage,Object object
     * @return: JSONObject
     * @Author: Shengzhenyu
     * @Date: 2021/12/9
     **/
    public static JSONObject createFailureStatus(String errorMessage, Object object) {
        ResponseStatus result = new ResponseStatus(Boolean.FALSE, ResponseStatus.DEFAULT_FAILURE_CODE, errorMessage, object);
        return (JSONObject) JSON.toJSON(result);
    }

    /**
     * @Description: 自定义返回失败信息和成功code和数据
     * @Param: String errorMessage,int code,Object object
     * @return: JSONObject
     * @Author: Shengzhenyu
     * @Date: 2021/12/9
     **/
    public static JSONObject createFailureStatus(String errorMessage, int code, Object object) {
        ResponseStatus result = new ResponseStatus(Boolean.FALSE, code, errorMessage, object);
        return (JSONObject) JSON.toJSON(result);
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
