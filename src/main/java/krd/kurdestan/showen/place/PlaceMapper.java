package krd.kurdestan.showen.place;

import org.geolatte.geom.G2D;
import org.geolatte.geom.Geometries;
import org.geolatte.geom.Point;
import org.geolatte.geom.crs.CoordinateReferenceSystems;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PlaceMapper {

    @Mappings({
            @Mapping(source = "location", target = "location", qualifiedByName = "locationDtoToLocation")})
    Place toPlace(PlaceDTO placeDTO);

    @Mappings({
            @Mapping(source = "location", target = "location", qualifiedByName = "locationToLocationDTO")})
    PlaceDTO toPlaceDTO(Place place);

    List<PlaceDTO> toPlaceDTOS(List<Place> places);

    List<Place> toPlaces(List<PlaceDTO> placeDTOS);

    @Named("locationDtoToLocation")
    default Point<G2D> convertLocationDtoToLocation(LocationDTO locationDTO) {
        return Geometries.mkPoint(new G2D(locationDTO.getLng(), locationDTO.getLat()), CoordinateReferenceSystems.WGS84);
    }

    @Named("locationToLocationDTO")
    default LocationDTO convertLocationToLocationDTO(Point<G2D> point) {
        G2D g2D = point.getPosition();
        LocationDTO locationDTO = new LocationDTO();
        locationDTO.setLat(g2D.getLat());
        locationDTO.setLng(g2D.getLon());
        return locationDTO;
    }
}
