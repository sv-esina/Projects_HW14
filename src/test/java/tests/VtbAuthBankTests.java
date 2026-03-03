package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.VtbBankWebPage;

import static io.qameta.allure.Allure.step;
import static pages.VtbBankWebPage.baseUrl;
import static pages.VtbBankWebPage.onlineBankUrl;


@DisplayName("Проверяем работу страницы авторизации в личном кабинете ВТБ Банка")
public class VtbAuthBankTests extends TestBase {

    VtbBankWebPage vtbBankWebPage = new VtbBankWebPage();


    @Test
    @DisplayName("Проверяем переход на страницу Личный кабинет ВТБ")

    void openMainPageVtbBank() {

    step("Открываем главную страницу сайта ВТБ Банка: " + baseUrl, () -> {
        vtbBankWebPage
                .openMainPage();

    });

    step("Переход на страницу личного кабинета", () -> {
        vtbBankWebPage
                .clickOnlineBankButton()
                .goToVtbOnlineBankPage()
                .checkingEnterPhoneNumberForm();
        });

    }

    @Test
    @DisplayName("Попытка входа в ЛК без ввода номера телефона")

    void loginWithEmptyPhoneNumber() {

        step("Открываем страницу авторизации: " + onlineBankUrl, () -> {
            vtbBankWebPage
                    .openVtbOnlineBankPage()
                    .checkingEnterPhoneNumberForm();

        });

        step("Проверяем обязательность поля Номер телефона", () -> {
            vtbBankWebPage
                    .openVtbOnlineBankPage()
                    .clickContinueButton()
                    .checkingErrorMessageByClickingContinueButton();

        });

    }

    @Test
    @DisplayName("Проверка открытия формы входа по QR-коду")

    void loginByQrCode() {

        step("Открываем страницу авторизации: " + onlineBankUrl, () -> {
            vtbBankWebPage
                    .openVtbOnlineBankPage()
                    .checkingEnterPhoneNumberForm();

        });

        step("Проверяем форму авторизации по QR коду", () -> {
            vtbBankWebPage
                    .clickEnterByQrButton()
                    .checkingOpenPageEnterQr()
                    .checkingQrCodeDisplay();

        });

    }
}
