package my.home.server;

import org.springframework.stereotype.Component;

@Component
public class GenericServiceBean {

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = "Returning " + content;
	}
}
