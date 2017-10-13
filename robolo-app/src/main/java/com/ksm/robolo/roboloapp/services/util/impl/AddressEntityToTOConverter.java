package com.ksm.robolo.roboloapp.services.util.impl;

import com.ksm.robolo.roboloapp.domain.AddressEntity;
import com.ksm.robolo.roboloapp.services.util.EntityToTOConverter;
import com.ksm.robolo.roboloapp.tos.AddressTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.util.List;

public class AddressEntityToTOConverter implements EntityToTOConverter<AddressTO, AddressEntity> {

    @Override
    public AddressTO convertToTO(AddressEntity entity) {
        Assert.notNull(entity, NULL_ARGUMENT_ERROR);
        AddressTO addressTO = new AddressTO();
        addressTO.setStreet(entity.getStreet());
        addressTO.setHouseNumber(entity.getHouseNumber());
        addressTO.setApartmentNumber(entity.getApartmentNumber());
        addressTO.setPostCode(entity.getPostCode());
        addressTO.setCity(entity.getCity());
        addressTO.setCountry(entity.getCountry());
        return addressTO;
    }

    @Override
    public List<AddressTO> convertListToTOList(List<AddressEntity> entityList) {
        return null;
    }
}
