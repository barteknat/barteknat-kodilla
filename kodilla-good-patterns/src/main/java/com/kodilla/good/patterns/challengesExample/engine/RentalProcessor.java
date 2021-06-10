package com.kodilla.good.patterns.challengesExample.engine;

import com.kodilla.good.patterns.challengesExample.model.RentRequest;
import com.kodilla.good.patterns.challengesExample.model.RentRequestRetriever;
import com.kodilla.good.patterns.challengesExample.model.RentalDto;
import com.kodilla.good.patterns.challengesExample.repository.RentalRepository;
import com.kodilla.good.patterns.challengesExample.service.InformationService;
import com.kodilla.good.patterns.challengesExample.service.RentalService;

public class RentalProcessor {

    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;

    public RentalProcessor(final InformationService informationService,
                           final RentalService rentalService,
                           final RentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public RentalDto process(final RentRequest rentRequest) {
        boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
        if(isRented) {
            rentalRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
            informationService.inform(rentRequest.getUser());
            return new RentalDto(rentRequest.getUser(), true);
        } else {
            return new RentalDto(rentRequest.getUser(), false);
        }

    }
}
