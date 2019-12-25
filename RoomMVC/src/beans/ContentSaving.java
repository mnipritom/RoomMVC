package beans;

public class ContentSaving {
	String[] headings;
	String[] content;
	
	protected ContentSaving(String[] headings, String[] content) {
		this.headings = headings;
		this.content = content;
	}
	
	protected String[] getHeadings() {
		return headings;
	}
	protected void setHeadings(String[] headings) {
		this.headings = headings;
	}
	protected String[] getContent() {
		return content;
	}
	protected void setContent(String[] content) {
		this.content = content;
	}
	
}
