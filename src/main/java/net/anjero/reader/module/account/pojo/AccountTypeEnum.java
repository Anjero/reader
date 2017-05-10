package net.anjero.reader.module.account.pojo;

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
public enum AccountTypeEnum {

    REGISTER(1),
    WEIBO(2),
    WECHAT(3),
    QQ(4);

    int type;

    public int getType() {
        return type;
    }

    AccountTypeEnum(int type) {
        this.type = type;
    }
}
