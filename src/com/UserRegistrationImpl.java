import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationImpl {
	
	public boolean firstNameCheck( String firstName) {
		Pattern firstNamePattern = Pattern.compile("[A-Z][a-z]{2,}");
		Matcher match = firstNamePattern.matcher(firstName);
        if(match.matches()){
            return true;
        }
        return false;
	}
	public boolean emailCheck( String email) {
		Pattern emailPattern = Pattern.compile("^[a-zA-Z]{3}\\.?[a-zA-Z0-9\\$\\_\\+]*\\@[a-z0-9]*\\.(co|in|com|net)");
		Matcher match = emailPattern.matcher(email);
        if(match.matches()){
            return true;
        }
        return false;
	}
	public boolean phoneCheck( String phone) {
		Pattern phonePattern = Pattern.compile("^[0-9\s]{2}[0-9]*{10}");
		Matcher match = phonePattern.matcher(phone);
        if(match.matches()){
            return true;
        }
        return false;
	}
	public boolean passwordCheck( String password) {
		Pattern passwordPattern = Pattern.compile("(?=.*[A-Z]).{8,}");
		Matcher match = passwordPattern.matcher(password);
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
		System.out.println("Enter a Valid Email");
		String email = readIn.next();
		flag = emailCheck(email);
		checkValidity(flag);
		System.out.println("Enter a Valid Phone");
		String phone = readIn.next();
		flag = phoneCheck(phone);
		checkValidity(flag);
		System.out.println("Enter a Valid Password");
		String password = readIn.next();
		flag = passwordCheck(password);
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
