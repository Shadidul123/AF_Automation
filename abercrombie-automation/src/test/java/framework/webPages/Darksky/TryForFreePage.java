package framework.webPages.Darksky;

import framework.webPages.BasePage;
import org.openqa.selenium.By;

public class TryForFreePage extends BasePage {

    private final By tryForFreeButton = By.linkText("TRY FOR FREE");


    public void clickTryForFreeButton() {
        clickOn(tryForFreeButton);
    }
}
