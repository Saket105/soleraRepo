package helloworld;

public class Address {
	private int addressId;
	private String district;
	private String city;
	private String state;
	
	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", district=" + district + ", city=" + city + ", state=" + state
				+ "]";
	}
	
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	

}
