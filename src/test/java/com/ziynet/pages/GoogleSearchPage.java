package com.ziynet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage extends basePage{

    @FindBy (name="q")
    public WebElement searchBox;

    @FindBy(css = "a[class='FLP8od']")
    public WebElement capitalText;

}
