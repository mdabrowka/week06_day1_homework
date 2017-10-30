class Classroom {
  private Student[] students;

  public Classroom() {
    this.students = new Student[20];
  }

  public int studentCount() {
    int count = 0;
    for(Student student : students){
      if (student != null) {
        count++;
      }
    }
    return count;
  }

  public void add(Student student) {
    if(isFull()) {
      return;
    }
    int studentCount = studentCount();
    students[studentCount] = student;
  }

  public boolean isFull() {
    return studentCount() == students.length;
  }

}
