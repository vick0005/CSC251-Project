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

         // Create a PolicyHolder object
         PolicyHolder policyHolder =
            new PolicyHolder(firstName, lastName, age,
                             smokingStatus, height, weight);

         // Create a Policy object that has a PolicyHolder
         Policy policy =
            new Policy(policyNumber, providerName, policyHolder);

         policies.add(policy);
      }

      inputFile.close();

      int smokerCount = 0;
      int nonSmokerCount = 0;

      for (Policy policy : policies)
      {
         // Implicitly calls the Policy toString method
         System.out.println(policy);
         System.out.println();

         PolicyHolder holder = policy.getPolicyHolder();

         if (holder.getSmokingStatus().equalsIgnoreCase("smoker"))
         {
            smokerCount++;
         }
         else if (holder.getSmokingStatus().equalsIgnoreCase("non-smoker"))
         {
            nonSmokerCount++;
         }
      }

      System.out.println("There were " + Policy.getPolicyCount()
                         + " Policy objects created.");

      System.out.println();

      System.out.println("The number of policies with a smoker is: "
                         + smokerCount);

      System.out.println();

      System.out.println("The number of policies with a non-smoker is: "
                         + nonSmokerCount);
   }
}
