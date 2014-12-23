package org.labcrypto.topteacher.teacher;

public class TestServiceLocator implements ServiceLocator {
    @Override
    public StudentFinder getStudentFinderService() {
        return new TestStudentFinder();
    }
}
