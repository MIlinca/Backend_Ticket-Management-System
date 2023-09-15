package endava.TicketManagementSystem.Repository;

import endava.TicketManagementSystem.Models.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketCategoryRepository extends JpaRepository<TicketCategory,Long> {
}
