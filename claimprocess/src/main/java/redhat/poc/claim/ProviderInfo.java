package redhat.poc.claim;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ProviderInfo implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "provider id")
   private java.lang.String id;
   private java.lang.String name;
   private java.lang.String providerGroupid;
   private java.util.Date effectiveDate;

   public ProviderInfo()
   {
   }

   public java.lang.String getId()
   {
      return this.id;
   }

   public void setId(java.lang.String id)
   {
      this.id = id;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getProviderGroupid()
   {
      return this.providerGroupid;
   }

   public void setProviderGroupid(java.lang.String providerGroupid)
   {
      this.providerGroupid = providerGroupid;
   }

   public java.util.Date getEffectiveDate()
   {
      return this.effectiveDate;
   }

   public void setEffectiveDate(java.util.Date effectiveDate)
   {
      this.effectiveDate = effectiveDate;
   }

   public ProviderInfo(java.lang.String id, java.lang.String name,
         java.lang.String providerGroupid, java.util.Date effectiveDate)
   {
      this.id = id;
      this.name = name;
      this.providerGroupid = providerGroupid;
      this.effectiveDate = effectiveDate;
   }

}