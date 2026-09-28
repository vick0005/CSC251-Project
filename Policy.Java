public class Policy
{
   private String policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;
   private static int policyCount = 0;

   /**
      Creates a Policy object with default values.
   */
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      policyHolder = new PolicyHolder();
      policyCount++;
   }

   /**
      Creates a Policy object with the specified information.
      @param policyNumber the policy number
      @param providerName the insurance provider name
      @param policyHolder the policyholder
   */
   public Policy(String policyNumber, String providerName,
                 PolicyHolder policyHolder)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;

      // Make a copy of the PolicyHolder object for security
      this.policyHolder = new PolicyHolder(policyHolder);

      policyCount++;
   }

   /**
      Sets the policy number.
      @param policyNumber the policy number
   */
   public void setPolicyNumber(String policyNumber)
   {
      this.policyNumber = policyNumber;
   }

   /**
      Sets the provider name.
      @param providerName the insurance provider name
   */
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }

   /**
      Sets the policyholder.
      @param policyHolder the policyholder
   */
   public void setPolicyHolder(PolicyHolder policyHolder)
   {
      // Make a copy to prevent security problems
      this.policyHolder = new PolicyHolder(policyHolder);
   }

   /**
      Returns the policy number.
      @return the policy number
   */
   public String getPolicyNumber()
   {
      return policyNumber;
   }

   /**
      Returns the provider name.
      @return the insurance provider name
   */
   public String getProviderName()
   {
      return providerName;
   }

   /**
      Returns a copy of the policyholder.
      @return a copy of the policyholder
   */
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder);
   }

   /**
      Returns the number of Policy objects created.
      @return the number of Policy objects
   */
   public static int getPolicyCount()
   {
      return policyCount;
   }

   /**
      Calculates and returns the policy price.
      @return the policy price
   */
   public double getPolicyPrice()
   {
      double price = 600.0;

      if (policyHolder.getAge() > 50)
      {
         price = price + 75;
      }

      if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
      {
         price = price + 100;
      }

      if (policyHolder.getBMI() > 35)
      {
         price = price + ((policyHolder.getBMI() - 35) * 20);
      }

      return price;
   }

   /**
      Returns information about the Policy object.
      @return the policy information
   */
   public String toString()
   {
      String str = "Policy Number: " + policyNumber +
                   "\nProvider Name: " + providerName +
                   "\n" + policyHolder +
                   String.format("\nPolicy Price: $%.2f", getPolicyPrice());

      return str;
   }
}
