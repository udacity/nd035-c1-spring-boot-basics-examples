package com.udacity.jwdnd.c1.review;

import com.udacity.jwdnd.c1.review.model.ChatMessage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatPage {

    @FindBy(id="messageText")
    private WebElement textField;

    @FindBy(id="submitMessage")
    private WebElement submitButton;

    @FindBy(className = "chatMessageUsername")
    private WebElement firstMessageUsername;

    @FindBy(className = "chatMessageText")
    private WebElement firstMessageText;

    public ChatPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void sendChatMessage(String text) {
        this.textField.sendKeys(text);
        this.submitButton.click();
    }

    public ChatMessage getFirstMessage() {
        ChatMessage result = new ChatMessage();
        result.setMessageText(firstMessageText.getText());
        result.setUsername(firstMessageUsername.getText());
        return result;
    }

}

