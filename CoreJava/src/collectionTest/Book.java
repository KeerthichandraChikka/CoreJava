package collectionTest;

public class Book {
	
	private int id;
	private String title;
	
	public Book(int id, String title) {
		this.id=id;
		this.title=title;
		
	}
	
	
	public String toString() {
		return "\nId :"+id + "\nTitle: "+title;
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Book)) {
			return false;
		}
		return this.id==((Book)o).id;
				
				
	}
	
	public int hashCode() {
		return id;
	}

}
