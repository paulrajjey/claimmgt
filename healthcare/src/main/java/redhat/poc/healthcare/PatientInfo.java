package redhat.poc.healthcare;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PatientInfo implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Patient Name")
   private java.lang.String name;
   private int age;
   private java.lang.String relationShipToInsured;
   private java.lang.String gender;

   public PatientInfo()
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

   public java.lang.String getRelationShipToInsured()
   {
      return this.relationShipToInsured;
   }

   public void setRelationShipToInsured(java.lang.String relationShipToInsured)
   {
      this.relationShipToInsured = relationShipToInsured;
   }

   public java.lang.String getGender()
   {
      return this.gender;
   }

   public void setGender(java.lang.String gender)
   {
      this.gender = gender;
   }

   public PatientInfo(java.lang.String name, int age,
         java.lang.String relationShipToInsured, java.lang.String gender)
   {
      this.name = name;
      this.age = age;
      this.relationShipToInsured = relationShipToInsured;
      this.gender = gender;
   }

}