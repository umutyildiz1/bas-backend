package com.umutyildiz.Bas.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitiliazer","handler","auctionList"})
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int id;

    @NotBlank
    @Size(min=2, max=50)
    @Column(name = "category_name")
    private String name;

    @Size(min=2, max=50)
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Auction> auctionList;
}
