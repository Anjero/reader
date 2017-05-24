package net.anjero.reader.module.folder.enums;

/**
 * ///////////////////////////////////////
 * <p>Create by 2017/5/24</p>
 * <p>
 * 作为一个真正的程序员，首先应该尊重编程，<br/>
 * 热爱你所写下的程序，他是你的伙伴，而不是工具。
 * </p>
 * ///////////////////////////////////////
 *
 * @author :anjero
 * @version :1.0
 */
public enum FileStatusEnum {

    DEFAULT(0), SHOW(1), HIDE(2), OUTDATED(3), BAN(201);

    FileStatusEnum(int status) {
        this.status = status;
    }

    int status;

    public int getStatus() {
        return status;
    }
}
