
package model;

import java.util.Date;

public class Projeto {
    private int id;
    private String name;
    private String description;
    private Date createdAt;
    private Date updateAt;
    
    public Projeto(String name, String description, Date createdAt, Date updateAt) {
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createAt) {
        this.createdAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Projeto{" + "id=" + id + ", name=" + name + ", description=" + description + ", createdAt=" + createdAt + ", updateAt=" + updateAt + '}';
    }
}
