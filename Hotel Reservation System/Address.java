class Address {
	private String streetName, city, state;
	private int houseNumber, zipCode;

	public Address(int houseNumber, String streetName, String city, String state, int zipCode){
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public static Address parse(String addressString){
		String[] addressArray = addressString.split("/");
		int houseNumber, zipCode;
		String streetName, city, state;

		try{
			houseNumber = Integer.parseInt(addressArray[0]);
			streetName = addressArray[1];
			city = addressArray[2];
			state = addressArray[3];
			zipCode = Integer.parseInt(addressArray[4]);
		} catch(NumberFormatException e){
			return new Address(0, null, null, null, 0);
		} catch(ArrayIndexOutOfBoundsException e){
			return new Address(0, null, null, null, 0);
		}

		return new Address(houseNumber, streetName, city, state, zipCode);
	}

	public int getHouseNumber(){
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber){
		this.houseNumber = houseNumber;
	}

	public String getStreetName(){
		return streetName;
	}

	public void setStreetName(String streetName){
		this.streetName = streetName;
	}

	public String getCity(){
		return city;
	}

	public void setCity(){
		this.city = city;
	}

	public String getState(){
		return state;
	}

	public void setState(String state){
		this.state = state;
	}

	public int getZipCode(){
		return zipCode;
	}

	public void setZipCode(int zipCode){
		this.zipCode = zipCode;
	}

	public String toString(){
		return houseNumber + " " + streetName + " " + city + ", " + state + " " + zipCode;
	}
}