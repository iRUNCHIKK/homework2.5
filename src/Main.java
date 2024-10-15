import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) {

        String login = "Login";
        String password = "Pass_word0932";
        String confirmPassword = "Pass_word0932";

        try {
            Validator.validate(login, password, confirmPassword);
        } catch (WrongLoginException wrongLoginException) {
            System.out.println("Произошла ошибка при проверке логина: " + wrongLoginException.getMessage());
        } catch (WrongPasswordException wrongPasswordException) {
            System.out.println("Произошла ошибка при проверке пароля: " + wrongPasswordException.getMessage());
        } finally {
            System.out.println("Валидация завершена");
        }
    }
}