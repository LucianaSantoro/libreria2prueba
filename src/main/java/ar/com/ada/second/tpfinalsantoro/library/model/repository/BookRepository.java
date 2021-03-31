package ar.com.ada.second.tpfinalsantoro.library.model.repository;

import ar.com.ada.second.tpfinalsantoro.library.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    /*
    // queries nativas

    public Long countByName(String name);

    //JPQL -> preferible
    @Query("Select Count (b) from book where b.name = :nombre")
    public Long contarPorNombre(String nombre);

    //nativa (con signos de pregunta) -> inyeccion que permite robar datos
    @Query(value = "Select count (*) from book b where b.name = ?", nativeQuery = true)
    public Long contarPorNombreNativo(String nombre);

    // da errores si no están las mayus y minus. CaseSensitive - Pascal vs camel

     */

}
