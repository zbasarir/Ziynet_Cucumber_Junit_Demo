package com.ziynet.pages;

import com.ziynet.utillities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class basePage {

    public basePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
