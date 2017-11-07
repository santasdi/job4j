package ru.job4j.application.models;

/**
 * Class item description.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 21.09.2017
 */
public class Item {
    /**
     * Name of item.
     */
    private String name;
    /**
     * Id of item.
     */
    private String id;
    /**
     * Description of item.
     */
    private String desc;
    /**
     * Creation type of name.
     */
    private long created;
    /**
     * Comments of item.
     */
    private String comments;

    /**
     * Constructor of Item.
     * @param name name
     * @param desc description
     * @param created creation number.
     */
    public Item(String name, String desc, long created) {
        this.name = name;
        this.desc = desc;

    }

    /**
     * Seting name.
     * @param name is name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Geting name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Seting id.
     * @param id is id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getting id.
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Setting description.
     * @param desc is description
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Getting description.
     * @return description
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Set creation.
     * @param created is created
     */
    public void setCreated(long created) {
        this.created = created;
    }

    /**
     * Getting created.
     * @return created
     */
    public long getCreated() {
        return created;
    }

    /**
     * Set comments.
     * @param comments are comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * Getting comments.
     * @return comments
     */
    public String getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", created=" + created +
                ", comments='" + comments + '\'' +
                '}';
    }
}
