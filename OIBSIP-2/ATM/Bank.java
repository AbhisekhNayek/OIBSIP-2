import java.util.ArrayList;

public class Bank 
{

    private ArrayList<User> users;
    private User currentUser;

    public Bank() 
    {
        this.users = new ArrayList<>();
        this.currentUser = null;

        users.add(new User("100", "1111", "ABHISEKH", "NAYEK", 1000.0));
        users.add(new User("101", "2222", "SHREYA", "BASU", 1000.0));
        users.add(new User("103", "3333", "NITAI", "NAYEK", 1000.0));
        users.add(new User("104", "4444", "RANJAN", "SAHOO", 1000.0));
        users.add(new User("105", "5555", "SANKAR", "NAYEK", 1000.0));

    }

    public boolean authenticateUser(String userID, String userPIN) 
    {
        for (User user : users) 
        {
            if (user.getUserID().equals(userID) && user.authenticate(userPIN)) 
            {
                currentUser = user;
                return true;
            }
        }
        return false;
    }

    public User getCurrentUser() 
    {
        return currentUser;
    }

    public User getUserByID(String userID) 
    {
        for (User user : users) 
        {
            if (user.getUserID().equals(userID)) 
            {
                return user;
            }
        }
        return null;
    }
}