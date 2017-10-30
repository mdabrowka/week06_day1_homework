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



}
