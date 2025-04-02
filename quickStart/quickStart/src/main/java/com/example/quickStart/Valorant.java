package com.example.quickStart;

import org.springframework.data.annotation.Id;

public class Valorant {
    @Id
    private String id;
    private String first;
    private String second;
    private String picture1;
    private String picture2;
    private int choicenFirst;
    private int choicenSecond;
    private int usersCount;

    public int getChoicenFirst() {
        return choicenFirst;
    }

    public void setChoicenFirst(int choicenFirst) {
        this.choicenFirst = choicenFirst;
    }

    public int getChicenSecond() {
        return choicenSecond;
    }

    public void setChicenSecond(int chicenSecond) {
        this.choicenSecond = chicenSecond;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(int usersCount) {
        this.usersCount = usersCount;
    }

    public String getPicture1() {
        return picture1;
    }

    public String getPicture2() {
        return picture2;
    }

    public void setPicture2(String picture2) {
        this.picture2 = picture2;
    }

    public void setPicture1(String picture1) {
        this.picture1 = picture1;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }



    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }
    public void setFirst(String text) {
        this.first = text;
    }
}
