package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.OnlineVtbBankWebPage;
import pages.MainVtbBankWebPage;


@DisplayName("Проверяем работу страницы авторизации в личном кабинете ВТБ Банка")

public class OnlineVtbAuthBankTests extends TestBase {

    OnlineVtbBankWebPage onlineVtbBankWebPage = new OnlineVtbBankWebPage();
    MainVtbBankWebPage mainVtbBankWebPage = new MainVtbBankWebPage();

    @Test
    @DisplayName("Проверяем переход на страницу Личный кабинет ВТБ")

    void openMainPageVtbBankTest() {

        mainVtbBankWebPage.openMainPage();

        onlineVtbBankWebPage
                .clickOnlineBankButton()
                .goToVtbOnlineBankPage()
                .checkingEnterPhoneNumberForm();

    }

    @Test
    @DisplayName("Попытка входа в ЛК без ввода номера телефона")

    void loginWithEmptyPhoneNumberTest() {

        onlineVtbBankWebPage
                    .openVtbOnlineBankPage()
                    .checkingEnterPhoneNumberForm()
                    .openVtbOnlineBankPage()
                    .clickContinueButton()
                    .checkingErrorMessageByClickingContinueButton();
    }

    @Test
    @DisplayName("Проверка открытия формы входа по QR-коду")

    void loginByQrCodeTest() {

        onlineVtbBankWebPage
                    .openVtbOnlineBankPage()
                    .checkingEnterPhoneNumberForm()
                    .clickEnterByQrButton()
                    .checkingOpenPageEnterQr()
                    .checkingQrCodeDisplay();


    }
}
