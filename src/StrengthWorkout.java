public class StrengthWorkout extends WorkoutRoutine {

    public StrengthWorkout(int duration) {
        super(duration);
    }

    @Override
    public int calculateCalories() {
        return duration * 5;
    }
}
