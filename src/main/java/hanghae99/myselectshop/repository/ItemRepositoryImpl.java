package hanghae99.myselectshop.repository;

import hanghae99.myselectshop.domain.Item;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.orm.jpa.JpaObjectRetrievalFailureException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemRepositoryImpl implements ItemRepository {
    private final ItemJpaRepository itemJpaRepository;

    @Override
    public Long save(Item item) {
        return itemJpaRepository.save(item).getId();
    }

    @Override
    public Item findById(Long postId) {
        return itemJpaRepository.findById(postId).orElseThrow(() -> new JpaObjectRetrievalFailureException(new EntityNotFoundException("게시글이 존재하지 않습니다.")));
    }

    @Override
    public List<Item> findAll() {
        return itemJpaRepository.findAll();
    }

    @Override
    public void delete(Long pId) {
        itemJpaRepository.deleteById(pId);
    }

}
