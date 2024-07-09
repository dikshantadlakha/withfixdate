package invoicemanagement.invoicemanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import invoicemanagement.invoicemanagement.model.invoice;
import invoicemanagement.invoicemanagement.respository.invoiceRepository;

@Controller
@RequestMapping("/api/v1/")
public class invoiceController {

    @Autowired
    private invoiceRepository InvoiceRepository;

    @GetMapping("/invoices")
    public String getAllInvoices(Model model) {
        List<invoice> invoices = InvoiceRepository.findAll();
        model.addAttribute("invoices", invoices);
        return "invoices";
    }

    @GetMapping("/invoices/{id}")
    public ResponseEntity<?> getInvoiceById(@PathVariable(value = "id") Long invoiceId) {
        return InvoiceRepository.findById(invoiceId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/invoices/new")
    public String createInvoiceForm(Model model) {
        model.addAttribute("invoice", new invoice());
        return "create_invoice";
    }

    @PostMapping("/invoices")
    public String saveInvoice(@ModelAttribute("invoice") invoice Invoice) {
        InvoiceRepository.save(Invoice);
        return "redirect:/api/v1/invoices";
    }

    @GetMapping("/invoices/edit/{id}")
    public String editInvoiceForm(@PathVariable Long id, Model model) {
        invoice existingInvoice = InvoiceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Invoice not found for this id :: " + id));
        model.addAttribute("invoice", existingInvoice);
        return "edit_invoice"; // Make sure this matches the Thymeleaf template name
    }

    @PostMapping("/invoices/{id}")
    public String updateInvoice(
            @PathVariable Long id,
            @ModelAttribute("invoice") invoice updatedInvoice) {

        invoice existingInvoice = InvoiceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Invoice not found for this id :: " + id));

        // Update fields from the updatedInvoice object
        existingInvoice.setIT_Department(updatedInvoice.getIT_Department());
existingInvoice.setInvoice_Amount(updatedInvoice.getInvoice_Amount());
existingInvoice.setVendor(updatedInvoice.getVendor());
existingInvoice.setInv_Status(updatedInvoice.getInv_Status());
existingInvoice.setInv_FandA_Submission_date(updatedInvoice.getInv_FandA_Submission_date());
existingInvoice.setPayment_Date(updatedInvoice.getPayment_Date());
existingInvoice.setCMS(updatedInvoice.getCMS());
existingInvoice.setFin_AC_Name(updatedInvoice.getFin_AC_Name());
existingInvoice.setInvoice_duedate(updatedInvoice.getInvoice_duedate());
existingInvoice.setMonth(updatedInvoice.getMonth());
existingInvoice.setFY(updatedInvoice.getFY());
existingInvoice.setInvoice_NO(updatedInvoice.getInvoice_NO());
existingInvoice.setInvoice_Date(updatedInvoice.getInvoice_Date());


        // Save the updated invoice to the repository
        InvoiceRepository.save(existingInvoice);

        return "redirect:/api/v1/invoices"; // Redirect to the list of invoices
    }
}
