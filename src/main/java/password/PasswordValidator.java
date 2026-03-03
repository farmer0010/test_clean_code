package password;

public class PasswordValidator {
    public static void validate(String password) {
        if(password == null) {
            throw new IllegalArgumentException("Password는 null이 들어올수 없습니다");
        }
        
        if (password.length() < 8) {
            throw new IllegalArgumentException("비밀번호는 8자리 이상이어야 합니다.");
        }
    }
}
