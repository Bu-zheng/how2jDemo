package example.com.bz.model;

import java.math.BigDecimal;

/**
 * @Title: Buzheng
 * @Package: example.com.bz.model
 * @Description:
 * @author: LinShuPeng
 * @date: 2019-06-22 下午 3:39
 * @Version: 1.0
 */
public class Buzheng {
    private String name;

    private String sex;

    private byte status;

    private BigDecimal money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Buzheng(byte status, BigDecimal money) {
        this.status = status;
        this.money = money;
    }

    public Buzheng(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Buzheng{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", status=" + status +
                ", money=" + money +
                '}';
    }
}
