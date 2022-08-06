package core;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseSelenideTest {

    @BeforeAll
    public static void configuration() {
        Configuration.baseUrl = "";
        Configuration.timeout = 10000;
        Configuration.browserSize = "1920x1080";

    }

    @AfterEach
    public void close() {
        Selenide.closeWebDriver();
    }

}
