package Problem2;

public class Mail {
  private int width;
  private int height;
  private int depth;
  private Recipient recipient;
  private static final int MIN_DIMENSION = 1;

  /**
   * Constructs Mail object.
   * @param width - width of Mail
   * @param height - height of Mail.
   * @param depth - depth of Mail.
   * @param recipient - Recipient to receive the Mail
   * @throws IllegalArgumentException - if the dimensions are smaller than the MIN_DIMENSION
   */
  public Mail(int width, int height, int depth, Recipient recipient) throws IllegalArgumentException {
    validateDimensions(width, height, depth);
    this.width = width;
    this.height = height;
    this.depth = depth;
    this.recipient = recipient;
  }

  /**
   * Validates the Dimensions of the Mail.
   * @param width - width of the Mail.
   * @param height - height of the Mail.
   * @param depth - depth of the Mail.
   * @throws IllegalArgumentException if the dimensions are smaller than the MIN_DIMENSION
   */
  public static void validateDimensions(int width, int height, int depth) throws IllegalArgumentException{
    if(width < MIN_DIMENSION || height < MIN_DIMENSION || depth < MIN_DIMENSION)
      throw new IllegalArgumentException("Invalid dimension. Dimension must be greater than 1");
  }

  /**
   * Getter for the Mail width.
   * @return width of Mail
   */
  public int getWidth() {
    return this.width;
  }

  /**
   * Getter for the Mail height.
   * @return height of Mail
   */
  public int getHeight() {
    return this.height;
  }

  /**
   * Getter for the Mail depth.
   * @return First Name
   */
  public int getDepth() {
    return this.depth;
  }

  /**
   * Getter for the Mail recipient.
   * @return First Name
   */
  public Recipient getRecipient() {
    return this.recipient;
  }


}