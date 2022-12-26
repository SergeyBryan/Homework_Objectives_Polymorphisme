package Data;

public class Data  {
    public String login;
    public String confirmPassword;
    public String password;

    public Data() {
    }


    public static void validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordExeption {
        if (check(login)) {
            throw new WrongLoginException("Логин должен содержать не больше 20 символов и включать в себя только латинские символы, цифры или знак '_'");
        }
        if (check(password)) {
            throw new WrongPasswordExeption("Пароль должен содержать не больше 20 символов и включать в себя только латинские символы, цифры или знак '_'");
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordExeption("Подтвержденный пароль не совпадает с введенным паролем");
        }
    }


    public static boolean che(String login, String password, String confirmPassword) {
        try {
            validate(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordExeption e) {
            System.out.println(e.getMessage());
            return false;
        } return true;
    }
    public static boolean check(String login) {
        if (login.length() > 20 || login.isEmpty() || login.isBlank()) {
            return false;
        }
        if (login.matches("[a-zA-z0-9_]+")) {
            return false;
        } return true;
    }


}
