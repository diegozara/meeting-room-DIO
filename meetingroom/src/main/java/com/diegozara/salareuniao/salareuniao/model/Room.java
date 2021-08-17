package com.diegozara.salareuniao.salareuniao.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="meetingroom")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date", nullable = false)
    private String date;

    @Column(name = "starHour", nullable = false)
    private String startHour;

    @Column(name = "endHour", nullable = false)
    private String endHour;


    @Override
    public String toString() {
        return "Room [id = "+id+", name = "+name+ ", startHour = "+startHour+", endHour = "+endHour+"]";
    }
}
