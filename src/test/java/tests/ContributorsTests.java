package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import core.BaseSelenideTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ContributorsTests extends BaseSelenideTest {

    /**
     * ancestor - найти элемент выше по дереву
     * $$ - получить коллекцию элементов
     * hover - навести мышку на элемент
     *
     * для работы с всплывающими окнами использовать вкладку source
     * браузера или команду консоли debugger
     *
     * $$("Popover-Message").find(Condition.visible) - получу видимый элемент из коллекции найденных элементов
     */
    @Test
    void andrSolntsevShouldContributeTheMost() {

        open("https://github.com/selenide/selenide");

        $(".Layout-sidebar").$(byText("Contributors"))
                .ancestor(".BorderGrid-cell").$$("ul li")
                .first()
                .hover();

        $$(".Popover-message")
                .find(Condition.visible)
                .shouldHave(Condition.text("Andrei Solntsev"));

        sleep(1000);

    }
}
