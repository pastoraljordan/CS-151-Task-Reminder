package backend;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private String email;
    private String username;
    private String password;
    private List<Reminder> reminders;

    public User(String name, String email, String username, String password) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.reminders = new ArrayList<>();
    }

    // Can also just make multiple methods for forgot password instead of switch
    public void forgotPassword() {

        // Prompt to send text message or email
        switch (verify) {
            case phoneNum:
                GmailTest.sendMessage("Sending old password", getPassword());
                break;
            case email:
                GmailTest.sendEmail("Sending old password", getPassword());
                break;
            case newPass:
                // Create new password and save it
                break;
            default:
                break;
        }

        // Can send message to phone number or email to get old password, or can set new password
        /*if(phone number choice) {
		 * 	send text message with old password
		 * }
		 * else if(email choice) {
		 * 	send email with old password
		 * }
		 * else
		 * ask to enter a new password and set that as new password
         */
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void addReminder(Reminder reminder) {
        reminders.add(reminder);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Reminder> getReminders() {
        return reminders;
    }

    public void setReminders(List<Reminder> reminders) {
        this.reminders = reminders;
    }

}
