package org.labcrypto.topteacher.teacher;

import org.labcrypto.topteacher.teacher.ui.TeacherFrame;

public class Teacher {
    public static void main(String[] args) {
        new TeacherFrame(new TestServiceLocator());
    }
}
