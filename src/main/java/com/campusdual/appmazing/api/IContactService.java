package com.campusdual.appmazing.api;

import com.campusdual.appmazing.model.dto.ContactDTO;

import java.util.List;

public interface IContactService {

    public ContactDTO queryContact (ContactDTO contact);
    List<ContactDTO> queryAllContacts();
    int insertContact (ContactDTO contact);
    int updateContact (ContactDTO contact);
    int deleteContact (ContactDTO contact);
}
