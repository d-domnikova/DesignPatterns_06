package Part3.T1_DecomposeConditional;

public class User {
    private boolean loginIn;

    public User(boolean loginIn) {
        this.loginIn = loginIn;
    }

    public boolean isLoggedIn() {
        return loginIn;
    }

    public boolean hasPermission(Resource resource){
        return true;
    }
}
