public class Player {
    private String name;
    private int age;
    private double height;
    private boolean retired;

    public Player(String name, int age, double height, boolean retired) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.retired = retired;
    }

    public void show() {
        String retirementStatus = retired ? "已退役" : "未退役";
        System.out.println("姓名: " + name + ", 年龄: " + age + ", 身高: " + height + ", 状态: " + retirementStatus);
    }

    public void honor(int medals) {
        System.out.println(name + "运动员获得了" + medals + "枚奖牌");
    }
}