package krd.kurdestan.showen.comment;

import krd.kurdestan.showen.like.Like;
import krd.kurdestan.showen.place.Place;
import krd.kurdestan.showen.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.envers.Audited;
import org.hibernate.mapping.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_comment")
@Data
@Audited
public class Comment extends BestEntity{
    private String text;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "comment", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Like> likes;
}
