package example.com.bz;

import java.util.ArrayList;

public enum Testss {
    Assigned("已分配", 1),
    Undistributed("未分配", 2),

    /**

     * 添加未知选项，避免出现null
     */
    UNKNOW("未知", -1);

    /**
     * 构造函数
     *
     * @param text
     * @param value
     */
    Testss(String text, int value)
    {
        this.value = value;
        this.text = text;
    }


    /**
     * 枚举类型要展示的值
     */
    public String text;
    /**
     * 枚举类型真实值
     */
    public int value;


    public String getText()
    {
        return text;
    }
    public int getValue()
    {
        return value;
    }
    /**
     * 將value轉換成int并获取对应的Gender值，如果value不能转换为int,返回null
     *
     * @param value
     * @return
     */
    public static Testss toEnum(String value)
    {
        try{
            int transValue = Integer.parseInt(value);
            return toEnum(transValue);
        }
        catch(Exception e){
        }
        return Testss.UNKNOW;
    }
    /**
     * 将整型转换成枚举类型
     *
     * @param value
     * @return
     */
    public static Testss toEnum(int value)
    {
        for (Testss c : Testss.values())
        {
            if (c.getValue() == value)
            {
                return c;
            }
        }
        return Testss.UNKNOW;
    }
    /**
     * 获取下拉菜单数据源
     *
     * @return
     */
    public static ArrayList<EnumObj> getEnumSource()
    {
        ArrayList<EnumObj> source = new ArrayList<EnumObj>();
        for (Testss c : Testss.values())
        {
            if (!c.equals(Testss.UNKNOW))
            {
                EnumObj e = new EnumObj(String.valueOf(c.value), c.text);
                source.add(e);
            }
        }
        return source;
    }
}
