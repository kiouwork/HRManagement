package com.fby.selfdefine;

import java.util.*;

/**
 * ClassName: DAO
 * Package: com.fby.selfdefine
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/3/12 - 3:56
 * @Version: V0.1
 */
public class DAO <T> {
    //定义Map
    Map <String, T> map;
    {
        map = new HashMap<>();
    }

    //保存，先查找是否有，有则跳过，无则新增保存；
    public void save(String id, T entity){
        if(!map.containsKey(id)) {
            map.put(id, entity);
        }else{
            System.out.println("已存在，无法新增保存！");
        }
    }

    //根据键，获得值；
    public T get(String id){
        return map.get(id);
    }

    //更新，先查找是否存在，存在则更新，否则跳过
    public void update(String id, T entity){
        if(map.containsKey(id)) {
            map.put(id, entity);
        }else {
            System.out.println("无此id，无法更新；");
        }
    }
    //返回map中的T对象
    public List<T> list(){
//        Collection<T> values = map.values();
//        ArrayList<T> list = new ArrayList();
//        list.addAll(values);
//        return list;

        //方式2
        Collection<T> values = map.values();
        ArrayList<T> list = new ArrayList<>(values);
        return list;
    }

    public void delete(String id){
        if(map.containsKey(id)){
            map.remove(id);
        }else {
            System.out.println("查无此人！");
        }
    }
}
