package redhat.poc.healthcare;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InsuredInfo implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Insured Name")
   private java.lang.String name;
   private java.util.Date dateOfBirth;
   private int age;
   private java.lang.String address;
   private java.lang.String city;
   private java.lang.String state;
   private java.lang.String zip;
   private java.lang.String gender;

   public InsuredInfo()
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

   public java.util.Date getDateOfBirth()
   {
      return this.dateOfBirth;
   }

   public void setDateOfBirth(java.util.Date dateOfBirth)
   {
      this.dateOfBirth = dateOfBirth;
   }

   public int getAge()
   {
      return this.age;
   }

   public void setAge(int age)
   {
      this.age = age;
   }

   public java.lang.String getAddress()
   {
      return this.address;
   }

   public void setAddress(java.lang.String address)
   {
      this.address = address;
   }

   public java.lang.String getCity()
   {
      return this.city;
   }

   public void setCity(java.lang.String city)
   {
      this.city = city;
   }

   public java.lang.String getState()
   {
      return this.state;
   }

   public void setState(java.lang.String state)
   {
      this.state = state;
   }

   public java.lang.String getZip()
   {
      return this.zip;
   }

   public void setZip(java.lang.String zip)
   {
      this.zip = zip;
   }

   public java.lang.String getGender()
   {
      return this.gender;
   }

   public void setGender(java.lang.String gender)
   {
      this.gender = gender;
   }

   public InsuredInfo(java.lang.String name, java.util.Date dateOfBirth,
         int age, java.lang.String address, java.lang.String city,
         java.lang.String state, java.lang.String zip,
         java.lang.String gender)
   {
      this.name = name;
      this.dateOfBirth = dateOfBirth;
      this.age = age;
      this.address = address;
      this.city = city;
      this.state = state;
      this.zip = zip;
      this.gender = gender;
   }

}