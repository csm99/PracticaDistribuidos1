package sd.practica1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sd.practica1.model.Autor;
import sd.practica1.model.Cliente;
import sd.practica1.model.Cuadro;

import java.util.Date;
import java.util.List;

public interface CuadroRepository extends JpaRepository<Cuadro, Integer> {
    Cuadro findByTitulo(String titulo);
    List<Cuadro> findByAnyoFinalizacion(int anyoFinalizacion);
    List<Cuadro> findByPrecio(int precio);
    List<Cuadro> findByDescripcionIgnoreCase(String descripcion);
    List<Cuadro> findByVendido(Boolean vendido);
    List<Cuadro> findByAutor(Autor autor);
    List<Cuadro> findByTituloContainsIgnoreCase(String titulo);
    List<Cuadro> findByComprador(Cliente cliente);
    List<Cuadro> findByFechaCompra(Date fecha);
}
