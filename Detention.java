class Detention {
  private Student[] offenders;

public Detention() {
  this.offenders = new Student[7];
}

public int studentCount() {
  int count = 0;
  for(Student student : offenders){
    if (student != null) {
      count++;
    }
  }
  return count;
}

}
