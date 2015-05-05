package redhat.poc.healthcare;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.remote.Remotable
public class ProviderInfo implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String name;
   private java.lang.String address;
   private java.lang.String city;
   private java.lang.String state;
   private java.lang.String zip;

   public ProviderInfo()
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

   public ProviderInfo(java.lang.String name, java.lang.String address,
         java.lang.String city, java.lang.String state, java.lang.String zip)
   {
      this.name = name;
      this.address = address;
      this.city = city;
      this.state = state;
      this.zip = zip;
   }

}