package org.redi.inheritance;

/**
 * Created by redi on 5/8/17.
 */
public class Teacher extends Person {

    public String getTeachingKurse() {
        return teachingKurse;
    }

    public void setTeachingKurse(String teachingKurse) {
        this.teachingKurse = teachingKurse;
    }

    private String teachingKurse;


}
