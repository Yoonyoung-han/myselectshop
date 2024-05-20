package hanghae99.myselectshop.service;

import hanghae99.myselectshop.domain.Item;
import hanghae99.myselectshop.dto.ItemRequest;
import hanghae99.myselectshop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public Item setSalesPost(ItemRequest reqItem){

        Long saveId = itemRepository.save(new Item(reqItem.getTitle(),reqItem.getContent(),reqItem.getPrice(),reqItem.getUsername()));
        return getSalesPost(saveId);
    }

    public Item getSalesPost(Long postId){
        itemRepository.findById(postId);
        return itemRepository.findById(postId);
    }

    public List<Item> getTotalPost(){
        return itemRepository.findAll();
    }

    public Item putPost(int pId, ItemRequest itemRequest) {
        Item targetItem = getSalesPost((long) pId);
        targetItem.setPrice(itemRequest.getPrice());
        targetItem.setContent(itemRequest.getContent());
        targetItem.setUsername(itemRequest.getUsername());
        targetItem.setTitle(itemRequest.getTitle());
        itemRepository.save(targetItem);
        return targetItem;
    }

    public void deletePost(Long pId) {
        itemRepository.delete(pId);
    }
}
