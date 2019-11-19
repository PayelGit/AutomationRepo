package MtdChaining;

public class Main_class
{

	public static void main(String[] args)
	{
		Firefox d = new Firefox();
		WebElement web = d.findElement();
		web.click();
		web.sendKeys();
		d.findElement().sendKeys();
		d.findElement().click();
	}

}
