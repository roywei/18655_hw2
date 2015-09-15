package xml_parse;

public class Author {

	// Author class to store author name- publication key one to one mapping
	String author;
	String pubKey;

	public Author(String author, String pubKey) {
		this.author = author;
		this.pubKey = pubKey;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubKey() {
		return pubKey;
	}

	public void setPubKey(String pubKey) {
		this.pubKey = pubKey;
	}

}
