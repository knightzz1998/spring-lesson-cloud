package cn.knightzz.pojo;

/**
 * @author 王天赐
 * @title: Result
 * @projectName spring-lesson-cloud
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2021/10/30 15:01
 */
public class Result {

    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
