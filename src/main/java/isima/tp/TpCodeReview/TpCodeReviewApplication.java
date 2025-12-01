package isima.tp.TpCodeReview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner; 


@SpringBootApplication
public class TpCodeReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpCodeReviewApplication.class, args);

		Scanner myObj = new Scanner(System.in); 
		AwesomePasswordChecker checker;

		System.out.print("Enter password to check: ");
		String password = myObj.nextLine();

		try {
			checker = AwesomePasswordChecker.getInstance();
			int[] mask = checker.maskAff(password);
			System.out.println("Mask for password '" + password + "':");
			for (int i : mask) {
				System.out.print(i + " ");
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		myObj.close();
	}

}
