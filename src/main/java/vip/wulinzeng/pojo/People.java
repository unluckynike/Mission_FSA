package vip.wulinzeng.pojo;

import org.springframework.stereotype.Component;

/*
@Name: People
@Author: zhouhailin
@Date: 2021/4/6
@Time: 6:55 下午
@Description： 人数记录
*/
@Component
public class People {
    public int id;
    public int count;


    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", count=" + count +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public People(int count) {
        this.count = count;
    }

    public People() {
    }
}
