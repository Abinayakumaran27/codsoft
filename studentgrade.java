import java.util.Scanner;

public class studentgrade {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numofsub = scanner.nextInt();
        int totalMarks = 0;
        for (int i = 1; i <= numofsub; i++)
        {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int mark = scanner.nextInt();
            totalMarks += mark;
        }
        System.out.println("Total Marks obtained: " + totalMarks);
        double averagePercentage = (double) totalMarks / numofsub;
        System.out.println("Average Percentage: " + averagePercentage);
        char grade;
        if (averagePercentage >= 90) {
            grade = 'O';
        } else if (averagePercentage >= 80) {
            grade = 'A';
        } else if (averagePercentage >= 70) {
            grade = 'B';
        } else if (averagePercentage >= 60) {
            grade = 'C';
        } else {
            grade = 'E';
        }
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}