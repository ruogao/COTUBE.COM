package cotube.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tag")
@IdClass(Tag.IdClass.class)
public class Tag{
    @Id
    private Integer comic_id;
    @Id
    private String comic_tag;

    public Tag(){

    }

    public Tag(Integer comic_id, String comic_tag) {
        this.comic_id = comic_id;
        this.comic_tag = comic_tag;
    }

    public Integer getComic_id() {
        return comic_id;
    }

    public void setComic_id(Integer comic_id) {
        this.comic_id = comic_id;
    }

    public String getComic_tag() {
        return comic_tag;
    }

    public void setComic_tag(String comic_tag) {
        this.comic_tag = comic_tag;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "comic_id=" + comic_id +
                ", comic_tag='" + comic_tag + '\'' +
                '}';
    }

    static class IdClass implements Serializable {
        public Integer comic_id;
        public String comic_tag;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            IdClass idClass = (IdClass) o;
            return Objects.equals(comic_id, idClass.comic_id) &&
                    Objects.equals(comic_tag, idClass.comic_tag);
        }

        @Override
        public int hashCode() {
            return Objects.hash(comic_id, comic_tag);
        }
    }
}