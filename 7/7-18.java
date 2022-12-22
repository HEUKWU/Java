public class Java {
    public static void main(String[] args) {
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};

        for (Robot robot : arr) {
            action(robot);
        }
    }

    public static void action(Robot robot) {
        if (robot instanceof DanceRobot) {
            DanceRobot r = (DanceRobot) robot;
            r.dance();
        } else if (robot instanceof SingRobot) {
            SingRobot r = (SingRobot) robot;
            r.sing();
        } else {
            DrawRobot r = (DrawRobot) robot;
            r.draw();
        }
    }
}

class Robot {

}

class DanceRobot extends Robot {
    void dance() {
        System.out.println("춤을 춥니다.");
    }
}

class SingRobot extends Robot {
    void sing() {
        System.out.println("노래를 합니다.");
    }
}

class DrawRobot extends Robot {
    void draw() {
        System.out.println("그림을 그립니다.");
    }
}
