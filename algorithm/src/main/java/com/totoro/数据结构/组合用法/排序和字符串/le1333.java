package com.totoro.数据结构.组合用法.排序和字符串;

import java.util.*;

public class le1333 {
    public static void main(String[] args) {
        // restaurants[i] = [idi, ratingi, veganFriendlyi素食：true 1/false 0, pricei价格, distancei距离]
        int[][] restaurants = new int[][]{{1,8,1,40,10},{2,8,0,50,5},{3,8,1,30,4},{4,10,0,10,3},{5,1,1,15,1}};
        int veganFriendly = 1;
        int maxPrice = 50;
        int maxDistance = 10;
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        //map.put(5, 1);
        //map.put(5, 2);
        //map.put(3, 3);
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
//        map1.put(5, 1);
//        map1.put(5, 2);
//        map1.put(3, 3);
        for (Integer key : map1.keySet()) {
            System.out.println(key);
        }
        System.out.println(filterRestaurants(restaurants, veganFriendly, maxPrice, maxDistance));
    }


    public static List<Integer> filterRestaurants(
            int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<int[]> list = new ArrayList<int[]>();

        for (int[] arr : restaurants) {
            if (arr[2] != 1 && veganFriendly == 1) {
                continue;
            }
            if (arr[3] > maxPrice) {
                continue;
            }
            if (arr[4] > maxDistance) {
                continue;
            }
            list.add(arr);
        }
        Collections.sort(list, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if (o1[1] - o2[1] < 0) return 1;  //意味着要换顺序
                else if (o1[1] - o2[1] > 0) {return -1;}
                else return -1;  // id从高到低，因此不需要换顺序
            }
        });

        List<Integer> result = new ArrayList<Integer>();
        for (int[] i : list) {
            result.add(i[0]);
        }
        return result;
    }
}
