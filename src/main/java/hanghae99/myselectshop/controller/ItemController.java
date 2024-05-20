package hanghae99.myselectshop.controller;

import hanghae99.myselectshop.domain.Item;
import hanghae99.myselectshop.dto.ItemRequest;
import hanghae99.myselectshop.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequiredArgsConstructor
@RequestMapping("/post")
public class ItemController {

    private final ItemService itemService;

    @PostMapping("")
    public Item setSalesPost(@RequestBody ItemRequest itemRequest){
        return itemService.setSalesPost(itemRequest);
    }

    @GetMapping("")
    public List<Item> getTotalPost(){
        return itemService.getTotalPost();
    }

    @PutMapping("/{id}")
    public Item putPost(@PathVariable(name = "id") int pId, @RequestBody ItemRequest itemRequest){
        return itemService.putPost(pId,itemRequest);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable(name = "id") Long pId){
        itemService.deletePost(pId);
        return ResponseEntity.status(HttpStatus.OK).body("{\"msg\": \"삭제완료\"}");
    }
}
