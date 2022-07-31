package core;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseSelenideConfiguration {

    @BeforeAll
    void configuration() {
        Configuration.baseUrl = "https://demoqa.com";

        Configuration.timeout = 10000;
        Configuration.browserSize = "1920x1080";

    }

    @AfterAll
    void close() {
        Selenide.closeWebDriver();
    }

}
