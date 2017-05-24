package net.anjero.reader.core.json;

/**
 * ///////////////////////////////////////
 * <p>Create by 2017/5/10</p>
 * <p>
 * 作为一个真正的程序员，首先应该尊重编程，<br/>
 * 热爱你所写下的程序，他是你的伙伴，而不是工具。
 * </p>
 * ///////////////////////////////////////
 *
 * @author :anjero
 * @version :1.0
 */
public class Result {

    private int code;
    private Object result;
    private String description;

    public Result() {
    }

    public Result(int code, Object result, String description) {
        this.code = code;
        this.result = result;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
