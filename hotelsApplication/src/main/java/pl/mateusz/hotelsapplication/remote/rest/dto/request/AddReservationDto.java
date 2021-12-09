package pl.mateusz.hotelsapplication.remote.rest.dto.request;

import pl.mateusz.hotelsapplication.remote.rest.dto.common.HotelReservationDto;
import pl.mateusz.hotelsapplication.remote.rest.dto.common.PersonReservationDto;

import java.util.List;

public class AddReservationDto {

    private List<HotelReservationDto> hotels;
    private PersonReservationDto person;

    public AddReservationDto() {
    }

    public AddReservationDto(List<HotelReservationDto> hotels, PersonReservationDto person) {
        this.hotels = hotels;
        this.person = person;
    }

    public List<HotelReservationDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelReservationDto> hotels) {
        this.hotels = hotels;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }
}