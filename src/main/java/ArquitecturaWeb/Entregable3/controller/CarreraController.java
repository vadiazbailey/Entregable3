package ArquitecturaWeb.Entregable3.controller;
import ArquitecturaWeb.Entregable3.models.Carrera;
import ArquitecturaWeb.Entregable3.service.CarreraService;
<<<<<<< HEAD
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
>>>>>>> ced471ec16627c399697b61804aff04f58dab644
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carreras")
public class CarreraController {
    @Autowired
    private CarreraService carreraService;

<<<<<<< HEAD
    @ApiOperation(value = "Esta consulta obtiene todas las carreras con estudiantes inscriptos, ordenada por cantidad de los mismos DESCENDENTEMENTE."
    , notes = "Ejemplo de uso: http://localhost:8080/carreras/all")
    /* @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successfully retrieved"),
        @ApiResponse(code = 404, message = "Not found - The product was not found")
      }) */
    @ResponseBody
    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
=======
    @RequestMapping("/all")
>>>>>>> ced471ec16627c399697b61804aff04f58dab644
    public List<Carrera> getAllCarrerasInscriptosOrdenadas() {
        return carreraService.findAllCarrerasOrdenadas();
    }

}
