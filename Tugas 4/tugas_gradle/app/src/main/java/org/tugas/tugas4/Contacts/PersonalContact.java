package org.tugas.tugas4.Contacts;

public class PersonalContact extends Contact {
    private String nickname;

    public PersonalContact(String name, String number, String email, String nickname) {
        super(name, number, email);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNickname: " + this.nickname;
    }

}
