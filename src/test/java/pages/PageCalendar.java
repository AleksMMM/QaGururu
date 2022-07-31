package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PageCalendar {

    public void setDate(String day, String month, String year) {
        String el = String.format("//div[contains(@aria-label, '%sth')]", day);
        $x("//select[@class = 'react-datepicker__month-select']").selectOption(month);
        $x("//select[@class = 'react-datepicker__year-select']").selectOption(year);
        $x(el).click();

    }
}
