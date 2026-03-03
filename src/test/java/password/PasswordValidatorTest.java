package password;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PasswordValidatorTest {
    @Test
    void testPassword() {
        String validPassword = null;
        assertThrows(IllegalArgumentException.class, () -> {
            PasswordValidator.validate(validPassword);
        });
    }
}
