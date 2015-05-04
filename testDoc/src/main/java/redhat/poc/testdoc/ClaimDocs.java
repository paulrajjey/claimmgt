package redhat.poc.testdoc;

import java.io.Serializable;
import java.util.List;
import org.jbpm.document.Document;

@org.kie.api.remote.Remotable
public class ClaimDocs implements Serializable
{

   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private List<Document> documents;

   public List<Document> getDocuments()
   {
      return documents;
   }

   public void setDocuments(List<Document> documents)
   {
      this.documents = documents;
   }

   public ClaimDocs()
   {
   }

   public ClaimDocs(java.util.List<org.jbpm.document.Document> documents)
   {
      this.documents = documents;
   }

}
