package redhat.poc.testdoc;

import java.io.Serializable;
import java.util.List;
import org.jbpm.document.Document;
public class ClaimDocs implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Document> claimDocuments;

	public List<Document> getClaimDocuments() {
		return claimDocuments;
	}

	public void setClaimDocuments(List<Document> claimDocuments) {
		this.claimDocuments = claimDocuments;
	}
	
	

}
