package ru.job4j.systemOfApplications;

/**
 * Class item description.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 21.09.2017
 */
public class Item {
    private String name;
    private String id;
    private String desc;
    private long created;
    private String comments;

    public Item(String name, String desc, long created) {
        this.name = name;
        this.desc = desc;
        this.created = created;

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public long getCreated() {
        return created;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }
}
