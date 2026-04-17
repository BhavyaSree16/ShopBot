package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.BasePage;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    private By menuBtn = By.id("react-burger-menu-btn");
    private By logoutBtn = By.id("logout_sidebar_link");

    // Actions
    public void clickMenu() {
        click(menuBtn);
    }

    public void clickLogout() {
        click(logoutBtn);
    }
}