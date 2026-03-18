package tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainVtbBankWebPage;

@DisplayName("Проверяем работу кнопок продуктов на главной странице ВТБ")

public class MainVtbProductsTests extends TestBase {
    MainVtbBankWebPage mainVtbBankWebPage = new MainVtbBankWebPage();

    @Test
    @DisplayName("Проверяем работу кнопки Дебетовые карты")

    void checkingDebitCardsButtonTest() {
            mainVtbBankWebPage
                    .openMainPage()
                    .scroll()
                    .removeCookiesBox()
                    .clickDebitCardsButton("Дебетовые карты")
                    .checkResult("Дебетовые карты");

    }

    @Test
    @DisplayName("Проверяем работу кнопки Кредитные карты")

    void checkingCreditCardsButtonTest() {
            mainVtbBankWebPage
                    .openMainPage()
                    .scroll()
                    .removeCookiesBox()
                    .clickCreditCardsButton("Кредитные карты")
                    .checkResult("Получить кредитную карту просто ");

    }

    @Test
    @DisplayName("Проверяем работу кнопки Сбережения")

    void checkingSavingsButtonTest() {
            mainVtbBankWebPage
                    .openMainPage()
                    .scroll()
                    .removeCookiesBox()
                    .clickSavingsButton("Сбережения")
                    .checkResult("Подберите вклад или накопительный счет ");

    }


}
