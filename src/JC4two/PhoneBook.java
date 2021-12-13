package JC4two;

import java.util.ArrayList;

public class PhoneBook extends ArrayList<Contact> {

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Contact phone : this) {
            stringBuilder.append("----------------------------\n");
            stringBuilder.append("Surname:" + phone.getName() + "\n");
            stringBuilder.append("Number:" + phone.getNumber() + "\n");
        }

        return stringBuilder.toString();
    }


        }


