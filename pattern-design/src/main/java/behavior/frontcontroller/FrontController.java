package behavior.frontcontroller;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        this.dispatcher = new Dispatcher();
    }

    public boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully.");
        return true;
    }

    public void trackRequest() {
        System.out.println("Track Request.");
    }

    public void dispatchRequest(String request) {
        trackRequest();
        if(isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
}
