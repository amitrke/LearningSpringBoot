package org.roorkee.demo2;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Chapter {

    @Id
    private String id;

    private String name;

    public Chapter(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
