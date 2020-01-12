package kg.myspring.FirstBoot.model;

import javax.persistence.*;

@Entity
@Table(name = "words")
public class FieldOfDreams{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Str;
    private Long count;
    public FieldOfDreams() {
    }
    public FieldOfDreams(Long id, String str, Long count) {
        this.id = id;
        Str = str;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStr() {
        return Str;
    }

    public void setStr(String str) {
        Str = str;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
