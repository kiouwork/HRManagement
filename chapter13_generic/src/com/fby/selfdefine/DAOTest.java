package com.fby.selfdefine;

import java.util.List;

/**
 * ClassName: DAOTest
 * Package: com.fby.selfdefine
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/3/22 - 8:32
 * @Version: V0.1
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
//        DAT2<User,User> dat2 = new DAT2<>();

        dao.save("1", new User(1,10,"a10"));
        dao.save("2", new User(2,20,"a20"));
        dao.save("3", new User(3,30,"a30"));
        dao.save("4", new User(4,40,"a40"));
        dao.save("5", new User(5,50,"a50"));

        dao.update("2",new User(22,220,"A220"));

        List<User> list = dao.list();
        for(User u : list){
            System.out.println(u);
        }
    }
}
