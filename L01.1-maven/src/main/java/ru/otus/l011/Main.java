package ru.otus.l011;

import com.google.common.base.Objects;

import static com.google.common.base.Objects.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String... args){
        Integer one = new Integer(1);
        Integer two = new Integer(2);

        System.out.print(com.google.common.base.Objects.equal(one, two));
    }
}
