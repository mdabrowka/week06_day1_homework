import org.junit.*;
import static org.junit.Assert.assertEquals;

public class ClassroomTest {

  Classroom classroom;
  Student student;

  @Before
  public void before() {
    this.classroom = new Classroom();
    this.student = new Student();
  }

    @Test
    public void classroomStartsEmpty() {
      assertEquals(0, classroom.studentCount());
    }


    @Test
    public void classroomCanTakeStudents() {
      classroom.add(student);
      assertEquals(1, classroom.studentCount());
    }

    @Test
    public void classroomIsFull() {
      for(int i =0; i < 20; i++) {
        classroom.add(student);
      }
      assertEquals(true, classroom.isFull());
    }

    @Test
    public void cannotAddStudentsWhenClassroomFull() {
      for(int i = 0; i < 22; i++) {
        classroom.add(student);
      }
      assertEquals(20, classroom.studentCount());
    }

}
