package week_03.explanation;

public class PersonalContact extends Contact{
    private String relationshiop;
    public PersonalContact(String name, String phoneNumber, String relationshiop){
        super(name, phoneNumber);
        this.relationshiop = relationshiop;
    }

    @Override
    public String toString(){
        return super.toString() + "관계 : " + relationshiop;
    }
}
