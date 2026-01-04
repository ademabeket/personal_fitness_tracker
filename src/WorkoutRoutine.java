public abstract class WorkoutRoutine {
    protected int duration;

    public WorkoutRoutine(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public abstract int calculateCalories();

    public void displayRoutine() {
        System.out.println(
                "Duration: " + duration +
                        " minutes, Calories: " + calculateCalories()
        );
    }
}



