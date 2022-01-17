package Problem1;

/**
 * A List represents an ordered, mutable collection of Courses.
 */
public interface ICourseCatalog {

  /**
   * Adds a course to the end of the Course Catalog
   * @param course - the course to add.
   */
  void append(Course course);


  /**
   * Removes a specified Course from the CourseCatalog.
   * @param course - the course to remove.
   * @throws CourseNotFoundException if the course does not exist.
   */
  void remove(Course course) throws CourseNotFoundException;


  /**
   * Checks if the specified course exists in the CourseCatalog.
   * @param course - the course to check
   * @return true if course exist, else false.
   */
  boolean contains(Course course);

  /**
   * Returns the index of the specified Course in the CourseCatalog.
   * @param course - course to check index
   * @return - index, if the course doesnt exist returns -1
   */
  int indexOf(Course course);


  /**
   * Gets the number of Courses in the CourseCatalog
   * @return - the number of courses in the catalog
   */
  int count();

  /**
   * Returns the Course at the given index in the Course Catalog.
   * @return the Course at the given index in the CourseCatalog.
   * @throws InvalidIndexException - if the index doesnt exist.
   */
  Course get(int index) throws InvalidIndexException;


  /**
   * Checks if the CourseCatalog is empty.
   * @return true if CourseCatalog is empty, false otherwise.
   */
  boolean isEmpty();
}
