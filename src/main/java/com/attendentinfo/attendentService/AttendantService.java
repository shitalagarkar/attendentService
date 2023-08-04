package com.attendentinfo.attendentService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AttendantService {
    private final AttendentRepository attendantRepo;
    private AttendentDB attendentDb ;

    public AttendantService(AttendentRepository attendantRepo) {
        attendentDb = AttendentDB.initiateDB();
        this.attendantRepo = attendantRepo;
    }

    public Attendant save (Attendant attendant) {
       //attendant.setAttendentId(UUID.randomUUID().toString());
        attendantRepo.save(attendant);
        return attendant;
    }


    public List<Attendant> getAllAttendants() {
        List<Attendant> allAttendantList = (List<Attendant>) attendantRepo.findAll();
        return allAttendantList;
    }

    public Attendant getAttendent(String id) {
        Attendant returnAttendant = null;
        Optional optionalReturn = attendantRepo.findById(id);
        if (optionalReturn.isPresent()) {
            returnAttendant = (Attendant) optionalReturn.get();
        }
        return returnAttendant;
    }

    public void deleteAttendant(String id) {
        attendantRepo.deleteById(id);

    }
}
