package com.attendentinfo.attendentService;

import org.springframework.data.relational.core.mapping.event.BeforeConvertCallback;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class AttendantListner implements BeforeConvertCallback<Attendant> {

    @Override
    public Attendant onBeforeConvert(Attendant entity) {
        if (entity.getAttendentId() == null) {
            entity.setAttendentId(UUID.randomUUID().toString());
        }
        return entity;
    }


}