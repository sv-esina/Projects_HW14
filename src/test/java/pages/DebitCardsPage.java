package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DebitCardsPage {

    private final   SelenideElement
                        checkResult=$(".typographystyles__Box-foundation-kit__sc-14qzghz-0.jXDzyw");


    @Step("Проверяем открывшуюся страницу")
    public DebitCardsPage checkResult(String value){
        checkResult.shouldHave(text(value));
        return this;
    }

}
