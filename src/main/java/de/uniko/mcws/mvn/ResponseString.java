package de.uniko.mcws.mvn;


public class ResponseString {

	private long id;

	public ResponseString(HttpServletRequest request) {
		try {
			this.id = Long.valueOf(request.getParameter("id"));
		} catch (NumberFormatException e) {
			this.id = 0;
		}
	}

	public ResponseString(long id) {
		this.id = id;
	}

	public String toString() {
		return (this.id == 0) ? "Hello World!" : "nope.";
	}

}
