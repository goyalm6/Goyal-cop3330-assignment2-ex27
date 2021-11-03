package ex27;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void validateFirstNameShouldReturnTrue() {
        String fname = "john";
        Boolean result = ex27.Main.validateFirstName(fname);
        assertTrue(result);
    }

    @Test
    void validateFirstNameShouldReturnFalseWhenFirstNameIsEmpty() {
        String fname = "";
        Boolean result = ex27.Main.validateFirstName(fname);
        assertFalse(result);
    }

    @Test
    void validateFirstNameShouldReturnFalseWhenFirstNameIsOneCharacter() {
        String fname = "q";
        Boolean result = ex27.Main.validateFirstName(fname);
        assertFalse(result);
    }

    @Test
    void validateLastNameShouldReturnTrue() {
        String lname = "johnson";
        Boolean result = ex27.Main.validateLastName(lname);
        assertTrue(result);
    }

    @Test
    void validateLastNameShouldReturnFalseWhenLastNameIsEmpty() {
        String lname = "";
        Boolean result = ex27.Main.validateLastName(lname);
        assertFalse(result);
    }

    @Test
    void validateLastNameShouldReturnFalseWhenLastNameIsOneCharacter() {
        String lname = "s";
        Boolean result = ex27.Main.validateLastName(lname);
        assertFalse(result);
    }

    @Test
    void validateZipCodeShouldReturnTrue() {
        String zip = "12345";
        Boolean result = ex27.Main.validateZipCode(zip);
        assertTrue(result);
    }

    @Test
    void validateZipCodeShouldReturnFalseWhenLessThanFiveDigits() {
        String zip = "123";
        Boolean result = ex27.Main.validateZipCode(zip);
        assertFalse(result);
    }

    @Test
    void validateZipCodeShouldReturnFalseWhenFiveDigitsAndNotAllIntegers() {
        String zip = "123AB";
        Boolean result = ex27.Main.validateZipCode(zip);
        assertFalse(result);
    }

    @Test
    void validateEmployeeIDShouldReturnTrue() {
        String empId = "CD-5675";
        Boolean result = ex27.Main.validateEmployeeID(empId);
        assertTrue(result);
    }

    @Test
    void validateEmployeeIDShouldReturnFalseWhenNotInExpectedFormat() {
        String empId = "AB1234";
        Boolean result = ex27.Main.validateEmployeeID(empId);
        assertFalse(result);
    }

    @Test
    void validateEmployeeIDShouldReturnFalseWhenAllCharacters() {
        String empId = "ABCDEF";
        Boolean result = ex27.Main.validateEmployeeID(empId);
        assertFalse(result);
    }

    @Test
    void validateEmployeeIDShouldReturnFalseWhenAllNumbers() {
        String empId = "123456";
        Boolean result = ex27.Main.validateEmployeeID(empId);
        assertFalse(result);
    }
}