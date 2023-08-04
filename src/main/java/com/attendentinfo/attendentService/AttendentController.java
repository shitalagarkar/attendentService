package com.attendentinfo.attendentService;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.List;

@RestController
public class AttendentController {


    private final AttendantService attendentSrvc;

    public AttendentController(AttendantService attendentSrvc) {
        this.attendentSrvc = attendentSrvc;
    }

    @GetMapping("/")
    public String hello() {
        return " Hello from Attendent";
    }

    @GetMapping("/attendants")
    public List<Attendant> getListOfAttendents() {
        List<Attendant> attendantList;
        attendantList = attendentSrvc.getAllAttendants();
        if (null == attendantList) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
       /* List <Attendent>attendentList = new ArrayList<Attendent>();
        attendentList.add(new Attendent("ATD_1","Shital","Agarkar","PCMC"));
        attendentList.add(new Attendent("ATD_2","Anvi","Agarkar","SB Road"));
        attendentList.add(new Attendent("ATD_3","Tushar","Agarkar","PUNE"));*/
        return attendantList;
    }

    @GetMapping("/attendants/{id}")
    public Attendant get(@PathVariable String id) {
        Attendant attendant = attendentSrvc.getAttendent(id);
        //Attendent attendent =  attendentDb.getAttendent(id);
        if (null == attendant)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return attendant;
    }

    @DeleteMapping("/attendants/{id}")
    public void delete(@PathVariable String id) {
        //  Attendent deletedAttendent = attendentDb.removeAttendent(id);
         attendentSrvc.deleteAttendant(id);

    }

    @PostMapping("/attendants/")
    public void create( @RequestBody Attendant inputattendent) throws IOException {
        inputattendent = attendentSrvc.save(inputattendent);
    }

}