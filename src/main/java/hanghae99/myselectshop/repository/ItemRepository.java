package hanghae99.myselectshop.repository;

import hanghae99.myselectshop.domain.Item;

import java.util.List;

public interface ItemRepository {
    Long save(Item item);

    Item findById(Long id);

    List<Item> findAll();

    void delete(Long pId);
}
