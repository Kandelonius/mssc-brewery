package guru.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Data // getters and setters equals and hashcode methods
@NoArgsConstructor
@AllArgsConstructor
@Builder // implements the builder pattern pg 97 GOF Design Patterns book
public class BeerDto {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}
