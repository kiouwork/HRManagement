package com.fby.list.exer3;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
/**
 * ClassName: InterviewTest
 * Package: com.fby.list.exer3
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/12/29 - 3:12
 * @Version: V0.1
 */
public class InterviewTest {
    @Test
    public void testListRemove() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        updateList(list);
        System.out.println(list);
    }
    private static void updateList(List list){
//        list.remove(2);
        list.remove(Integer.valueOf(2));
    }
}