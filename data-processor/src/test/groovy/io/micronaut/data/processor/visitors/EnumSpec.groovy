package io.micronaut.data.processor.visitors

class EnumSpec extends AbstractDataSpec {

    void "test handle enum type match"() {
        when:
        def repo = buildRepository('test.MyInterface', """

import io.micronaut.data.tck.entities.Pet;
import io.micronaut.data.tck.entities.Pet.PetType;

@Repository
interface MyInterface extends GenericRepository<Pet, Long> {

    Pet findByType(PetType type);
}
""")

        then:
        repo != null
    }
}
