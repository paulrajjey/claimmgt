package redhat.poc.healthcare;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.remote.Remotable
public class Service implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.util.Date dateOfService;
   private java.lang.String serviceType;
   private java.lang.String code;
   private double serviceAmount;

   public Service()
   {
   }

   public java.util.Date getDateOfService()
   {
      return this.dateOfService;
   }

   public void setDateOfService(java.util.Date dateOfService)
   {
      this.dateOfService = dateOfService;
   }

   public java.lang.String getServiceType()
   {
      return this.serviceType;
   }

   public void setServiceType(java.lang.String serviceType)
   {
      this.serviceType = serviceType;
   }

   public java.lang.String getCode()
   {
      return this.code;
   }

   public void setCode(java.lang.String code)
   {
      this.code = code;
   }

   public double getServiceAmount()
   {
      return this.serviceAmount;
   }

   public void setServiceAmount(double serviceAmount)
   {
      this.serviceAmount = serviceAmount;
   }

   public Service(java.util.Date dateOfService, java.lang.String serviceType,
         java.lang.String code, double serviceAmount)
   {
      this.dateOfService = dateOfService;
      this.serviceType = serviceType;
      this.code = code;
      this.serviceAmount = serviceAmount;
   }

}