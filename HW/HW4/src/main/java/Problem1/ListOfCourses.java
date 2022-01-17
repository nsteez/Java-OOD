package Problem1;

import java.util.Arrays;
import java.util.Objects;

public class ListOfCourses implements ICourseCatalog {
  private static final int NUM_SLOTS = 2;
  private Course[] courses;
  private int size;

  public ListOfCourses(){
    this.courses = new Course[NUM_SLOTS];
    this.size = 0;
  }

  public static ListOfCourses createEmpty(){
    return new ListOfCourses();
  }

  /**
   * Adds a course to the end of the Course Catalog
   *
   * @param course - the course to add.
   */
  @Override
  public void append(Course course) {
    if(!this.inSizeRange())
      this.resize();
    this.courses[this.size] = course;
    this.size++;

  }
  /**
   * Helper function that checks if there is room in the items array to add a new item to the list.
   */
  private boolean inSizeRange(){
    return (this.size + 1 <= this.courses.length);
  }

  /**
   * Helper function that checks if the Catalog should be resized
   */
  private void resize(){
    int newCourseSize = this.size + NUM_SLOTS;
    Course[] newCourses = new Course[newCourseSize];
    this.copyCourses(this.courses, newCourses);
    this.courses = newCourses;

  }
  private void copyCourses(Course[] from, Course[] to, int fromStart, int fromEnd, int toStart){
    if (toStart >= 0){
      for (int i = fromStart; i < fromEnd; i++){
        to[toStart] = from[i];
        toStart++;
      }
    }
  }


  private void copyCourses(Course[] from, Course[] to){
    this.copyCourses(from, to, 0, from.length, 0);
  }


  /**
   * Removes a specified Course from the CourseCatalog.
   * @param course - the course to remove.
   * @throws CourseNotFoundException if the course does not exist.
   */
  @Override
  public void remove(Course course) throws CourseNotFoundException {
    int index = indexOf(course);
    if (index < 0){
      throw new CourseNotFoundException();
    }else {
      Course[] newArray = new Course[this.size - 1];

      copyCourses(this.courses, newArray, 0, index, 0);
      copyCourses(this.courses, newArray, index + 1, this.courses.length - 1, index);

      this.courses = newArray;
      this.size--;
    }
  }

  public boolean hasDuplicates(Course course){
    int count = 0;
    for(int i = 0; i < this.size; i++) {
      if (course.equals(this.courses[i])) {
        count++;

      }
    }
    return count > 1 ? true: false;

  }

  /**
   * Checks if the specified course exists in the CourseCatalog.
   *
   * @param course - the course to check
   * @return true if course exist, else false.
   */
  @Override
  public boolean contains(Course course) {
    if (indexOf(course) == -1){
      return false;
    }
    return true;
  }

  /**
   * Returns the index of the specified Course in the CourseCatalog.
   *
   * @param course - course to check index
   * @return - index, if the course doesnt exist returns -1
   */
  @Override
  public int indexOf(Course course) {
    for (int i = 0; i < this.size; i++) {
      if (this.courses[i].equals(course)) {
        return i;
      }
    }
    return -1;
  }

  /**
   * Gets the number of Courses in the CourseCatalog
   * @return - the number of courses in the catalog
   */
  @Override
  public int count() {
    return size;
  }

  /**
   * Returns the Course at the given index in the Course Catalog.
   *
   * @param index
   * @return the Course at the given index in the CourseCatalog.
   * @throws InvalidIndexException - if the index doesnt exist.
   */
  @Override
  public Course get(int index) throws InvalidIndexException {
    if (index < 0 || index >= this.size){
      throw new InvalidIndexException();
    } else {
      return courses[index];

    }
  }
  /**
   * Checks if the CourseCatalog is empty.
   *
   * @return true if CourseCatalog is empty, false otherwise.
   */
  @Override
  public boolean isEmpty() {
    return size == 0 ? true : false;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOfCourses that = (ListOfCourses) o;
    return size == that.size && Arrays.equals(courses, that.courses);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(size);
    result = 31 * result + Arrays.hashCode(courses);
    return result;
  }

  @Override
  public String toString() {
    return "ListOfCourses{" +
        "courses=" + Arrays.toString(courses) +
        ", size=" + size +
        '}';
  }
}
