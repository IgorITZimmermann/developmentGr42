package lessson30;

import lesson26.AccessLevel;

import java.util.List;

abstract class AccessCheck {

    protected  int level;

    public AccessCheck(int level) {
        this.level = level;
    }

    public boolean canReadFiles(){
        return this.level >= 1;
    }


    abstract boolean canRead();
    //abstract boolean canRight();
}
