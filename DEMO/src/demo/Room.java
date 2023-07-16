package demo;

public class Room {
	private String bedName;
	private String fan;
	private String Door;
	private Integer bulbCount;
	
	public Integer toatalBulbPrice(int p) {
		return p*bulbCount;
	}
	
	
	public String getBedName() {
		return bedName;
	}
	public void setBedName(String bedName) {
		this.bedName = bedName;
	}
	public String getFan() {
		return fan;
	}
	public void setFan(String fan) {
		this.fan = fan;
	}
	public String getDoor() {
		return Door;
	}
	public void setDoor(String door) {
		Door = door;
	}
	public Integer getBulbCount() {
		return bulbCount;
	}
	public void setBulbCount(Integer bulbCount) {
		this.bulbCount = bulbCount;
	}
	
	
	
	
	

}
