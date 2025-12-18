public class FitnessApp {
    private String appName;
    private User user;
    private WorkoutRoutine routine;

    public FitnessApp(String appName, User user, WorkoutRoutine routine) {
        this.appName = appName;
        this.user = user;
        this.routine = routine;
    }

    public String getAppName() {
        return appName;
    }

    public User getUser() {
        return user;
    }

    public WorkoutRoutine getRoutine() {
        return routine;
    }


    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRoutine(WorkoutRoutine routine) {
        this.routine = routine;
    }

    public void showDetails() {
        System.out.println("Fitness App: " + appName);
        user.displayInfo();
        routine.displayRoutine();
    }
}

