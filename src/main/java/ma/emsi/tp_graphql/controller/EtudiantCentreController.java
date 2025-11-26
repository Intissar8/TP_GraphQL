package ma.emsi.tp_graphql.controller;

import ma.emsi.tp_graphql.dto.EtudiantDTO;
import ma.emsi.tp_graphql.model.Centre;
import ma.emsi.tp_graphql.model.Etudiant;
import ma.emsi.tp_graphql.service.CentreService;
import ma.emsi.tp_graphql.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SubscriptionMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

import java.util.List;

@Controller
public class EtudiantCentreController {
    @Autowired
    EtudiantService etudiantService;
    @Autowired
    CentreService centreService;
    @QueryMapping
    public List<Centre> getAllCentres(){
        return centreService.getCentres();
    }
    @QueryMapping
    public List<Etudiant>getAllEtudiants(){
        return etudiantService.getStudents();
    }
    @QueryMapping
    public Centre getCentreById(@Argument Long  id){
        return centreService.getCentre(id);
    }
    @QueryMapping
    public Etudiant getEtudiantById(@Argument Long id){
        return etudiantService.getEtudiant(id);
    }
    @MutationMapping
    public Etudiant addEtudiant(@Argument EtudiantDTO etudiantDTO) {
        return etudiantService.addEtudiant(etudiantDTO);
    }
    @MutationMapping
    public String deleteEtudiant(@Argument Long id){
        return etudiantService.deleteEtudiant(id);
    }
    @MutationMapping
    public Etudiant updateEtudiant(@Argument Long id,@Argument EtudiantDTO etudiantDTO){
        return etudiantService.updateEtudiant(id,etudiantDTO);
    }
    @SubscriptionMapping
    public Flux<Etudiant> etudiantAdded() {
        return etudiantService.getEtudiantAdded();
    }
    @SubscriptionMapping
    public Flux<String> etudiantMoved() {
       return etudiantService.etudiantMoved();
    }
    }