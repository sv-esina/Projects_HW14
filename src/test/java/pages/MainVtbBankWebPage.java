package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainVtbBankWebPage {
    public static String baseUrl = "https://www.vtb.ru/";

    private final SelenideElement

                    scroll = $("#pb"),
                    cookiesBox = $("#cookies-box"),
                    closeCookiesBox = $("#cookie-buttons");


                ElementsCollection
                    debitCardsButton=$$("[href='/personal/karty/debetovye/']"),
                    creditCardsButton=$$("[href='/personal/karty/kreditnye/']"),
                    savingsButton=$$("[href='/personal/vklady-i-scheta/']");

    @Step("Открываем главную страницу сайта ВТБ Банк")
    public MainVtbBankWebPage openMainPage() {
        open(baseUrl);
        return this;
    }


    @Step("Нажимаем кнопку Дебетовые карты")
    public MainVtbBankWebPage clickDebitCardsButton(String value) {
        debitCardsButton.findBy(text(value)).click();
        return this;
    }

    @Step("Нажимаем кнопку Кредитные карты")
    public MainVtbBankWebPage clickCreditCardsButton(String value) {
        creditCardsButton.findBy(text(value)).click();
        return this;
    }

    @Step("Нажимаем кнопку Сбережения")
    public MainVtbBankWebPage clickSavingsButton(String value) {
        savingsButton.findBy(text(value)).click();
        return this;
    }


    @Step("Скролл страницы до блока Частным лицам")
    public MainVtbBankWebPage scroll() {
        scroll.scrollTo();

        return this;
    }

    @Step("Убираем всплывающее сообщение cookie")
    public MainVtbBankWebPage removeCookiesBox() {

        while (cookiesBox.is(visible)) {
            closeCookiesBox.click();
        }
        return this;
    }

}
