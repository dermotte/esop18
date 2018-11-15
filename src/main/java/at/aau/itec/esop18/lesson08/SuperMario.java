package at.aau.itec.esop18.lesson08;

public class SuperMario {
    int positionX = 42;
    int positionY = 0;

    int speed = 1;

    void goLeft() {
        positionX -= speed;
    }

    void goRight() {
        positionY -= speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        return speed;
    }
}
