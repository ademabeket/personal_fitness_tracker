public class FitnessApp {
    private String appName;
    private User user;
    private WorkoutRoutine routine;

    public FitnessApp(String appName, User user, WorkoutRoutine routine) {
        this.appName = appName;
        this.user = user;
        this.routine = routine;
    }

    public void showDetails() {
        System.out.println("Fitness App: " + appName);
        System.out.println(user);
        routine.displayRoutine();
    }
}


