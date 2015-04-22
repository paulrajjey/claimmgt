package redhat.poc.claim;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Address implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "address")
   private java.lang.String address;
   private java.lang.String city;
   @org.kie.api.definition.type.Label(value = "state")
   private java.lang.String state;
   private java.lang.String zip;

   public Address()
   {
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

   public Address(java.lang.String address, java.lang.String city,
         java.lang.String state, java.lang.String zip)
   {
      this.address = address;
      this.city = city;
      this.state = state;
      this.zip = zip;
   }

}