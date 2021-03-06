package redhat.poc.healthcare;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.remote.Remotable
@XmlRootElement
public class ErrorContext implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String type;
   private java.lang.String category;
   private java.lang.String msg;

   public ErrorContext()
   {
   }

   public java.lang.String getType()
   {
      return this.type;
   }
   @XmlElement
   public void setType(java.lang.String type)
   {
      this.type = type;
   }

   public java.lang.String getCategory()
   {
      return this.category;
   }
   @XmlElement
   public void setCategory(java.lang.String category)
   {
      this.category = category;
   }

   public java.lang.String getMsg()
   {
      return this.msg;
   }
   @XmlElement
   public void setMsg(java.lang.String msg)
   {
      this.msg = msg;
   }

   public ErrorContext(java.lang.String type, java.lang.String category,
         java.lang.String msg)
   {
      this.type = type;
      this.category = category;
      this.msg = msg;
   }

}