package com.lh.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Staff
 * @Desc //员工类
 * @Author mi
 * @Date 2020/8/8 14:12
 */
public class Staff {
    private int id;
    private String name;
    private String dept;
    private List<Staff> subordinateList;

    public Staff(int id,String name,String dept){
        this.id=id;
        this.name=name;
        this.dept=dept;
        subordinateList=new ArrayList<>();
    }

    public void addSubordinate(Staff staff){
        subordinateList.add(staff);
    }

    public List<Staff> getSubordinateList(){
        return subordinateList;
    }

    @Override
    public String toString() {
        return "Employee:{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
