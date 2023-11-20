package pojoPackage;



public class pojoClass {
	
	private int id;
	 category category;
	 private String name;
	   private String[] photoUrls;
	tags[] tags;
	private String status;
	
	public pojoClass(int id, category category, String name, String[] photoUrls, pojoPackage.tags[] tags, String status) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.photoUrls = photoUrls;
		this.tags = tags;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public category getCategory() {
		return category;
	}
	public void setCp(category category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getPhotoUrls() {
		return photoUrls;
	}
	public void setPhotoUrls(String[] photoUrls) {
		this.photoUrls = photoUrls;
	}
	public tags[] getTags() {
		return tags;
	}
	public void setTags(tags[] tags) {
		this.tags = tags;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
			
}