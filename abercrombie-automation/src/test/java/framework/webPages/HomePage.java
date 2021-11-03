package framework.webPages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

	private final By emailTextField = By.id("email");
	private final By passwordTextField = By.id("pass");
	private final By loginButton = By.id("loginbutton");
	private final By firstNameTextField = By.id("firstName");
	private final By lastNameTextField = By.id("lastName");
	private final By mobileNumberTextField = By.id("mobileNumber");
	private final By newPasswordTextField = By.id("newPwd");
	private final By errorMessage = By.id("errorMessage");
	private final By femaleGender = By.id("u_0_9");
	private final By maleGender = By.id("u_0_a");
	private final By messengerLink = By.id("");
	
	public void clickOnLoginButton() {
		clickOn(loginButton);
	}

	public void enterEmail(String enterEmail) {
		setValue(emailTextField, enterEmail);
	}
	
	public void enterPassword(String enterPassword) {
		setValue(passwordTextField, enterPassword);
	}

	public void enterFirstName(String firstName) {
		setValue(firstNameTextField, firstName);
	}

	public void enterLastName(String lastName) {
		setValue(lastNameTextField, lastName);
	}

	public void enterMobileNumber(String mobileNum) {
		setValue(mobileNumberTextField, mobileNum);
	}

	public void enterNewPassword(String password) {
		setValue(newPasswordTextField, password);
	}

	public String getErrorMessage() {
		return getTextFromElement(errorMessage);
	}

	public boolean isGenderFemaleSelected() {
		return isElementSelected(femaleGender);
	}

	public void clickOnFemaleGender() {
		clickOn(femaleGender);
	}

	public boolean isGenderMaleSelected() {
		return isElementSelected(maleGender);
	}

	public void clickOnMaleGender() {
		clickOn(maleGender);
	}

	public void clickOnMessengerLink() {
		clickOn(messengerLink);
	}







}
