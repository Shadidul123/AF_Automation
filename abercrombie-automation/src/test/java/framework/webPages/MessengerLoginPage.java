package framework.webPages;

import org.openqa.selenium.By;

public class MessengerLoginPage extends BasePage{

    private final By errorMessage = By.id("");

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }
}
