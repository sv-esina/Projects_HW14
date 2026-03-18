package pages;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class OnlineVtbBankWebPage {

    public static String onlineBankUrl = "https://online.vtb.ru/";

    private final SelenideElement
                    onlineBankButton=$("[data-component=header-login-link-desktop]"),
                    phoneNumberField=$("[data-test-id=submit-phone-number-button]"),
                    enterByQrField=$("[data-test-id=auth-by-qr-button]"),
                    qrCode=$("[alt=QR-код]");



    @Step("Нажимаем кнопку кн. Личный кабинет")
    public OnlineVtbBankWebPage clickOnlineBankButton() {
        onlineBankButton.click();

        return this;
    }

    @Step("Переходим вкладку Онлайн Банк")
    public OnlineVtbBankWebPage goToVtbOnlineBankPage() {
        switchTo().window(1);
        return this;
    }

    @Step("Проверяем открытие формы Введите номер телефона")
    public OnlineVtbBankWebPage checkingEnterPhoneNumberForm() {

        $(byText("Введите номер телефона")).shouldBe(visible);
        return this;
    }

    @Step("Открываем страницу авторизации")
    public OnlineVtbBankWebPage openVtbOnlineBankPage() {
        open(onlineBankUrl);

        return this;
    }

    @Step("Нажимаем кнопку Продолжить")
    public OnlineVtbBankWebPage clickContinueButton() {
        phoneNumberField.click();

        return this;
    }

    @Step("Проверяем сообщение об ошибке по кнопке Продолжить")
    public OnlineVtbBankWebPage checkingErrorMessageByClickingContinueButton() {
        $(byText("Заполните поле")).shouldBe(visible);
        return this;
    }

    @Step("Нажимаем кнопку Войти по QR")
    public OnlineVtbBankWebPage clickEnterByQrButton() {
        enterByQrField.click();
        return this;
    }

    @Step("Проверяем открытие страницы Войти по QR-коду")
    public OnlineVtbBankWebPage checkingOpenPageEnterQr() {
        $(byText("Войти по QR-коду")).shouldBe(visible);
        return this;
    }

    @Step("Проверяем наличие QR-кода на странице")
    public OnlineVtbBankWebPage checkingQrCodeDisplay() {
        qrCode.shouldBe(visible);
        return this;
    }

}
