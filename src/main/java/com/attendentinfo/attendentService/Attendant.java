package com.attendentinfo.attendentService;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotBlank;

@Table("ATTENDANT")
public class Attendant {

  @Id
    private String attendantId;

    @NotBlank
    private String firstName;
    private String lastName;
    //private Photo attendent_photo;

    /*public Photo getAttendent_photo() {
        return attendent_photo;
    }

    public void setAttendent_photo(Photo attendent_photo) {
        this.attendent_photo = attendent_photo;
    }*/

    public String getAttendentId() {
        return attendantId;
    }

    public void setAttendentId(String id) {
        attendantId = id;
    }

    private String areaAvailable;

    public Attendant(String attendentId, String firstName, String lastName, String areaAvailable ) {
        this.attendantId = attendentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.areaAvailable = areaAvailable;

    }

    public Attendant() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAreaAvailable() {
        return areaAvailable;
    }

    public void setAreaAvailable(String areaAvailable) {
        this.areaAvailable = areaAvailable;
    }


}
