import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationImpl {
	public Pattern firstNamePattern = Pattern.compile("[A-Z][a-z]{2,}");
	public boolean firstNameCheck( String firstName) {
		Matcher match = firstNamePattern.matcher(firstName);
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
		flag = firstNameCheck(firstName);
		checkValidity(flag);
		System.out.println("Enter a Valid last name(Starts with a Cap and has min 3 letters)");
		String lastName = readIn.next();
		flag = firstNameCheck(lastName);
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
