package com.ittest_04;

public class GirlFriendTest {
    public static void main(String[] args) {

        GirlFriend gf1 = new GirlFriend();
        gf1.setName("诗情");
        gf1.setAge(18);
        gf1.setGender("萌妹子");
        System.out.println(gf1.getName()+gf1.getAge()+gf1.getGender());
        gf1.sleep();

    }

}
