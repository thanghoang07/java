package bai1;

public class Use implements Observer {
	public String article;
	public Subject blog;

	@Override
	public void update() {
		System.out.println("State change reported by subject.");
		article = (String) blog.getUpdate();
	}

	@Override
	public void setSubject(Subject subject) {
		this.article = "No new Article!";
		this.blog = subject;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}
}
