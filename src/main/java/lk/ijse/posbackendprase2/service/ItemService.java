package lk.ijse.posbackendprase2.service;


import lk.ijse.posbackendprase2.dto.impl.ItemDto;

import java.util.List;

public interface ItemService {
    void saveItem(ItemDto itemDto);
    ItemDto getItemById(String itemCode);
    List<ItemDto> getAllItems();
    void updateItem(String itemCode, ItemDto itemDto);
    void deleteItem(String itemCode);
}
