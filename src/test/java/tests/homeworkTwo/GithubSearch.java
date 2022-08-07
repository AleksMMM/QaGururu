package tests.homeworkTwo;

import com.codeborne.selenide.Condition;
import core.BaseSelenideTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubSearch extends BaseSelenideTest {

    @Test
    @DisplayName("Проверка поиска github")
    void searchSelenide() {
        open("/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions").pressEnter();
        $("#wiki-body").shouldHave(text("Soft assertions"));
        $(byText("#wiki-body")).shouldHave(text("Using JUnit5"));
    }
}
