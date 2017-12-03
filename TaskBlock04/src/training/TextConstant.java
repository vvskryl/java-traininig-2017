package training;

public interface TextConstant {
    //Constants
    String WELCOME = "welcome";
    String ASK_FOR_INPUT = "ask.for.input";
    String WRONG = "wrong";
    String WRONG_UNIQUE_EMAIL = "wrong.unique.email";
    String WRONG_UNIQUE_NICKNAME = "wrong.unique.nickname";
    String NOTEBOOK_OVERFLOW = "notebook.overflow";
    String SURNAME = "surname";
	String NAME = "name";
    String PATRONYMIC = "patronymic";
    String NICKNAME = "nickname";
    String COMMENT = "comment";
    String GROUP = "group";
    String HOME_PHONE = "home.phone";
    String CELLPHONE = "cellphone";
	String CELLPHONE_2 = "cellphone2";
    String EMAIL = "email";
    String SKYPE = "skype";
    String ADDRESS_INDEX = "address.index";
    String ADDRESS_CITY = "address.city";
    String ADDRESS_STREET = "address.street";
    String ADDRESS_HOUSE_NUMBER = "address.house.number";
    String ADDRESS_FLAT_NUMBER = "address.flat.number";
    
    //Regular expressions for input
    String REGEX_SURNAME = "regex.surname";
    String REGEX_NAME = "regex.name";
    String REGEX_PATRONYMIC = "regex.patronymic";
    String REGEX_NICKNAME = "[A-Za-z0-9]+";
    String REGEX_COMMENT = ".{0,500}";
    String REGEX_GROUP = "GROUP[1-2]";
    String REGEX_HOME_PHONE = "[1-9][0-9]{11}";
    String REGEX_CELLPHONE = "[1-9][0-9]{11}";
    String REGEX_CELLPHONE_2 = "[N1-9]([0-9]{11})?";
    String REGEX_EMAIL = "[A-Za-z0-9][A-Za-z0-9-_.]*[A-Za-z0-9]@[A-Za-z0-9][A-Za-z0-9-_.]*[A-Za-z0-9][.][A-Za-z]{2,}";
    String REGEX_SKYPE = "[A-Za-z0-9-_.]{6,22}";
    String REGEX_ADDRESS_INDEX = "[0-9]{5}([- _][0-9]{4})?";
    String REGEX_ADDRESS_CITY = "[A-Za-z][A-Za-z' -]*[A-Za-z]";
    String REGEX_ADDRESS_STREET = "[A-Za-z][A-Za-z' -]*[A-Za-z]";
    String REGEX_ADDRESS_HOUSE_NUMBER = "[0-9]+[A-Za-z]?([/-][0-9]+[A-Za-z]?)?";
    String REGEX_ADDRESS_FLAT_NUMBER = "[N0-9]([0-9]*)?";
    
}
