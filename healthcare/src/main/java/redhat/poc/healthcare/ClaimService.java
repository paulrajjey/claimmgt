package redhat.poc.healthcare;

/**
 * This class was automatically generated by the data modeler tool.
 */
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@org.kie.api.remote.Remotable
public class ClaimService implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.util.Date dateOfService;
   private java.lang.String serviceType;
   private java.lang.String code;
   private double serviceAmount;

   public ClaimService()
   {
   }

   public java.util.Date getDateOfService()
   {
      return this.dateOfService;
   }
   @XmlElement
   public void setDateOfService(java.util.Date dateOfService)
   {
      this.dateOfService = dateOfService;
   }

   public java.lang.String getServiceType()
   {
      return this.serviceType;
   }
   @XmlElement
   public void setServiceType(java.lang.String serviceType)
   {
      this.serviceType = serviceType;
   }

   public java.lang.String getCode()
   {
      return this.code;
   }
   @XmlElement
   public void setCode(java.lang.String code)
   {
      this.code = code;
   }

   public double getServiceAmount()
   {
      return this.serviceAmount;
   }
   @XmlElement
   public void setServiceAmount(double serviceAmount)
   {
      this.serviceAmount = serviceAmount;
   }

   public ClaimService(java.util.Date dateOfService, java.lang.String serviceType,
         java.lang.String code, double serviceAmount)
   {
      this.dateOfService = dateOfService;
      this.serviceType = serviceType;
      this.code = code;
      this.serviceAmount = serviceAmount;
   }

@Override
public String toString() {
	return "Service [dateOfService=" + dateOfService + ", serviceType="
			+ serviceType + ", code=" + code + ", serviceAmount="
			+ serviceAmount + "]";
}

}