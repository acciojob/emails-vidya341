package com.driver;

public class Email {

    private String emailId;
    private String password;
    public Email()
    {

    }

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public boolean checkuppercase(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                return true;
            }
        }
        return false;
    }
    public boolean checklowercase(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                return true;
            }
        }
        return false;
    }
    public boolean checkdigit(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>='1' && ch<='9')
            {
                return true;
            }
        }
        return false;
    }
    public boolean checkspecial(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch<='A' || ch>='B')
            {
                return true;
            }
        }
        return false;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

        String curr_password = getPassword();
        if(curr_password.equals(oldPassword)){
            if(newPassword.length()>=8 && checkuppercase(newPassword) && checklowercase(newPassword) && checkdigit(newPassword) && checkspecial(newPassword))
            {
                password = newPassword;
            }

        }
    }
}
