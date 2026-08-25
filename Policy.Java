public class Policy
{
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   // No-argument constructor
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
   }

   // Constructor with arguments
   public Policy(String policyNumber, String providerName,
                 String firstName, String lastName,
                 int age, String smokingStatus,
                 double height, double weight)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }

   public void setPolicyNumber(String policyNumber)
   {
      this.policyNumber = policyNumber;
   }

   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
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

   public String getPolicyNumber()
   {
      return policyNumber;
   }

   public String getProviderName()
   {
      return providerName;
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

   public double getBMI()
   {
      return (weight * 703) / (height * height);
   }

   public double getPolicyPrice()
   {
      double price = 600.0;

      if (age > 50)
      {
         price = price + 75;
      }

      if (smokingStatus.equalsIgnoreCase("smoker"))
      {
         price = price + 100;
      }

      if (getBMI() > 35)
      {
         price = price + ((getBMI() - 35) * 20);
      }

      return price;
   }
}