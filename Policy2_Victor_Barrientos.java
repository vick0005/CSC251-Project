import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

// Demo class for policy
public class Project_Victor_Barrientos
{
   public static void main(String[] args) throws IOException
   {
      ArrayList<Policy> policies = new ArrayList<Policy>();

      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);

      while (inputFile.hasNextLine())
      {
         String policyNumber = inputFile.nextLine();

         if (policyNumber.trim().isEmpty())
         {
            continue;
         }

         String providerName = inputFile.nextLine();
         String firstName = inputFile.nextLine();
         String lastName = inputFile.nextLine();
         int age = Integer.parseInt(inputFile.nextLine());
         String smokingStatus = inputFile.nextLine();
         double height = Double.parseDouble(inputFile.nextLine());
         double weight = Double.parseDouble(inputFile.nextLine());

         Policy policy = new Policy(policyNumber, providerName,
                                    firstName, lastName,
                                    age, smokingStatus,
                                    height, weight);

         policies.add(policy);
      }

      inputFile.close();

      int smokerCount = 0;
      int nonSmokerCount = 0;

      for (Policy policy : policies)
      {
         System.out.println("Policy Number: " + policy.getPolicyNumber());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder's First Name: " + policy.getFirstName());
         System.out.println("Policyholder's Last Name: " + policy.getLastName());
         System.out.println("Policyholder's Age: " + policy.getAge());
         System.out.println("Policyholder's Smoking Status (smoker/non-smoker): "
                            + policy.getSmokingStatus());
         System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
         System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
         System.out.printf("Policyholder's BMI: %.2f%n", policy.getBMI());
         System.out.printf("Policy Price: $%.2f%n%n", policy.getPolicyPrice());

         if (policy.getSmokingStatus().equalsIgnoreCase("smoker"))
         {
            smokerCount++;
         }
         else if (policy.getSmokingStatus().equalsIgnoreCase("non-smoker"))
         {
            nonSmokerCount++;
         }
      }

      System.out.println("The number of policies with a smoker is: "
                         + smokerCount);

      System.out.println("The number of policies with a non-smoker is: "
                         + nonSmokerCount);
   }
}
