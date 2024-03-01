package com.fby.list.exer3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ClassName: KTVByArrayListTest
 * Package: com.fby.list.exer3
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/12/18 - 2:40
 * @Version: V0.1
 */
public class KTVByArrayListTest {
    private static ArrayList musicList = new ArrayList();//创建歌曲列表
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        addMusicList();
        boolean flag = true;

        while (flag){
            System.out.println("当前歌曲列表" + musicList);
            System.out.println("-----------欢迎来到点歌系统-------------");
            System.out.println("1、添加歌曲至列表");
            System.out.println("2、将歌曲置顶");
            System.out.println("3、奖歌曲前移一位");
            System.out.println("4、退出");
            System.out.print("请输入操作序号：");

            int key = scan.nextInt();

            switch (key){
                case 1:
                    addMusic();
                    break;
                case 2:
                    setTop();
                    break;
                case 3:
                    setBefore();
                    break;
                case 4:
                    System.out.println("-----------退出----------");
                    System.out.println("您已经成功退出系统！");
                    flag = false;
                    break;
                default:
                    System.out.println("----------------------------------");
                    System.out.println("功能选择有误，请输入正确的功能序号!");
                    break;
            }
        }
    }

    public static void addMusicList(){
        musicList.add("本草纲目");
        musicList.add("一匹狼");
        musicList.add("千年等一回");
        musicList.add("苦行僧");
        musicList.add("双截棍");
        musicList.add("幽灵城堡");
    }

    private static void addMusic() {
        System.out.print("请输入要添加的歌曲名称：");
        String musicName = scan.next();
        musicList.add(musicName);
        System.out.println("已将“" + musicName + "”添加到播放列表");
    }

    private static void setTop() {
        System.out.print("请输入要置顶的歌曲名称：");
        String musicName = scan.next();// 获取键盘输入内容
        int musicIndex = musicList.indexOf(musicName);
        if(musicIndex < 0){
            System.out.println("歌曲不在列表内");
        }else if(musicIndex ==0){
            System.out.println("歌曲已经置顶");
        }else {
            System.out.println("已将" + musicName + "置顶");
            System.out.println("-----------------");
            musicList.remove(musicName);
            musicList.add(0,musicName);
        }
    }

    private static void setBefore() {
        System.out.print("请输入要置前的歌曲名称：");
        String musicName = scan.next();// 获取键盘输入内容
        int musicIndex = musicList.indexOf(musicName);

        if(musicIndex < 0){
            System.out.println("该歌曲不在列表内");
        }else if(musicIndex == 0){
            System.out.println("该歌曲已经置顶");
        }else {
            musicList.remove(musicIndex);
            musicList.add(musicIndex - 1 ,musicName);
            System.out.println("已将歌曲《" + musicName + "》置前一位");
        }

    }
    //添加默认歌曲
//    scan.close();
}
