package com.lh.pattern.composite;

/**
 * @ClassName CompositePatternDemo
 * @Desc //组合模式测试类
 * 组合模式依据树形结构来组合对象
 * @Author mi
 * @Date 2020/8/8 14:18
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        Staff boss = new Staff(1, "Tom", "Boss");
        Staff cto = new Staff(2, "John", "IT");
        Staff saleDirector = new Staff(3, "Robert", "Marketing");
        boss.addSubordinate(cto);
        boss.addSubordinate(saleDirector);
        Staff engineer1 = new Staff(4, "Bob", "IT");
        Staff engineer2 = new Staff(5, "Michael", "IT");
        cto.addSubordinate(engineer1);
        cto.addSubordinate(engineer2);
        Staff saleExecutive1 = new Staff(6, "Richard", "Marketing");
        Staff saleExecutive2 = new Staff(7, "Rob", "Marketing");
        saleDirector.addSubordinate(saleExecutive1);
        saleDirector.addSubordinate(saleExecutive2);
        //打印所有的员工
        System.out.println(boss);
        for (Staff manager : boss.getSubordinateList()) {
            System.out.println(manager);
            for (Staff staff : manager.getSubordinateList()) {
                System.out.println(staff);
            }
        }
    }
}
