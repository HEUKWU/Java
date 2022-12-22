abstract class Unit {
    int x, y;
    abstract void move(int x, int y);

    void stop() {}
}

class Marine extends Unit {
    void stimPack() {}

    @Override
    void move(int x, int y) {

    }
}

class Tank extends Unit {
    void changeMode() {}

    @Override
    void move(int x, int y) {

    }
}

class Dropship extends Unit {
    void load() {}
    void unload() {}

    @Override
    void move(int x, int y) {

    }
}
