package training;

public class Note {
	private String surname;
	private String email;
	private String name;
	private String patronymic;
	private String surnameNamePatronymic;
	private String nickname;
	private String comment;
	private Groups group;
	private String homePhone;
	private String cellphone;
	private String cellphone2;
	private String skype;
	private String addressIndex;
	private String addressCity;
	private String addressStreet;
	private String addressHouseNumber;
	private String addressFlatNumber;
	private String address;
	/*private Calendar create;
	private Calendar edit;
	*/
	
	/**
	 * @Override
	 * @param note
	 */
	public boolean equals (Note note) {
		if (email.equals(note.getEmail())) return true;
		else if (nickname.equals(note.getNickname())) return true;
		else return false;
	}
	
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the patronymic
	 */
	public String getPatronymic() {
		return patronymic;
	}

	/**
	 * @param patronymic the patronymic to set
	 */
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	/**
	 * @return the surnameNamePatronymic
	 */
	public String getSurnameNamePatronymic() {
		return surnameNamePatronymic;
	}

	/**
	 * @param surnameNamePatronymic the surnameNamePatronymic to set
	 */
	public void setSurnameNamePatronymic() {
		surnameNamePatronymic = surname + " " + name + " " + patronymic;
	}

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the group
	 */
	public Groups getGroup() {
		return group;
	}

	/**
	 * @param group the group to set
	 */
	public void setGroup(Groups group) {
		this.group = group;
	}

	/**
	 * @return the homePhone
	 */
	public String getHomePhone() {
		return homePhone;
	}

	/**
	 * @param homePhone the homePhone to set
	 */
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	/**
	 * @return the cellphone
	 */
	public String getCellphone() {
		return cellphone;
	}

	/**
	 * @param cellphone the cellphone to set
	 */
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	/**
	 * @return the cellphone2
	 */
	public String getCellphone2() {
		return cellphone2;
	}

	/**
	 * @param cellphone2 the cellphone2 to set
	 */
	public void setCellphone2(String cellphone2) {
		this.cellphone2 = cellphone2;
	}

	/**
	 * @return the skype
	 */
	public String getSkype() {
		return skype;
	}

	/**
	 * @param skype the skype to set
	 */
	public void setSkype(String skype) {
		this.skype = skype;
	}

	/**
	 * @return the addressIndex
	 */
	public String getAddressIndex() {
		return addressIndex;
	}

	/**
	 * @param addressIndex the addressIndex to set
	 */
	public void setAddressIndex(String addressIndex) {
		this.addressIndex = addressIndex;
	}

	/**
	 * @return the addressCity
	 */
	public String getAddressCity() {
		return addressCity;
	}

	/**
	 * @param addressCity the addressCity to set
	 */
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	/**
	 * @return the addressStreet
	 */
	public String getAddressStreet() {
		return addressStreet;
	}

	/**
	 * @param addressStreet the addressStreet to set
	 */
	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}

	/**
	 * @return the addressHouseNumber
	 */
	public String getAddressHouseNumber() {
		return addressHouseNumber;
	}

	/**
	 * @param addressHouseNumber the addressHouseNumber to set
	 */
	public void setAddressHouseNumber(String addressHouseNumber) {
		this.addressHouseNumber = addressHouseNumber;
	}

	/**
	 * @return the addressFlatNumber
	 */
	public String getAddressFlatNumber() {
		return addressFlatNumber;
	}

	/**
	 * @param addressFlatNumber the addressFlatNumber to set
	 */
	public void setAddressFlatNumber(String addressFlatNumber) {
		this.addressFlatNumber = addressFlatNumber;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress() {
		address = addressIndex + ", " + addressCity + ", " + addressStreet + ", "
				  + addressHouseNumber;
		if (!addressFlatNumber.equals("N"))
			address = address + ", " + addressFlatNumber;
	}
}
