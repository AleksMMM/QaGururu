package pages;

import com.codeborne.selenide.SelenideElement;
import core.BaseSelenideTest;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PageRegisrtation extends BaseSelenideTest {

    private SelenideElement firstName = $x("//input[@placeholder = 'First Name']");
    private SelenideElement selenideElement = $x("//input[@placeholder = 'First Name']");

    public PageRegisrtation setFirstName(String firsName) {
        $x("//input[@placeholder = 'First Name']").setValue(firsName);
        return this;
    }

    public PageRegisrtation setlastName(String firsName) {
        $x("//input[@placeholder = 'Last Name']").setValue(firsName);
        return this;
    }

    public PageRegisrtation setUserEmail(String value) {
        $("[id=userEmail]").setValue(value);
        return this;
    }

    public PageRegisrtation setGenger(String gender) {
        $("#genterWrapper").$(byText(gender)).click();
        return this;
    }

    public PageRegisrtation setMobilePhone(String phoneNumber) {
        $x("//input[@id = 'userNumber']").setValue(phoneNumber);
        return this;
    }

    public PageRegisrtation setDateBirth(String day, String mouth, String year ) {
        $x("//input[@id = 'dateOfBirthInput']").click();
        new PageCalendar().setDate(day,mouth, year);
        return this;
    }

    public PageRegisrtation setSubjects(String subjects) {
        $("#subjectsInput").setValue(subjects).pressEnter();
        return this;
    }

    public PageRegisrtation setHobbies(String hobbyInput) {
        $("#hobbiesWrapper").$(byText(hobbyInput)).click();
        return this;
    }

    public PageRegisrtation uploadImage(String upload) {
        $("#uploadPicture").uploadFile(new File(upload));
        $("#currentAddress-wrapper").click();
        return this;
    }

    public PageRegisrtation setCurrentAddress(String value) {
        $("#currentAddress").setValue(value);
        $("#state").click();
        return this;
    }

    public PageRegisrtation setState(String stateState) {
        $("#stateCity-wrapper").$(byText(stateState)).click();
        $("#city").click();
        return this;
    }

    public PageRegisrtation setCity(String stateCity) {
        $("#stateCity-wrapper").$(byText(stateCity)).click();
        $("#submit").click();
        return this;
    }

    public PageRegisrtation checkResult(String key, String value) {
        new ResultWindow().checkResult(key, value);
        return this;
    }
}