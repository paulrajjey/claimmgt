package redhat.ruledemo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Applicant implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String name;
   private int age;
   private java.lang.String state;
   private double creditAmount;
   private int score;

   public Applicant()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public int getAge()
   {
      return this.age;
   }

   public void setAge(int age)
   {
      this.age = age;
   }

   public java.lang.String getState()
   {
      return this.state;
   }

   public void setState(java.lang.String state)
   {
      this.state = state;
   }

   public double getCreditAmount()
   {
      return this.creditAmount;
   }

   public void setCreditAmount(double creditAmount)
   {
      this.creditAmount = creditAmount;
   }

   public int getScore()
   {
      return this.score;
   }

   public void setScore(int score)
   {
      this.score = score;
   }

   public Applicant(java.lang.String name, int age, java.lang.String state,
         double creditAmount, int score)
   {
      this.name = name;
      this.age = age;
      this.state = state;
      this.creditAmount = creditAmount;
      this.score = score;
   }

}