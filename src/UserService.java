public class UserService {
    private User user;

    public UserService(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUserId(){

        return "id:" + this.user.getId();
    }
}
