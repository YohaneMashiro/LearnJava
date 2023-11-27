package com.ithema;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//ATM类，用于代表ATM系统，负责所有业务需求
public class ATM {
    private ArrayList<Account> accounts=new ArrayList<>();
    private Account loginAcc;
    private Scanner sc=new Scanner(System.in);//注意此处也要私有
    private Random r=new Random();

    /*欢迎页面*/
    public void start(){
        while (true) {
            System.out.println("====welcome to use ATM system====");
            System.out.println("0.shutdown the system");
            System.out.println("1.login");
            System.out.println("2.new a account");
            System.out.println("plz choose:");
            int option;
            option=sc.nextInt();
            switch(option){
                case 0:
                    System.out.println("thx for your use");
                    return ;
                case 1:
                    //用户登录
                    login();
                    break;
                case 2:
                    //用户开户
                    newAccount();
                    break;
                default:
                    System.out.println("undefined option");
                    break;
            }
        }
    }

    /*用户登录*/
    private void login(){
        System.out.println("===login===");
        //1.判断是否有账户
        if(accounts.size()==0){
            System.out.println("no account exists");
            return ;
        }

        //2.确认有账户，登录
        while (true) {
            System.out.println("input the cardID");
            String cardID=sc.next();
            Account acc=getAccountByCardID(cardID);
            if(acc==null){
                System.out.println("the cardID do not exist");
            }
            else{
                while (true) {
                    System.out.println("plz input the password");
                    String passWord=sc.next();
                    if(passWord.equals(acc.getPassWord())){
                        System.out.println("welcome, "+acc.getUserName());
                        //展示登录后的界面
                        loginAcc=acc;
                        userCommand();
                        return ;
                    }
                    else{
                        System.out.println("Wrong");
                    }
                }
            }
        }
    }

    //展示登录后的界面
    private void userCommand(){
        while (true) {
            System.out.println("===options for " + loginAcc.getUserName() + " as follows===");
            System.out.println("1.show your information");
            System.out.println("2.deposit");
            System.out.println("3.take out money");
            System.out.println("4.transfer");
            System.out.println("5.change password");
            System.out.println("6.logout");
            System.out.println("7.cancel");
            String command=sc.next();
            switch (command){
                case "1":
                    //查询账户
                    showLoginAccount();
                    break;
                case "2":
                    //存款
                    depositMoney();
                    break;
                case "3":
                    //取款
                    takeOutMoney();
                    break;
                case "4":
                    //转账
                    transferMoney();
                    break;
                case "5":
                    //修改密码
                    changePassWord();
                    break;
                case "6":
                    //退出
                    System.out.println(loginAcc.getUserName()+", logout successfully");
                    return ;//跳出用户展示页面，回到ATM系统页面
                case "7":
                    //注销
                    if(cancelAccount()) return;
                    else break;
                default:
                    System.out.println("undefined option, plz try again");
                    break;
            }
        }
    }

    /*存款*/
    private void depositMoney(){
        System.out.println("==deposit==");
        System.out.println("how much do you want to deposit?");
        double money=sc.nextDouble();

        loginAcc.setMoney(loginAcc.getMoney()+money);
        System.out.println("this time, " + money + ". total, " + loginAcc.getMoney());
    }

    /*取款*/
    private void takeOutMoney(){
        System.out.println("==take out money==");
        if(loginAcc.getMoney()<100){
            System.out.println("your deposit is less than 100.0, can not take out");
            return ;
        }
        while (true) {
            System.out.println("how much do you want to take out?");
            double money=sc.nextDouble();
            if(money>= loginAcc.getLimit()){
                System.out.println("money is more than the limit, plz try again");
            }
            else if(loginAcc.getMoney()<money){
                System.out.println("your deposit is not enough, plz take less");
            }
            else{
                loginAcc.setMoney(loginAcc.getMoney()-money);
                System.out.println("you have take out $" + money + " successfully, your deposit is " + loginAcc.getMoney());
                return ;
            }
        }
    }

    /*转账*/
    private void transferMoney(){
        System.out.println("==transfer==");
        //1.账户数必须大于等于2
        if(accounts.size()<2){
            System.out.println("the number of accounts is less than 2");
            return ;
        }
        //2.账户必须有钱
        if(loginAcc.getMoney()==0){
            System.out.println("you do not have money");
            return ;
        }
        //3.转账
        while (true) {
            System.out.println("plz input the cardID of target account");
            String toCardID=sc.next();
            Account toAcc=getAccountByCardID(toCardID);
            if(toAcc==null){
                System.out.println("wrong cardID, plz try again");
            }
            else{
                while (true) {
                    System.out.println("how much money will be transferred?");
                    double money=sc.nextDouble();
                    if(money>loginAcc.getLimit()){
                        System.out.println("money is more than the limit, plz try again");
                    }
                    else if(loginAcc.getMoney()<money){
                        System.out.println("your deposit is not enough, plz take less");
                    }
                    else{
                        loginAcc.setMoney(loginAcc.getMoney()-money);
                        toAcc.setMoney(toAcc.getMoney()+money);
                        System.out.println("you have transfer $" + money + "to "+toAcc.getUserName().charAt(0)+"** successfully, your deposit is " + loginAcc.getMoney());
                        return ;
                    }
                }
            }
        }
    }

    /*修改密码*/
    private void changePassWord(){
        while (true) {
            System.out.println("==change password==");
            System.out.println("plz input the original password");
            String origPassWord=sc.next();
            if(origPassWord.equals(loginAcc.getPassWord())){
                while (true) {
                    System.out.println("plz input the new password");
                    String newPassWord=sc.next();
                    System.out.println("plz ensure new password");
                    String checkPassWord=sc.next();
                    if(checkPassWord.equals(newPassWord)){
                        loginAcc.setPassWord(newPassWord);
                        System.out.println(loginAcc.getUserName() + ", your password is updated successfully");
                        return ;
                    }
                    else{
                        System.out.println("two passwords are different, plz try again");
                    }
                }
            }
            else{
                System.out.println("wrong, plz try again");
            }
        }
    }

    /*注销*/
    private boolean cancelAccount(){//此处用true表示注销成功，方便展示界面的选择
        System.out.println("==cancel your account==");
        if(loginAcc.getMoney()!=0){
            System.out.println("your deposit is not 0, plz take it out first");
            return false;
        }

        while (true) {
            System.out.println("are your sure to cancel your account?(0:false/1:true)");
            String command=sc.next();
            switch (command){
                case "0":
                    System.out.println("we keep your account");
                    return false;
                case"1":
                    System.out.println("input your password");
                    String password=sc.next();
                    if(password.equals(loginAcc.getPassWord())){
                        System.out.println(loginAcc.getUserName() + ", your account is canceled successfully");
                        accounts.remove(loginAcc);
                        return true;
                    }
                    else{
                        System.out.println("wrong");
                        return false;
                    }
                default:
                    System.out.println("plz input 0/1");
            }
        }
    }

    //查询账户
    private void showLoginAccount(){
        System.out.println("==info is as follows==");
        System.out.println("cardID: " + loginAcc.getCardID());
        System.out.println("username: " + loginAcc.getUserName());
        System.out.println("sex: " + loginAcc.getSex());
        System.out.println("money: " + loginAcc.getMoney());
        System.out.println("limit: " + loginAcc.getLimit());
    }

    /*用户开户*/
    private void newAccount(){//不需要被外部调用的都设为private
        //1.创建用户对象
        Account acc=new Account();
        //2.输入用户信息
        System.out.println("input your name");
        String name=sc.next();
        acc.setUserName(name);

        while (true) {
            System.out.println("input your sex(0:female/1:male)");
            String sex=sc.next();
            switch (sex){
                case "0":
                    acc.setSex("female");
                    break;
                case "1":
                    acc.setSex("male");
                    break;
                default:
                    System.out.println("plz input right sex");
                    break;
            }
            if(sex.equals("0")||sex.equals("1")) break;
        }

        while (true) {
            System.out.println("input your password");
            String password=sc.next();
            System.out.println("input again to ensure");
            String password2=sc.next();
            if(password.equals(password2)){
                acc.setPassWord(password);
                break;
            }
            else{
                System.out.println("two passwords are different, try again");
            }
        }

        acc.setMoney(0);

        System.out.println("input your limit");
        double limit=sc.nextDouble();
        acc.setLimit(limit);

        acc.setCardID(newCardID());

        //3.存入用户集合
        accounts.add(acc);
        System.out.println("congratulation! " + acc.getUserName()+". new successfully");
        System.out.println("your cardID is " + acc.getCardID());
    }

    //生成卡号
    private String newCardID(){
        while (true) {
            String s="";
            for (int i = 0; i < 8; i++) {
                s+=r.nextInt(0,10);//输入数字2，自动转换成‘2’
            }

            Account acc=getAccountByCardID(s);
            if(acc==null) return s;
        }
    }

    //通过卡号找账户，null代表没有
    private Account getAccountByCardID(String s){
        for (int i = 0; i < accounts.size(); i++) {
            if(s.equals(accounts.get(i).getCardID())) return accounts.get(i);
        }
        return null;
    }
}
