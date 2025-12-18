public class WorkoutRoutine {
    private String type;
    private int duration; // minutes

    public WorkoutRoutine(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }


    public String getType() {
        return type;
    }

    public int getDuration() {
        return duration;
    }


    public void setType(String type) {
        this.type = type;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int calculateCalories() {
        return duration * 8;
    }

    public void displayRoutine() {
        System.out.println(
                "Workout: " + type + ", Duration: " + duration + " minutes" + ", Calories burned: " + calculateCalories()
        );
    }
}


