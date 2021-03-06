package person.biki.springmicroservices.msccbeerservice.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import person.biki.springmicroservices.msccbeerservice.web.model.BeerDto;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto) {
        //TODO: implement
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeer(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {
        //TODO: Implement
        return new ResponseEntity(HttpStatus.NO_CONTENT);

    }


}
