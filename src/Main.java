import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();

        users.add(new User("Ademi", 17, 55.5));
        users.add(new User("Dana", 21, 62.0));
        users.add(new User("Aliya", 20, 58.3));
        users.add(new User("Arman", 23, 70.8));

        // PRINT ALL
        System.out.println("All users:");
        users.forEach(System.out::println);

        // SEARCH
        System.out.println("\nSearch user Dana:");
        for (User u : users) {
            if (u.getName().equals("Dana")) {
                System.out.println(u);
            }
        }

        // FILTER
        System.out.println("\nUsers heavier than 60 kg:");
        for (User u : users) {
            if (u.getWeight() > 60) {
                System.out.println(u);
            }
        }

        // SORT
        System.out.println("\nSorted by weight:");
        users.sort(Comparator.comparingDouble(User::getWeight));
        users.forEach(System.out::println);

        // POLYMORPHISM
        WorkoutRoutine cardio = new CardioWorkout(45);
        WorkoutRoutine strength = new StrengthWorkout(60);

        System.out.println("\nCardio calories: " + cardio.calculateCalories());
        System.out.println("Strength calories: " + strength.calculateCalories());
    }
}
