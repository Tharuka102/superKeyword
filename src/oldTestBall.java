public class oldTestBall {
    String color = "Red";
}
class newTestBall extends oldTestBall{
    String color = "Pink";
    void printcolor (){
        System.out.println(color);
        System.out.println(super.color);
    }
}

class test{
    public static void main(String[] args) {
        newTestBall ntb =new newTestBall();
        ntb.printcolor();
    }
}