package com.cdi.com.Agroapoya2CDI.Controller;

import com.cdi.com.Agroapoya2CDI.Entity.AOfertasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.AestadoOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CAPlantillaCorreoModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CATipoCamposCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CAplantillaCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CCalculaPrecioFinGrupalEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CCalculaPrecioFinIndividualEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CCalculaPrecioFinMixtaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CCiudadDistribucionOfertEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CConductorEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CConductorSectorOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CConductorSectorOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CConsultaEstadoOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CCordenadasSectorEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CCordenadasSectorModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CDatosTransportistaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CDocumentoCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CDocumentoCorreoModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.COfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.COfertaImagenModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.COfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.COfertasNuevasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CPersonaTransEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CPersonasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CSectorConductorEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CSectorOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CSectorOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CTipoCosteoOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CTransportesNuevosEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CValoracionOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CValoracionOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CVigenciaOfertaEntoty;
import com.cdi.com.Agroapoya2CDI.Entity.CVigenciaOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CconductoresTransportesNuevosEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CiudadOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.ConductorEntity;
import com.cdi.com.Agroapoya2CDI.Entity.ConductorOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.ConductorSectorModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CorreoMomentoEnvioEntoty;
import com.cdi.com.Agroapoya2CDI.Entity.CosteoOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CosteoOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CpersonaCampesinoModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CpersonaClienteModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CpersonaTransportistaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CtipoMomentoEnvioEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CtipoPlantillaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.EmailEntity;
import com.cdi.com.Agroapoya2CDI.Entity.EstadosOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.INFOGENERALEntity;
import com.cdi.com.Agroapoya2CDI.Entity.JornadasOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.ListasDatosBancoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.MV_AGRO_VALIDACODIGOEntity;
import com.cdi.com.Agroapoya2CDI.Entity.MV_INSERT_AGRO_PERSONASVDOSEntity;
import com.cdi.com.Agroapoya2CDI.Entity.OfertasCarritoComprasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.OfertasHistorialEntity;
import com.cdi.com.Agroapoya2CDI.Entity.ProductoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.RemitenteCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.SELECT_MNCPIOEntity;
import com.cdi.com.Agroapoya2CDI.Entity.SectoresEntity;
import com.cdi.com.Agroapoya2CDI.Entity.SectoresModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.Select_TipoDocumentoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.TipoViasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.TokenTransModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.TransActivosEntity;
import com.cdi.com.Agroapoya2CDI.Entity.UploadFileResponse;
import com.cdi.com.Agroapoya2CDI.Entity.UsuarioAdminEntity;
import com.cdi.com.Agroapoya2CDI.Entity.cliente_select_ofertasNuevasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.conductorModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.consultaProductoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.entregasConductorEntity;
import com.cdi.com.Agroapoya2CDI.Entity.estadoEntregaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.evidenciaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.evidenciaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.imagenesOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.listaCondicionEntity;
import com.cdi.com.Agroapoya2CDI.Entity.listaEmpaqueEntity;
import com.cdi.com.Agroapoya2CDI.Entity.listaTamanoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.loginClienteEntity;
import com.cdi.com.Agroapoya2CDI.Entity.loginTransEntity;
import com.cdi.com.Agroapoya2CDI.Entity.menuEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_CiudadesActivasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_EnvioCorreoTransprtistaViejeEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_infoBasicaUsuarioEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_listaSectoresConOfertasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.productosEntity;
import com.cdi.com.Agroapoya2CDI.Entity.tipo_carro_carroceriaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.tipo_carro_pesoEntity;
import com.cdi.com.Agroapoya2CDI.ServiceImplementacion.FileStorageException;
import com.cdi.com.Agroapoya2CDI.ServiceImplementacion.FileStorageService;
import com.cdi.com.Agroapoya2CDI.Services.AOfertasService;
import com.cdi.com.Agroapoya2CDI.Services.AestadoOfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.CALCULADORA_VALORPAGOService;
import com.cdi.com.Agroapoya2CDI.Services.CAPlantillaCorreoModService;
import com.cdi.com.Agroapoya2CDI.Services.CATipoCamposCorreoService;
import com.cdi.com.Agroapoya2CDI.Services.CAplantillaCorreoService;
import com.cdi.com.Agroapoya2CDI.Services.CCalculaPrecioFinGrupalService;
import com.cdi.com.Agroapoya2CDI.Services.CCalculaPrecioFinIndividualService;
import com.cdi.com.Agroapoya2CDI.Services.CCalculaPrecioFinMixtaService;
import com.cdi.com.Agroapoya2CDI.Services.CCiudadDistribucionOfertService;
import com.cdi.com.Agroapoya2CDI.Services.CConductorSectorOfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.CConductorSectorOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.CConductorService;
import com.cdi.com.Agroapoya2CDI.Services.CConsultaEstadoOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.CCordenadasSectorModService;
import com.cdi.com.Agroapoya2CDI.Services.CCordenadasSectorService;
import com.cdi.com.Agroapoya2CDI.Services.CDatosTransportistaService;
import com.cdi.com.Agroapoya2CDI.Services.CDocumentoCorreoModService;
import com.cdi.com.Agroapoya2CDI.Services.CDocumentoCorreoService;
import com.cdi.com.Agroapoya2CDI.Services.CEnvioRealCorreoService;
import com.cdi.com.Agroapoya2CDI.Services.COfertaImagenModService;
import com.cdi.com.Agroapoya2CDI.Services.COfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.COfertaService;
import com.cdi.com.Agroapoya2CDI.Services.COfertasNuevasService;
import com.cdi.com.Agroapoya2CDI.Services.CPersonaTransService;
import com.cdi.com.Agroapoya2CDI.Services.CPersonasService;
import com.cdi.com.Agroapoya2CDI.Services.CSectorConductorService;
import com.cdi.com.Agroapoya2CDI.Services.CSectorOfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.CSectorOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.CTipoCosteoOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.CTransportesNuevosService;
import com.cdi.com.Agroapoya2CDI.Services.CValidaCambioEtapaService;
import com.cdi.com.Agroapoya2CDI.Services.CValoracionOfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.CValoracionOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.CVigenciaOfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.CVigenciaOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.CconductoresTransportesNuevosService;
import com.cdi.com.Agroapoya2CDI.Services.CiudadOfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.ConductorOfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.ConductorSectorModService;
import com.cdi.com.Agroapoya2CDI.Services.ConductorService;
import com.cdi.com.Agroapoya2CDI.Services.CorreoMomentoEnvioService;
import com.cdi.com.Agroapoya2CDI.Services.CosteoOfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.CosteoOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.CpersonaCampesinoModService;
import com.cdi.com.Agroapoya2CDI.Services.CpersonaClienteModService;
import com.cdi.com.Agroapoya2CDI.Services.CpersonaTransportistaModService;
import com.cdi.com.Agroapoya2CDI.Services.CtipoMomentoEnvioService;
import com.cdi.com.Agroapoya2CDI.Services.CtipoPlantillaService;
import com.cdi.com.Agroapoya2CDI.Services.EnvioCorreo_IndividualService;
import com.cdi.com.Agroapoya2CDI.Services.EstadosOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.INFOGENERALService;
import com.cdi.com.Agroapoya2CDI.Services.JornadasOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.ListasDatosBancoService;
import com.cdi.com.Agroapoya2CDI.Services.MV_AGRO_VALIDACODIGOService;
import com.cdi.com.Agroapoya2CDI.Services.cliente_select_ofertasNuevasService;
import com.cdi.com.Agroapoya2CDI.Services.mv_CiudadesActivasService;
import com.cdi.com.Agroapoya2CDI.Services.mv_infoBasicaUsuarioService;
import com.cdi.com.Agroapoya2CDI.Services.mv_listaSectoresConOfertasService;
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
import com.cdi.com.Agroapoya2CDI.Services.OfertasCarritoComprasService;
import com.cdi.com.Agroapoya2CDI.Services.OfertasHistorialService;
import com.cdi.com.Agroapoya2CDI.Services.OlvidoClaveService;
import com.cdi.com.Agroapoya2CDI.Services.ProductoService;
import com.cdi.com.Agroapoya2CDI.Services.RemitenteCorreoService;
import com.cdi.com.Agroapoya2CDI.Services.SELECT_MNCPIOService;
import com.cdi.com.Agroapoya2CDI.Services.SectoresModService;
import com.cdi.com.Agroapoya2CDI.Services.SectoresService;
import com.cdi.com.Agroapoya2CDI.Services.Select_TipoDocumentoService;
import com.cdi.com.Agroapoya2CDI.Services.TipoViasService;
import com.cdi.com.Agroapoya2CDI.Services.TokenTransModService;
import com.cdi.com.Agroapoya2CDI.Services.TransActivosService;
import com.cdi.com.Agroapoya2CDI.Services.UsuarioAdminService;
import com.cdi.com.Agroapoya2CDI.Services.codigoPersonaModService;
import com.cdi.com.Agroapoya2CDI.Services.conductorModService;
import com.cdi.com.Agroapoya2CDI.Services.consultaProductoService;
import com.cdi.com.Agroapoya2CDI.Services.entregasConductorService;
import com.cdi.com.Agroapoya2CDI.Services.estadoEntregaService;
import com.cdi.com.Agroapoya2CDI.Services.evidenciaModService;
import com.cdi.com.Agroapoya2CDI.Services.evidenciaService;
import com.cdi.com.Agroapoya2CDI.Services.imagenesOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.listaCondicionService;
import com.cdi.com.Agroapoya2CDI.Services.listaEmpaqueService;
import com.cdi.com.Agroapoya2CDI.Services.listaTamanoService;
import com.cdi.com.Agroapoya2CDI.Services.loginClienteService;
import com.cdi.com.Agroapoya2CDI.Services.loginTransService;
import com.cdi.com.Agroapoya2CDI.Services.menuService;
import com.cdi.com.Agroapoya2CDI.Services.mv_EnvioCorreoTransprtistaViejeService;
import com.cdi.com.Agroapoya2CDI.Services.productosService;
import com.cdi.com.Agroapoya2CDI.Services.tipo_carro_carroceriaService;
import com.cdi.com.Agroapoya2CDI.Services.tipo_carro_pesoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
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

    @Autowired
    SectoresService serviceSectoresService;

    @Autowired
    CSectorOfertaModService serviceCSectorOfertaModService;

    @Autowired
    CSectorOfertaService serviceCSectorOfertaService;

    @Autowired
    CConductorSectorOfertaModService serviceCConductorSectorOfertaModService;

    @Autowired
    CCiudadDistribucionOfertService serviceCCiudadDistribucionOfertService;

    @Autowired
    SectoresModService serviceSectoresModService;

    @Autowired
    AOfertasService serviceAOfertasService;

    @Autowired
    AestadoOfertaModService serviceAestadoOfertaModService;

    @Autowired
    TransActivosService serviceTransActivosService;

    @Autowired
    evidenciaModService serviceevidenciaModService;

    @Autowired
    CConductorSectorOfertaService serviceCConductorSectorOfertaService;

    @Autowired
    estadoEntregaService serviceestadoEntregaService;

    @Autowired
    entregasConductorService serviceentregasConductorService;

    @Autowired
    evidenciaService serviceevidenciaService;

    @Autowired
    CiudadOfertaModService serviceCiudadOfertaModService;

    @Autowired
    CValoracionOfertaModService serviceCValoracionOfertaModService;

    @Autowired
    CValoracionOfertaService serviceCValoracionOfertaService;

    @Autowired
    EnvioCorreo_IndividualService serviceEnvioCorreo_IndividualService;

    @Autowired
    RemitenteCorreoService serviceRemitenteCorreoService;

    @Autowired
    CEnvioRealCorreoService serviceCEnvioRealCorreoService;

    @Autowired
    COfertasNuevasService serviceCOfertasNuevasService;

    @Autowired
    OfertasCarritoComprasService serviceOfertasCarritoComprasService;

    @Autowired
    OfertasHistorialService serviceOfertasHistorialService;

    @Autowired
    UsuarioAdminService serviceUsuarioAdminService;

    @Autowired
    OlvidoClaveService serviceOlvidoClaveService;

    @Autowired
    loginTransService serviceloginTransService;

    @Autowired
    TokenTransModService serviceTokenTransModService;

    @Autowired
    CosteoOfertaService serviceCosteoOfertaService;

    @Autowired
    CosteoOfertaModService serviceCosteoOfertaModService;

    @Autowired
    loginClienteService serviceloginClienteService;

    @Autowired
    CpersonaCampesinoModService serviceCpersonaCampesinoModService;

    @Autowired
    CCordenadasSectorModService serviceCCordenadasSectorModService;

    @Autowired
    CConsultaEstadoOfertaService serviceCConsultaEstadoOfertaService;

    @Autowired
    CCordenadasSectorService serviceCCordenadasSectorService;

    @Autowired
    CSectorConductorService serviceCSectorConductorService;

    @Autowired
    ConductorOfertaModService serviceConductorOfertaModService;

    @Autowired
    CDatosTransportistaService serviceCDatosTransportistaService;

    @Autowired
    CTipoCosteoOfertaService serviceCTipoCosteoOfertaService;

    @Autowired
    CpersonaTransportistaModService serviceCpersonaTransportistaModService;

    @Autowired
    CpersonaClienteModService serviceCpersonaClienteModService;

    @Autowired
    CtipoPlantillaService serviceCtipoPlantillaService;

    @Autowired
    CorreoMomentoEnvioService serviceCorreoMomentoEnvioService;

    @Autowired
    CtipoMomentoEnvioService serviceCtipoMomentoEnvioService;

    @Autowired
    CAplantillaCorreoService serviceCAplantillaCorreoService;

    @Autowired
    CATipoCamposCorreoService serviceCATipoCamposCorreoService;

    @Autowired
    CAPlantillaCorreoModService serviceCAPlantillaCorreoModService;

    @Autowired
    CDocumentoCorreoModService serviceCDocumentoCorreoModService;

    @Autowired
    CDocumentoCorreoService serviceCDocumentoCorreoService;

    @Autowired
    CTransportesNuevosService serviceCTransportesNuevosService;

    @Autowired
    CconductoresTransportesNuevosService serviceCconductoresTransportesNuevosService;

    @Autowired
    ConductorSectorModService serviceConductorSectorModService;

    @Autowired
    CPersonaTransService serviceCPersonaTransService;

    @Autowired
    CValidaCambioEtapaService serviceCValidaCambioEtapaService;

    @Autowired
    CVigenciaOfertaModService serviceCVigenciaOfertaModService;

    @Autowired
    CVigenciaOfertaService serviceCVigenciaOfertaService;

    @Autowired
    CCalculaPrecioFinIndividualService serviceCCalculaPrecioFinIndividualService;

    @Autowired
    CCalculaPrecioFinGrupalService serviceCCalculaPrecioFinGrupalService;

    @Autowired
    CCalculaPrecioFinMixtaService serviceCCalculaPrecioFinMixtaService;

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
    public String uploadOfertas(@RequestParam("file") MultipartFile file) {
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
            file.transferTo(new File("C:/inetpub/wwwroot/ImagenesAgroapoya2/ImagenesOfertas/" + fileName));
        } catch (IOException | IllegalStateException ex) {
            System.out.println("Error " + ex);
        }
        UploadFileResponse uploadfile = new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
        uploadfile.getFileDownloadUri();
        return JSONObject.quote("Archivo Subido Correctamente");
    }

    @PostMapping("/uploadevidencia")
    public String uploadEvidencia(@RequestParam("file") MultipartFile file) {
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
            file.transferTo(new File("C:/inetpub/wwwroot/ImagenesAgroapoya2/ImagenesEvidencia/" + fileName));
        } catch (IOException | IllegalStateException ex) {
            System.out.println("Error " + ex);
        }
        UploadFileResponse uploadfile = new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
        uploadfile.getFileDownloadUri();
        return JSONObject.quote("Archivo Subido Correctamente");
    }

    @PostMapping("/uploadconductores")
    public String uploadConductores(@RequestParam("file") MultipartFile file) {
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
            file.transferTo(new File("C:/inetpub/wwwroot/ImagenesAgroapoya2/ImagenesConductores/" + fileName));
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

    @GetMapping("/consectores/{bandera}/{NOMBRE_SECTOR}/{CD_PAIS}/{CD_RGION}/{CD_MNCPIO}")
    public List<SectoresEntity> ConsultaSectores(
            @PathVariable Integer bandera,
            @PathVariable String NOMBRE_SECTOR,
            @PathVariable Integer CD_PAIS,
            @PathVariable Integer CD_RGION,
            @PathVariable Integer CD_MNCPIO) {
        return serviceSectoresService.ConsultaSectores(bandera, NOMBRE_SECTOR, CD_PAIS, CD_RGION, CD_MNCPIO);
    }

    @PostMapping("/csectorofertamod/{bandera}")
    public String CSectorOfertaMod(
            @RequestBody CSectorOfertaModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCSectorOfertaModService.CSectorOfertaMod(entidad, bandera);
    }

    @GetMapping("/conscsectoroferta/{bandera}/{CD_CNSCTVO}")
    public List<CSectorOfertaEntity> ConsultaCSectorOferta(
            @PathVariable Integer bandera,
            @PathVariable Integer CD_CNSCTVO) {
        return serviceCSectorOfertaService.ConsultaCSectorOferta(bandera, CD_CNSCTVO);
    }

    @PostMapping("/cconductorofertamod/{bandera}")
    public String CConductorOfertaMod(
            @RequestBody CConductorSectorOfertaModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCConductorSectorOfertaModService.CConductorOfertaMod(entidad, bandera);
    }

    @GetMapping("/conscciudadistcionofert/{bandera}/{CD_CNSCTVO}")
    public List<CCiudadDistribucionOfertEntity> ConsultaCCiudadDistcionOferta(
            @PathVariable Integer bandera,
            @PathVariable String CD_CNSCTVO) {
        return serviceCCiudadDistribucionOfertService.ConsultaCCiudadDistcionOferta(bandera, CD_CNSCTVO);
    }

    @PostMapping("/sectoresmod/{BANDERA}")
    public String SectoresMod(
            @RequestBody SectoresModEntity entidad,
            @PathVariable Integer BANDERA) {
        return serviceSectoresModService.SectoresMod(entidad, BANDERA);
    }

    @PostMapping("/consaofertas/{Bandera}/{cnctivoOferta}/{id_prdcto}/{idProductor}")
    public List<AOfertasEntity> ConsultaAOfertas(
            @RequestBody AOfertasEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer cnctivoOferta,
            @PathVariable Integer id_prdcto,
            @PathVariable Integer idProductor) {
        return serviceAOfertasService.ConsultaAOfertas(entidad, Bandera, cnctivoOferta, id_prdcto, idProductor);
    }

    @PostMapping("/aestadofertamod/{Bandera}")
    public String AEstadoOfertaMod(
            @RequestBody AestadoOfertaModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceAestadoOfertaModService.AEstadoOfertaMod(entidad, Bandera);
    }

    @GetMapping("/constransactivos/{bandera}/{id_condutor}/{usucodigTrans}")
    public List<TransActivosEntity> ConsultaTrascActivos(
            @PathVariable Integer bandera,
            @PathVariable Integer id_condutor,
            @PathVariable Integer usucodigTrans) {
        return serviceTransActivosService.ConsultaTrascActivos(bandera, id_condutor, usucodigTrans);
    }

    @PostMapping("/evidenciamod/{bandera}/{id_conductor}/{id_factura}/{Entregado}")
    public String EvidenciaMod(
            @RequestBody evidenciaModEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable Integer id_conductor,
            @PathVariable Integer id_factura,
            @PathVariable Integer Entregado) {
        return serviceevidenciaModService.EvidenciaMod(entidad, bandera, id_conductor, id_factura, Entregado);
    }

    @GetMapping("/consconductorsectorofert/{bandera}/{CD_CNSCTVO}")
    public List<CConductorSectorOfertaEntity> ConsultaConductSectorOfert(
            @PathVariable Integer bandera,
            @PathVariable String CD_CNSCTVO) {
        return serviceCConductorSectorOfertaService.ConsultaConductSectorOfert(bandera, CD_CNSCTVO);
    }

    @GetMapping("/consestadoentrega/{bandera}")
    public List<estadoEntregaEntity> ConsultaEstadoEntrega(
            @PathVariable Integer bandera) {
        return serviceestadoEntregaService.ConsultaEstadoEntrega(bandera);
    }

    @GetMapping("/consentregasconductor/{bandera}/{ID_CNDCTOR}/{ID_ENTREGA}")
    public List<entregasConductorEntity> ConsultaEntregasConductor(
            @PathVariable Integer bandera,
            @PathVariable Integer ID_CNDCTOR,
            @PathVariable Integer ID_ENTREGA) {
        return serviceentregasConductorService.ConsultaEntregasConductor(bandera, ID_CNDCTOR, ID_ENTREGA);
    }

    @GetMapping("/consevidencia/{bandera}/{id_evidencia}/{id_factura}")
    public List<evidenciaEntity> ConsultaEvidencia(
            @PathVariable Integer bandera,
            @PathVariable Integer id_evidencia,
            @PathVariable Integer id_factura) {
        return serviceevidenciaService.ConsultaEvidencia(bandera, id_evidencia, id_factura);
    }

    @PostMapping("/ciudadofertamod/{Bandera}")
    public String CiudadOfertaMod(
            @RequestBody CiudadOfertaModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCiudadOfertaModService.CiudadOfertaMod(entidad, Bandera);
    }

    @PostMapping("/cvaloracionofertamod/{BANDERA}")
    public String CValoracionOfertaMod(
            @RequestBody CValoracionOfertaModEntity entidad,
            @PathVariable Integer BANDERA) {
        return serviceCValoracionOfertaModService.CValoracionOfertaMod(entidad, BANDERA);
    }

    @GetMapping("/conscvaloracionoferta/{BANDERA}/{CD_CNSCTVO}/{ID_SCTOR_OFRTA}")
    public List<CValoracionOfertaEntity> ConsultaCValoracionOferta(
            @PathVariable Integer BANDERA,
            @PathVariable Integer CD_CNSCTVO,
            @PathVariable Integer ID_SCTOR_OFRTA) {
        return serviceCValoracionOfertaService.ConsultaCValoracionOferta(BANDERA, CD_CNSCTVO, ID_SCTOR_OFRTA);
    }

    @GetMapping("/enviocorreoindividual/{bandera}/{IdPlantilla}/{usucodig}/{correoPersona}/{Cd_cnctvo}")
    public String EnvioCorreoIndividual(
            @PathVariable Integer bandera,
            @PathVariable Integer IdPlantilla,
            @PathVariable Integer usucodig,
            @PathVariable String correoPersona,
            @PathVariable Integer Cd_cnctvo) {
        return serviceEnvioCorreo_IndividualService.EnvioCorreoIndividual(bandera, IdPlantilla, usucodig, correoPersona, Cd_cnctvo);
    }

    @GetMapping("/remitentecorreo")
    public List<RemitenteCorreoEntity> ConsRemitenteCorreo() {
        return serviceRemitenteCorreoService.ConsRemitenteCorreo();
    }

    @GetMapping("/enviocorreomasivo/{bandera}/{IdPlantilla}/{IdTipoUsuario}")
    public String MasivoEnvioCorreo(
            @PathVariable Integer bandera,
            @PathVariable Integer IdPlantilla,
            @PathVariable Integer IdTipoUsuario) {
        return serviceCEnvioRealCorreoService.ConsultaEnvioRealCorreo(bandera, IdPlantilla, IdTipoUsuario);
    }

    @PostMapping("/conscofertasnuevas/{Bandera}/{cnctivoOferta}/{id_prdcto}")
    public List<COfertasNuevasEntity> ConsultaOfertasNuevas(
            @RequestBody COfertasNuevasEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer cnctivoOferta,
            @PathVariable Integer id_prdcto) {
        return serviceCOfertasNuevasService.ConsultaOfertasNuevas(entidad, Bandera, cnctivoOferta, id_prdcto);
    }

    @PostMapping("/consofertacarritocompras/{Bandera}/{cnctivoOferta}/{id_prdcto}")
    public List<OfertasCarritoComprasEntity> ConsultaOfertasCarritoCompras(
            @RequestBody OfertasCarritoComprasEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer cnctivoOferta,
            @PathVariable Integer id_prdcto) {
        return serviceOfertasCarritoComprasService.ConsultaOfertasCarritoCompras(entidad, Bandera, cnctivoOferta, id_prdcto);
    }

    @PostMapping("/consofertashistorial/{Bandera}/{cnctivoOferta}/{id_prdcto}")
    public List<OfertasHistorialEntity> ConsultaOfertasCarritoCompras(
            @RequestBody OfertasHistorialEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer cnctivoOferta,
            @PathVariable Integer id_prdcto) {
        return serviceOfertasHistorialService.ConsultaOfertasCarritoCompras(entidad, Bandera, cnctivoOferta, id_prdcto);
    }

    @PostMapping("/consusuarioadmin/{Bandera}")
    public List<UsuarioAdminEntity> ConsultaUserAdmin(
            @RequestBody UsuarioAdminEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceUsuarioAdminService.ConsultaUserAdmin(entidad, Bandera);
    }

    @PostMapping(value = "/send")
    @ResponseBody
    public String SendEmail(@RequestBody EmailEntity emailBody) {
        return serviceOlvidoClaveService.sendEmail(emailBody);
    }

    @PostMapping("/conslogintrans/{bandera}")
    public List<loginTransEntity> ConsultaLoginTransportista(
            @RequestBody loginTransEntity entidad,
            @PathVariable Integer bandera) {
        return serviceloginTransService.ConsultaLoginTransportista(entidad, bandera);
    }

    @PutMapping("/acttokentransmod/{bandera}")
    public String ActualizaTokenTransMod(
            @RequestBody TokenTransModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceTokenTransModService.ActualizaTokenTransMod(entidad, bandera);
    }

    @GetMapping("/conscosteoferta/{bandera}/{CD_CNSCTVO}")
    public List<CosteoOfertaEntity> ConsultaCosteoOferta(
            @PathVariable Integer bandera,
            @PathVariable String CD_CNSCTVO) {
        return serviceCosteoOfertaService.ConsultaCosteoOferta(bandera, CD_CNSCTVO);
    }

    @PostMapping("/costeofertamod/{bandera}")
    public String CosteOFertaMod(
            @RequestBody CosteoOfertaModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCosteoOfertaModService.CosteOFertaMod(entidad, bandera);
    }

    @PostMapping("/conslogincliente/{bandera}")
    public List<loginClienteEntity> ConsultaLoginCliente(
            @RequestBody loginClienteEntity entidad,
            @PathVariable Integer bandera) {
        return serviceloginClienteService.ConsultaLoginCliente(entidad, bandera);
    }

    @GetMapping("/ServMensajeria/{user}/{token}/{GSM}/{SMSText}/{metodo_envio}")
    public String ConsultaNitXFeria(@PathVariable String user, @PathVariable String token, @PathVariable String GSM, @PathVariable String SMSText, @PathVariable String metodo_envio) {
        JSONObject ObjectJson = new JSONObject();

        String var = "";
        try {
            RestTemplate rt = new RestTemplate();
            HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
            parameters.add("user", user);
            parameters.add("token", token);
            parameters.add("GSM", GSM);
            parameters.add("SMSText", SMSText);
            parameters.add("metodo_envio", metodo_envio);
            ResponseEntity<Object> response = rt.exchange("https://contacto-masivo.com/sms/back_sms/public/api/sendsms?user=" + user + "&token=" + token + "&GSM=" + GSM + "&SMSText=" + SMSText + "&metodo_envio=" + metodo_envio, HttpMethod.POST, null, Object.class);
            Object NitObject = response.getBody();
            com.fasterxml.jackson.databind.ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(NitObject);
            ObjectJson = new JSONObject(json);
            JSONObject NitFeria = ObjectJson.getJSONObject("infosms");
            JSONArray NitFeriaArray = NitFeria.getJSONArray("infsms");
            var = NitFeriaArray.toString();
        } catch (Exception ex) {
            return "Error:" + ex.getMessage();
        }

        return var;
    }

    @GetMapping("/reporteSms/{mensaje}/{celular}")
    public String ConsultaNitXFeria(@PathVariable String mensaje, @PathVariable String celular) {
        JSONObject ObjectJson = new JSONObject();
        try {

            RestTemplate rt = new RestTemplate();
            HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
            parameters.add("mensaje", mensaje);
            parameters.add("celular", celular);

            ResponseEntity<Object> response = rt.exchange("https://contacto-masivo.com/sms/back_sms/public/api/sendsms?mensaje=" + mensaje + "&celular=" + celular, HttpMethod.POST, null, Object.class);
            Object NitObject = response.getBody();
            com.fasterxml.jackson.databind.ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(NitObject);
            ObjectJson = new JSONObject(json);
            JSONObject smsreport = ObjectJson.getJSONObject("infosms");

            JSONArray smsit = smsreport.getJSONArray("infsms");
            return smsit.toString();

        } catch (Exception ex) {
            return "Error:" + ex.getMessage();
        }
    }

    @PostMapping("/personacampesinamod/{bandera}")
    public String CPersonaCampeMod(
            @RequestBody CpersonaCampesinoModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCpersonaCampesinoModService.CPersonaCampeMod(entidad, bandera);
    }

    @PostMapping("/cordenadassectormod/{BANDERA}")
    public String CordenadasSectorMod(
            @RequestBody CCordenadasSectorModEntity entidad,
            @PathVariable Integer BANDERA) {
        return serviceCCordenadasSectorModService.CordenadasSectorMod(entidad, BANDERA);
    }

    @GetMapping("/consultestadoferta/{bandera}/{CD_CNSCTVO}")
    public List<CConsultaEstadoOfertaEntity> ConsultaCEstadoOferta(
            @PathVariable Integer bandera,
            @PathVariable String CD_CNSCTVO) {
        return serviceCConsultaEstadoOfertaService.ConsultaCEstadoOferta(bandera, CD_CNSCTVO);
    }

    @GetMapping("/consccordenadasector/{BANDERA}/{ID_SCTOR_OFRTA}")
    public List<CCordenadasSectorEntity> ConsultaCordenadasSector(
            @PathVariable Integer BANDERA,
            @PathVariable Integer ID_SCTOR_OFRTA) {
        return serviceCCordenadasSectorService.ConsultaCordenadasSector(BANDERA, ID_SCTOR_OFRTA);
    }

    @GetMapping("/conscsectorconductor/{bandera}/{cd_cnctivo}")
    public List<CSectorConductorEntity> ConsultaSectorConductor(
            @PathVariable Integer bandera,
            @PathVariable Integer cd_cnctivo) {
        return serviceCSectorConductorService.ConsultaSectorConductor(bandera, cd_cnctivo);
    }

    @PostMapping("/modconductoroferta/{BANDERA}")
    public String ModConductorOfert(
            @RequestBody ConductorOfertaModEntity entidad,
            @PathVariable Integer BANDERA) {
        return serviceConductorOfertaModService.ModConductorOfert(entidad, BANDERA);
    }

    @GetMapping("/conscdatostransportista/{bandera}/{usucodig}/{IdConductor}")
    public List<CDatosTransportistaEntity> ConsultaCDatosTransportista(
            @PathVariable Integer bandera,
            @PathVariable String usucodig,
            @PathVariable Integer IdConductor) {
        return serviceCDatosTransportistaService.ConsultaCDatosTransportista(bandera, usucodig, IdConductor);
    }

    @GetMapping("/consctipocosteoferta/{bandera}")
    public List<CTipoCosteoOfertaEntity> ConsultaCTipoCosteoOferta(
            @PathVariable Integer bandera) {
        return serviceCTipoCosteoOfertaService.ConsultaCTipoCosteoOferta(bandera);
    }

    @PostMapping("/modpersonatransportista/{bandera}")
    public String ModPersonaTransportista(
            @RequestBody CpersonaTransportistaModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCpersonaTransportistaModService.ModPersonaTransportista(entidad, bandera);
    }

    @PostMapping("/modcpersonacliente/{bandera}/{banderaDos}")
    public String ModCPersonaCliente(
            @RequestBody CpersonaClienteModEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable Integer banderaDos) {
        return serviceCpersonaClienteModService.ModCPersonaCliente(entidad, bandera, banderaDos);
    }

    @GetMapping("/consctipoplantilla/{Bandera}")
    public List<CtipoPlantillaEntity> ConsultaTipoPlantillas(
            @PathVariable Integer Bandera) {
        return serviceCtipoPlantillaService.ConsultaTipoPlantillas(Bandera);
    }

    @GetMapping("/conscorreomomentoenvio/{Bandera}")
    public List<CorreoMomentoEnvioEntoty> ConsultaCorreoMomentoEnvio(
            @PathVariable Integer Bandera) {
        return serviceCorreoMomentoEnvioService.ConsultaCorreoMomentoEnvio(Bandera);
    }

    @GetMapping("/consctipomomentoenvio/{Bandera}")
    public List<CtipoMomentoEnvioEntity> ConsultaTipoMomentoEnvio(
            @PathVariable Integer Bandera) {
        return serviceCtipoMomentoEnvioService.ConsultaTipoMomentoEnvio(Bandera);
    }

    @PostMapping("/consaplantillacorreo/{Bandera}")
    public List<CAplantillaCorreoEntity> ConsultaReporteAuditoria(
            @RequestBody CAplantillaCorreoEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCAplantillaCorreoService.ConsultaAplantillaCorreo(entidad, Bandera);
    }

    @GetMapping("/conscatipocamposcorreo/{Bandera}")
    public List<CATipoCamposCorreoEntity> ConsultaTipoCamposCorreo(
            @PathVariable Integer Bandera) {
        return serviceCATipoCamposCorreoService.ConsultaTipoCamposCorreo(Bandera);
    }

    @PostMapping("/modcaplantillacorreo/{Bandera}")
    public String ModCAPlantillaCorreo(
            @RequestBody CAPlantillaCorreoModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCAPlantillaCorreoModService.ModCAPlantillaCorreo(entidad, Bandera);
    }

    @PostMapping("/modcdocumentocorreo/{Bandera}")
    public String ModCDocumentoCorreo(
            @RequestBody CDocumentoCorreoModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCDocumentoCorreoModService.ModCDocumentoCorreo(entidad, Bandera);
    }

    @GetMapping("/conscdocumentocorreo/{Bandera}/{IdPlantilla}")
    public List<CDocumentoCorreoEntity> ConsultaCDocumentoCorreo(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdPlantilla) {
        return serviceCDocumentoCorreoService.ConsultaCDocumentoCorreo(Bandera, IdPlantilla);
    }

    @GetMapping("/consctransportesnuevos/{Bandera}/{usucodigTrans}/{id_conductor}")
    public List<CTransportesNuevosEntity> ConsultaCTransportesNuevos(
            @PathVariable Integer Bandera,
            @PathVariable Integer usucodigTrans,
            @PathVariable Integer id_conductor) {
        return serviceCTransportesNuevosService.ConsultaCTransportesNuevos(Bandera, usucodigTrans, id_conductor);
    }

    @GetMapping("/consconductortransportesnuevos/{Bandera}/{usucodigTrans}/{CD_CNSCTVO}")
    public List<CconductoresTransportesNuevosEntity> ConsultaConductoresTransportes(
            @PathVariable Integer Bandera,
            @PathVariable Integer usucodigTrans,
            @PathVariable Integer CD_CNSCTVO) {
        return serviceCconductoresTransportesNuevosService.ConsultaConductoresTransportes(Bandera, usucodigTrans, CD_CNSCTVO);
    }

    @PostMapping("/modconductorsector/{Bandera}")
    public String ModConductorSector(
            @RequestBody ConductorSectorModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceConductorSectorModService.ModConductorSector(entidad, Bandera);
    }

    @GetMapping("/conscpersonatrans/{bandera}/{usucodig}/{id_conductor}")
    public List<CPersonaTransEntity> ConsultaCPersonaTrans(
            @PathVariable Integer bandera,
            @PathVariable Integer usucodig,
            @PathVariable Integer id_conductor) {
        return serviceCPersonaTransService.ConsultaCPersonaTrans(bandera, usucodig, id_conductor);
    }

    @GetMapping("/conscvalidacambioetapa/{Bandera}/{CD_CNSCTVO}/{FASE_SIGUIENTE}")
    public String ConsultaCValidaCambioEtapa(
            @PathVariable Integer Bandera,
            @PathVariable Integer CD_CNSCTVO,
            @PathVariable Integer FASE_SIGUIENTE) {
        return serviceCValidaCambioEtapaService.ConsultaCValidaCambioEtapa(Bandera, CD_CNSCTVO, FASE_SIGUIENTE);
    }

    @PostMapping("/modcvigenciaoferta/{BANDERA}")
    public String ModCVigenciaOferta(
            @RequestBody CVigenciaOfertaModEntity entidad,
            @PathVariable Integer BANDERA) {
        return serviceCVigenciaOfertaModService.ModCVigenciaOferta(entidad, BANDERA);
    }

    @GetMapping("/conscvigenciaoferta/{BANDERA}/{CD_CNSCTVO}")
    public List<CVigenciaOfertaEntoty> ConsultaCVigenciaOferta(
            @PathVariable Integer BANDERA,
            @PathVariable Integer CD_CNSCTVO) {
        return serviceCVigenciaOfertaService.ConsultaCVigenciaOferta(BANDERA, CD_CNSCTVO);
    }

    @GetMapping("/conscalculapreciofinindividual/{BANDERA}/{CD_CNSCTVO}/{ID_SCTOR_OFRTA}/{tpo_cmsion_indvdual}/{vlor_cmsion_indvdual}")
    public List<CCalculaPrecioFinIndividualEntity> ConsultaCalculaPrecioFinIndiv(
            @PathVariable Integer BANDERA,
            @PathVariable Integer CD_CNSCTVO,
            @PathVariable Integer ID_SCTOR_OFRTA,
            @PathVariable Integer tpo_cmsion_indvdual,
            @PathVariable Integer vlor_cmsion_indvdual) {
        return serviceCCalculaPrecioFinIndividualService.ConsultaCalculaPrecioFinIndiv(BANDERA, CD_CNSCTVO, ID_SCTOR_OFRTA, tpo_cmsion_indvdual, vlor_cmsion_indvdual);
    }

    @GetMapping("/conscalculapreciofingrupal/{BANDERA}/{CD_CNSCTVO}/{ID_SCTOR_OFRTA}/{tpo_cmsion_grupal}/{vlor_cmsion_grupal}/{vlor_dmcilio_grupal}/{mnmo_prsnas_xgrupo}")
    public List<CCalculaPrecioFinGrupalEntity> ConsultaCCalculaPrecioFinGrupal(
            @PathVariable Integer BANDERA,
            @PathVariable Integer CD_CNSCTVO,
            @PathVariable Integer ID_SCTOR_OFRTA,
            @PathVariable Integer tpo_cmsion_grupal,
            @PathVariable Integer vlor_cmsion_grupal,
            @PathVariable Integer vlor_dmcilio_grupal,
            @PathVariable Integer mnmo_prsnas_xgrupo) {
        return serviceCCalculaPrecioFinGrupalService.ConsultaCCalculaPrecioFinGrupal(BANDERA, CD_CNSCTVO, ID_SCTOR_OFRTA, tpo_cmsion_grupal, vlor_cmsion_grupal, vlor_dmcilio_grupal, mnmo_prsnas_xgrupo);
    }

    @GetMapping("/conscalculapreciofinmixta/{BANDERA}/{CD_CNSCTVO}/{ID_SCTOR_OFRTA}/{tpo_cmsion_indvdual}/{vlor_cmsion_indvdual}/{tpo_cmsion_grupal}/{vlor_cmsion_grupal}/{vlor_dmcilio_indvdual}/{vlor_dmcilio_grupal}/{mnmo_prsnas_xgrupo}")
    public List<CCalculaPrecioFinMixtaEntity> ConsultaCalcPrecioFinMixta(
            @PathVariable Integer BANDERA,
            @PathVariable Integer CD_CNSCTVO,
            @PathVariable Integer ID_SCTOR_OFRTA,
            @PathVariable Integer tpo_cmsion_indvdual,
            @PathVariable Integer vlor_cmsion_indvdual,
            @PathVariable Integer tpo_cmsion_grupal,
            @PathVariable Integer vlor_cmsion_grupal,
            @PathVariable Integer vlor_dmcilio_indvdual,
            @PathVariable Integer vlor_dmcilio_grupal,
            @PathVariable Integer mnmo_prsnas_xgrupo) {
        return serviceCCalculaPrecioFinMixtaService.ConsultaCalcPrecioFinMixta(BANDERA, CD_CNSCTVO, ID_SCTOR_OFRTA, tpo_cmsion_indvdual, vlor_cmsion_indvdual, tpo_cmsion_grupal, vlor_cmsion_grupal, vlor_dmcilio_indvdual, vlor_dmcilio_grupal, mnmo_prsnas_xgrupo);
    }
}
