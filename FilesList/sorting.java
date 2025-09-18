public class sorting {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide scores as command-line arguments.");
            return;
        }

        // Parse input scores
        int[] scores = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                scores[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + args[i]);
                return;
            }
        }

        // Sort the scores
        java.util.Arrays.sort(scores);

        // Print the sorted scores
        System.out.print("Sorted scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
}