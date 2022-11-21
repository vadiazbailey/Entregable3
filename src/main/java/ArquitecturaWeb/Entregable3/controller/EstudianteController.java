package ArquitecturaWeb.Entregable3.controller;
import ArquitecturaWeb.Entregable3.models.Estudiante;
import ArquitecturaWeb.Entregable3.service.EstudianteService;
<<<<<<< HEAD
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

=======
>>>>>>> ced471ec16627c399697b61804aff04f58dab644
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    EstudianteService estudianteService;

<<<<<<< HEAD
    @ApiOperation(value = "Esta consulta POST, permite agregar un estudiante a la DB", 
    notes="Se debe enviar un JSON de Estudiante en el BODY. http://localhost:8080/estudiantes/agregar")
    

=======
>>>>>>> ced471ec16627c399697b61804aff04f58dab644
    @PostMapping(value="/agregar", produces="application/json", consumes="application/json")
    public Estudiante addStudent(@RequestBody Estudiante e){
        return estudianteService.save(e);
    }

<<<<<<< HEAD
    @ApiOperation(value = "Obtiene un estudiante mediante el numero de Libreta Universitaria", 
        notes = "Modo de uso: http://localhost:8080/estudiantes/{Libreta}")

    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Estudiante obtenido con exito"), 
        @ApiResponse(code = 404, message = "Estudiante no encontrado")})
    
    
=======
>>>>>>> ced471ec16627c399697b61804aff04f58dab644
    @RequestMapping(value = "/{lu}", method = RequestMethod.GET, produces = "application/json")
    public Estudiante getEstudianteByLU(@PathVariable Long lu){
        return estudianteService.findByLU(lu);
    }

<<<<<<< HEAD
    @ApiOperation(value = "Obtiene todos los estudiantes segun su genero de identidad",  
        notes = "Modo de uso: http://localhost:8080/estudiantes/genero/{x} con X = H ó M según corresponda")

=======
>>>>>>> ced471ec16627c399697b61804aff04f58dab644
    @RequestMapping(value = "/genero/{genero}", method = RequestMethod.GET, produces = "application/json")
    public List<Estudiante> getEstudiantesbyGenero(@PathVariable String genero){
        return estudianteService.findByGenero(genero);
    }

<<<<<<< HEAD
    @ApiOperation(value = "Obtiene todos los estudiantes ordenados por apellido, ASCENDENTEMENTE.",  
        notes = "Modo de uso: http://localhost:8080/estudiantes/apellido")

=======
>>>>>>> ced471ec16627c399697b61804aff04f58dab644
    @RequestMapping(value = "/apellido", method = RequestMethod.GET, produces = "application/json")
    public List<Estudiante> getEstudiantesbyApellido(){
        return estudianteService.findAllOrdenadoApellido();
    }

<<<<<<< HEAD
    @ApiOperation(value = "Obtiene todos los estudiantes de una determinada carrera, filtrando por ciudad de residencia.",  
        notes = "Modo de uso: http://localhost:8080/estudiantes/filtrar?carrera={C}&ciudad={CI} con C = carrera y CI = ciudad")
    @RequestMapping(value = "filtrar", params={"carrera","ciudad"}, method = RequestMethod.GET, produces = "application/json")
=======
    @RequestMapping(value = "/byCarreraCiudad", params={"carrera","ciudad"}, method = RequestMethod.GET, produces = "application/json")
>>>>>>> ced471ec16627c399697b61804aff04f58dab644
    public List<Estudiante> getEstudiantesbyCarreraYCiudad(@RequestParam Long carrera, @RequestParam String ciudad){
        return estudianteService.findByCarreraYCiudad(carrera, ciudad);
    }
}
