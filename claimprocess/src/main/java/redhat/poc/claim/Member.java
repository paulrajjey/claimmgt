package redhat.poc.claim;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Member implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "member name")
   private java.lang.String name;
   private java.lang.String groupId;
   private java.lang.String ssn;
   private java.lang.String address;
   private java.lang.String city;
   private java.lang.String state;
   private java.lang.String zip;

   public Member()
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

   public java.lang.String getGroupId()
   {
      return this.groupId;
   }

   public void setGroupId(java.lang.String groupId)
   {
      this.groupId = groupId;
   }

   public java.lang.String getSsn()
   {
      return this.ssn;
   }

   public void setSsn(java.lang.String ssn)
   {
      this.ssn = ssn;
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

   public Member(java.lang.String name, java.lang.String groupId,
         java.lang.String ssn, java.lang.String address,
         java.lang.String city, java.lang.String state, java.lang.String zip)
   {
      this.name = name;
      this.groupId = groupId;
      this.ssn = ssn;
      this.address = address;
      this.city = city;
      this.state = state;
      this.zip = zip;
   }

}