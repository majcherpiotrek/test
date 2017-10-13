package com.ksm.robolo.roboloapp.services.util.impl;

import com.ksm.robolo.roboloapp.domain.AddressEntity;
import com.ksm.robolo.roboloapp.services.util.EntityToTOConverter;
import com.ksm.robolo.roboloapp.tos.AddressTO;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressEntityToTOConverterTest {

    private EntityToTOConverter addressConverter;

    @Test
    public void convertAddressEntityToAddressToTest() throws Exception {

        addressConverter = new AddressEntityToTOConverter();

        // Create address entity
        final AddressEntity addressEntity = new AddressEntity();
        long id = 1L;
        addressEntity.setId(id);
        String street = "street";
        addressEntity.setStreet(street);
        String number = "number";
        addressEntity.setHouseNumber(number);
        String apartmentNumber = "apart number";
        addressEntity.setApartmentNumber(apartmentNumber);
        String city = "city";
        addressEntity.setCity(city);
        String postCode = "post code";
        addressEntity.setPostCode(postCode);
        String country = "country";
        addressEntity.setCountry(country);

        AddressTO addressTO = (AddressTO) addressConverter.convertToTO(addressEntity);

        assertEquals(street, addressTO.getStreet());
        assertEquals(number, addressTO.getHouseNumber());
        assertEquals(apartmentNumber, addressTO.getApartmentNumber());
        assertEquals(city, addressTO.getCity());
        assertEquals(postCode, addressTO.getPostCode());
        assertEquals(country, addressTO.getCountry());
    }
}