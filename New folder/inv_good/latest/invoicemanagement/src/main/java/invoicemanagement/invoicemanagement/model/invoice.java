package invoicemanagement.invoicemanagement.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;


@Entity
@Table(name="invoices")
public class invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name="Invoice_NO")
    private int invoice_NO;

    @Column(name="Invoice_Date")
    private LocalDate invoice_Date;

    @Column(name="IT_Department")
    private String IT_Department;

    @Column(name="Vendor")
    private String Vendor;

    @Column(name="Expense_Type")
    private String Expense_Type;

    @Column(name="No_of_Entries")
    private int No_of_Entries;

    @Column(name="Product")
    private String Product;

    @Column(name="Fin_A/C_Name")
    private String Fin_AC_Name;

    @Column(name="Sub_Product")
    private String Sub_Product;

    @Column(name="BU_Group")
    private String BU_Group;

    @Column(name="QTY")
    private int QTY;

    @Column(name="Invoice_Amount")
    private int Invoice_Amount;

    @Column(name="GST")
    private String GST;

    @Column(name="Total_Amount")
    private int Total_Amount;

    @Column(name="Start_Date")
    private LocalDate Start_Date;

    @Column(name="End_Date")
    private LocalDate End_Date;

    @Column(name="Allocated_Location")
    private String Allocated_Location;

    @Column(name="OEM")
    private String OEM;

    @Column(name="PO#(If Any)")
    private String PO_if_any;

    @Column(name="Description")
    private String Description;

    @Column(name="Remarks (If Any)")
    private String Remarks_if_any;

    @Column(name="Inv_Status")
    private String Inv_Status;

    @Column(name="Inv_F&A Submission date")
    private LocalDate Inv_FandA_Submission_date;

    @Column(name="Payment_Date")
    private LocalDate Payment_Date;

    @Column(name="CMS")
    private String CMS;

    @Enumerated(EnumType.STRING)
    @Column(name = "month")
    private Month month;
    

    

@Column(name="Quarter")
private String Quarter;


    @Column(name="FY")
    private String FY;

    @Column(name="system_id")
    private String system_id;

    @CreationTimestamp
    @Column(name="Created_date_time", nullable = false, updatable = false)
    private LocalDateTime createdDateTime;

    @Column(name="Duplicacy_Check")
    private String Duplicacy_Check;

    @UpdateTimestamp
    @Column(name="Last_updated")
    private LocalDateTime lastUpdated;

    @Column(name="Last_updated_By")
    private String lastUpdatedBy;

    @Column(name="Invoice_duedate")
    private LocalDate Invoice_duedate;

    @Column(name="SOF#")
    private String SOF;

    public invoice() {
        // Default constructor
        super();
    }

    public invoice(Long id, int invoice_NO, LocalDate invoice_Date, String iT_Department, String vendor,
            String expense_Type, int no_of_Entries, String product, String fin_AC_Name, String sub_Product,
            String bU_Group, int qTY, int invoice_Amount, String gST, int total_Amount, LocalDate start_Date,
            LocalDate end_Date, String allocated_Location, String oEM, String pO_if_any, String description,
            String remarks_if_any, String inv_Status, LocalDate inv_FandA_Submission_date, LocalDate payment_Date,
            String cMS, Month month, String quarter, String fY, String system_id, LocalDateTime createdDateTime,
            String duplicacy_Check, LocalDateTime lastUpdated, String lastUpdatedBy, LocalDate invoice_duedate,
            String sOF) {
        this.id = id;
        this.invoice_NO = invoice_NO;
        this.invoice_Date = invoice_Date;
        IT_Department = iT_Department;
        Vendor = vendor;
        Expense_Type = expense_Type;
        No_of_Entries = no_of_Entries;
        Product = product;
        Fin_AC_Name = fin_AC_Name;
        Sub_Product = sub_Product;
        BU_Group = bU_Group;
        QTY = qTY;
        Invoice_Amount = invoice_Amount;
        GST = gST;
        Total_Amount = total_Amount;
        Start_Date = start_Date;
        End_Date = end_Date;
        Allocated_Location = allocated_Location;
        OEM = oEM;
        PO_if_any = pO_if_any;
        Description = description;
        Remarks_if_any = remarks_if_any;
        Inv_Status = inv_Status;
        Inv_FandA_Submission_date = inv_FandA_Submission_date;
        Payment_Date = payment_Date;
        CMS = cMS;
        this.month = month;
        Quarter = quarter;
        FY = fY;
        this.system_id = system_id;
        this.createdDateTime = createdDateTime;
        Duplicacy_Check = duplicacy_Check;
        this.lastUpdated = lastUpdated;
        this.lastUpdatedBy = lastUpdatedBy;
        Invoice_duedate = invoice_duedate;
        SOF = sOF;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getInvoice_NO() {
        return invoice_NO;
    }

    public void setInvoice_NO(int invoice_NO) {
        this.invoice_NO = invoice_NO;
    }

    public LocalDate getInvoice_Date() {
        return invoice_Date;
    }

    public void setInvoice_Date(LocalDate invoice_Date) {
        this.invoice_Date = invoice_Date;
    }

    public String getIT_Department() {
        return IT_Department;
    }

    public void setIT_Department(String iT_Department) {
        IT_Department = iT_Department;
    }

    public String getVendor() {
        return Vendor;
    }

    public void setVendor(String vendor) {
        Vendor = vendor;
    }

    public String getExpense_Type() {
        return Expense_Type;
    }

    public void setExpense_Type(String expense_Type) {
        Expense_Type = expense_Type;
    }

    public int getNo_of_Entries() {
        return No_of_Entries;
    }

    public void setNo_of_Entries(int no_of_Entries) {
        No_of_Entries = no_of_Entries;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public String getFin_AC_Name() {
        return Fin_AC_Name;
    }

    public void setFin_AC_Name(String fin_AC_Name) {
        Fin_AC_Name = fin_AC_Name;
    }

    public String getSub_Product() {
        return Sub_Product;
    }

    public void setSub_Product(String sub_Product) {
        Sub_Product = sub_Product;
    }

    public String getBU_Group() {
        return BU_Group;
    }

    public void setBU_Group(String bU_Group) {
        BU_Group = bU_Group;
    }

    public int getQTY() {
        return QTY;
    }

    public void setQTY(int qTY) {
        QTY = qTY;
    }

    public int getInvoice_Amount() {
        return Invoice_Amount;
    }

    public void setInvoice_Amount(int invoice_Amount) {
        Invoice_Amount = invoice_Amount;
    }

    public String getGST() {
        return GST;
    }

    public void setGST(String gST) {
        GST = gST;
    }

    public int getTotal_Amount() {
        return Total_Amount;
    }

    public void setTotal_Amount(int total_Amount) {
        Total_Amount = total_Amount;
    }

    public LocalDate getStart_Date() {
        return Start_Date;
    }

    public void setStart_Date(LocalDate start_Date) {
        Start_Date = start_Date;
    }

    public LocalDate getEnd_Date() {
        return End_Date;
    }

    public void setEnd_Date(LocalDate end_Date) {
        End_Date = end_Date;
    }

    public String getAllocated_Location() {
        return Allocated_Location;
    }

    public void setAllocated_Location(String allocated_Location) {
        Allocated_Location = allocated_Location;
    }

    public String getOEM() {
        return OEM;
    }

    public void setOEM(String oEM) {
        OEM = oEM;
    }

    public String getPO_if_any() {
        return PO_if_any;
    }

    public void setPO_if_any(String pO_if_any) {
        PO_if_any = pO_if_any;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getRemarks_if_any() {
        return Remarks_if_any;
    }

    public void setRemarks_if_any(String remarks_if_any) {
        Remarks_if_any = remarks_if_any;
    }

    public String getInv_Status() {
        return Inv_Status;
    }

    public void setInv_Status(String inv_Status) {
        Inv_Status = inv_Status;
    }

    public LocalDate getInv_FandA_Submission_date() {
        return Inv_FandA_Submission_date;
    }

    public void setInv_FandA_Submission_date(LocalDate inv_FandA_Submission_date) {
        Inv_FandA_Submission_date = inv_FandA_Submission_date;
    }

    public LocalDate getPayment_Date() {
        return Payment_Date;
    }

    public void setPayment_Date(LocalDate payment_Date) {
        Payment_Date = payment_Date;
    }

    public String getCMS() {
        return CMS;
    }

    public void setCMS(String cMS) {
        CMS = cMS;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public String getQuarter() {
        return Quarter;
    }

    public void setQuarter(String quarter) {
        Quarter = quarter;
    }

    public String getFY() {
        return FY;
    }

    public void setFY(String fY) {
        FY = fY;
    }

    public String getSystem_id() {
        return system_id;
    }

    public void setSystem_id(String system_id) {
        this.system_id = system_id;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getDuplicacy_Check() {
        return Duplicacy_Check;
    }

    public void setDuplicacy_Check(String duplicacy_Check) {
        Duplicacy_Check = duplicacy_Check;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public LocalDate getInvoice_duedate() {
        return Invoice_duedate;
    }

    public void setInvoice_duedate(LocalDate invoice_duedate) {
        Invoice_duedate = invoice_duedate;
    }

    public String getSOF() {
        return SOF;
    }

    public void setSOF(String sOF) {
        SOF = sOF;
    }

}