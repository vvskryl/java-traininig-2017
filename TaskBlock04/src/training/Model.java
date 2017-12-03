package training;

import java.util.Arrays;
import java.util.Scanner;

import static training.TextConstant.*;

/**
 * Created by Viacheslav Skryl on 10.11.2017
 */

public class Model {
	//Constants of business logic
	public static final int SIZE_OF_NOTEBOOK = 250;
		
	View view;
	Scanner sc;
	
	//Create a notebook
	Note [] noteBook = new Note[SIZE_OF_NOTEBOOK];
	
	void addInput(View view, Scanner sc) throws EqualNickNameException, EqualEmailException {
		this.view = view;
		this.sc = sc;
		
		Note note = new Note();
		note.setSurname(matches(View.bundle.getString(SURNAME), View.bundle.getString(REGEX_SURNAME)));
		note.setName(matches(View.bundle.getString(NAME), View.bundle.getString(REGEX_NAME)));
		note.setPatronymic(matches(View.bundle.getString(PATRONYMIC), View.bundle.getString(REGEX_PATRONYMIC)));
		note.setSurnameNamePatronymic();
		note.setNickname(matches(View.bundle.getString(NICKNAME), REGEX_NICKNAME));
		//Check nickname
		int i = 0;
		while (noteBook[i] != null) {
			if (noteBook[i].getNickname().equals(note.getNickname()))
				throw new EqualNickNameException(View.bundle.getString(WRONG_UNIQUE_NICKNAME));
			else i++;
		}
		note.setComment(matches(View.bundle.getString(COMMENT), REGEX_COMMENT));
		note.setGroup(Groups.valueOf(matches(View.bundle.getString(GROUP) 
					  + Arrays.toString(Groups.values()), REGEX_GROUP)));
		note.setHomePhone(matches(View.bundle.getString(HOME_PHONE), REGEX_HOME_PHONE));
		note.setCellphone(matches(View.bundle.getString(CELLPHONE), REGEX_CELLPHONE));
		note.setCellphone2(matches(View.bundle.getString(CELLPHONE_2), REGEX_CELLPHONE_2));
		note.setSkype(matches(View.bundle.getString(SKYPE), REGEX_SKYPE));
		note.setAddressIndex(matches(View.bundle.getString(ADDRESS_INDEX), REGEX_ADDRESS_INDEX));
		note.setAddressCity(matches(View.bundle.getString(ADDRESS_CITY), REGEX_ADDRESS_CITY));
		note.setAddressStreet(matches(View.bundle.getString(ADDRESS_STREET), REGEX_ADDRESS_STREET));
		note.setAddressHouseNumber(matches(View.bundle.getString(ADDRESS_HOUSE_NUMBER), REGEX_ADDRESS_HOUSE_NUMBER));
		note.setAddressFlatNumber(matches(View.bundle.getString(ADDRESS_FLAT_NUMBER), REGEX_ADDRESS_FLAT_NUMBER));
		note.setAddress();
		
		note.setEmail(matches(View.bundle.getString(EMAIL), REGEX_EMAIL));
		//Check email
		i = 0;
		while (noteBook[i] != null) {
			if (noteBook[i].getEmail().equals(note.getEmail()))
				throw new EqualEmailException(View.bundle.getString(WRONG_UNIQUE_EMAIL));
			else i++;
		}
		
		addNote(note);
		
	}

	private void addNote(Note note) {
		int i = 0;
		while (noteBook[i] != null) i++;
		noteBook[i] = note;
	}

	private String matches(String message, String regex) {
		String res;
        View.print(View.bundle.getString(ASK_FOR_INPUT) + message);
        while (!(sc.hasNext() && (res = sc.next()).matches(regex))) {
            View.print(View.bundle.getString(WRONG)
            		   + View.bundle.getString(ASK_FOR_INPUT) + message);
        }
        return res;
	}

}
