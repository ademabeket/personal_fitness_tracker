public class Main {
    public static void main(String[] args) {

        User user1 = new User("Ademi", 17, 55.5);
        User user2 = new User("Dana", 21, 62.0);
        User user3 = new User("Aliya", 20, 58.3);
        User user4 = new User("Arman", 23, 70.8);

        WorkoutRoutine routine1 = new WorkoutRoutine("Cardio", 45);
        WorkoutRoutine routine2 = new WorkoutRoutine("Strength", 60);
        WorkoutRoutine routine3 = new WorkoutRoutine("Yoga", 30);
        WorkoutRoutine routine4 = new WorkoutRoutine("HIIT", 40);

        FitnessApp app1 = new FitnessApp("MyFitness", user1, routine1);
        FitnessApp app2 = new FitnessApp("MyFitness", user2, routine2);
        FitnessApp app3 = new FitnessApp("MyFitness", user3, routine3);
        FitnessApp app4 = new FitnessApp("MyFitness", user4, routine4);

        app1.showDetails();
        System.out.println("------------------");
        app2.showDetails();
        System.out.println("------------------");
        app3.showDetails();
        System.out.println("------------------");
        app4.showDetails();


        User heaviest = user1;

        if (user2.getWeight() > heaviest.getWeight()) heaviest = user2;
        if (user3.getWeight() > heaviest.getWeight()) heaviest = user3;
        if (user4.getWeight() > heaviest.getWeight()) heaviest = user4;

        System.out.println("------------------");
        System.out.println("Heaviest user: " + heaviest.getName()
                + " (" + heaviest.getWeight() + " kg)");


        Post post1 = new Post(user1, "Drink more water during workouts!");
        Post post2 = new Post(user2, "Consistency is the key to success.");

        post1.likePost();
        post1.likePost();
        post2.likePost();

        System.out.println("------------------");
        post1.displayPost();
        System.out.println("------------------");
        post2.displayPost();

    }
}
