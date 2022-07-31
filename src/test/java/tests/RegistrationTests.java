package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pages.PageRegisrtation;

import java.io.File;

import static core.TestData.FIRST_NAME;
import static core.TestData.LAST_NAME;

public class RegistrationTests {

    PageRegisrtation pageRegisrtation = new PageRegisrtation();

    @Test
    void successfulTest() {

        Selenide.open( "https://demoqa.com/automation-practice-form");

        pageRegisrtation.firstNameInput(FIRST_NAME)
                .lastNameInput(LAST_NAME)
                .setUserEmail("alexLar@gmail.com")
                .setGenger("Male")
                .setMobilePhone("3748596032")
                .setDateBirth("11", "April", "1990")
                .setSubjects("Physics")
                .setHobbies("Reading")
                .uploadImage(String.valueOf(new File("src/test/resources/docker-1.png")))
                .setCurrentAddress("Lenina 5")
                .setState("NCR")
                .setCity("Delhi")
                .checkResult("Student Name", FIRST_NAME + " " + LAST_NAME)
                .checkResult("Student Email", "alexLar@gmail.com")
                .checkResult("Date of Birth", "10 April,1990");

    }

}
