package com.totoro.数据结构.queue队列;

/**
 * @Description:
 * 写一个 RecentCounter 类来计算特定时间范围内最近的请求。
 *
 * 请你实现 RecentCounter 类：
 *
 * RecentCounter() 初始化计数器，请求数为 0 。
 * int ping(int t) 在时间 t 添加一个新请求，其中 t 表示以毫秒为单位的某个时间，
 * 并返回过去 3000 毫秒内发生的所有请求数（包括新请求）。
 * 确切地说，返回在 [t-3000, t] 内发生的请求数。
 *
 * 输入： ["RecentCounter", "ping", "ping", "ping", "ping"]
 *      [[], [1], [100], [3001], [3002]]
 * 输出： [null, 1, 2, 3, 3]
 *
 * @author: zhaoyan
 * @Date: 2022/07/31 18:53
 */

/**
 * 考察重点：集合的使用
 */
class RecentCounter {
    private final static int TIME_QUOTA = 3000;

    public RecentCounter() {

    }

    public int ping(int t) {

        System.out.println();
        return 0;
    }
}

public class RecentCounter933 {
    public static void main(String[] args) {
     RecentCounter counter = new RecentCounter();
     counter.ping(1);
     counter.ping(1);
     counter.ping(100);
     counter.ping(3001);
     counter.ping(3002);
    }
}
