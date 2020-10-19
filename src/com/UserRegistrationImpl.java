import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationImpl {
	public static final Pattern firstNamePattern = Pattern.compile("[A-Z][a-z]{2,}");
	public static final Pattern emailPattern = Pattern.compile("^[a-zA-Z]{3}\\.?[a-zA-Z0-9\\$\\_\\+]*\\@[a-z0-9]*\\.(co|in|com|net)");
	public static final Pattern phonePattern = Pattern.compile("^[0-9]{2}[\\s]{1}[0-9]*{10}");
	public static final Pattern passwordPattern = Pattern.compile("^(?=.*[@#$%&*_=+].{8}$)(?=.*[A-Z])(?=.*[0-9])");
	public boolean checkMatch( String matchString, Pattern pattern) {
		Matcher match = pattern.matcher(matchString);
        if(match.matches()){
            return true;
        }
        return false;
	}
	public void takeUserInput() {
		boolean flag;
		Scanner readIn = new Scanner(System.in);
		System.out.println("Enter a Valid first name(Starts with a Cap and has min 3 letters)");
		String firstName = readIn.next();
		flag = checkMatch(firstName, firstNamePattern);
		checkValidity(flag);
		System.out.println("Enter a Valid last name(Starts with a Cap and has min 3 letters)");
		String lastName = readIn.next();
		flag = checkMatch(lastName, firstNamePattern);
		checkValidity(flag);
		System.out.println("Enter a Valid Email");
		String email = readIn.next();
		flag = checkMatch(email, emailPattern);
		checkValidity(flag);
		System.out.println("Enter a Valid Phone");
		String phone = readIn.next();
		flag = checkMatch(phone, phonePattern);
		checkValidity(flag);
		System.out.println("Enter a Valid Password");
		String password = readIn.next();
		flag = checkMatch(password, passwordPattern);
		checkValidity(flag);
	}
	public void checkValidity(boolean flag) {
		if (flag == true) {
			System.out.println("Valid");
			return;
		}
		System.out.println("Invalid");
		return;
	}
}