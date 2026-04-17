package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import base.BasePage;

import java.util.ArrayList;
import java.util.List;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    // 🔹 Existing Locators (Logout)
    private By menuBtn = By.id("react-burger-menu-btn");
    private By logoutBtn = By.id("logout_sidebar_link");

    // 🔹 New Locators (Products)
    private By productNames = By.className("inventory_item_name");
    private By productPrices = By.className("inventory_item_price");
    private By sortDropdown = By.className("product_sort_container");

    // 🔹 Logout Actions
    public void clickMenu() {
        click(menuBtn);
    }

    public void clickLogout() {
        click(logoutBtn);
    }

    // 🔹 Get all product names
    public List<String> getProductNames() {
        List<WebElement> elements = driver.findElements(productNames);
        List<String> names = new ArrayList<>();

        for (WebElement e : elements) {
            names.add(e.getText());
        }
        return names;
    }

    // 🔹 Get all product prices
    public List<Double> getProductPrices() {
        List<WebElement> elements = driver.findElements(productPrices);
        List<Double> prices = new ArrayList<>();

        for (WebElement e : elements) {
            String priceText = e.getText().replace("$", "");
            prices.add(Double.parseDouble(priceText));
        }
        return prices;
    }

    // 🔹 Select sorting option
    public void selectSortOption(String value) {
        org.openqa.selenium.support.ui.Select select =
                new org.openqa.selenium.support.ui.Select(driver.findElement(sortDropdown));
        select.selectByValue(value);
    }

    // 🔹 Click first product
    public void clickFirstProduct() {
        driver.findElements(productNames).get(0).click();
    }

    // 🔹 Product detail page
    public String getProductDetailName() {
        return driver.findElement(By.className("inventory_details_name")).getText();
    }

    public String getProductDetailPrice() {
        return driver.findElement(By.className("inventory_details_price")).getText();
    }
}