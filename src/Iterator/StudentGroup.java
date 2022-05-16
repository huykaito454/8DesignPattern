package Iterator;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup implements Container {
    private List<Student> studentList = new ArrayList<>();
    public void addStudent(Student student){
        studentList.add(student);
    }

    @Override
    public StudentIterator getIterator() {
        return new StudentGroupIterator();
    }
    private class StudentGroupIterator implements StudentIterator {
        private int index = 0;
        @Override
        public boolean hasNext() {
            if(index < studentList.size()){
                return true;
            }
            else return false;
        }
        @Override
        public Object next() {
            return studentList.get(index++);
        }
    }

}
