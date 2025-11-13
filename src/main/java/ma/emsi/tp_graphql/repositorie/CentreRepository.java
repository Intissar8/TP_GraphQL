package ma.emsi.tp_graphql.repositorie;

import ma.emsi.tp_graphql.model.Centre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CentreRepository extends JpaRepository<Centre,Long> {
}