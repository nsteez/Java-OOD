package Problem2;

public class Locker {

  private int maxWidth;
  private int maxHeight;
  private int maxDepth;
  private Mail mailItem;

  /**
   * Constructs the Locker class with the following parameters.
   *
   * @param maxWidth  - maximum width of the Locker.
   * @param maxHeight - maximum height of the Locker.
   * @param maxDepth  - maximum depth of the Locker.
   * @param mailItem  - Mail item in Locker.
   * @throws MailTooBigException - if the Mail is too big for the Locker.
   */
  public Locker(int maxWidth, int maxHeight, int maxDepth, Mail mailItem)
      throws MailTooBigException {
    this.maxWidth = maxWidth;
    this.maxHeight = maxHeight;
    this.maxDepth = maxDepth;
    if (mailItem != null) {
      validateDimensions(mailItem);
    }
    this.mailItem = mailItem; // the item stores in the locker, if any
  }

  /**
   * Validates the Dimensions of the Locker.
   *
   * @param mailItem - the Mail item for size validation
   * @throws MailTooBigException - if the Mail is too big for the Locker
   */
  private void validateDimensions(Mail mailItem) throws MailTooBigException {
    if (mailItem.getWidth() > maxWidth || mailItem.getHeight() > maxHeight
        || mailItem.getDepth() > maxDepth) {
      throw new MailTooBigException();
    }
  }

  /**
   * Consumes a mail item and store it in the locker with two exceptions.
   *
   * @param mailItem - Mail item to be stored in the Locker.
   * @throws LockerIsFullException - if the Locker is full.
   * @throws MailTooBigException   - if the Mail doesn't fit within the Locker dimensions
   */
  public void addMail(Mail mailItem) throws LockerIsFullException, MailTooBigException {
    if (this.mailItem != null) {
      throw new LockerIsFullException();
    }
    validateDimensions(mailItem);
    this.mailItem = mailItem;
  }

  /**
   * Returns and removes the mail item from the locker under the following conditions: there is a
   * mail item and the recipient passed to pickupMail matches the recipient of the mail item.
   * @param recipient - the recipient to pickup the Mail.
   * @return the mail Item to be picked up or returns null if there is nothing to pickup.
   */
  public Mail pickupMail(Recipient recipient) {
    if (this.mailItem != null && this.mailItem.getRecipient().equals(recipient)) {
      Mail pickupMail = this.mailItem;
      this.mailItem = null;
      return pickupMail;
    } else {
      return null;
    }
  }
}
