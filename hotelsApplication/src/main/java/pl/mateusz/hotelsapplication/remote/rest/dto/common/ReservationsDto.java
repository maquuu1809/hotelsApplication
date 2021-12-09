package pl.mateusz.hotelsapplication.remote.rest.dto.common;

import pl.mateusz.hotelsapplication.domain.model.StatusType;

import java.util.List;

public class ReservationsDto {

    private Integer id;
    private StatusType ststus;
    private List<HotelReservationDto> rooms;
    private PersonReservationDto person;

    public ReservationsDto() {
    }

    public ReservationsDto(Integer id, StatusType ststus, List<HotelReservationDto> rooms, PersonReservationDto person) {
        this.id = id;
        this.ststus = ststus;
        this.rooms = rooms;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StatusType getStstus() {
        return ststus;
    }

    public void setStstus(StatusType ststus) {
        this.ststus = ststus;
    }

    public List<HotelReservationDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<HotelReservationDto> rooms) {
        this.rooms = rooms;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }
}