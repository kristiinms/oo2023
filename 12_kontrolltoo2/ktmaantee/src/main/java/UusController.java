package com.example.ktmaantee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/maantee")
public class UusController {

    @Autowired
    private MaanteeRepository maanteeRepository;

    @PostMapping("/maanteed")
    public Maantee lisaMaantee(@RequestBody Maantee maantee) {
        return maanteeRepository.save(maantee);
    }

    @PostMapping("/maanteed/{maanteeId}/soidukid")
    public Soiduk lisaSoiduk(@PathVariable int maanteeId, @RequestBody Soiduk soiduk) {
        Maantee maantee = maanteeRepository.findById(maanteeId)
                .orElseThrow(() -> new RuntimeException("Maanteed ei leitud"));

        soiduk.setMaantee(maantee);
        maantee.getMaanteeSoidukid().add(soiduk);
        maanteeRepository.save(maantee);

        return soiduk;
    }

    @GetMapping("/maanteed/{maanteeId}/soidukid")
    public List<Soiduk> getMaanteeSoidukid(@PathVariable int maanteeId) {
        Maantee maantee = maanteeRepository.findById(maanteeId)
                .orElseThrow(() -> new RuntimeException("Maanteed ei leitud"));

        return maantee.getMaanteeSoidukid();
    }




}