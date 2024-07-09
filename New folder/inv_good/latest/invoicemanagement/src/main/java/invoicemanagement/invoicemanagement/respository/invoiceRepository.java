package invoicemanagement.invoicemanagement.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import invoicemanagement.invoicemanagement.model.invoice;

@Repository
public interface invoiceRepository extends JpaRepository<invoice, Long> {

}
