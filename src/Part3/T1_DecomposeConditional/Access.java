package Part3.T1_DecomposeConditional;

public class Access {
    public void checkAccess(User user, Resource resource) {
        if (checkLogIn(user, resource)) {
            if (isAccessAllowed(user, resource)) {
                System.out.println("Access granted");
            } else {
                System.out.println("Access denied");
            }
        } else {
            System.out.println("Access denied");
        }
    }

    public boolean checkLogIn(User user, Resource resource) {
        return user != null && user.isLoggedIn() && resource != null;
    }

    public boolean isAccessAllowed(User user, Resource resource){
        return user.hasPermission(resource);
    }
}
