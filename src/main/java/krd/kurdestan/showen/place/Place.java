package krd.kurdestan.showen.place;


import lombok.Data;
import org.geolatte.geom.G2D;
import org.geolatte.geom.Point;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl-place")
@Audited
@Data
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;



    @Column(name = "titel")
    private  String titel;

    @Column(name = "address")
    private  String address;

    @Column(name = "star_service")
    private  String startService;

    @Column(name = "end_service")
    private  String endService;

    @Column(name = "location")
    private Point<G2D> location;




}
