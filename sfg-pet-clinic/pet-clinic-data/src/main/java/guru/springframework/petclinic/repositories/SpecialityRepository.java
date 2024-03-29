package guru.springframework.petclinic.repositories;

import guru.springframework.petclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepository extends CrudRepository<Specialty, Long> {
}
