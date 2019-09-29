package example.com.bz;

/**
 * 定义一个枚举的对象，用于列表的转化等
 * @author Administrator
 *
 */
public class EnumObj
{
	/**
	 * 值
	 */
	private String EnumValue;
	/**
	 * 文本
	 */
	private String EnumText;
	/**
	 * 构造函数初始化
	 * @param v 值
	 * @param t 文本
	 */
	public EnumObj(String v,String t)
	{
		EnumValue=v;
		EnumText=t;
	}
	/**
	 * 设置值
	 */
	public void setEnumValue(String v)
	{
		EnumValue=v;
	}
	/**
	 * 设置文本
	 */
	public void setEnumText(String t)
	{
		EnumText=t;
	}
	/**
	 * 获取值
	 */
	public String getEnumValue()
	{
		return EnumValue;
	}
	/**
	 * 获取文本
	 */
	public String getEnumText()
	{
		return EnumText;
	}
	
}
