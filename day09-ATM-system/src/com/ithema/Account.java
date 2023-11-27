package com.ithema;

//Account类，用于存储用户信息
public class Account {
    private String cardID;
    private String userName;
    private String sex;
    private String passWord;
    private double money;
    private double limit;

    public Account() {
    }

    public Account(String cardID, String userName, String sex, String passWord, double money, double limit) {
        this.cardID = cardID;
        this.userName = userName;
        this.sex = sex;
        this.passWord = passWord;
        this.money = money;
        this.limit = limit;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
