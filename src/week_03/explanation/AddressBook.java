package week_03.explanation;

import java.util.ArrayList;

import java.util.List;
import java.util.ArrayList;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

     public void add(Contact contact){
        contacts.add(contact);
    }

    public void displayContacts(){
        if(contacts.isEmpty()){
            System.out.println("연락처가 비어있습니다.");
        }
        // 연락처 정보 모두 출력
        for(Contact contact : contacts){
            // 이름 :, 천화번호 :,
            System.out.println(contact);
            // System.out.println(contact.toString()); = System.out.println(contact); 같은 효과
        }
    }

    public void searchContact(String name){
        boolean isExist = false;

        for(Contact contact : contacts){
            if(contact.getName().equals(name)){
                System.out.println(contact);
                isExist = true;
            }
        }
        if(!isExist){
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }
}
