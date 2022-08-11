package com.cdi.com.Agroapoya2CDI.Controller;

import com.cdi.com.Agroapoya2CDI.Entity.CConductorEntity;
import com.cdi.com.Agroapoya2CDI.Entity.COfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.COfertaImagenModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.COfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CPersonasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.ConductorEntity;
import com.cdi.com.Agroapoya2CDI.Entity.EstadosOfertaEntity;
//import com.cdi.com.Agroapoya2CDI.Entity.EmailEntity;
import com.cdi.com.Agroapoya2CDI.Entity.INFOGENERALEntity;
import com.cdi.com.Agroapoya2CDI.Entity.JornadasOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.ListasDatosBancoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.MV_AGRO_VALIDACODIGOEntity;
import com.cdi.com.Agroapoya2CDI.Entity.MV_INSERT_AGRO_PERSONASVDOSEntity;
import com.cdi.com.Agroapoya2CDI.Entity.ProductoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.SELECT_MNCPIOEntity;
import com.cdi.com.Agroapoya2CDI.Entity.Select_TipoDocumentoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.TipoViasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.UploadFileResponse;
import com.cdi.com.Agroapoya2CDI.Entity.cliente_select_ofertasNuevasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.conductorModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.consultaProductoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.imagenesOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.listaCondicionEntity;
import com.cdi.com.Agroapoya2CDI.Entity.listaEmpaqueEntity;
import com.cdi.com.Agroapoya2CDI.Entity.listaTamanoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.menuEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_CiudadesActivasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_EnvioCorreoTransprtistaViejeEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_infoBasicaUsuarioEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_listaSectoresConOfertasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_pa_cliente_select_ofertasNuevasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.productosEntity;
import com.cdi.com.Agroapoya2CDI.Entity.tipo_carro_carroceriaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.tipo_carro_pesoEntity;
import com.cdi.com.Agroapoya2CDI.ServiceImplementacion.FileStorageException;
import com.cdi.com.Agroapoya2CDI.ServiceImplementacion.FileStorageService;
import com.cdi.com.Agroapoya2CDI.Services.CALCULADORA_VALORPAGOService;
import com.cdi.com.Agroapoya2CDI.Services.CConductorService;
import com.cdi.com.Agroapoya2CDI.Services.COfertaImagenModService;
import com.cdi.com.Agroapoya2CDI.Services.COfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.COfertaService;
import com.cdi.com.Agroapoya2CDI.Services.CPersonasService;
import com.cdi.com.Agroapoya2CDI.Services.ConductorService;
import com.cdi.com.Agroapoya2CDI.Services.EstadosOfertaService;
//import com.cdi.com.Agroapoya2CDI.Services.EmailService;
import com.cdi.com.Agroapoya2CDI.Services.INFOGENERALService;
import com.cdi.com.Agroapoya2CDI.Services.JornadasOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.ListasDatosBancoService;
import com.cdi.com.Agroapoya2CDI.Services.MV_AGRO_VALIDACODIGOService;
import com.cdi.com.Agroapoya2CDI.Services.cliente_select_ofertasNuevasService;
import com.cdi.com.Agroapoya2CDI.Services.mv_CiudadesActivasService;
import com.cdi.com.Agroapoya2CDI.Services.mv_infoBasicaUsuarioService;
import com.cdi.com.Agroapoya2CDI.Services.mv_listaSectoresConOfertasService;
import com.cdi.com.Agroapoya2CDI.Services.mv_pa_cliente_select_ofertasNuevasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.cdi.com.Agroapoya2CDI.Services.MV_INSERT_AGRO_PERSONASVDOSService;
import com.cdi.com.Agroapoya2CDI.Services.ProductoService;
import com.cdi.com.Agroapoya2CDI.Services.SELECT_MNCPIOService;
import com.cdi.com.Agroapoya2CDI.Services.Select_TipoDocumentoService;
import com.cdi.com.Agroapoya2CDI.Services.TipoViasService;
import com.cdi.com.Agroapoya2CDI.Services.codigoPersonaModService;
import com.cdi.com.Agroapoya2CDI.Services.conductorModService;
import com.cdi.com.Agroapoya2CDI.Services.consultaProductoService;
import com.cdi.com.Agroapoya2CDI.Services.imagenesOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.listaCondicionService;
import com.cdi.com.Agroapoya2CDI.Services.listaEmpaqueService;
import com.cdi.com.Agroapoya2CDI.Services.listaTamanoService;
import com.cdi.com.Agroapoya2CDI.Services.menuService;
import com.cdi.com.Agroapoya2CDI.Services.mv_EnvioCorreoTransprtistaViejeService;
import com.cdi.com.Agroapoya2CDI.Services.productosService;
import com.cdi.com.Agroapoya2CDI.Services.tipo_carro_carroceriaService;
import com.cdi.com.Agroapoya2CDI.Services.tipo_carro_pesoService;
import java.io.File;
import java.io.IOException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/", produces = "application/json", method = {RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH})
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH, RequestMethod.DELETE})

public class Controller {

    @Autowired
    INFOGENERALService serviceINFOGENERALService;

    @Autowired
    cliente_select_ofertasNuevasService servicecliente_select_ofertasNuevasService;

    @Autowired
    mv_listaSectoresConOfertasService servicemv_listaSectoresConOfertasService;

    @Autowired
    mv_CiudadesActivasService servicemv_CiudadesActivasService;

    @Autowired
    mv_infoBasicaUsuarioService servicemv_infoBasicaUsuarioService;

    @Autowired
    mv_pa_cliente_select_ofertasNuevasService servicemv_pa_cliente_select_ofertasNuevasService;

    @Autowired
    MV_INSERT_AGRO_PERSONASVDOSService serviceINSERT_AGRO_PERSONASVDOSService;

    @Autowired
    SELECT_MNCPIOService serviceSELECT_MNCPIOService;

    @Autowired
    Select_TipoDocumentoService serviceSelect_TipoDocumentoService;

    @Autowired
    MV_AGRO_VALIDACODIGOService serviceMV_AGRO_VALIDACODIGOService;

    @Autowired
    CALCULADORA_VALORPAGOService serviceCALCULADORA_VALORPAGOService;

    @Autowired
    mv_EnvioCorreoTransprtistaViejeService servicemv_EnvioCorreoTransprtistaViejeService;

    @Autowired
    productosService serviceproductosService;

    @Autowired
    listaEmpaqueService servicelistaEmpaqueService;

    @Autowired
    listaCondicionService servicelistaCondicionService;

    @Autowired
    listaTamanoService servicelistaTamanoService;

    @Autowired
    private FileStorageService fileStorageService;

    @Autowired
    imagenesOfertaService serviceimagenesOfertaService;

    @Autowired
    COfertaModService serviceCOfertaModService;

    @Autowired
    consultaProductoService serviceconsultaProductoService;

    @Autowired
    COfertaService serviceCOfertaService;

    @Autowired
    COfertaImagenModService serviceCOfertaImagenModService;

    @Autowired
    ListasDatosBancoService serviceListasDatosBancoService;

    @Autowired
    TipoViasService serviceTipoViasService;

    @Autowired
    CPersonasService serviceCPersonasService;

    @Autowired
    EstadosOfertaService serviceEstadosOfertaService;

//    @Autowired
//    EmailService serviceEmailService;
    @Autowired
    JornadasOfertaService serviceJornadasOfertaService;

    @Autowired
    ProductoService serviceProductoService;

    @Autowired
    codigoPersonaModService servicecodigoPersonaModService;

    @Autowired
    menuService servicemenuService;

    @Autowired
    tipo_carro_carroceriaService servicetipo_carro_carroceriaService;

    @Autowired
    tipo_carro_pesoService servicetipo_carro_pesoService;

    @Autowired
    conductorModService serviceconductorModService;

    @Autowired
    ConductorService serviceConductorService;

    @Autowired
    CConductorService serviceCConductorService;

    @GetMapping("/consultainfogeneral/{ID}/{subId}")
    public List<INFOGENERALEntity> ConsultaInfoGeneral(
            @PathVariable Integer ID,
            @PathVariable Integer subId) {
        return serviceINFOGENERALService.ConsultaInfoGeneral(ID, subId);
    }

    @GetMapping("/consclientselectofert/{US_CLIENTE}")
    public List<cliente_select_ofertasNuevasEntity> ConsultaClienteSelectOfertas(
            @PathVariable Integer US_CLIENTE) {
        return servicecliente_select_ofertasNuevasService.ConsultaClienteSelectOfertas(US_CLIENTE);
    }

    @GetMapping("/conslistsctoroferts/{bandera}/{ciudad}")
    public List<mv_listaSectoresConOfertasEntity> ConsultaListSctorsOferts(
            @PathVariable Integer bandera,
            @PathVariable Integer ciudad) {
        return servicemv_listaSectoresConOfertasService.ConsultaListSctorsOferts(bandera, ciudad);
    }

    @GetMapping("/consciudadesactivs/{bandera}")
    public List<mv_CiudadesActivasEntity> ConsultaCiudadesActivs(
            @PathVariable Integer bandera) {
        return servicemv_CiudadesActivasService.ConsultaCiudadesActivs(bandera);
    }

    @PostMapping("/consinfobascuser/{bandera}")
    public List<mv_infoBasicaUsuarioEntity> ConsultaInfoBascUser(
            @RequestBody mv_infoBasicaUsuarioEntity entidad,
            @PathVariable Integer bandera) {
        return servicemv_infoBasicaUsuarioService.ConsultaInfoBascUser(entidad, bandera);
    }

    @GetMapping("/consclientofertnew/{US_CLIENTE}/{TIPOCOMPRA}/{NOMBRE}/{ID_SECTOR}/{CD_MNCPIO}")
    public List<mv_pa_cliente_select_ofertasNuevasEntity> ConsultaClientOfertNew(
            @PathVariable Integer US_CLIENTE,
            @PathVariable Integer TIPOCOMPRA,
            @PathVariable String NOMBRE,
            @PathVariable Integer ID_SECTOR,
            @PathVariable Integer CD_MNCPIO) {
        return servicemv_pa_cliente_select_ofertasNuevasService.ConsultaClientOfertNew(US_CLIENTE, TIPOCOMPRA, NOMBRE, ID_SECTOR, CD_MNCPIO);
    }

    @PostMapping("/insertagroprsnasvdos/{bandera}/{codUsuario}")
    public String InsertAgroPrsnasvdos(
            @RequestBody MV_INSERT_AGRO_PERSONASVDOSEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable Integer codUsuario) {
        return serviceINSERT_AGRO_PERSONASVDOSService.InsertAgroPrsnasvdos(entidad, bandera, codUsuario);
    }

    @GetMapping("/consultmncpio/{CD_RGION}")
    public List<SELECT_MNCPIOEntity> ConsultaMNCPIO(
            @PathVariable Integer CD_RGION) {
        return serviceSELECT_MNCPIOService.ConsultaMNCPIO(CD_RGION);
    }

    @GetMapping("/constipodocumento/{Bandera}")
    public List<Select_TipoDocumentoEntity> ConsultaSelectTpoDocumento(
            @PathVariable Integer Bandera) {
        return serviceSelect_TipoDocumentoService.ConsultaSelectTpoDocumento(Bandera);
    }

    @GetMapping("/consagrovalidacodigo/{BANDERA}/{CODIGO}/{CODIGODOS}/{UNIDADES}")
    public List<MV_AGRO_VALIDACODIGOEntity> ConsultaAgroValidaCod(
            @PathVariable Integer BANDERA,
            @PathVariable Integer CODIGO,
            @PathVariable String CODIGODOS,
            @PathVariable Integer UNIDADES) {
        return serviceMV_AGRO_VALIDACODIGOService.ConsultaAgroValidaCod(BANDERA, CODIGO, CODIGODOS, UNIDADES);
    }

    @GetMapping("/conscalvalorpagos/{TIPOCOMPRA}/{CD_CNSCTVO}/{CD_UNDAD}/{USUCODIG}/{Descarga}/{Bandera}")
    public String ConsultaValorPago(
            @PathVariable Integer TIPOCOMPRA,
            @PathVariable Integer CD_CNSCTVO,
            @PathVariable Integer CD_UNDAD,
            @PathVariable Integer USUCODIG,
            @PathVariable Integer Descarga,
            @PathVariable Integer Bandera) {
        return serviceCALCULADORA_VALORPAGOService.ConsultaValorPago(TIPOCOMPRA, CD_CNSCTVO, CD_UNDAD, USUCODIG, Descarga, Bandera);
    }

    @GetMapping("/consenviocorreotransviaje/{id_trans}/{consecutico}")
    public List<mv_EnvioCorreoTransprtistaViejeEntity> ConsultaEnvioCorreoTransptsta(
            @PathVariable Integer id_trans,
            @PathVariable Integer consecutico) {
        return servicemv_EnvioCorreoTransprtistaViejeService.ConsultaEnvioCorreoTransptsta(id_trans, consecutico);
    }

    @GetMapping("/consproductos/{bandera}")
    public List<productosEntity> ConsultaProducto(
            @PathVariable Integer bandera) {
        return serviceproductosService.ConsultaProductos(bandera);
    }

    @GetMapping("/conslistempaque/{producto}")
    public List<listaEmpaqueEntity> ConsultaListaEmpaque(
            @PathVariable Integer producto) {
        return servicelistaEmpaqueService.ConsultaListaEmpaque(producto);
    }

    @GetMapping("/conslistcondicion/{producto}")
    public List<listaCondicionEntity> ConsultaListaCondicion(
            @PathVariable Integer producto) {
        return servicelistaCondicionService.ConsultaListaCondicion(producto);
    }

    @GetMapping("/conslistamano/{producto}")
    public List<listaTamanoEntity> ConsultaListatamano(
            @PathVariable Integer producto) {
        return servicelistaTamanoService.ConsultaListaTamano(producto);
    }

    //SUBIR IMAGENES
    @PostMapping("/uploadFile")
    public String uploadFiles(@RequestParam("file") MultipartFile file) {
        String fileName = null;
        try {
            fileName = fileStorageService.storeFile(file);
        } catch (FileStorageException ex) {
            System.out.println("Error " + ex);
        }
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/ImagenesAgroapoya2/")
                .path(fileName)
                .toUriString();
        fileDownloadUri = fileDownloadUri.replace(":8089/ImagenesAgroapoya2", "");
        try {
            file.transferTo(new File("C:/inetpub/wwwroot/ImagenesAgroapoya2/" + fileName));
        } catch (IOException | IllegalStateException ex) {
            System.out.println("Error " + ex);
        }
        UploadFileResponse uploadfile = new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
        uploadfile.getFileDownloadUri();
        return JSONObject.quote("Archivo Subido Correctamente");
    }

    @GetMapping("/consimagenoferta/{Bandera}/{cd_cnsctivo}")
    public List<imagenesOfertaEntity> ConsultaImageOferta(
            @PathVariable Integer Bandera,
            @PathVariable Integer cd_cnsctivo) {
        return serviceimagenesOfertaService.ConsultaImageOferta(Bandera, cd_cnsctivo);
    }

    @PostMapping("/cofertamod/{bandera}/{ID_EMPAQUE}")
    public String InAcCOfertaMod(
            @RequestBody COfertaModEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable String ID_EMPAQUE) {
        return serviceCOfertaModService.InAcCOfertaMod(entidad, bandera, ID_EMPAQUE);
    }

    @GetMapping("/conscproducto/{cd_consecutivo}")
    public List<consultaProductoEntity> ConsultacProducto(
            @PathVariable Integer cd_consecutivo) {
        return serviceconsultaProductoService.ConsultaProducto(cd_consecutivo);
    }

    @GetMapping("/conscoferta/{bandera}/{CD_CNSCTVO}")
    public List<COfertaEntity> ConsultaCOferta(
            @PathVariable Integer bandera,
            @PathVariable String CD_CNSCTVO) {
        return serviceCOfertaService.ConsultaCOferta(bandera, CD_CNSCTVO);
    }

    @PostMapping("/actcofertaimagenmod/{bandera}")
    public String ActualizaCOfertaImagenMod(
            @RequestBody COfertaImagenModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCOfertaImagenModService.ActualizaCOfertaImagenMod(entidad, bandera);
    }

    @GetMapping("/conslistdatobanco/{Bandera}")
    public List<ListasDatosBancoEntity> ConsultaListasDatosBanco(
            @PathVariable Integer Bandera) {
        return serviceListasDatosBancoService.ConsultaListasDatosBanco(Bandera);
    }

    @GetMapping("/constipovias/{Bandera}")
    public List<TipoViasEntity> ConsultaTipoVias(
            @PathVariable Integer Bandera) {
        return serviceTipoViasService.ConsultaTipoVias(Bandera);
    }

    @PostMapping("/conscpersons/{bandera}/{TipoPersona}")
    public List<CPersonasEntity> ConsultaCPersonas(
            @RequestBody CPersonasEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable String TipoPersona) {
        return serviceCPersonasService.ConsultaCPersonas(entidad, bandera, TipoPersona);
    }

    //RECUPERACION CONTRASEÑA - ENVIO DE CORREO
//    @PostMapping(value = "/send")
//    @ResponseBody
//    public String SendEmail(@RequestBody EmailEntity emailBody) {
//        return serviceEmailService.sendEmail(emailBody);
//    }
    @GetMapping("/consestadosofertas/{prmtro}")
    public List<EstadosOfertaEntity> ConsultaEstadoOfertas(
            @PathVariable Integer prmtro) {
        return serviceEstadosOfertaService.ConsultaEstadoOfertas(prmtro);
    }

    @GetMapping("/consjorndofertas/{prmtro}")
    public List<JornadasOfertaEntity> ConsultaJornadaOferta(
            @PathVariable Integer prmtro) {
        return serviceJornadasOfertaService.ConsultaJornadaOferta(prmtro);
    }

    @PostMapping("/consproducto/{bandera}")
    public List<ProductoEntity> ConsultaProducto(
            @RequestBody ProductoEntity entidad,
            @PathVariable Integer bandera) {
        return serviceProductoService.ConsultaProducto(entidad, bandera);
    }

    @GetMapping("/actcodigopersona/{bandera}")
    public String ActualizaCodigoPersona(
            @PathVariable Integer bandera) {
        return servicecodigoPersonaModService.ActualizaCodigoPersona(bandera);
    }

    @GetMapping("/consmenu/{Bandera}/{IdTipoUsuario}")
    public List<menuEntity> ConsultaMenu(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdTipoUsuario) {
        return servicemenuService.ConsultaMenu(Bandera, IdTipoUsuario);
    }

    @GetMapping("/constpocarcarroceria/{bandera}")
    public List<tipo_carro_carroceriaEntity> ConsultaTipoCarroCarroceria(
            @PathVariable Integer bandera) {
        return servicetipo_carro_carroceriaService.ConsultaTipoCarroCarroceria(bandera);
    }

    @GetMapping("/constipocarropeso/{bandera}")
    public List<tipo_carro_pesoEntity> ConsultaTipoCarroPeso(
            @PathVariable Integer bandera) {
        return servicetipo_carro_pesoService.ConsultaTipoCarroPeso(bandera);
    }

    @PostMapping("/conductormod/{bandera}/{id_carroceria}/{id_pesoCargaCarro}")
    public String ConductorMod(
            @RequestBody conductorModEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable Integer id_carroceria,
            @PathVariable Integer id_pesoCargaCarro) {
        return serviceconductorModService.ConductorMod(entidad, bandera, id_carroceria, id_pesoCargaCarro);
    }

    @PostMapping("/consconductor/{bandera}/{Cd_cnsctivo}/{CODIGO_TRANS}/{CD_PAIS}/{CD_RGION}/{CD_MNCPIO}")
    public List<ConductorEntity> ConsultaConductor(
            @RequestBody ConductorEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable Integer Cd_cnsctivo,
            @PathVariable Integer CODIGO_TRANS,
            @PathVariable Integer CD_PAIS,
            @PathVariable Integer CD_RGION,
            @PathVariable Integer CD_MNCPIO) {
        return serviceConductorService.ConsultaConductor(entidad, bandera, Cd_cnsctivo, CODIGO_TRANS, CD_PAIS, CD_RGION, CD_MNCPIO);
    }

    @PostMapping("/conscconductor/{bandera}")
    public List<CConductorEntity> ConsultaCConductor(
            @RequestBody CConductorEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCConductorService.ConsultaCConductor(entidad, bandera);
    }
}
