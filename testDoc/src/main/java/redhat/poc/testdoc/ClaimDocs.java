package redhat.poc.testdoc;

import java.io.Serializable;
import java.util.List;
import org.jbpm.document.Document;
public class ClaimDocs implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Document> documents;

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	

}
