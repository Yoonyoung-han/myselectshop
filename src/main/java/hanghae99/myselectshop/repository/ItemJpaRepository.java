package hanghae99.myselectshop.repository;

import hanghae99.myselectshop.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemJpaRepository extends JpaRepository<Item,Long> {

}
