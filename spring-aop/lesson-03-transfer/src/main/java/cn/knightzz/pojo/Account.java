package cn.knightzz.pojo;

/**
 * @author 王天赐
 * @title: Account
 * @projectName spring-lesson-cloud
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2021/10/30 15:01
 */
public class Account {

    private String cardNo;
    private String name;
    private int money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCardNo() { return cardNo; }

    public void setCardNo(String cardNo) { this.cardNo = cardNo;}

    @Override
    public String toString() {
        return "Account{" +
                "cardNo='" + cardNo + '\'' +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
