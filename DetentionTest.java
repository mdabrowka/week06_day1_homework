import org.junit.*;
import static org.junit.Assert.assertEquals;

public class DetentionTest {

  Detention detention;
  Classroom classroom;
  Student student;

  @Before
  public void before() {
    this.detention = new Detention();
    this.classroom = new Classroom();
    this.student = new Student();
  }

    @Test
    public void detentionStartsEmpty() {
      assertEquals(0, detention.studentCount());
    }

}
