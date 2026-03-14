package tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.VtbBankWebPage;

import static io.qameta.allure.Allure.step;
import static pages.VtbBankWebPage.baseUrl;

@DisplayName("Проверяем работу кнопок продуктов на главной странице Т-Банка")
public class VtbProductsTests extends TestBase {
    VtbBankWebPage vtbBankWebPage = new VtbBankWebPage();

    @Test
    @DisplayName("Проверяем работу кнопки Дебетовые карты")

    void checkingDebitCardsButton() {
        step("Открываем главную страницу сайта ВТБ Банка: " + baseUrl, () -> {
            vtbBankWebPage
                    .openMainPage()
                    .scroll();

        });

        step("Проверяем работу кнопки Дебетовые карты", () -> {
            vtbBankWebPage
                    .removeCookiesBox()
                    .clickDebitCardsButton("Дебетовые карты")
                    .checkResult("Дебетовые карты");

        });
    }

    @Test
    @DisplayName("Проверяем работу кнопки Кредитные карты")

    void checkingCreditCardsButton() {
        step("Открываем главную страницу сайта ВТБ Банка: " + baseUrl, () -> {
            vtbBankWebPage
                    .openMainPage()
                    .scroll();

        });

        step("Проверяем работу кнопки Кредитные карты", () -> {
            vtbBankWebPage
                    .removeCookiesBox()
                    .clickCreditCardsButton("Кредитные карты")
                    .checkResult("Получить кредитную карту просто ");

        });
    }

    @Test
    @DisplayName("Проверяем работу кнопки Сбережения")

    void checkingSavingsButton() {
        step("Открываем главную страницу сайта ВТБ Банка: " + baseUrl, () -> {
            vtbBankWebPage
                    .openMainPage()
                    .scroll();

        });

        step("Проверяем работу кнопки Сбережения", () -> {
            vtbBankWebPage
                    .removeCookiesBox()
                    .clickSavingsButton("Сбережения")
                    .checkResult("Подберите вклад или накопительный счет ");

        });
    }


}
