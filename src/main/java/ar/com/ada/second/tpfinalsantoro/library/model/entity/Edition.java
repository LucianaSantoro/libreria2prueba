package ar.com.ada.second.tpfinalsantoro.library.model.entity;


import ar.com.ada.second.tpfinalsantoro.library.model.mapper.converter.YearAttributeConverter;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "Edition")
public class Edition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String printingPlace;

    @Convert(converter = YearAttributeConverter.class)
    @Column(nullable = false)
    private Date year;

    @Column(nullable = false)
    private String publishingHouse;


}
