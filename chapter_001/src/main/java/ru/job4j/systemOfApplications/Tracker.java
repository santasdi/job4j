package ru.job4j.systemOfApplications;
import java.lang.*;


/**
 * Methods to control items.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 21.09.2017Created by Артем on 17.09.2017.
 */
public class Tracker {
    private Item[] items = new Item[100];
    private int possition = 0;
    private double counterId = 0;
    /**
     * Generated id.
     */
    public double generateId() {
        return Math.random()* this.counterId++;
    }

    /**
     * Adding item.
     * @param item is item object
     * @return item
     */
    public Item add(Item item){
        String s = Double.toString(generateId());
        item.setId(s);
        this.items[possition++] = item;
        return item;
    }

    /**
     * Deleting item
     * @param item is for id of item
     */
    public void delete(Item item){
        for (int i = 0; i != this.possition; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(item.getId())) {
                System.arraycopy(this.items, i + 1, this.items,i,this.items.length - possition);
                break;
            }
        }
        possition--;
    }

    /**
     * Update item with param id and name of item.
     * @param id is id of item
     * @param item is item will be updating to new item
     */
    public void update(String id, Item item){
        for (int index = 0; index < this.items.length; index++) {
            if (this.items[index] != null && id.equals(this.items[index].getId())){
                this.items[index] = item;
            }
        }
    }

    /**
     * Finding all items whithout null elements.
     * @return items
     */
    public Item[] findAll(){
        int count = 0;
        Item[] result = new Item[possition];
        for (int index = 0; index != this.possition; index++){
            if (this.items[index] != null) {
                result[index] = this.items[index];
                count++;
            } else {
                for(int k = index; k < this.possition - 1; k++) {
                    result[k] = this.items[k + 1];
                    count++;
                }
            }
        }
        System.arraycopy(result, 0, result, 0, count);
        return result;
    }

    /**
     * Finding items by name.
     * @param key is item's name
     * @return items that was found
     */
    public Item[] findByName(String key){
        int count = 0;
        for(int index = 0; index < possition; index++){
            if (this.items[index] != null && this.items[index].getName().equals(key)) {
                count++;
            }
        }
        Item[] result = new Item[count];
        for (int i = 0; i < count; i++){
            if (this.items[i] != null && this.items[i].getName().equals(key)){
                result[i] = this.items[i];
            }
        }
        return result;
    }

    /**
     * Finding items by uniq id.
     * @param id is id of item
     * @return item that was found or null
     */
    public Item findById(String id){
        Item result = null;
        for (Item item : this.items) {
            if(item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }


}
