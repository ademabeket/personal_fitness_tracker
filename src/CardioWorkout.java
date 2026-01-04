public class CardioWorkout extends WorkoutRoutine {

    public CardioWorkout(int duration) {
        super(duration);
    }

    @Override
    public int calculateCalories() {
        return duration * 8;
    }
}
