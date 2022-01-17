package finalExam.p2;
import java.time.LocalDate;
import java.util.Objects;

  /*
   Class taxReturn contains information about a filled tax return.
   */
  public class TaxReturn {

    private Name taxFiller;
    private Name coTaxFiller;
    private ContactInfo fillerContactInformation;
    private String TIN;
    private Integer fillingYear;
    private LocalDate dateTaxReturnFilled;
    private Double amountOfTaxesOwed;
    private Double amountOfTaxesOverpaid;
    private Boolean taxApplicationProcessed;

    public TaxReturn(Name taxFiller, Name coTaxFiller,
        ContactInfo fillerContactInformation, String TIN,
        Integer fillingYear, LocalDate dateTaxReturnFilled,
        Double amountOfTaxesOwed, Double amountOfTaxesOverpaid) {
      this.taxFiller = taxFiller;
      this.coTaxFiller = coTaxFiller;
      this.fillerContactInformation = fillerContactInformation;
      this.TIN = TIN;
      this.fillingYear = fillingYear;
      this.dateTaxReturnFilled = dateTaxReturnFilled;
      this.amountOfTaxesOwed = amountOfTaxesOwed;
      this.amountOfTaxesOverpaid = amountOfTaxesOverpaid;
      this.taxApplicationProcessed = false;
    }

    public TaxReturn(Name taxFiller, ContactInfo fillerContactInformation,
        String TIN, Integer fillingYear, LocalDate dateTaxReturnFilled,
        Double amountOfTaxesOwed, Double amountOfTaxesOverpaid) {
      this.taxFiller = taxFiller;
      this.coTaxFiller = null;
      this.fillerContactInformation = fillerContactInformation;
      this.TIN = TIN;
      this.fillingYear = fillingYear;
      this.dateTaxReturnFilled = dateTaxReturnFilled;
      this.amountOfTaxesOwed = amountOfTaxesOwed;
      this.amountOfTaxesOverpaid = amountOfTaxesOverpaid;
      this.taxApplicationProcessed = false;
    }

    public Name getTaxFiller() {
      return taxFiller;
    }

    public Name getCoTaxFiller() {
      return coTaxFiller;
    }

    public ContactInfo getFillerContactInformation() {
      return fillerContactInformation;
    }

    public String getTIN() {
      return TIN;
    }

    public Integer getFillingYear() {
      return fillingYear;
    }

    public LocalDate getDateTaxReturnFilled() {
      return dateTaxReturnFilled;
    }

    public Double getAmountOfTaxesOwed() {
      return amountOfTaxesOwed;
    }

    public Double getAmountOfTaxesOverpaid() {
      return amountOfTaxesOverpaid;
    }

    public Boolean getTaxApplicationProcessed() {
      return taxApplicationProcessed;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof TaxReturn)) return false;
      TaxReturn taxReturn = (TaxReturn) o;
      return Objects.equals(getTaxFiller(), taxReturn.getTaxFiller()) &&
          Objects.equals(getCoTaxFiller(), taxReturn.getCoTaxFiller()) &&
          Objects.equals(getFillerContactInformation(), taxReturn.getFillerContactInformation()) &&
          Objects.equals(getTIN(), taxReturn.getTIN()) &&
          Objects.equals(getFillingYear(), taxReturn.getFillingYear()) &&
          Objects.equals(getDateTaxReturnFilled(), taxReturn.getDateTaxReturnFilled()) &&
          Objects.equals(getAmountOfTaxesOwed(), taxReturn.getAmountOfTaxesOwed()) &&
          Objects.equals(getAmountOfTaxesOverpaid(), taxReturn.getAmountOfTaxesOverpaid()) &&
          Objects.equals(getTaxApplicationProcessed(), taxReturn.getTaxApplicationProcessed());
    }

    @Override
    public int hashCode() {
      return Objects.hash(getTaxFiller(), getCoTaxFiller(),
          getFillerContactInformation(), getTIN(), getFillingYear(),
          getDateTaxReturnFilled(), getAmountOfTaxesOwed(),
          getAmountOfTaxesOverpaid(), getTaxApplicationProcessed());
    }
  }




