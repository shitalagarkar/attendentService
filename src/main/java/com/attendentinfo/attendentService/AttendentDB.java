package com.attendentinfo.attendentService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AttendentDB {

    private Map <String, Attendant> attendent_DB;
    private static AttendentDB attendentDB;
    private AttendentDB() {
        attendent_DB =  new HashMap<String, Attendant> ();
        attendent_DB.put("ATD_1", new Attendant("ATD_1","Shital","Agarkar","PCMC") );
        attendent_DB.put("ATD_2",new Attendant("ATD_2","Anvi","Agarkar","SB Road") );
        attendent_DB.put("ATD_3",new Attendant("ATD_3","Tushar","Agarkar","PUNE") );
    }

    public static AttendentDB initiateDB () {

        if (null ==  attendentDB) {
            attendentDB = new AttendentDB();
        }
        return attendentDB;
    }

    public void populateDb ( Attendant atd)  {
        if (null == attendent_DB)
            throw new IllegalArgumentException("AttendedDB is not initiated");
        if ( null !=  atd) {
            attendent_DB.put(atd.getAttendentId(), atd);
        }
    }

    public Attendant getAttendent (String id) {
        Attendant atd = null;
        if (null !=  id) {
            atd =  attendent_DB.get(id);
        }
        return atd;
    }

    public List<Attendant> getAllAttendants () {
        List<Attendant> attendantList = null;
        attendantList = new ArrayList<Attendant>( attendent_DB.values());
        return attendantList;
    }

    public Attendant removeAttendent (String id) {
        Attendant removedAttendant = null;
        if (null != id) {
            removedAttendant = attendent_DB.remove(id);
        }
        return removedAttendant;
    }



}

