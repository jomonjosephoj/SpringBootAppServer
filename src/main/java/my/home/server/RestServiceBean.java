package my.home.server;

public class RestServiceBean {

    private String content;

    public RestServiceBean(String content) {
        this.content = content;
    }

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = "Returning " + content;
	}
}
