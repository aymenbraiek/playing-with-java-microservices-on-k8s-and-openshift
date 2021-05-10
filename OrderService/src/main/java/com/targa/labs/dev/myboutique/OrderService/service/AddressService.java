package com.targa.labs.dev.myboutique.OrderService.service;

import com.targa.labs.dev.myboutique.OrderService.domain.Address;
import com.targa.labs.dev.myboutique.myboutique.commons.dto.AddressDto;



public class AddressService {

    public static AddressDto mapToDto(Address address) {
        if (address != null) {
            return new AddressDto(
                    address.getAddress1(),
                    address.getAddress2(),
                    address.getCity(),
                    address.getPostcode(),
                    address.getCountry()
            );
        }
        return null;
    }
}
