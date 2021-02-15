package vip.yazilim.springboot.basics.restservice.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import vip.yazilim.springboot.basics.restservice.bean.Instrument;

/**
 * Example Rest Controller
 *
 * @author Emre Sen - Aug 9, 2018
 */
@RestController
public class InstrumentController {

    private final static List<Instrument> INSTRUMENT_LIST = new ArrayList<>(Arrays.asList(
            new Instrument(1, "Octo8978", "Switcahble"),
            new Instrument(2, "Octo9000", "Temprabure")
    ));

    /**
     * Endpoint to get list of instruments
     *
     * @return list of instruments
     */
    @GetMapping("/instruments")
    public List<Instrument> getAllInstruments() {
        return INSTRUMENT_LIST;
    }

    /**
     * Endpoint to get instrument by id
     *
     * @param id id of instrument will be selected
     * @return instrument with given id
     */
    @GetMapping("/instrument/{id}")
    public Instrument getInstrument(@PathVariable int id) {
        for (Instrument each : INSTRUMENT_LIST) {
            if (each.getId() == id) {
                return each;
            }
        }
        return null;
    }

}
