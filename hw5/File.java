package hw5;

public class File extends Document{
	private String pathname;
	public void setPathname(String Pathname) {
		pathname = Pathname;
	}
	public String getPathname(){
		return pathname;
	}
	public String toString() {
		return "Path: " + this.getPathname() + "\n" 
				+ super.toString();
	}
}
