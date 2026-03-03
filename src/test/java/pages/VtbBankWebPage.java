package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.title;

public class VtbBankWebPage {
    public static String baseUrl = "https://www.vtb.ru/";
    public static String onlineBankUrl = "https://online.vtb.ru/";

    private final SelenideElement
                    onlineBankButton=$("[data-component=header-login-link-desktop]"),
                    phoneNumberField=$("[data-test-id=submit-phone-number-button]"),
                    enterByQrField=$("[data-test-id=auth-by-qr-button]"),
                    qrCode=$("[alt=QR-код]"),
                    checkResult=$(".typographystyles__Box-foundation-kit__sc-14qzghz-0.jXDzyw"),
                    scroll = $("#pb");

    ElementsCollection debitCardsButton=$$("[href='/personal/karty/debetovye/']"),
            creditCardsButton=$$("[href='/personal/karty/kreditnye/']"),
            savingsButton=$$("[href='/personal/vklady-i-scheta/']");

    @Step("Открываем главную страницу сайта ВТБ Банк")
    public VtbBankWebPage openMainPage() {
        open(baseUrl);
        webdriver().shouldHave(title("Банк ВТБ (ПАО) ⚡— дебетовые и кредитные карты, ипотека, кредиты, вклады для физических и юридических лиц по всей России"));
        return this;
    }


    @Step("Нажимаем кнопку кн. Личный кабинет")
    public VtbBankWebPage clickOnlineBankButton() {
        onlineBankButton.click();

        return this;
    }

    @Step("Переходим вкладку Онлайн Банк")
    public VtbBankWebPage goToVtbOnlineBankPage() {
        switchTo().window(1);
        return this;
    }

    @Step("Проверяем открытие формы Введите номер телефона")
    public VtbBankWebPage checkingEnterPhoneNumberForm() {

        $(byText("Введите номер телефона")).shouldBe(visible);
        return this;
    }

    @Step("Открываем страницу авторизации")
    public VtbBankWebPage openVtbOnlineBankPage() {
        open(onlineBankUrl);

        return this;
    }

    @Step("Нажимаем кнопку Продолжить")
    public VtbBankWebPage clickContinueButton() {
        phoneNumberField.click();

        return this;
    }

    @Step("Проверяем сообщение об ошибке по кнопке Продолжить")
    public VtbBankWebPage checkingErrorMessageByClickingContinueButton() {
        $(byText("Заполните поле")).shouldBe(visible);
        return this;
    }

    @Step("Нажимаем кнопку Войти по QR")
    public VtbBankWebPage clickEnterByQrButton() {
        enterByQrField.click();
        return this;
    }

    @Step("Проверяем открытие страницы Войти по QR-коду")
    public VtbBankWebPage checkingOpenPageEnterQr() {
        $(byText("Войти по QR-коду")).shouldBe(visible);
        return this;
    }

    @Step("Проверяем наличие QR-кода на странице")
    public VtbBankWebPage checkingQrCodeDisplay() {
        qrCode.shouldBe(visible);
        return this;
    }

    @Step("Нажимаем кнопку Дебетовые карты")
    public VtbBankWebPage clickDebitCardsButton(String value) {
        debitCardsButton.findBy(text(value)).click();
        return this;
    }

    @Step("Нажимаем кнопку Кредитные карты")
    public VtbBankWebPage clickCreditCardsButton(String value) {
        creditCardsButton.findBy(text(value)).click();
        return this;
    }

    @Step("Нажимаем кнопку Сбережения")
    public VtbBankWebPage clickSavingsButton(String value) {
        savingsButton.findBy(text(value)).click();
        return this;
    }

    @Step("Проверяем открывшуюся страницу")
    public VtbBankWebPage checkResult(String value){
        checkResult.shouldHave(text(value));
        return this;
    }


    public VtbBankWebPage scroll() {
        scroll.scrollTo();

        return this;
    }

    public VtbBankWebPage removeCookiesBox() {
        $("#cookie-buttons").click();

        return this;
    }

}
