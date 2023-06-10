package practice.p2;

import practice.test.A;
import practice.test.Test;

public class B extends Test {

    public void print(B obj) {
        obj.someMethod();
    }

    @Override
    protected void someMethod() {

    }
}
