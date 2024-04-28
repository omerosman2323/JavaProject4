package Registration;
public class RegistrationClas {
private String userName;
private String password;
private String email;


    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email format. Please provide a valid Yahoo email.");
        }
    }


    public void setUserName(String userName) {
        if (isValidUserName(userName)) {
            this.userName = userName;
        } else {
            System.out.println("Invalid username. Username cannot be empty and should be at least 6 characters long.");
        }
    }


    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            System.out.println("Invalid password. Password cannot be empty, should be at least 6 characters long, and should not contain the username.");
        }
    }


    private boolean isValidEmail(String email) {
        return email.endsWith("@yahoo.com");
    }


    private boolean isValidUserName(String userName) {
        return userName != null && !userName.isEmpty() && userName.length() > 6;
    }


    private boolean isValidPassword(String password) {
        return password != null && !password.isEmpty() && password.length() > 6 && !password.contains(userName);
    }


    public void displayRegistrationDetails() {
        System.out.println("Registration Details:");
        System.out.println("Email: " + email);
        System.out.println("Username: " + userName);
        // For security reasons, don't display password here
    }

}
