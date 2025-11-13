package ma.emsi.tp_graphql.dto;

import ma.emsi.tp_graphql.model.Centre;
import ma.emsi.tp_graphql.model.Etudiant;
import ma.emsi.tp_graphql.repositorie.CentreRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DtoToEtudiant {
    @Autowired
    CentreRepository centreRepository;
    public void toEtudiant(Etudiant et, EtudiantDTO dto) {
        Centre centre= centreRepository.findById(dto.centreId()).orElse(null);
        if (dto != null) {
            BeanUtils.copyProperties(dto,et);
            et.setCentre(centre);
        }
    }
}