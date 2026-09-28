public class PolicyHolder
{
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   /**
      Creates a PolicyHolder object with default values.
   */
   public PolicyHolder()
   {
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
   }

   /**
      Creates a PolicyHolder object with the specified information.
      @param firstName the policyholder's first name
      @param lastName the policyholder's last name
      @param age the policyholder's age
      @param smokingStatus the policyholder's smoking status
      @param height the policyholder's height in inches
      @param weight the policyholder's weight in pounds
   */
   public PolicyHolder(String firstName, String lastName,
                       int age, String smokingStatus,
                       double height, double weight)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }

   /**
      Copy constructor.
      @param object the PolicyHolder object to copy
   */
   public PolicyHolder(PolicyHolder object)
   {
      firstName = object.firstName;
      lastName = object.lastName;
      age = object.age;
      smokingStatus = object.smokingStatus;
      height = object.height;
      weight = object.weight;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public void setAge(int age)
   {
      this.age = age;
   }

   public void setSmokingStatus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus;
   }

   public void setHeight(double height)
   {
      this.height = height;
   }

   public void setWeight(double weight)
   {
      this.weight = weight;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public int getAge()
   {
      return age;
   }

   public String getSmokingStatus()
   {
      return smokingStatus;
   }

   public double getHeight()
   {
      return height;
   }

   public double getWeight()
   {
      return weight;
   }

   /**
      Calculates and returns the policyholder's BMI.
      @return the policyholder's BMI
   */
   public double getBMI()
   {
      return (weight * 703) / (height * height);
   }

   /**
      Returns information about the PolicyHolder object.
      @return the policyholder information
   */
   public String toString()
   {
      String str = "Policyholder's First Name: " + firstName +
                   "\nPolicyholder's Last Name: " + lastName +
                   "\nPolicyholder's Age: " + age +
                   "\nPolicyholder's Smoking Status (Y/N): " + smokingStatus +
                   String.format("\nPolicyholder's Height: %.1f inches", height) +
                   String.format("\nPolicyholder's Weight: %.1f pounds", weight) +
                   String.format("\nPolicyholder's BMI: %.2f", getBMI());

      return str;
   }
}
