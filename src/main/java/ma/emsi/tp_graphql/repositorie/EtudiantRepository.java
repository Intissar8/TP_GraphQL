package ma.emsi.tp_graphql.repositorie;

import ma.emsi.tp_graphql.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long>
{
}
