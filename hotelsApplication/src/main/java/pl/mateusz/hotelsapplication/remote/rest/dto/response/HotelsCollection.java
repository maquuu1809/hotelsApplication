package pl.mateusz.hotelsapplication.remote.rest.dto.response;

import java.util.List;

public class HotelsCollection {

    private List<HotelDto> hotels;

    public HotelsCollection() {
    }

    public HotelsCollection(List<HotelDto> hotels) {
        this.hotels = hotels;
    }

    public List<HotelDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelDto> hotels) {
        this.hotels = hotels;
    }
}
