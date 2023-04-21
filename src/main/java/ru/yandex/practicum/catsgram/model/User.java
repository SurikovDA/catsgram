package ru.yandex.practicum.catsgram.model;

import java.time.LocalDate;

public class User {
    private String email;
    private String nickname;
    private LocalDate birthdate;


    public String getNickname() {
        return nickname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return email.equals(user.email);
    }

    public String getEmail() {
        return email;
    }
}

