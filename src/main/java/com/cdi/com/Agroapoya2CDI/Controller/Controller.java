package com.cdi.com.Agroapoya2CDI.Controller;

import com.cdi.com.Agroapoya2CDI.Entity.AGRO_DIRECCION_POPUPEntity;
import com.cdi.com.Agroapoya2CDI.Entity.ActualizaLinkEntity;
import com.cdi.com.Agroapoya2CDI.Entity.Agro_Select_AGRO_BANCOEntity;
import com.cdi.com.Agroapoya2CDI.Entity.Agro_Select_AGRO_FORMA_PAGOEntity;
import com.cdi.com.Agroapoya2CDI.Entity.Agro_Select_AGRO_TIPO_CUENTAEntity;
import com.cdi.com.Agroapoya2CDI.Entity.Agro_Select_AGRO_TIPO_PERSONAEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CGrupoClienteEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CRelacionGrupoClienteEntity;
import com.cdi.com.Agroapoya2CDI.Entity.INFOGENERALEntity;
import com.cdi.com.Agroapoya2CDI.Entity.MV_AGRO_VALIDACODIGOEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_insert_AGRO_CLIENTE_2Entity;
import com.cdi.com.Agroapoya2CDI.Entity.MV_INSERT_AGRO_PERSONASVDOSEntity;
import com.cdi.com.Agroapoya2CDI.Entity.MV_MLTLSTAS_RGSTROEntity;
import com.cdi.com.Agroapoya2CDI.Entity.SELECT_MNCPIOEntity;
import com.cdi.com.Agroapoya2CDI.Entity.Select_TipoDocumentoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_pa_INSERT_PROCESO_PAGOEntity;
import com.cdi.com.Agroapoya2CDI.Entity.cliente_select_ofertasNuevasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_CiudadesActivasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_EnvioCorreoTransprtistaViejeEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_infoBasicaUsuarioEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_listaSectoresConOfertasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_pa_cliente_select_ofertasNuevasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.selec_agro_url_pagosEntity;
import com.cdi.com.Agroapoya2CDI.Services.AGRO_DIRECCION_POPUPService;
import com.cdi.com.Agroapoya2CDI.Services.AGRO_VALIDARBTNGRUPALService;
import com.cdi.com.Agroapoya2CDI.Services.ActualizaLinkService;
import com.cdi.com.Agroapoya2CDI.Services.Agro_Select_AGRO_BANCOService;
import com.cdi.com.Agroapoya2CDI.Services.Agro_Select_AGRO_FORMA_PAGOService;
import com.cdi.com.Agroapoya2CDI.Services.Agro_Select_AGRO_TIPO_CUENTAService;
import com.cdi.com.Agroapoya2CDI.Services.Agro_Select_AGRO_TIPO_PERSONAService;
import com.cdi.com.Agroapoya2CDI.Services.CALCULADORA_VALORPAGOService;
import com.cdi.com.Agroapoya2CDI.Services.CGrupoClienteService;
import com.cdi.com.Agroapoya2CDI.Services.CRelacionGrupoClienteService;
import com.cdi.com.Agroapoya2CDI.Services.INFOGENERALService;
import com.cdi.com.Agroapoya2CDI.Services.MV_AGRO_VALIDACODIGOService;
import com.cdi.com.Agroapoya2CDI.Services.cliente_select_ofertasNuevasService;
import com.cdi.com.Agroapoya2CDI.Services.mv_CiudadesActivasService;
import com.cdi.com.Agroapoya2CDI.Services.mv_infoBasicaUsuarioService;
import com.cdi.com.Agroapoya2CDI.Services.mv_listaSectoresConOfertasService;
import com.cdi.com.Agroapoya2CDI.Services.mv_pa_cliente_select_ofertasNuevasService;
import com.cdi.com.Agroapoya2CDI.Services.selec_agro_url_pagosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.cdi.com.Agroapoya2CDI.Services.MV_INSERT_AGRO_PERSONASVDOSService;
import com.cdi.com.Agroapoya2CDI.Services.MV_MLTLSTAS_RGSTROService;
import com.cdi.com.Agroapoya2CDI.Services.SELECT_MNCPIOService;
import com.cdi.com.Agroapoya2CDI.Services.Select_TipoDocumentoService;
import com.cdi.com.Agroapoya2CDI.Services.mv_pa_INSERT_PROCESO_PAGOService;
import com.cdi.com.Agroapoya2CDI.Services.mv_CNSCTVOCMNDADCNSMOService;
import com.cdi.com.Agroapoya2CDI.Services.mv_EnvioCorreoTransprtistaViejeService;
import com.cdi.com.Agroapoya2CDI.Services.mv_insert_AGRO_CLIENTE_2Service;

@RestController
@RequestMapping(value = "/", produces = "application/json", method = {RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH})
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH, RequestMethod.DELETE})

public class Controller {

    @Autowired
    INFOGENERALService serviceINFOGENERALService;

    @Autowired
    cliente_select_ofertasNuevasService servicecliente_select_ofertasNuevasService;

    @Autowired
    AGRO_VALIDARBTNGRUPALService serviceAGRO_VALIDARBTNGRUPALService;

    @Autowired
    mv_listaSectoresConOfertasService servicemv_listaSectoresConOfertasService;

    @Autowired
    mv_CiudadesActivasService servicemv_CiudadesActivasService;

    @Autowired
    mv_infoBasicaUsuarioService servicemv_infoBasicaUsuarioService;

    @Autowired
    mv_pa_cliente_select_ofertasNuevasService servicemv_pa_cliente_select_ofertasNuevasService;

    @Autowired
    CGrupoClienteService serviceCGrupoClienteService;

    @Autowired
    CRelacionGrupoClienteService serviceCRelacionGrupoClienteService;

    @Autowired
    mv_pa_INSERT_PROCESO_PAGOService serviceINSERT_PROCESO_PAGOService;

    @Autowired
    selec_agro_url_pagosService serviceselec_agro_url_pagosService;

    @Autowired
    ActualizaLinkService serviceActualizaLinkService;

    @Autowired
    MV_INSERT_AGRO_PERSONASVDOSService serviceINSERT_AGRO_PERSONASVDOSService;

    @Autowired
    MV_MLTLSTAS_RGSTROService serviceMV_MLTLSTAS_RGSTROService;

    @Autowired
    SELECT_MNCPIOService serviceSELECT_MNCPIOService;

    @Autowired
    mv_CNSCTVOCMNDADCNSMOService serviceCNSCTVOCMNDADCNSMOService;

    @Autowired
    mv_insert_AGRO_CLIENTE_2Service serviceInsert_AGRO_CLIENTE_2Service;

    @Autowired
    Select_TipoDocumentoService serviceSelect_TipoDocumentoService;

    @Autowired
    Agro_Select_AGRO_TIPO_PERSONAService serviceAgro_Select_AGRO_TIPO_PERSONAService;

    @Autowired
    Agro_Select_AGRO_TIPO_CUENTAService serviceAgro_Select_AGRO_TIPO_CUENTAService;

    @Autowired
    Agro_Select_AGRO_BANCOService serviceAgro_Select_AGRO_BANCOService;

    @Autowired
    Agro_Select_AGRO_FORMA_PAGOService serviceAgro_Select_AGRO_FORMA_PAGOService;

    @Autowired
    AGRO_DIRECCION_POPUPService serviceAGRO_DIRECCION_POPUPService;

    @Autowired
    MV_AGRO_VALIDACODIGOService serviceMV_AGRO_VALIDACODIGOService;

    @Autowired
    CALCULADORA_VALORPAGOService serviceCALCULADORA_VALORPAGOService;

    @Autowired
    mv_EnvioCorreoTransprtistaViejeService servicemv_EnvioCorreoTransprtistaViejeService;

    @GetMapping("/consultainfogeneral/{ID}")
    public List<INFOGENERALEntity> ConsultaInfoGeneral(
            @PathVariable Integer ID) {
        return serviceINFOGENERALService.ConsultaInfoGeneral(ID);
    }

    @GetMapping("/consclientselectofert/{US_CLIENTE}")
    public List<cliente_select_ofertasNuevasEntity> ConsultaClienteSelectOfertas(
            @PathVariable Integer US_CLIENTE) {
        return servicecliente_select_ofertasNuevasService.ConsultaClienteSelectOfertas(US_CLIENTE);
    }

    @GetMapping("/consagrovalidgrupal/{cd_cnsctivo}")
    public String ConsultaAgroValidGrupal(
            @PathVariable String cd_cnsctivo) {
        return serviceAGRO_VALIDARBTNGRUPALService.ConsultaAgroValidGrupal(cd_cnsctivo);
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

    @PostMapping("/insertcgrupcliente/{Bandera}")
    public String InsertCGrupCliente(
            @RequestBody CGrupoClienteEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCGrupoClienteService.InsertCGrupCliente(entidad, Bandera);
    }

    @DeleteMapping("/eliminacgrupcliente/{Bandera}")
    public String EliminaCGrupCliente(
            @RequestBody CGrupoClienteEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCGrupoClienteService.EliminaCGrupCliente(entidad, Bandera);
    }

    @PostMapping("/insertcrelagrpclient/{Bandera}")
    public String InsertaCRelacGrupoClient(
            @RequestBody CRelacionGrupoClienteEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCRelacionGrupoClienteService.InsertaCRelacGrupoClient(entidad, Bandera);
    }

    @DeleteMapping("/eliminacrelagrpclient/{Bandera}")
    public String EliminaCRelacGrupoClient(
            @RequestBody CRelacionGrupoClienteEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCRelacionGrupoClienteService.EliminaCRelacGrupoClient(entidad, Bandera);
    }

    @PostMapping("/insertprocespago")
    public String InsertProcesPago(
            @RequestBody mv_pa_INSERT_PROCESO_PAGOEntity entidad) {
        return serviceINSERT_PROCESO_PAGOService.InsertProcesPago(entidad);
    }

    @GetMapping("/consultagrourl")
    public List<selec_agro_url_pagosEntity> ConsultaAgroURL() {
        return serviceselec_agro_url_pagosService.ConsultaAgroURL();
    }

    @PutMapping("/actualizalink")
    public String ActualizaLinkS(
            @RequestBody ActualizaLinkEntity entidad) {
        return serviceActualizaLinkService.ActualizaLinkS(entidad);
    }

    @PostMapping("/insertagroprsnasvdos")
    public String InsertAgroPrsnasvdos(
            @RequestBody MV_INSERT_AGRO_PERSONASVDOSEntity entidad) {
        return serviceINSERT_AGRO_PERSONASVDOSService.InsertAgroPrsnasvdos(entidad);
    }

    @GetMapping("/consultmltlstasrgstro/{Bandera}")
    public List<MV_MLTLSTAS_RGSTROEntity> ConsultaMLTLSTASRGTRO(
            @PathVariable Integer Bandera) {
        return serviceMV_MLTLSTAS_RGSTROService.ConsultaMLTLSTASRGTRO(Bandera);
    }

    @GetMapping("/consultmncpio/{CD_RGION}")
    public List<SELECT_MNCPIOEntity> ConsultaMNCPIO(
            @PathVariable Integer CD_RGION) {
        return serviceSELECT_MNCPIOService.ConsultaMNCPIO(CD_RGION);
    }

    @PutMapping("/actualizacnsctvo")
    public String ActualizaCNSCTVO() {
        return serviceCNSCTVOCMNDADCNSMOService.ActualizaCNSCTVO();
    }

    @PostMapping("/insertagroclient/{id_horaRango}")
    public String InsertaAgroClient(
            @RequestBody mv_insert_AGRO_CLIENTE_2Entity entidad,
            @PathVariable Integer id_horaRango) {
        return serviceInsert_AGRO_CLIENTE_2Service.InsertaAgroClient(entidad, id_horaRango);
    }

    @GetMapping("/constipodocumento/{Bandera}")
    public List<Select_TipoDocumentoEntity> ConsultaSelectTpoDocumento(
            @PathVariable Integer Bandera) {
        return serviceSelect_TipoDocumentoService.ConsultaSelectTpoDocumento(Bandera);
    }

    @GetMapping("/constipopersona/{Bandera}")
    public List<Agro_Select_AGRO_TIPO_PERSONAEntity> ConsTipoPersona(
            @PathVariable Integer Bandera) {
        return serviceAgro_Select_AGRO_TIPO_PERSONAService.ConsTipoPersona(Bandera);
    }

    @GetMapping("/constopocuenta/{Bandera}")
    public List<Agro_Select_AGRO_TIPO_CUENTAEntity> ConsTipoCuenta(
            @PathVariable Integer Bandera) {
        return serviceAgro_Select_AGRO_TIPO_CUENTAService.ConsTipoCuenta(Bandera);
    }

    @GetMapping("/consultaBanco/{Bandera}")
    public List<Agro_Select_AGRO_BANCOEntity> ConsBanco(
            @PathVariable Integer Bandera) {
        return serviceAgro_Select_AGRO_BANCOService.ConsBanco(Bandera);
    }

    @GetMapping("/consformapago/{Bandera}")
    public List<Agro_Select_AGRO_FORMA_PAGOEntity> ConsultaFormaPago(
            @PathVariable Integer Bandera) {
        return serviceAgro_Select_AGRO_FORMA_PAGOService.ConsultaFormaPago(Bandera);
    }

    @GetMapping("/consdireccionpopup/{Bandera}")
    public List<AGRO_DIRECCION_POPUPEntity> ConsultaDireccionPopUp(
            @PathVariable Integer Bandera) {
        return serviceAGRO_DIRECCION_POPUPService.ConsultaDireccionPopUp(Bandera);
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
}
