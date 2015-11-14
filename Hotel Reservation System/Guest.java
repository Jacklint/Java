class Guest {
	private Address address;
	private Reservation reservation;
	private String name, phoneNum, roomPrefs;
	private int points;

	public Guest(String name, String phoneNum, Address address){
		this(name, phoneNum, address, null, null, 0);
	}

	public Guest(String name, String phoneNum, Address address, String roomPrefs){
		this(name, phoneNum, address, roomPrefs, null, 0);
	}

	public Guest(String name, String phoneNum, Address address, String roomPrefs, Reservation reservation){
		this(name, phoneNum, address, roomPrefs, reservation, 0);
	}

	public Guest(String name, String phoneNum, Address address, String roomPrefs, Reservation reservation, int points){
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
		this.roomPrefs = roomPrefs;
		this.reservation = reservation;
		this.points = points;
	}

	public Address getAddress(){
		return address;
	}

	public void setAddress(Address address){
		this.address = address;
	}

	public Reservation getReservation(){
		return reservation;
	}

	public void setReservation(Reservation reservation){
		this.reservation = reservation;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getPhoneNumber(){
		return phoneNum;
	}

	public void setPhoneNumber(String phoneNum){
		this.phoneNum = phoneNum;
	}

	public String getRoomPreferences(){
		return roomPrefs;
	}

	public void setRoomPreferences(String roomPrefs){
		this.roomPrefs = roomPrefs;
	}

	public int getPoints(){
		return points;
	}

	public void givePoints(int newPoints){
		points += newPoints;
	}

	public boolean usePoints(int requiredPoints){
		if(canPay(requiredPoints)){
			points -= requiredPoints;
			return true;
		} else {
			return false;
		}
	}

	public boolean canPay(int requiredPoints){
		if(points >= requiredPoints){
			return true;
		} else {
			return false;
		}
	}

	public String toString(){
		return "Name: " + name + "\nAddress: " + address.toString() + 
		"\nPhone Number: " + phoneNum + "\nReservation: " + reservation + 
		"\nRoom Preferences: " + roomPrefs + "\nPoints: " + points;
	}

}