package krd.kurdestan.showen.images;

import krd.kurdestan.showen.Common.BaseEntity;
import krd.kurdestan.showen.place.Place;
import krd.kurdestan.showen.user.User;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_like")
@Data
@Audited
public class Image extends BaseEntity {


    @NotNull
    @Column(name = "image")
    private String image;


    @OneToOne
    @JoinColumn(name = "user_id",unique = true)
    private User user;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;



}
