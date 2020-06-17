package com.udacity.jwdnd.c1.l5.usertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CounterPage {

    @FindBy(id = "count-display")
    private WebElement countDisplay;

    @FindBy(id = "increment-button")
    private WebElement incrementButton;

    @FindBy(id = "reset-value-field")
    private WebElement resetValueField;

    @FindBy(id = "reset-button")
    private WebElement resetButton;

    public CounterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public int getDisplayedCount() {
        return Integer.parseInt(countDisplay.getText());
    }

    public void incrementCount() {
        incrementButton.click();
    }

    public void resetCount(int value) {
        resetValueField.clear();
        resetValueField.sendKeys(String.valueOf(value));
        resetButton.click();
    }
}
