package com.cdi.com.CorferiasRuedaNegocios.Controller;

import ch.qos.logback.core.net.ObjectWriter;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CActualizaAuditoriaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CActualizaTokenEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CAdmPreguntaEstandarEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CAdmPreguntaEstandarModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CAdminSalasConfigEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CAdminSalasEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CAdminSalasModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CAdministraLinkRdnEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CAdministraMesaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CAgendaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CAgendaModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CAgendaPartEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CAsignaAgendaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CAsignaPaisesEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CAsignaPaisesModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CAyudaUsuarioRdnEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CCajaContenidoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CCamposParticipanteEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CCateSectorPartEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CCategoriaSectorEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CChatEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CChatMensConsEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CChatMensModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CCiudadDptoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CConfiguraTipoPerfilEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CConfiguraTipoPerfilModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CConsultaJornadaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CContactoContenidoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CContenidoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CDatosContactoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CDatosEmpresaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CDatosTableroEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CDatosTableroPPEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CDefinirAuditoriaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CUsuarioInfoConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CDptoPaisEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CEnvioRealCorreoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CEvaluacionConsEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CMasivoEnvioCorreoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CEvaluacionEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CEvaluacionModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CEvaluacionPartEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CFechaRuedaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CFormulaPlantillaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CFormulaPlantillaModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CIdiomaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CJornadaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CJornadaModificaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaEstadoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaFiltrosEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaMomentoEnvioEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaParticipantesRDNEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaPerfilRdnEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaPlantillaCorreoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaRecintoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaRolEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaTerminoPoliticaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaTipoRespuestaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaUsuarioAuditoriaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CMascaraContenidoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CMascaraEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CMascaraRegistroRDNEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CNoticiaContenidoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CNotificacionEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CParticipanteEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CParticipanteModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CPataCategEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CPataCategModificaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CPermisosRolEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CPlantillaCorreoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntaEvaluacionModeEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntaEvaluacionPopEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasContenidoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasEstRdnEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasEstRdnModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasEstandarEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasEvaluacionEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasPartEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasRuedaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasRuedaModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CProgramacionCorreoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CRdnPatalogosEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CRecintoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CRecintoModificaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CRecuperaDatosUsuarioEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CRedSocialAdmEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CRelDatosContactoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CRelDocEnvioCorreoModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CRelEmpresaEnvioCorreoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CRepEvaPreguntasEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CRepRespuestasEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CRepRespuestasGeneralEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CReporteAuditoriaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CReporteEvaEncEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CReporteParticipanteEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CReporteSectorCatSubEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CRuedaNegocioEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CRuedaNegocioModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CSectorModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CSectorPartEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CSubCatePartEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CSubCategoriaSectorEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CTerminoPoliticaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CTerminoPoliticaModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CTtListaRespuestasModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CUsuarioConsModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CUsuarioConsultaRolesEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CUsuarioPermisoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CUsuarioRdnEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CUsuarioRdnModificaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CValidaPermisoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CVideoContenidoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CVigenciaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CVisualizaParticipanteEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CusuariosEnvioCorreoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.EncriptacionEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PAccesoContactoModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PAgendaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PAgendaModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PAgendaSalaModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PCategoriaSectorEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PChatEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PCitasAgendaPdfEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PConsultaChatEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PConsultaContactoChatEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PEncabezaAgendaPdfEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PInfoContactoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PLogWebEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PMascaraRegistroRdnEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PMesaChatMensModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PMesaChatModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PNotificacionModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PNotificacionesEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PParticipanteContactoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PParticipantePreguntaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PParticipanteProductoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PParticipantesRDNEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PPerfilRuedaNegocioEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PProductosServiciosEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PProductosServiciosModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PProductosServiciosPartEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRdnMenuParticipanteEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRdnParticipanteEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRecintoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRecuperaDatosContactoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRedSocialGEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRedSocialGModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRegistroContactoDocEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRegistroContactoModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRegistroParticipanteEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRegistroParticipanteModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRegistroPerfilEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRegistroPerfilModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRespPregSegEnEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRespuestaPreguntasRegEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRespuestaPreguntasSegEnEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRuedaNegocioEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PSectorEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PSectorParticipanteEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PSubCategoriaSectorEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PTerminoPoliticaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PUbicaParticipanteEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PValidaParticipanteEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PopcionesRtaPregunta;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PpreguntaRuedaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtCamposRuedaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtClaseRuedaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtEstadoCitaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtEstadoParticipanteEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtFuenteEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtGeneroEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtIdiomaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtListaOfDemEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtPaisEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTamañoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTiempoDuracionEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoChatEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoCierreEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoCitaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoEnvioCorreoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoEvaEncEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoIdentificacionEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoJornadaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoParticipanteEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoPlantillaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoPreguntaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoProgramacionEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoRuedaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoSeleccionEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoSeleccionPaisEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtUbicacionEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.UploadFileResponse;
import com.cdi.com.CorferiasRuedaNegocios.Entity.meetwherebyEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.EnvioMailService;
import com.cdi.com.CorferiasRuedaNegocios.ServiceImplements.FileStorageException;
import com.cdi.com.CorferiasRuedaNegocios.ServiceImplements.FileStorageService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CActualizaAuditoriaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CActualizaTokenService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAdmPreguntaEstandarModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAdmPreguntaEstandarService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAdminSalasConfigService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAdminSalasModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAdminSalasService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAdministraLinkRdnService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAdministraMesaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAgendaModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAgendaPartService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAgendaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAsignaAgendaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAsignaPaisesModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAsignaPaisesService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAyudaUsuarioRdnService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CCajaContenidoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CCamposParticipanteService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CCateSectorPartService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CCategoriaSectorService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CChatMensConsService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CChatMensModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CChatService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CCiudadDptoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CConfiguraTipoPerfilModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CConfiguraTipoPerfilService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CConsultaJornadaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CContactoContenidoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CContenidoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CDatosContactoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CDatosEmpresaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CDatosTableroPPService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CDatosTableroService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CDefinirAuditoriaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CDptoPaisService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CEnvioRealCorreoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CEvaluacionConsService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CEvaluacionModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CEvaluacionPartService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CEvaluacionService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CFechaRuedaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CFiltrosLinkRdnService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CFormulaPlantillaModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CFormulaPlantillaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CIdiomaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CJornadaModificaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CJornadaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CListaEstadoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CListaFiltrosService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CListaMomentoEnvioService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CListaParticipantesRDNService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CListaPerfilRdnService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CListaPlantillaCorreoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CListaRecintoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CListaRolService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CListaTerminoPoliticaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CListaTipoRespuestaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CListaUsuarioAuditoriaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CMascaraContenidoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CMascaraRegistroRDNService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CMascaraService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CNoticiaContenidoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CNotificaContactoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CNotificacionService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CParticipanteModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CParticipanteService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPataCategModificaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPataCategService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPermisosRolService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPlantillaCorreoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPreguntaEvaluacionModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPreguntaEvaluacionPopService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPreguntasContenidoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPreguntasEstRdnModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPreguntasEstRdnService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPreguntasEstandarService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPreguntasEvaluacionService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPreguntasPartService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPreguntasRuedaModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPreguntasRuedaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CProgramacionCorreoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRdnPatalogosService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRecintoModificaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRecintoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRecuperaDatosUsuarioService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRedSocialAdmService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRelDatosContactoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRelDocEnvioCorreoModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRelEmpresaEnvioCorreoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRepEvaPreguntasService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRepRespuestasGeneralService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRepRespuestasService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CReporteAuditoriaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CReporteEvaEncService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CReporteParticipanteService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CReporteSectorCatSubService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRuedaNegocioModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRuedaNegocioService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CSectorModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CSectorPartService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CSubCatePartService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CSubCategoriaSectorService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CTerminoPoliticaModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CTerminoPoliticaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CTtListaRespuestasModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CUsuarioConsModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CUsuarioConsultaRolesService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CValidaUsuarioConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PLogWebService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtClaseRuedaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtEstadoParticipanteService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtGeneroService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtIdiomaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtPaisService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtTipoChatService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtTipoCierreService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtTipoIdentificacionService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtTipoJornadaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtTipoParticipanteService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtTipoPlantillaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtTipoPreguntaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtTipoProgramacionService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtTipoRuedaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtTipoSeleccionPaisService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtTipoSeleccionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cdi.com.CorferiasRuedaNegocios.Services.CUsuarioInfoConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CUsuarioPermisoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CUsuarioRdnModificaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CUsuarioRdnService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CValidaPermisoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CVideoContenidoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CVigenciaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CVisualizaParticipanteService;
import com.cdi.com.CorferiasRuedaNegocios.Services.CusuariosEnvioCorreoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.IndividualEnvioCorreoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PAccesoContactoModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PAgendaModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PAgendaSalaModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PAgendaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PCategoriaSectorService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PChatService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PCitasAgendaPdfService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PConsultaChatService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PConsultaContactoChatService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PCuentaChatService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PCuentaNotificaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PEncabezaAgendaPdfService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PInfoContactoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PMascaraRegistroRdnService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PMesaChatMensModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PMesaChatModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PNotificacionModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PNotificacionesService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PParticipanteContactoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PParticipantePreguntaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PParticipanteProductoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PParticipantesRDNService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PPerfilRuedaNegocioService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PProductosServiciosModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PProductosServiciosPartService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PProductosServiciosService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRdnMenuParticipanteService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRdnParticipanteService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRecintoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRecuperaDatosContactoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRedSocialGModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRedSocialGService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRegistroContactoDocService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRegistroContactoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRegistroParticipanteModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRegistroParticipanteService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRegistroPerfilModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRegistroPerfilService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRespPregSegEnService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRespuestaPreguntasRegService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRespuestaPreguntasSegEnService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRuedaNegocioService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PSectorParticipanteService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PSectorService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PSubCategoriaSectorService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PTerminoPoliticaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PUbicaParticipanteService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PValidaContactoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PValidaParticipanteService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PValidaRdnContactoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PopcionesRtaPreguntaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PpreguntaRuedaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtCamposRuedaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtEstadoCitaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtFuenteService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtListaOfDemService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtTamañoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtTiempoDuracionService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtTipoCitaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtTipoEnvioCorreoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtTipoEvaEncService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtUbicacionService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/", produces = "application/json", method = {RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH})
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH, RequestMethod.DELETE})

public class Controller {
    
    @Autowired
    TtPaisService servicepaisservice;
    
    @Autowired
    PLogWebService servicePLogWebService;
    
    @Autowired
    TtClaseRuedaService serviceTtClaseRuedaService;
    
    @Autowired
    TtTipoRuedaService serviceTtTipoRuedaService;
    
    @Autowired
    TtTipoParticipanteService serviceTtTipoParticipanteService;
    
    @Autowired
    TtTipoCierreService serviceTtTipoCierreService;
    
    @Autowired
    TtTipoPreguntaService serviceTtTipoPreguntaService;
    
    @Autowired
    TtTipoJornadaService serviceTtTipoJornadaService;
    
    @Autowired
    TtIdiomaService serviceTtIdiomaService;
    
    @Autowired
    TtTipoSeleccionService serviceTtTipoSeleccionService;
    
    @Autowired
    TtTipoSeleccionPaisService serviceTtTipoSeleccionPaisService;
    
    @Autowired
    TtEstadoParticipanteService serviceTtEstadoParticipanteService;
    
    @Autowired
    TtTipoChatService serviceTtTipoChatService;
    
    @Autowired
    TtGeneroService serviceTtGeneroService;
    
    @Autowired
    TtTipoPlantillaService serviceTtTipoPlantillaService;
    
    @Autowired
    TtTipoIdentificacionService serviceTtTipoIdentificacionService;
    
    @Autowired
    TtTipoProgramacionService serviceTtTipoProgramacionService;
    
    @Autowired
    CListaEstadoService serviceCListaEstadoService;
    
    @Autowired
    CListaFiltrosService serviceCListaFiltrosService;
    
    @Autowired
    CDptoPaisService serviceCDptoPaisService;
    
    @Autowired
    CCiudadDptoService serviceCCiudadDptoService;
    
    @Autowired
    CValidaUsuarioConsolaService serviceCValidaUsuarioConsolaService;
    
    @Autowired
    CListaRolService serviceCListaRolService;
    
    @Autowired
    CUsuarioInfoConsolaService serviceCConsultaUsuarioInfoConsolaService;
    
    @Autowired
    CPermisosRolService serviceCPermisosRolService;
    
    @Autowired
    CUsuarioConsultaRolesService serviceCUsuarioConsultaRolesService;
    
    @Autowired
    CUsuarioConsModService serviceCUsuarioConsModService;
    
    @Autowired
    CRedSocialAdmService serviceCRedSocialAdmService;
    
    @Autowired
    CPataCategService serviceCPataCategService;
    
    @Autowired
    CPataCategModificaService serviceCPataCategModificaService;
    
    @Autowired
    CRdnPatalogosService serviceCRdnPatalogosService;
    
    @Autowired
    private FileStorageService fileStorageService;
    
    @Autowired
    PRegistroParticipanteService servicePRegistroParticipanteService;
    
    @Autowired
    PRegistroParticipanteModService servicePRegistroParticipanteModService;
    
    @Autowired
    PPerfilRuedaNegocioService servicePPerfilRuedaNegocioService;
    
    @Autowired
    PRegistroContactoService servicePRegistroContactoService;
    
    @Autowired
    PRegistroPerfilService servicePRegistroPerfilService;
    
    @Autowired
    PRegistroPerfilModService servicePRegistroPerfilModService;
    
    @Autowired
    CRecintoService serviceCRecintoService;
    
    @Autowired
    CRecintoModificaService serviceCRecintoModificaService;
    
    @Autowired
    PRedSocialGService servicePRedSocialGService;
    
    @Autowired
    PRedSocialGModService servicePRedSocialGModService;
    
    @Autowired
    CAdmPreguntaEstandarService serviceCAdmPreguntaEstandarService;
    
    @Autowired
    CAdmPreguntaEstandarModService serviceCAdmPreguntaEstandarModService;
    
    @Autowired
    TtUbicacionService serviceTtUbicacionService;
    
    @Autowired
    CListaRecintoService serviceCListaRecintoService;
    
    @Autowired
    TtListaOfDemService serviceTtListaOfDemService;
    
    @Autowired
    CRuedaNegocioService serviceCRuedaNegocioService;
    
    @Autowired
    CUsuarioRdnService serviceCUsuarioRdnService;
    
    @Autowired
    CAyudaUsuarioRdnService serviceCAyudaUsuarioRdnService;
    
    @Autowired
    CUsuarioRdnModificaService serviceCUsuarioRdnModificaService;
    
    @Autowired
    CRuedaNegocioModService serviceCRuedaNegocioModService;
    
    @Autowired
    CListaPerfilRdnService serviceCListaPerfilRdnService;
    
    @Autowired
    CPreguntasEstandarService serviceCPreguntasEstandarService;
    
    @Autowired
    CPreguntasEstRdnService serviceCPreguntasEstRdnService;
    
    @Autowired
    CPreguntasEstRdnModService serviceCPreguntasEstRdnModService;
    
    @Autowired
    PSectorService servicePSectorService;
    
    @Autowired
    PCategoriaSectorService servicePCategoriaSectorService;
    
    @Autowired
    PSectorParticipanteService servicePSectorParticipanteService;
    
    @Autowired
    PSubCategoriaSectorService servicePSubCategoriaSectorService;
    
    @Autowired
    PpreguntaRuedaService servicePpreguntaRuedaService;
    
    @Autowired
    PRespuestaPreguntasRegService servicePRespuestaPreguntasRegService;
    
    @Autowired
    PUbicaParticipanteService servicePUbicaParticipanteService;
    
    @Autowired
    PMascaraRegistroRdnService servicePMascaraRegistroRdnService;
    
    @Autowired
    CIdiomaService serviceCIdiomaService;
    
    @Autowired
    PProductosServiciosService servicePProductosServiciosService;
    
    @Autowired
    PProductosServiciosModService servicePProductosServiciosModService;
    
    @Autowired
    CConfiguraTipoPerfilService serviceCConfiguraTipoPerfilService;
    
    @Autowired
    CConfiguraTipoPerfilModService serviceCConfiguraTipoPerfilModService;
    
    @Autowired
    CCategoriaSectorService serviceCCategoriaSectorService;
    
    @Autowired
    CSectorModService serviceCSectorModService;
    
    @Autowired
    CSubCategoriaSectorService serviceCSubCategoriaSectorService;
    
    @Autowired
    CPreguntasRuedaService serviceCPreguntasRuedaService;
    
    @Autowired
    CPreguntasRuedaModService serviceCPreguntasRuedaModService;
    
    @Autowired
    CTtListaRespuestasModService serviceCTtListaRespuestasModService;
    
    @Autowired
    CListaTipoRespuestaService serviceCListaTipoRespuestaService;
    
    @Autowired
    CCamposParticipanteService serviceCCamposParticipanteService;
    
    @Autowired
    CMascaraRegistroRDNService serviceCMascaraRegistroRDNService;
    
    @Autowired
    CJornadaService serviceCJornadaService;
    
    @Autowired
    CJornadaModificaService serviceCJornadaModificaService;
    
    @Autowired
    CAsignaPaisesService serviceCAsignaPaisesService;
    
    @Autowired
    CAsignaPaisesModService serviceCAsignaPaisesModService;
    
    @Autowired
    PValidaContactoService servicePValidaContactoService;
    
    @Autowired
    PInfoContactoService servicePInfoContactoService;
    
    @Autowired
    CTerminoPoliticaService serviceCTerminoPoliticaService;
    
    @Autowired
    CListaTerminoPoliticaService serviceCListaTerminoPoliticaService;
    
    @Autowired
    CTerminoPoliticaModService serviceCTerminoPoliticaModService;
    
    @Autowired
    CAdministraMesaService serviceCAdministraMesaService;
    
    @Autowired
    PParticipantesRDNService servicePParticipantesRDNService;
    
    @Autowired
    PParticipanteContactoService servicePParticipanteContactoService;
    
    @Autowired
    PParticipanteProductoService servicePParticipanteProductoService;
    
    @Autowired
    PParticipantePreguntaService servicePParticipantePreguntaService;
    
    @Autowired
    CContenidoService serviceCContenidoService;
    
    @Autowired
    CCajaContenidoService serviceCCajaContenidoService;
    
    @Autowired
    CUsuarioPermisoService serviceCUsuarioPermisoService;
    
    @Autowired
    PAccesoContactoModService servicePAccesoContactoModService;
    
    @Autowired
    PValidaParticipanteService servicePValidaParticipanteService;
    
    @Autowired
    CNoticiaContenidoService serviceCNoticiaContenidoService;
    
    @Autowired
    CVideoContenidoService serviceCVideoContenidoService;
    
    @Autowired
    PRdnParticipanteService servicePRdnParticipanteService;
    
    @Autowired
    PRdnMenuParticipanteService servicePRdnMenuParticipanteService;
    
    @Autowired
    TtTiempoDuracionService serviceTtTiempoDuracionService;
    
    @Autowired
    CPreguntasContenidoService serviceCPreguntasContenidoService;
    
    @Autowired
    CMascaraContenidoService serviceCMascaraContenidoService;
    
    @Autowired
    TtEstadoCitaService serviceTtEstadoCitaService;
    
    @Autowired
    CFechaRuedaService serviceCFechaRuedaService;
    
    @Autowired
    CAgendaService serviceCAgendaService;
    
    @Autowired
    CAgendaModService serviceCAgendaModService;
    
    @Autowired
    TtTipoEnvioCorreoService serviceTtTipoEnvioCorreoService;
    
    @Autowired
    TtCamposRuedaService serviceTtCamposRuedaService;
    
    @Autowired
    CPlantillaCorreoService serviceCPlantillaCorreoService;
    
    @Autowired
    CContactoContenidoService serviceCContactoContenidoService;
    
    @Autowired
    TtFuenteService serviceTtFuenteService;
    
    @Autowired
    TtTamañoService serviceTtTamañoService;
    
    @Autowired
    CFormulaPlantillaModService serviceCFormulaPlantillaModService;
    
    @Autowired
    CProgramacionCorreoService serviceCProgramacionCorreoService;
    
    @Autowired
    CVigenciaService serviceCVigenciaService;
    
    @Autowired
    CFiltrosLinkRdnService serviceCFiltrosLinkRdnService;
    
    @Autowired
    CAdministraLinkRdnService serviceCAdministraLinkRdnService;
    
    @Autowired
    PopcionesRtaPreguntaService servicePopcionesRtaPreguntaService;
    
    @Autowired
    CValidaPermisoService serviceCValidaPermisoService;
    
    @Autowired
    PAgendaModService servicePAgendaModService;
    
    @Autowired
    PAgendaService servicePAgendaService;
    
    @Autowired
    CParticipanteService serviceCParticipanteService;
    
    @Autowired
    CParticipanteModService serviceCParticipanteModService;
    
    @Autowired
    CDatosEmpresaService serviceCDatosEmpresaService;
    
    @Autowired
    CDatosContactoService serviceCDatosContactoService;
    
    @Autowired
    CSectorPartService serviceCSectorPartService;
    
    @Autowired
    CCateSectorPartService serviceCCateSectorPartService;
    
    @Autowired
    PProductosServiciosPartService servicePProductosServiciosPartService;
    
    @Autowired
    CFormulaPlantillaService serviceCFormulaPlantillaService;
    
    @Autowired
    CAsignaAgendaService serviceCAsignaAgendaService;
    
    @Autowired
    CListaPlantillaCorreoService serviceCListaPlantillaCorreoService;
    
    @Autowired
    CRelDocEnvioCorreoModService serviceCRelDocEnvioCorreoModService;
    
    @Autowired
    CVisualizaParticipanteService serviceCVisualizaParticipanteService;
    
    @Autowired
    CRelEmpresaEnvioCorreoService serviceCRelEmpresaEnvioCorreoService;
    
    @Autowired
    CSubCatePartService serviceCSubCatePartService;
    
    @Autowired
    CPreguntasPartService serviceCPreguntasPartService;
    
    @Autowired
    CEvaluacionService serviceCEvaluacionService;
    
    @Autowired
    CEvaluacionModService serviceCEvaluacionModService;
    
    @Autowired
    CPreguntaEvaluacionModService serviceCPreguntaEvaluacionModService;
    
    @Autowired
    PEncabezaAgendaPdfService servicePEncabezaAgendaPdfService;
    
    @Autowired
    PCitasAgendaPdfService servicePCitasAgendaPdfService;
    
    @Autowired
    CPreguntasEvaluacionService serviceCPreguntasEvaluacionService;
    
    @Autowired
    CPreguntaEvaluacionPopService serviceCPreguntaEvaluacionPopService;
    
    @Autowired
    TtTipoEvaEncService serviceTtTipoEvaEncService;
    
    @Autowired
    CListaMomentoEnvioService serviceCListaMomentoEnvioService;
    
    @Autowired
    PNotificacionesService servicePNotificacionesService;
    
    @Autowired
    PNotificacionModService servicePNotificacionModService;
    
    @Autowired
    CEnvioRealCorreoService serviceCEnvioRealCorreoService;
    
    @Autowired
    CChatService serviceCChatService;
    
    @Autowired
    CusuariosEnvioCorreoService serviceCusuariosEnvioCorreoService;
    
    @Autowired
    CNotificacionService serviceCNotificacionService;
    
    @Autowired
    TtTipoCitaService serviceTtTipoCitaService;
    
    @Autowired
    CMascaraService serviceCMascaraService;
    
    @Autowired
    CDatosTableroService serviceCDatosTableroService;
    
    @Autowired
    CConsultaJornadaService serviceCConsultaJornadaService;
    
    @Autowired
    PRecintoService servicePRecintoService;
    
    @Autowired
    EnvioMailService serviceEnvioMailService;
    
    @Autowired
    IndividualEnvioCorreoService serviceIndividualEnvioCorreoService;
    
    @Autowired
    CRelDatosContactoService serviceCRelDatosContactoService;
    
    @Autowired
    PRuedaNegocioService servicePRuedaNegocioService;
    
    @Autowired
    CEvaluacionPartService serviceCEvaluacionPartService;
    
    @Autowired
    CAgendaPartService serviceCAgendaPartService;
    
    @Autowired
    CReporteEvaEncService serviceCReporteEvaEncService;
    
    @Autowired
    CRepEvaPreguntasService serviceCRepEvaPreguntasService;
    
    @Autowired
    CRepRespuestasService serviceCRepRespuestasService;
    
    @Autowired
    CReporteSectorCatSubService serviceCReporteSectorCatSubService;
    
    @Autowired
    CReporteParticipanteService serviceCReporteParticipanteService;
    
    @Autowired
    CDatosTableroPPService serviceCDatosTableroPPService;
    
    @Autowired
    CListaParticipantesRDNService serviceCListaParticipantesRDNService;
    
    @Autowired
    PRegistroContactoDocService servicePRegistroContactoDocService;
    
    @Autowired
    PRespuestaPreguntasSegEnService servicePRespuestaPreguntasSegEnService;
    
    @Autowired
    PValidaRdnContactoService servicePValidaRdnContactoService;
    
    @Autowired
    PRespPregSegEnService servicePRespPregSegEnService;
    
    @Autowired
    PCuentaNotificaService servicePCuentaNotificaService;
    
    @Autowired
    CEvaluacionConsService serviceCEvaluacionConsService;
    
    @Autowired
    PConsultaContactoChatService servicePConsultaContactoChatService;
    
    @Autowired
    PConsultaChatService servicePConsultaChatService;
    
    @Autowired
    PMesaChatModService servicePMesaChatModService;
    
    @Autowired
    PMesaChatMensModService servicePMesaChatMensModService;
    
    @Autowired
    CRepRespuestasGeneralService serviceCRepRespuestasGeneralService;
    
    @Autowired
    CChatMensModService serviceCChatMensModService;
    
    @Autowired
    CChatMensConsService serviceCChatMensConsService;
    
    @Autowired
    CActualizaAuditoriaService serviceCActualizaAuditoriaService;
    
    @Autowired
    CDefinirAuditoriaService serviceCDefinirAuditoriaService;
    
    @Autowired
    CListaUsuarioAuditoriaService serviceCListaUsuarioAuditoriaService;
    
    @Autowired
    CReporteAuditoriaService serviceCReporteAuditoriaService;
    
    @Autowired
    PTerminoPoliticaService servicePTerminoPoliticaService;
    
    @Autowired
    PCuentaChatService servicePCuentaChatService;
    
    @Autowired
    PAgendaSalaModService servicePAgendaSalaModService;
    
    @Autowired
    PChatService servicePChatService;
    
    @Autowired
    CNotificaContactoService serviceCNotificaContactoService;
    
    @Autowired
    CAdminSalasService serviceCAdminSalasService;
    
    @Autowired
    CAdminSalasModService serviceCAdminSalasModService;
    
    @Autowired
    PRecuperaDatosContactoService servicePRecuperaDatosContactoService;
    
    @Autowired
    CAdminSalasConfigService serviceCAdminSalasConfigService;
    
    @Autowired
    CRecuperaDatosUsuarioService serviceCRecuperaDatosUsuarioService;
    
    @Autowired
    CActualizaTokenService serviceCActualizaTokenService;
    
    @GetMapping("/consultarpaises")
    public List<TtPaisEntity> ConsultarPaises() {
        return servicepaisservice.listar();
    }
    
    @PostMapping("/insertalogweb")
    public String InsertaLogWeb(
            @RequestBody PLogWebEntity entity) {
        return servicePLogWebService.InsertaLogWeb(entity);
    }
    
    @GetMapping("/consultarclaserueda")
    public List<TtClaseRuedaEntity> ConsultarClaseRueda() {
        return serviceTtClaseRuedaService.listar();
    }
    
    @GetMapping("/consultartiporueda")
    public List<TtTipoRuedaEntity> ConsultarTipoRueda() {
        return serviceTtTipoRuedaService.listar();
    }
    
    @GetMapping("/consultartipoparticipante")
    public List<TtTipoParticipanteEntity> ConsultarTipoParticipante() {
        return serviceTtTipoParticipanteService.listar();
    }
    
    @GetMapping("/consultartipocierre")
    public List<TtTipoCierreEntity> ConsultarTipoCierre() {
        return serviceTtTipoCierreService.listar();
    }
    
    @GetMapping("/consultartipopregunta")
    public List<TtTipoPreguntaEntity> ConsultarTipoPregunta() {
        return serviceTtTipoPreguntaService.listar();
    }
    
    @GetMapping("/consultartipojornada")
    public List<TtTipoJornadaEntity> ConsultarTipoJornada() {
        return serviceTtTipoJornadaService.listar();
    }
    
    @GetMapping("/consultaridioma")
    public List<TtIdiomaEntity> ConsultarIdioma() {
        return serviceTtIdiomaService.listar();
    }
    
    @GetMapping("/consultartiposeleccion")
    public List<TtTipoSeleccionEntity> ConsultarTipoSeleccion() {
        return serviceTtTipoSeleccionService.listar();
    }
    
    @GetMapping("/consultartiposeleccionpais")
    public List<TtTipoSeleccionPaisEntity> ConsultarTipoSeleccionPais() {
        return serviceTtTipoSeleccionPaisService.listar();
    }
    
    @GetMapping("/consultarestadoparticipante")
    public List<TtEstadoParticipanteEntity> ConsultarEstadoParticipante() {
        return serviceTtEstadoParticipanteService.listar();
    }
    
    @GetMapping("/consultartipochat")
    public List<TtTipoChatEntity> ConsultarTipoChat() {
        return serviceTtTipoChatService.listar();
    }
    
    @GetMapping("/consultagenero")
    public List<TtGeneroEntity> ConsultaGenero() {
        return serviceTtGeneroService.listar();
    }
    
    @GetMapping("/consultatipoplantilla")
    public List<TtTipoPlantillaEntity> ConsultaTipoPlantilla() {
        return serviceTtTipoPlantillaService.listar();
    }
    
    @GetMapping("/consultatipoidentificacion")
    public List<TtTipoIdentificacionEntity> ConsultaTipoIdentificacion() {
        return serviceTtTipoIdentificacionService.listar();
    }
    
    @GetMapping("/consultatipoprogramacion")
    public List<TtTipoProgramacionEntity> ConsultaTipoProgramacion() {
        return serviceTtTipoProgramacionService.listar();
    }
    
    @GetMapping("/consultalistaestados")
    public List<CListaEstadoEntity> ConsultaListaEstados() {
        return serviceCListaEstadoService.ListaEstados();
    }
    
    @GetMapping("/consultalistafiltros/{Bandera}")
    public List<CListaFiltrosEntity> ConsultaListaFiltros(
            @PathVariable Integer Bandera) {
        return serviceCListaFiltrosService.ConsultaFiltros(Bandera);
    }
    
    @GetMapping("/consultadeptopais/{IdPais}")
    public List<CDptoPaisEntity> ConsultaDeptoPais(
            @PathVariable Integer IdPais) {
        return serviceCDptoPaisService.ConsultaCiudadPais(IdPais);
    }
    
    @GetMapping("/consultaciudadesdepto/{IdPais}/{IdDpto}")
    public List<CCiudadDptoEntity> ConsultaCiudadesDepto(
            @PathVariable Integer IdPais,
            @PathVariable String IdDpto) {
        return serviceCCiudadDptoService.ConsultaCiudadDepto(IdPais, IdDpto);
    }
    
    @GetMapping("/validausuarioconsola/{Usuario}")
    public String ValidaUsuario(
            @PathVariable String Usuario) {
        return serviceCValidaUsuarioConsolaService.ValidarUsuarioConsola(Usuario);
    }
    
    @GetMapping("/consultalistaroles/{Bandera}")
    public List<CListaRolEntity> ConsultaListaRoles(
            @PathVariable Integer Bandera) {
        return serviceCListaRolService.ConsultaListaRoles(Bandera);
    }
    
    @PostMapping("/usuarioconsola")
    public String ConsultaUsuarioConsola(
            @RequestBody CUsuarioInfoConsolaEntity usucons) {
        return serviceCConsultaUsuarioInfoConsolaService.ConsultaUsuarioInfo(usucons);
        
    }
    
    @PostMapping("/servicioencripta")
    public String ServicioEncriptaDesencripta(
            @RequestBody EncriptacionEntity entidad) {
        return serviceCConsultaUsuarioInfoConsolaService.Clave(entidad);
    }
    
    @PostMapping("/insertarolconsola/{Bandera}/{IdUsuario}")
    public String InsertarRolConsola(
            @RequestBody CListaRolEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return serviceCListaRolService.InsertarRolConsola(entidad, Bandera, IdUsuario);
    }
    
    @PutMapping("/actualizarolconsola/{Bandera}/{IdUsuario}")
    public String ActualizarRolConsola(
            @RequestBody CListaRolEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return serviceCListaRolService.ActualizarRolConsola(entidad, Bandera, IdUsuario);
    }
    
    @GetMapping("/consultapermisosrol/{bandera}/{IdRol}/{NombreRol}")
    public List<CPermisosRolEntity> ConsultaPermisosRol(
            @PathVariable Integer bandera,
            @PathVariable Integer IdRol,
            @PathVariable String NombreRol) {
        return serviceCPermisosRolService.ConsultaPermisosRol(bandera, IdRol,
                NombreRol);
    }
    
    @PostMapping("/insertarpermisosrolconsola/{Bandera}/{IdUsuario}")
    public String InsertarPermisosRolConsola(
            @RequestBody CPermisosRolEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return serviceCPermisosRolService.InsertarPermisosRolConsola(entidad,
                Bandera, IdUsuario);
    }
    
    @PutMapping("/actualizarpermisosrolconsola/{Bandera}/{IdUsuario}")
    public String ActualizarPermisosRolConsola(
            @RequestBody CPermisosRolEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return serviceCPermisosRolService.ActualizarPermisosRolConsola(entidad,
                Bandera, IdUsuario);
    }
    
    @GetMapping("/consultausuarioroles/{Bandera}/{Idusuario}")
    public List<CUsuarioConsultaRolesEntity> ConsultaPermisosRol(
            @PathVariable Integer Bandera,
            @PathVariable Integer Idusuario) {
        return serviceCUsuarioConsultaRolesService.ConsultaRoles(Bandera,
                Idusuario);
    }
    
    @GetMapping("/consultausuariosconsola/{Bandera}/{Idusuario}/{Estado}/{IdRol}/{IdUsuarioCons}/{NombreUsuario}")
    public List<CUsuarioConsModEntity> ConsultaUsuariosConsola(
            @PathVariable Integer Bandera,
            @PathVariable Integer Idusuario,
            @PathVariable Integer Estado,
            @PathVariable Integer IdRol,
            @PathVariable Integer IdUsuarioCons,
            @PathVariable String NombreUsuario) {
        return serviceCUsuarioConsModService.ConsultaUsuarioConsola(Bandera, Idusuario,
                Estado, IdRol, IdUsuarioCons, NombreUsuario);
    }
    
    @PostMapping("/insertarusuarioconsmod/{Bandera}/{Idusuario}")
    public String InsertarUsuarioConsMod(
            @RequestBody CUsuarioConsModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer Idusuario) {
        return serviceCUsuarioConsModService.InsertarUsuarioConsMod(entidad, Bandera,
                Idusuario);
    }
    
    @PutMapping("/actualizarusuarioconsmod/{Bandera}/{Idusuario}")
    public String ActualizarUsuarioConsMod(
            @RequestBody CUsuarioConsModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer Idusuario) {
        return serviceCUsuarioConsModService.ActualizarUsuarioConsMod(entidad, Bandera,
                Idusuario);
    }
    
    @PostMapping("/insertarelacionrolusuario/{Bandera}/{IdUsuario}")
    public String InsertarRelacionRolUsuario(
            @RequestBody CUsuarioInfoConsolaEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return serviceCConsultaUsuarioInfoConsolaService.InsertarRelUsuarioRol(entidad,
                Bandera, IdUsuario);
    }
    
    @PutMapping("/actualizarrelacionrolusuario/{Bandera}/{IdUsuario}")
    public String ActualizarRelacionRolUsuario(
            @RequestBody CUsuarioInfoConsolaEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return serviceCConsultaUsuarioInfoConsolaService.ActualizarRelUsuarioRol(entidad,
                Bandera, IdUsuario);
    }
    
    @GetMapping("/consultaredsocialadm/{IdRed}/{NombreRed}/{bandera}/{Estado}")
    public List<CRedSocialAdmEntity> ConsultaRedesSocialesAdm(
            @PathVariable Integer IdRed,
            @PathVariable String NombreRed,
            @PathVariable Integer bandera,
            @PathVariable Integer Estado) {
        return serviceCRedSocialAdmService.ConsultarRedSocialAdm(IdRed,
                NombreRed, bandera, Estado);
    }
    
    @PostMapping("/insertaredsocialadm/{Bandera}")
    public String InsertarRedSocialAdm(
            @RequestBody CRedSocialAdmEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCRedSocialAdmService.InsertarRedSocial(entidad, Bandera);
    }
    
    @PutMapping("/actualizaredsocialadm/{Bandera}")
    public String ActualizarRedSocialAdm(
            @RequestBody CRedSocialAdmEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCRedSocialAdmService.ActualizarRedSocial(entidad, Bandera);
    }
    
    @GetMapping("/consultapatacategoria/{Idioma}/{idusuario}/{IdRdn}/{IdCategoriaPata}/{bandera}")
    public List<CPataCategEntity> ConsultaPataCategoria(
            @PathVariable String Idioma,
            @PathVariable Integer idusuario,
            @PathVariable Integer IdRdn,
            @PathVariable Integer IdCategoriaPata,
            @PathVariable Integer bandera) {
        return serviceCPataCategService.ConsultaPataCateg(Idioma, idusuario,
                IdRdn, IdCategoriaPata, bandera);
    }
    
    @PostMapping("/insertapatacategoria/{Idioma}/{idusuario}/{bandera}")
    public String InsertarPataCategoria(
            @RequestBody CPataCategModificaEntity entidad,
            @PathVariable String Idioma,
            @PathVariable Integer idusuario,
            @PathVariable Integer bandera) {
        return serviceCPataCategModificaService.InsertaPataCategoria(entidad,
                Idioma, idusuario, bandera);
    }
    
    @PutMapping("/actualizapatacategoria/{Idioma}/{idusuario}/{bandera}")
    public String ActualizarPataCategoria(
            @RequestBody CPataCategModificaEntity entidad,
            @PathVariable String Idioma,
            @PathVariable Integer idusuario,
            @PathVariable Integer bandera) {
        return serviceCPataCategModificaService.ActualizaPataCategoria(entidad,
                Idioma, idusuario, bandera);
    }
    
    @GetMapping("/consultardnpatalogos/{Idioma}/{idusuario}/{IdRdn}/{IdCategoriaPata}/{bandera}")
    public List<CRdnPatalogosEntity> ConsultaRdnPatalogos(
            @PathVariable String Idioma,
            @PathVariable Integer idusuario,
            @PathVariable Integer IdRdn,
            @PathVariable Integer IdCategoriaPata,
            @PathVariable Integer bandera) {
        return serviceCRdnPatalogosService.ConsultaRdnPatalogos(Idioma, idusuario,
                IdRdn, IdCategoriaPata, bandera);
    }
    
    @PostMapping("/insertardnpatalogos/{Idioma}/{idusuario}/{bandera}")
    public String InsertarRdnPatalgos(
            @RequestBody CRdnPatalogosEntity entidad,
            @PathVariable String Idioma,
            @PathVariable Integer idusuario,
            @PathVariable Integer bandera) {
        return serviceCRdnPatalogosService.InsertarRdnPatalogo(entidad, Idioma,
                idusuario, bandera);
    }
    
    @PutMapping("/actualizardnpatalogos/{Idioma}/{idusuario}/{bandera}")
    public String ActualizarRdnPatalogos(
            @RequestBody CRdnPatalogosEntity entidad,
            @PathVariable String Idioma,
            @PathVariable Integer idusuario,
            @PathVariable Integer bandera) {
        return serviceCRdnPatalogosService.ActualizarRdnPatalogo(entidad, Idioma,
                idusuario, bandera);
    }

    //Subida Imagenes
    @PostMapping("/uploadFile")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        String fileName = null;
        try {
            fileName = fileStorageService.storeFile(file);
        } catch (FileStorageException ex) {
            System.out.println("Error " + ex);;
        }
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/ImagenesRDN/")
                //configuracion corferias
                //.path("https://imagenesappcdi.corferias.co/ImagenesCorferias/")
                .path(fileName)
                .toUriString();
        fileDownloadUri = fileDownloadUri.replace(":8082/CorferiasRuedaNegocios", "");
        //fileDownloadUri = fileDownloadUri.replace(":443/CorferiasService", "");
        try {

            //file.transferTo(new File("D:/ImagenesRDN/" + fileName));
            file.transferTo(new File("C:/inetpub/wwwroot/ImagenesRDN/" + fileName));
            //configuracion corferias
            //file.transferTo(new File("E:/SitioImagenes/ImagenesCorferias/" + fileName));
        } catch (IOException | IllegalStateException ex) {
            System.out.println("Error " + ex);;
        }
        UploadFileResponse uploadfile = new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
        uploadfile.getFileDownloadUri();
        return JSONObject.quote("Archivo Subido Correctamente");
    }
    
    @PostMapping("/uploadarchivos")
    public String UploadArchivos(@RequestParam("file") MultipartFile file) {
        String fileName = null;
        try {
            fileName = fileStorageService.storeFile(file);
        } catch (FileStorageException ex) {
            System.out.println("Error " + ex);;
        }
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/ImagenesRDN/ArchivosRDN/")
                //configuracion corferias
                //.path("https://imagenesappcdi.corferias.co/ImagenesCorferias/")
                .path(fileName)
                .toUriString();
        fileDownloadUri = fileDownloadUri.replace(":8082/CorferiasRuedaNegocios", "");
        //fileDownloadUri = fileDownloadUri.replace(":443/CorferiasService", "");
        try {

            //file.transferTo(new File("D:/ArchivosRDN/" + fileName));
            file.transferTo(new File("C:/inetpub/wwwroot/ImagenesRDN/ArchivosRDN/" + fileName));
            //configuracion corferias
            //file.transferTo(new File("E:/SitioImagenes/ImagenesCorferias/" + fileName));
        } catch (IOException | IllegalStateException ex) {
            System.out.println("Error " + ex);;
        }
        UploadFileResponse uploadfile = new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
        uploadfile.getFileDownloadUri();
        return JSONObject.quote("Archivo Subido Correctamente");
    }
    
    @PostMapping("/uploadMultipleFiles")
    public List<String> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        return Arrays.asList(files)
                .stream()
                .map(file -> uploadFile(file))
                .collect(Collectors.toList());
    }
    
    @PostMapping("/uploadimagepdf")
    public String Uploadimagepdf(@RequestParam("file") MultipartFile file) {
        String fileName = null;
        try {
            fileName = fileStorageService.storeFile(file);
        } catch (FileStorageException ex) {
            System.out.println("Error " + ex);;
        }
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/ImagenesParticipantes/")
                .path(fileName)
                .toUriString();
        fileDownloadUri = fileDownloadUri.replace(":8082/CorferiasRuedaNegocios", "");
        //fileDownloadUri = fileDownloadUri.replace(":443/CorferiasService", "");
        try {

            //file.transferTo(new File("D:/ImagenesRDN/" + fileName));
            file.transferTo(new File("C:/inetpub/RDNWeb/assets/ImagenesParticipantes/" + fileName));
            
        } catch (IOException | IllegalStateException ex) {
            System.out.println("Error " + ex);;
        }
        UploadFileResponse uploadfile = new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
        uploadfile.getFileDownloadUri();
        return JSONObject.quote("Archivo Subido Correctamente");
    }
    
    @GetMapping("/consultaregistroparticipante/{Bandera}/{Idioma}/{IdParticipante}/{NoIdentificacion}")
    public List<PRegistroParticipanteEntity> ConsultaRegistroParticipante(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdParticipante,
            @PathVariable String NoIdentificacion) {
        return servicePRegistroParticipanteService.ConsultaRegistroParticipante(Bandera,
                Idioma, IdParticipante, NoIdentificacion);
    }
    
    @PostMapping("/insertaregistroparticipante/{Bandera}/{IdUsuario}")
    public String InsertarRegistroParticipante(
            @RequestBody PRegistroParticipanteModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return servicePRegistroParticipanteModService.InsertaRegistroParticipante(entidad,
                Bandera, IdUsuario);
    }
    
    @PutMapping("/actualizaregistroparticipante/{Bandera}/{IdUsuario}")
    public String ActualizarRegistroParticipante(
            @RequestBody PRegistroParticipanteModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return servicePRegistroParticipanteModService.ActualizarRegistroParticipante(entidad,
                Bandera, IdUsuario);
    }
    
    @GetMapping("/consultaregistrocontacto/{Bandera}/{Idioma}/{IdContacto}")
    public String ConsultaRegistroContacto(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdContacto) {
        return servicePRegistroContactoService.ConsultaRegistroContacto(Bandera, Idioma,
                IdContacto);
    }
    
    @PostMapping("/insertaregistrocontacto/{Bandera}/{IdUsuario}")
    public String InsertarRegistroContacto(
            @RequestBody PRegistroContactoModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return servicePRegistroContactoService.InsertarRegistroContacto(entidad, Bandera, IdUsuario);
    }
    
    @PutMapping("/actualizaregistrocontacto/{Bandera}/{IdUsuario}")
    public String ActualizarRegistroContacto(
            @RequestBody PRegistroContactoModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return servicePRegistroContactoService.InsertarRegistroContacto(entidad, Bandera, IdUsuario);
    }
    
    @GetMapping("/consultaperfilruedanegocio/{Bandera}/{Idioma}/{Idparticipante}/{IdRuedaNegocio}")
    public List<PPerfilRuedaNegocioEntity> ConsultaPerfilRuedaNegocio(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer Idparticipante,
            @PathVariable Integer IdRuedaNegocio) {
        return servicePPerfilRuedaNegocioService.ConsultaRuedaNegocio(Bandera,
                Idioma, Idparticipante, IdRuedaNegocio);
    }
    
    @GetMapping("/consultaregistroperfil/{Bandera}/{Idioma}/{IdRueda}")
    public List<PRegistroPerfilEntity> ConsultaRegistroPerfil(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdRueda) {
        return servicePRegistroPerfilService.ConsultarRegistroPerfil(Bandera, Idioma, IdRueda);
    }
    
    @PostMapping("/insertarregistroperfil/{Bandera}/{IdUsuario}")
    public String InsertarRegistroPerfil(
            @RequestBody PRegistroPerfilModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return servicePRegistroPerfilModService.InsertarRegistroPerfil(entidad, Bandera, IdUsuario);
    }
    
    @GetMapping("/consultarecinto/{bandera}/{Idioma}/{idusuario}/{NombreRecinto}/{IdRecinto}/{Estado}/{Imagen}/{Publicar}/{IdPais}")
    public List<CRecintoEntity> ConsultaRecinto(
            @PathVariable Integer bandera,
            @PathVariable String Idioma,
            @PathVariable Integer idusuario,
            @PathVariable String NombreRecinto,
            @PathVariable Integer IdRecinto,
            @PathVariable Integer Estado,
            @PathVariable String Imagen,
            @PathVariable Integer Publicar,
            @PathVariable Integer IdPais) {
        return serviceCRecintoService.ConsultaRecinto(bandera, Idioma, idusuario, NombreRecinto, IdRecinto, Estado, Imagen, Publicar, IdPais);
    }
    
    @PostMapping("/insertarecinto/{Bandera}/{Idioma}/{idusuario}")
    public String InsertarRecinot(
            @RequestBody CRecintoModificaEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer idusuario) {
        return serviceCRecintoModificaService.InsertarRecinto(entidad, Bandera,
                Idioma, idusuario);
    }
    
    @PutMapping("/actualizarecinto/{Bandera}/{Idioma}/{idusuario}")
    public String ActualizarRegistroContacto(
            @RequestBody CRecintoModificaEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer idusuario) {
        return serviceCRecintoModificaService.ActualizarRecinto(entidad, Bandera,
                Idioma, idusuario);
    }
    
    @GetMapping("/consultaredsocialg/{IdModulo}/{IdFuncion}/{Bandera}")
    public List<PRedSocialGEntity> ConsultaRedSocial(
            @PathVariable Integer IdModulo,
            @PathVariable String IdFuncion,
            @PathVariable Integer Bandera) {
        return servicePRedSocialGService.ConsultaRedSocialG(IdModulo, IdFuncion, Bandera);
    }
    
    @PostMapping("/insertaredsocialg/{Bandera}/{IdModulo}")
    public String InsertarRedSocialG(
            @RequestBody PRedSocialGModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdModulo) {
        return servicePRedSocialGModService.InsertarRedSocialG(entidad, Bandera,
                IdModulo);
    }
    
    @PutMapping("/actualizaredsocialg/{Bandera}/{IdModulo}")
    public String ActualizarRedSocialG(
            @RequestBody PRedSocialGModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdModulo) {
        return servicePRedSocialGModService.ActualizarRedSocialG(entidad, Bandera,
                IdModulo);
    }
    
    @GetMapping("/consultapreguntasestandaradm/{Bandera}/{Idioma}/{Pregunta}/{IdPregunta}")
    public List<CAdmPreguntaEstandarEntity> ConsultaPreguntasEstandarAdm(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable String Pregunta,
            @PathVariable Integer IdPregunta) {
        return serviceCAdmPreguntaEstandarService.ConsultaAdmPreguntasEstandar(Bandera,
                Idioma, Pregunta, IdPregunta);
    }
    
    @PostMapping("/insertapreguntasestandarmodadm/{bandera}/{Idioma}")
    public String InsertarPreguntasEstandarModAdm(
            @RequestBody CAdmPreguntaEstandarModEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable String Idioma) {
        return serviceCAdmPreguntaEstandarModService.InsertaPreguntaEstandarOtroIdioma(entidad,
                bandera, Idioma);
    }
    
    @PutMapping("/actualizapregutnasestandarmodamd/{bandera}/{Idioma}")
    public String ActualizarPreguntasEstandarModAdm(
            @RequestBody CAdmPreguntaEstandarModEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable String Idioma) {
        return serviceCAdmPreguntaEstandarModService.ActualizaPreguntaEstandar(entidad, bandera, Idioma);
    }
    
    @GetMapping("/consultarubicacion")
    public List<TtUbicacionEntity> ConsultarUbicacion() {
        return serviceTtUbicacionService.listar();
    }
    
    @GetMapping("/consultalistarecinto/{Bandera}")
    public List<CListaRecintoEntity> ConsultaListaRecinto(
            @PathVariable Integer Bandera) {
        return serviceCListaRecintoService.ConsultaRecinto(Bandera);
    }
    
    @GetMapping("/consultarlistaofdem")
    public List<TtListaOfDemEntity> ConsultarlistaOfDem() {
        return serviceTtListaOfDemService.listar();
    }
    
    @PostMapping("/consultaruedanegocios/{bandera}/{Idioma}/{Idusuario}/{TipoPart}")
    public List<CRuedaNegocioEntity> ConsultaRuedaNegocios(
            @RequestBody CRuedaNegocioEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable String Idioma,
            @PathVariable Integer Idusuario,
            @PathVariable Integer TipoPart) {
        return serviceCRuedaNegocioService.ConsultaRuedaNegocios(entidad, bandera,
                Idioma, Idusuario, TipoPart);
    }
    
    @GetMapping("/consultausuariordn/{Bandera}/{Idusuario}")
    public List<CUsuarioRdnEntity> ConsultaUsuarioRdn(
            @PathVariable Integer Bandera,
            @PathVariable Integer Idusuario) {
        return serviceCUsuarioRdnService.ConsultaUsuarioRdn(Bandera, Idusuario);
    }
    
    @GetMapping("/consultayudausariordn/{bandera}/{IdRuedaNegocio}/{NombreRdn}")
    public List<CAyudaUsuarioRdnEntity> ConsultaAyudaUsuarioRdn(
            @PathVariable Integer bandera,
            @PathVariable Integer IdRuedaNegocio,
            @PathVariable String NombreRdn) {
        return serviceCAyudaUsuarioRdnService.AyudaUsuarioRdn(bandera, IdRuedaNegocio, NombreRdn);
    }
    
    @PostMapping("/insertarusuariordnmod/{Bandera}")
    public String InsertarUsuarioRdnMod(
            @RequestBody CUsuarioRdnModificaEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCUsuarioRdnModificaService.InsertarRelUsuarioRueda(entidad,
                Bandera);
    }
    
    @DeleteMapping("/eliminarusuariordnmod/{Bandera}")
    public String EliminarUsuarioRdnMod(
            @RequestBody CUsuarioRdnModificaEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCUsuarioRdnModificaService.InsertarRelUsuarioRueda(entidad,
                Bandera);
    }
    
    @PostMapping("/insertaruedanegociomod/{bandera}/{Idioma}")
    public String InsertarRuedaNegocioMod(
            @RequestBody CRuedaNegocioModEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable String Idioma) {
        return serviceCRuedaNegocioModService.InsertarRuedaNegocio(entidad, bandera, Idioma);
    }
    
    @PutMapping("/actualizaruedanegociosmod/{bandera}/{Idioma}")
    public String ActualizarRuedaNegociosMod(
            @RequestBody CRuedaNegocioModEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable String Idioma) {
        return serviceCRuedaNegocioModService.ActualizarRuedaNegocio(entidad, bandera, Idioma);
    }
    
    @GetMapping("/consultalistaperfilrdn/{bandera}/{Idioma}/{IdUsuario}/{IdRdn}/{IdParticipante}")
    public List<CListaPerfilRdnEntity> ConsultaListaPerfil(
            @PathVariable Integer bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuario,
            @PathVariable Integer IdRdn,
            @PathVariable Integer IdParticipante) {
        return serviceCListaPerfilRdnService.ConsultaListaPerfil(bandera,
                Idioma, IdUsuario, IdRdn, IdParticipante);
    }
    
    @GetMapping("/consultapreguntasestandar/{bandera}/{Idioma}/{IdRdn}/{IdPerfil}")
    public List<CPreguntasEstandarEntity> ConsultaPregutnasEstandar(
            @PathVariable Integer bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdRdn,
            @PathVariable Integer IdPerfil) {
        return serviceCPreguntasEstandarService.ConsultapreguntasEstandar(bandera, Idioma,
                IdRdn, IdPerfil);
    }
    
    @GetMapping("/consultapreguntasestrdn/{bandera}/{Idioma}/{IdRdn}/{IdPerfil}")
    public List<CPreguntasEstRdnEntity> ConsultaPreguntasEstRdn(
            @PathVariable Integer bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdRdn,
            @PathVariable Integer IdPerfil) {
        return serviceCPreguntasEstRdnService.ConsultaPreguntasEstRdn(bandera,
                Idioma, IdRdn, IdPerfil);
    }
    
    @PostMapping("/insertarpreguntasestrdnmod/{bandera}")
    public String InsertarRuedaNegocioMod(
            @RequestBody CPreguntasEstRdnModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCPreguntasEstRdnModService.InsertarPreguntasEstRdn(entidad, bandera);
    }
    
    @PutMapping("/actualizarpreguntasestrdnmod/{bandera}")
    public String ActualizarRuedaNegociosMod(
            @RequestBody CPreguntasEstRdnModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCPreguntasEstRdnModService.ActualizarPreguntasEstRdn(entidad, bandera);
    }
    
    @GetMapping("/consultasectores/{Bandera}/{IdRuedaNegocio}/{Idioma}/{IdSector}")
    public List<PSectorEntity> ConsultaSectores(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRuedaNegocio,
            @PathVariable String Idioma,
            @PathVariable Integer IdSector) {
        return servicePSectorService.ConsultaSectores(Bandera, IdRuedaNegocio, Idioma, IdSector);
    }
    
    @GetMapping("/consultacategoriasector/{Bandera}/{IdSector}/{Idioma}")
    public List<PCategoriaSectorEntity> ConsultaCategoriaSector(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdSector,
            @PathVariable String Idioma) {
        return servicePCategoriaSectorService.ConsultaCategoriaSector(Bandera, IdSector,
                Idioma);
    }
    
    @GetMapping("/consultasectorparticipante/{Bandera}/{Idioma}/{IdParticipante}/{IdRueda}")
    public List<PSectorParticipanteEntity> ConsutlaSectorParticipante(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdParticipante,
            @PathVariable Integer IdRueda) {
        return servicePSectorParticipanteService.ConsultaSectorParticipante(Bandera,
                Idioma, IdParticipante, IdRueda);
    }
    
    @PostMapping("/insertarsectorparticipantemod/{Bandera}/{Idioma}")
    public String InsertarSectorParticipanteMod(
            @RequestBody PSectorParticipanteEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return servicePSectorParticipanteService.InsertarConsultaSectorParticipante(entidad,
                Bandera, Idioma);
    }
    
    @PutMapping("/actualizarsectorparticipantemod/{Bandera}/{Idioma}")
    public String ActualizarSectorParticipanteMod(
            @RequestBody PSectorParticipanteEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return servicePSectorParticipanteService.ActualizarConsultaSectorParticipante(entidad,
                Bandera, Idioma);
    }
    
    @GetMapping("/consultasubcategoriasector/{Bandera}/{IdSector}/{Idioma}")
    public List<PSubCategoriaSectorEntity> ConsultaSubCategoriaSector(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdSector,
            @PathVariable String Idioma) {
        return servicePSubCategoriaSectorService.ConsultaSubCategoriaSector(Bandera,
                IdSector, Idioma);
    }
    
    @GetMapping("/consultapreguntarueda/{Bandera}/{IdRuedaNegocio}/{Idioma}/{IdParticipante}")
    public List<PpreguntaRuedaEntity> ConsultaPreguntaRueda(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRuedaNegocio,
            @PathVariable String Idioma,
            @PathVariable Integer IdParticipante) {
        return servicePpreguntaRuedaService.ConsultaPreguntaRueda(Bandera,
                IdRuedaNegocio, Idioma, IdParticipante);
    }
    
    @PostMapping("/insertarespuestaspreguntas/{Bandera}")
    public String InsertarRespuestasPreguntas(
            @RequestBody PRespuestaPreguntasRegEntity entidad,
            @PathVariable Integer Bandera) {
        return servicePRespuestaPreguntasRegService.InsertarRespuestasPreguntas(entidad, Bandera);
    }
    
    @PutMapping("/actualizarespuestaspreguntas/{Bandera}")
    public String ActualizarRespuestasPreguntas(
            @RequestBody PRespuestaPreguntasRegEntity entidad,
            @PathVariable Integer Bandera) {
        return servicePRespuestaPreguntasRegService.ActualizarRespuestasPreguntas(entidad, Bandera);
    }
    
    @GetMapping("/consultaubicaparticipante/{Bandera}/{IdParticipante}/{IdRdn}")
    public List<PUbicaParticipanteEntity> ConsultaUbicaParticipante(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdParticipante,
            @PathVariable Integer IdRdn) {
        return servicePUbicaParticipanteService.ConsultaUbicaParticipante(Bandera,
                IdParticipante, IdRdn);
    }
    
    @PostMapping("/insertaubicaparticipante/{Bandera}")
    public String InsertaUbicaParticipante(
            @RequestBody PUbicaParticipanteEntity entidad,
            @PathVariable Integer Bandera) {
        return servicePUbicaParticipanteService.InsertarUbicaParticipante(entidad, Bandera);
    }
    
    @PutMapping("/actualizaubicaparticipante/{Bandera}")
    public String ActualizaUbicaParticipante(
            @RequestBody PUbicaParticipanteEntity entidad,
            @PathVariable Integer Bandera) {
        return servicePUbicaParticipanteService.ActualizarUbicaParticipante(entidad, Bandera);
    }
    
    @GetMapping("/consultamascararegistrordn/{IdLabel}/{IdRdn}")
    public List<PMascaraRegistroRdnEntity> ConsultaMascaraRegistroRdn(
            @PathVariable Integer IdLabel,
            @PathVariable Integer IdRdn) {
        return servicePMascaraRegistroRdnService.ConsultaMascaraRegistro(IdLabel, IdRdn);
    }
    
    @GetMapping("/consultaidiomas/{Id}/{Idsec}/{bandera}")
    public List<CIdiomaEntity> ConsultaIdioma(
            @PathVariable Integer Id,
            @PathVariable Integer Idsec,
            @PathVariable Integer bandera) {
        return serviceCIdiomaService.ConsultaIdioma(Id, Idsec, bandera);
    }
    
    @GetMapping("/consultaproductoservicios/{bandera}/{Idioma}/{Producto}/{IdParticipante}/{IdProducto}")
    public List<PProductosServiciosEntity> ConsultaProductosServicios(
            @PathVariable Integer bandera,
            @PathVariable String Idioma,
            @PathVariable String Producto,
            @PathVariable Integer IdParticipante,
            @PathVariable Integer IdProducto) {
        return servicePProductosServiciosService.ConsultaProductosServicio(bandera, Idioma,
                Producto, IdParticipante, IdProducto);
    }
    
    @PostMapping("/insertarproductoservicio/{Bandera}/{Idioma}")
    public String InsertarProductoServicio(
            @RequestBody PProductosServiciosModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return servicePProductosServiciosModService.InsertarProductosServicios(entidad, Bandera, Idioma);
    }
    
    @PutMapping("/actualizarproductoservicio/{Bandera}/{Idioma}")
    public String ActualizarProductoServicio(
            @RequestBody PProductosServiciosModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return servicePProductosServiciosModService.ActualizarProductosServicios(entidad, Bandera, Idioma);
    }
    
    @GetMapping("/consultaconfiguratipoperfil/{bandera}/{IdRdn}/{IdTipoPerfil}/{Descripcion}/{Idioma}")
    public List<CConfiguraTipoPerfilEntity> ConsultaConfiguraTipoPerfil(
            @PathVariable Integer bandera,
            @PathVariable Integer IdRdn,
            @PathVariable Integer IdTipoPerfil,
            @PathVariable String Descripcion,
            @PathVariable String Idioma) {
        return serviceCConfiguraTipoPerfilService.ConsultaTipoPerfil(bandera, IdRdn,
                IdTipoPerfil, Descripcion, Idioma);
    }
    
    @PostMapping("/insertaconfiguratipoperfilmod/{Bandera}/{Idioma}")
    public String InsetarConfiguraTipoPerfil(
            @RequestBody CConfiguraTipoPerfilModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCConfiguraTipoPerfilModService.InsertarConfiguraTipoPerfil(entidad,
                Bandera, Idioma);
    }
    
    @PutMapping("/actualizaconfiguratipoperfilmod/{Bandera}/{Idioma}")
    public String ActualizaConfiguraTipoPerfil(
            @RequestBody CConfiguraTipoPerfilModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCConfiguraTipoPerfilModService.ActualizarConfiguraTipoPerfil(entidad,
                Bandera, Idioma);
    }
    
    @DeleteMapping("/eliminaconftipoperfil/{Bandera}/{Idioma}")
    public String EliminaConfTipoPerfil(
            @RequestBody CConfiguraTipoPerfilModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCConfiguraTipoPerfilModService.EliminarConfiguraTipoPerfil(entidad, Bandera, Idioma);
    }
    
    @GetMapping("/consultacategoriasector/{Bandera}/{Idioma}/{IdCategoria}/{NombreCategoria}/{IdSector}/{NombreSector}")
    public List<CCategoriaSectorEntity> ConsultaConfiguraTipoPerfil(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdCategoria,
            @PathVariable String NombreCategoria,
            @PathVariable Integer IdSector,
            @PathVariable String NombreSector) {
        return serviceCCategoriaSectorService.ConsultaCategoriaSector(Bandera, Idioma,
                IdCategoria, NombreCategoria, IdSector, NombreSector);
    }
    
    @PostMapping("/insertasectormod/{Bandera}/{Idioma}")
    public String InsertarSectorMod(
            @RequestBody CSectorModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCSectorModService.InsertarSectorMod(entidad, Bandera, Idioma);
    }
    
    @PutMapping("/actualizasectormod/{Bandera}/{Idioma}")
    public String ActualizaSectorMod(
            @RequestBody CSectorModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCSectorModService.ActualizarSectorMod(entidad, Bandera, Idioma);
    }
    
    @PostMapping("/insertarcategoriasectormodifica/{Bandera}/{Idioma}")
    public String InsertarCategoriaSectorModifica(
            @RequestBody CCategoriaSectorEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCCategoriaSectorService.InsertarCategoriaSector(entidad, Bandera,
                Idioma);
    }
    
    @PutMapping("/actualizacategoriasectormodifica/{Bandera}/{Idioma}")
    public String ActualizarCategoriaSectorModifica(
            @RequestBody CCategoriaSectorEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCCategoriaSectorService.ActualizarCategoriaSector(entidad, Bandera,
                Idioma);
    }
    
    @GetMapping("/csubconsultasubcategoriasectores/{Bandera}/{Idioma}/{IdCategoria}/{IdSubCategoria}/{NombreCategoria}")
    public List<CSubCategoriaSectorEntity> ConsultaSubCategoriaSector(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdCategoria,
            @PathVariable Integer IdSubCategoria,
            @PathVariable String NombreCategoria) {
        return serviceCSubCategoriaSectorService.CSubConsultaSubCategoriaSector(Bandera,
                Idioma, IdCategoria, IdSubCategoria, NombreCategoria);
    }
    
    @PostMapping("/insertarsubcategoriasector/{Bandera}/{Idioma}")
    public String InsertarSubCategoriaSector(
            @RequestBody CSubCategoriaSectorEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCSubCategoriaSectorService.CSubInsertarSubCategoriaSector(entidad,
                Bandera, Idioma);
    }
    
    @PutMapping("/actualizarsubcategoriasector/{Bandera}/{Idioma}")
    public String ActualizarSubCategoriaSector(
            @RequestBody CSubCategoriaSectorEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCSubCategoriaSectorService.CSubActualizarSubCategoriaSector(entidad,
                Bandera, Idioma);
    }
    
    @GetMapping("/consultapreguntasrueda/{Bandera}/{Idioma}/{IdUsuario}/{IdRueda}/{IdPerfil}/{IdPregunta}")
    public List<CPreguntasRuedaEntity> ConsultaPreguntasRueda(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuario,
            @PathVariable Integer IdRueda,
            @PathVariable Integer IdPerfil,
            @PathVariable Integer IdPregunta) {
        return serviceCPreguntasRuedaService.ConsultaPreguntasRueda(Bandera, Idioma,
                IdUsuario, IdRueda, IdPerfil, IdPregunta);
    }
    
    @PostMapping("/insertarpreguntasruedanegocios/{Bandera}/{Idioma}")
    public String InsertarPreguntasRuedaNegocios(
            @RequestBody CPreguntasRuedaModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCPreguntasRuedaModService.InsertarPreguntasRueda(entidad, Bandera,
                Idioma);
    }
    
    @PutMapping("/actualizarpreguntasruedanegocios/{Bandera}/{Idioma}")
    public String ActualizarPreguntasRuedaNegocios(
            @RequestBody CPreguntasRuedaModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCPreguntasRuedaModService.ActualizarPreguntasRueda(entidad, Bandera,
                Idioma);
    }
    
    @PostMapping("/insertarlistarespuestas/{Bandera}/{Idioma}")
    public String InsertarListaRespuestas(
            @RequestBody CTtListaRespuestasModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCTtListaRespuestasModService.InsertarListaRespuestas(entidad,
                Bandera, Idioma);
    }
    
    @PutMapping("/actualizarlistarespuestas/{Bandera}/{Idioma}")
    public String ActualizarListaRespuestas(
            @RequestBody CTtListaRespuestasModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCTtListaRespuestasModService.ActualizarListaRespuestas(entidad,
                Bandera, Idioma);
    }
    
    @GetMapping("/consultalistatiporespuesta/{Bandera}/{Idioma}")
    public List<CListaTipoRespuestaEntity> ConsultaListaTipoRespuesta(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCListaTipoRespuestaService.ConsultaListaTipoRespuesta(Bandera, Idioma);
    }
    
    @GetMapping("/consultalistacamposparticipante/{Bandera}/{IdRdn}")
    public List<CCamposParticipanteEntity> ConsultaListaCampoParticipante(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRdn) {
        return serviceCCamposParticipanteService.ConsultaCamposParticipante(Bandera, IdRdn);
    }
    
    @PostMapping("/insertarcamposparticipante/{Bandera}")
    public String InsertarCamposParticipante(
            @RequestBody CCamposParticipanteEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCCamposParticipanteService.InsertarCamposParticipante(entidad, Bandera);
    }
    
    @PutMapping("/actualizarcamposparticipante/{Bandera}")
    public String ActualizarCamposParticipante(
            @RequestBody CCamposParticipanteEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCCamposParticipanteService.ActualizarCamposParticipante(entidad, Bandera);
    }
    
    @GetMapping("/consultamascararegistro/{Bandera}/{IdRdn}/{IdLabel}")
    public List<CMascaraRegistroRDNEntity> ConsultaMascaraRegistro(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRdn,
            @PathVariable Integer IdLabel) {
        return serviceCMascaraRegistroRDNService.ConsultaMascaraRegistroRDN(Bandera,
                IdRdn, IdLabel);
    }
    
    @PostMapping("/insertarmascararegistro/{Bandera}/{IdLabel}")
    public String InsertarMascaraRegistro(
            @RequestBody CMascaraRegistroRDNEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdLabel) {
        return serviceCMascaraRegistroRDNService.InsertarMascaraRegistro(entidad,
                Bandera, IdLabel);
    }
    
    @PutMapping("/actualizarmascararegistro/{Bandera}/{IdLabel}")
    public String ActualizarMascaraRegistro(
            @RequestBody CMascaraRegistroRDNEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdLabel) {
        return serviceCMascaraRegistroRDNService.ActualizarMascaraRegistro(entidad,
                Bandera, IdLabel);
    }
    
    @GetMapping("/consultajornada/{bandera}/{Idioma}")
    public List<CJornadaEntity> ConsultaJornada(
            @RequestBody CJornadaEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable String Idioma) {
        return serviceCJornadaService.ConsultaJornada(entidad, bandera, Idioma);
    }
    
    @PostMapping("/insertarjornadas/{Bandera}")
    public String InsertarJornada(
            @RequestBody CJornadaModificaEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCJornadaModificaService.InsertarJornada(entidad, Bandera);
    }
    
    @PutMapping("/actualizarjornadas/{Bandera}")
    public String ActualizarJornada(
            @RequestBody CJornadaModificaEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCJornadaModificaService.ActualizarJornada(entidad, Bandera);
    }
    
    @GetMapping("/consultasignapaises/{Bandera}/{IdUsuario}/{IdRdn}/{IdPerfilRueda}/{IdTipoSeleccion}/{IdAsignaPais}")
    public List<CAsignaPaisesEntity> ConsultaAsingaPaises(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario,
            @PathVariable Integer IdRdn,
            @PathVariable Integer IdPerfilRueda,
            @PathVariable Integer IdTipoSeleccion,
            @PathVariable Integer IdAsignaPais) {
        return serviceCAsignaPaisesService.ConsultaAsignaPaises(Bandera, IdUsuario, IdRdn,
                IdPerfilRueda, IdTipoSeleccion, IdAsignaPais);
    }
    
    @PostMapping("/insertarasignapaises/{Bandera}/{IdPais}")
    public String InsertarAsignaPaises(
            @RequestBody CAsignaPaisesModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdPais) {
        return serviceCAsignaPaisesModService.InsertarAsignaPaises(entidad, Bandera, IdPais);
    }
    
    @PutMapping("/actualizarasignapaises/{Bandera}/{IdPais}")
    public String ActualizarAsignaPaises(
            @RequestBody CAsignaPaisesModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdPais) {
        return serviceCAsignaPaisesModService.ActualizarAsignaPaises(entidad, Bandera, IdPais);
    }
    
    @GetMapping("/consultavalidacontacto/{IdContacto}")
    public String ConsultaValidaContacto(
            @PathVariable Integer IdContacto) {
        return servicePValidaContactoService.ConsultaValidaContacto(IdContacto);
    }
    
    @PostMapping("/consultainfcontacto")
    public String ConsultaInfoContacto(
            @RequestBody PInfoContactoEntity entidad) {
        return servicePInfoContactoService.ConsultaInfoContacto(entidad);
    }
    
    @GetMapping("/consultalistaterminopolitica/{Idioma}")
    public List<CListaTerminoPoliticaEntity> ConsultaListaTerminoPolitica(
            @PathVariable String Idioma) {
        return serviceCListaTerminoPoliticaService.ConsultaListaTerminoPolitica(Idioma);
    }
    
    @GetMapping("/consultaterminopolitica/{TipoDoc}/{IdRueda}/{Idioma}/{IdTerminoPolitica}")
    public List<CTerminoPoliticaEntity> ConsultaTerminoPolitica(
            @PathVariable Integer TipoDoc,
            @PathVariable Integer IdRueda,
            @PathVariable String Idioma,
            @PathVariable Integer IdTerminoPolitica) {
        return serviceCTerminoPoliticaService.ConsultaTerminoPolitica(TipoDoc, IdRueda,
                Idioma, IdTerminoPolitica);
    }
    
    @PostMapping("/insertarterminopolitica/{Idioma}/{bandera}")
    public String InsertarTerminoPolitica(
            @RequestBody CTerminoPoliticaModEntity entidad,
            @PathVariable String Idioma,
            @PathVariable Integer bandera) {
        return serviceCTerminoPoliticaModService.InsertarTerminoPolitica(entidad, Idioma, bandera);
    }
    
    @PutMapping("/actualizarterminopolitica/{Idioma}/{bandera}")
    public String ActualizaTerminoPolitica(
            @RequestBody CTerminoPoliticaModEntity entidad,
            @PathVariable String Idioma,
            @PathVariable Integer bandera) {
        return serviceCTerminoPoliticaModService.ActualizarTerminoPolitica(entidad, Idioma, bandera);
    }
    
    @GetMapping("/consultaradministramesa/{bandera}/{Idioma}/{IdRuedaNegocio}")
    public List<CAdministraMesaEntity> ConsultaAdministraMesa(
            @PathVariable Integer bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdRuedaNegocio) {
        return serviceCAdministraMesaService.ConsultarAdministrarMesa(bandera, Idioma, IdRuedaNegocio);
    }
    
    @PostMapping("/insertaradministramesa/{bandera}/{Idioma}")
    public String InsertarAdministraMesa(
            @RequestBody CAdministraMesaEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable String Idioma) {
        return serviceCAdministraMesaService.InsertarAdministraMesa(entidad, bandera, Idioma);
    }
    
    @PutMapping("/actualizaradministramesa/{bandera}/{Idioma}")
    public String ActualizarAdministraMesa(
            @RequestBody CAdministraMesaEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable String Idioma) {
        return serviceCAdministraMesaService.ActualizarAdministraMesa(entidad, bandera, Idioma);
    }
    
    @PostMapping("/servicioreubicarn/{Bandera}")
    public String ServicioReubicaRN(
            @RequestBody CRuedaNegocioModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCRuedaNegocioModService.ActualizarReubicaRN(entidad, Bandera);
    }
    
    @GetMapping("/consultaparticipantesrdn/{Bandera}/{IdRueda}/{IdParticipante}/{NombreEmpresa}/{IdPais}/{IdDepartamento}/{IdCiudad}/{Url}/{IdSector}/{Sugerido}/{IdUsuario}/{Nit}/{IdCategoria}/{NombreProductoClave}")
    public List<PParticipantesRDNEntity> ConsultaParticipantesRdn(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRueda,
            @PathVariable Integer IdParticipante,
            @PathVariable String NombreEmpresa,
            @PathVariable Integer IdPais,
            @PathVariable String IdDepartamento,
            @PathVariable String IdCiudad,
            @PathVariable String Url,
            @PathVariable Integer IdSector,
            @PathVariable Integer Sugerido,
            @PathVariable Integer IdUsuario,
            @PathVariable String Nit,
            @PathVariable Integer IdCategoria,
            @PathVariable String NombreProductoClave) {
        return servicePParticipantesRDNService.ConsultaParticipanteRDN(Bandera,
                IdRueda, IdParticipante, NombreEmpresa, IdPais, IdDepartamento,
                IdCiudad, Url, IdSector, Sugerido, IdUsuario, Nit, IdCategoria, NombreProductoClave);
    }
    
    @GetMapping("/consultaparticipantecontacto/{Bandera}/{IdParticipante}/{Idioma}")
    public List<PParticipanteContactoEntity> ConsultaParticipanteContacto(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdParticipante,
            @PathVariable String Idioma) {
        return servicePParticipanteContactoService.ConsultaParticipanteContacto(Bandera,
                IdParticipante, Idioma);
    }
    
    @GetMapping("/consultaparticipanteproducto/{Bandera}/{IdRueda}/{IdParticipante}/{Idioma}")
    public List<PParticipanteProductoEntity> ConsultaParticipanteProducto(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRueda,
            @PathVariable Integer IdParticipante,
            @PathVariable String Idioma) {
        return servicePParticipanteProductoService.ConsultaParticipanteProducto(Bandera,
                IdRueda, IdParticipante, Idioma);
    }
    
    @GetMapping("/consultaparticipantepregunta/{Bandera}/{IdParticipante}/{Idioma}/{IdRueda}")
    public List<PParticipantePreguntaEntity> ConsultaParticipantePregunta(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdParticipante,
            @PathVariable String Idioma,
            @PathVariable Integer IdRueda) {
        return servicePParticipantePreguntaService.ConsultaParticipantePregunta(Bandera,
                IdParticipante, Idioma, IdRueda);
    }
    
    @GetMapping("/consultarcontenido/{Bandera}/{IdRueda}/{Idioma}/{Contenido}")
    public List<CContenidoEntity> ConsultaContenido(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRueda,
            @PathVariable String Idioma,
            @PathVariable String Contenido) {
        return serviceCContenidoService.ConsultaContenido(Bandera, IdRueda, Idioma, Contenido);
    }
    
    @PostMapping("/insertarcontenido/{Bandera}/{Idioma}")
    public String InsertarContenido(
            @RequestBody CContenidoEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCContenidoService.InsertarContenido(entidad, Bandera, Idioma);
    }
    
    @PutMapping("/actualizarcontenido/{Bandera}/{Idioma}")
    public String ActualizarContenido(
            @RequestBody CContenidoEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCContenidoService.ActualizarContenido(entidad, Bandera, Idioma);
    }
    
    @GetMapping("/consultarcajacontenido/{Bandera}/{IdRueda}/{Idioma}")
    public List<CCajaContenidoEntity> ConsultaCajaContenido(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRueda,
            @PathVariable String Idioma) {
        return serviceCCajaContenidoService.ConsultarCajaContenido(Bandera, IdRueda, Idioma);
    }
    
    @PostMapping("/insertarcajacontenido/{Bandera}/{Idioma}/{IdUsuarioC}")
    public String InsertarCajaContenido(
            @RequestBody CCajaContenidoEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuarioC) {
        return serviceCCajaContenidoService.InsertarCajaContenido(entidad, Bandera, Idioma,
                IdUsuarioC);
    }
    
    @PutMapping("/actualizarcajacontenido/{Bandera}/{Idioma}/{IdUsuarioC}")
    public String ActualizarCajaContenido(
            @RequestBody CCajaContenidoEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuarioC) {
        return serviceCCajaContenidoService.ActualizarCajaContenido(entidad, Bandera,
                Idioma, IdUsuarioC);
    }
    
    @GetMapping("/consultausuariopermiso/{Bandera}/{Idusuario}")
    public List<CUsuarioPermisoEntity> ConsultaUsuarioPermiso(
            @PathVariable Integer Bandera,
            @PathVariable Integer Idusuario) {
        return serviceCUsuarioPermisoService.ConsultaUsuarioPermiso(Bandera, Idusuario);
    }
    
    @PostMapping("/accesocontacto")
    public String InsertarCajaContenido(
            @RequestBody PAccesoContactoModEntity entidad) {
        return servicePAccesoContactoModService.AccesoContacto(entidad);
    }
    
    @GetMapping("/consultavalidaparticipante/{Bandera}/{NoIdentificacion}")
    public List<PValidaParticipanteEntity> ConsultaValidaParticipante(
            @PathVariable Integer Bandera,
            @PathVariable String NoIdentificacion) {
        return servicePValidaParticipanteService.ConsultaValidaParticipante(Bandera, NoIdentificacion);
    }
    
    @GetMapping("/consultanoticiacontenido/{Bandera}/{IdRueda}/{Idioma}")
    public List<CNoticiaContenidoEntity> ConsultarConsultaNoticiaContenido(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRueda,
            @PathVariable String Idioma) {
        return serviceCNoticiaContenidoService.ConsultaNoticiaContenido(Bandera, IdRueda,
                Idioma);
    }
    
    @PostMapping("/insertarnoticiacontenido/{Bandera}/{Idioma}/{IdUsuarioC}")
    public String InsertarNoticiaContenido(
            @RequestBody CNoticiaContenidoEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuarioC) {
        return serviceCNoticiaContenidoService.InsertarNoticiaContenido(entidad, Bandera,
                Idioma, IdUsuarioC);
    }
    
    @PutMapping("/actualizarnoticiacontenido/{Bandera}/{Idioma}/{IdUsuarioC}")
    public String ActualizarNoticiaContenido(
            @RequestBody CNoticiaContenidoEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuarioC) {
        return serviceCNoticiaContenidoService.ActualizarNoticiaContenido(entidad, Bandera,
                Idioma, IdUsuarioC);
    }
    
    @GetMapping("/consultarvideocontenido/{Bandera}/{IdRueda}/{Idioma}")
    public List<CVideoContenidoEntity> ConsultarVideoContenido(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRueda,
            @PathVariable String Idioma) {
        return serviceCVideoContenidoService.ConsultaVideoContenido(Bandera, IdRueda, Idioma);
    }
    
    @PostMapping("/insertarvideocontenido/{Bandera}/{Idioma}")
    public String InsertarVideoContenido(
            @RequestBody CVideoContenidoEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCVideoContenidoService.InsertarVideoContenido(entidad, Bandera, Idioma);
    }
    
    @PutMapping("/actualizarvideocontenido/{Bandera}/{Idioma}")
    public String ActualizarVideoContenido(
            @RequestBody CVideoContenidoEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCVideoContenidoService.ActualizarVideoContenido(entidad, Bandera, Idioma);
    }
    
    @GetMapping("/consultardnparticipante/{Bandera}/{IdContacto}/{IdRdn}/{Idioma}")
    public List<PRdnParticipanteEntity> ConsultarRdnParticipante(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdContacto,
            @PathVariable Integer IdRdn,
            @PathVariable String Idioma) {
        return servicePRdnParticipanteService.ConsultaRdnParticipante(Bandera, IdContacto, IdRdn, Idioma);
    }
    
    @GetMapping("/consultarmenuparticipante/{Bandera}/{IdContacto}")
    public List<PRdnMenuParticipanteEntity> ConsultaMenuParticipante(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdContacto) {
        return servicePRdnMenuParticipanteService.ConsultaMenuParticipante(Bandera, IdContacto);
    }
    
    @GetMapping("/consultatiempoduracion")
    public List<TtTiempoDuracionEntity> ConsultarTiempoDuracion() {
        return serviceTtTiempoDuracionService.listar();
    }
    
    @PostMapping("/insertarelacioncontacto/{Bandera}/{IdUsuario}")
    public String InsertarRelacionContacto(
            @RequestBody PRegistroPerfilModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return servicePRegistroPerfilModService.InsertaRelacionContactoMod(entidad, Bandera, IdUsuario);
    }
    
    @GetMapping("/consultapreguntascontenido/{Bandera}/{IdRueda}/{Idioma}")
    public List<CPreguntasContenidoEntity> ConsultaPreguntasContenido(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRueda,
            @PathVariable String Idioma) {
        return serviceCPreguntasContenidoService.ConsultarPreguntasContenido(Bandera, IdRueda, Idioma);
    }
    
    @PostMapping("/insertarpreguntascontenido/{Bandera}/{Idioma}")
    public String InsertarContenido(
            @RequestBody CPreguntasContenidoEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCPreguntasContenidoService.InsertarPreguntasContenido(entidad, Bandera, Idioma);
    }
    
    @PutMapping("/actualizarpreguntascontenido/{Bandera}/{Idioma}")
    public String ActualizarContenido(
            @RequestBody CPreguntasContenidoEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCPreguntasContenidoService.ActualizarPreguntasContenido(entidad, Bandera, Idioma);
    }
    
    @GetMapping("/consultarmascaracontenido/{Bandera}/{IdRueda}/{Idioma}")
    public List<CMascaraContenidoEntity> ConsultaMascaraContenido(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRueda,
            @PathVariable String Idioma) {
        return serviceCMascaraContenidoService.ConsultaMascaraContenido(Bandera, IdRueda, Idioma);
    }
    
    @PostMapping("/insertarmascaracontenido/{Bandera}/{Idioma}/{IdUsuarioC}")
    public String InsertarMascaraContenido(
            @RequestBody CMascaraContenidoEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuarioC) {
        return serviceCMascaraContenidoService.InsertarMascaraContenido(entidad, Bandera, Idioma, IdUsuarioC);
    }
    
    @PutMapping("/actualizarmascaracontenido/{Bandera}/{Idioma}/{IdUsuarioC}")
    public String ActualizarMascaraContenido(
            @RequestBody CMascaraContenidoEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuarioC) {
        return serviceCMascaraContenidoService.ActualizarMascaraContenido(entidad, Bandera, Idioma, IdUsuarioC);
    }
    
    @GetMapping("/consultarestadocita")
    public List<TtEstadoCitaEntity> ConsultaEstadoCita() {
        return serviceTtEstadoCitaService.listar();
    }
    
    @GetMapping("/consultafecharueda/{bandera}/{IdRueda}")
    public List<CFechaRuedaEntity> ConsultaFechaRueda(
            @PathVariable Integer bandera,
            @PathVariable Integer IdRueda) {
        return serviceCFechaRuedaService.ConsultaFechaRueda(bandera, IdRueda);
    }
    
    @PostMapping("/consultagenda/{bandera}/{Idioma}/{IdRuedaNegocio}/{IdPerfilRueda}/{NoIdentifica}/{IdParticipanteS}/{IdParticipanteA}")
    public List<CAgendaEntity> ConsultaAgenda(
            @RequestBody CAgendaEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdRuedaNegocio,
            @PathVariable Integer IdPerfilRueda,
            @PathVariable String NoIdentifica,
            @PathVariable Integer IdParticipanteS,
            @PathVariable Integer IdParticipanteA) {
        return serviceCAgendaService.ConsultaAgenda(entidad, bandera, Idioma,
                IdRuedaNegocio, IdPerfilRueda, NoIdentifica, IdParticipanteS, IdParticipanteA);
    }
    
    @PutMapping("/actualizaragenda/{bandera}/{Idioma}")
    public String ActualizarMascaraContenido(
            @RequestBody CAgendaModEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable String Idioma) {
        return serviceCAgendaModService.ActualizaAgenda(entidad, bandera, Idioma);
    }
    
    @GetMapping("/consultalistacamposrueda")
    public List<TtCamposRuedaEntity> ConsultaListaCamposRueda() {
        return serviceTtCamposRuedaService.listar();
    }
    
    @GetMapping("/consultalistatipoenviocorreo")
    public List<TtTipoEnvioCorreoEntity> COnsultaListaTipoEnvioCorreo() {
        return serviceTtTipoEnvioCorreoService.listar();
    }
    
    @GetMapping("/consultaplantillacorreo/{bandera}/{Idioma}/{NombrePlantilla}/{IdTipoPlantilla}/{MomentoEnvio}/{Asunto}/{EmailRemitente}/{Estado}/{Descripcion}/{IdPlantilla}/{IdModuloEstado}")
    public List<CPlantillaCorreoEntity> ConsultaPlantillaCorreo(
            @PathVariable Integer bandera,
            @PathVariable String Idioma,
            @PathVariable String NombrePlantilla,
            @PathVariable Integer IdTipoPlantilla,
            @PathVariable Integer MomentoEnvio,
            @PathVariable String Asunto,
            @PathVariable String EmailRemitente,
            @PathVariable Integer Estado,
            @PathVariable String Descripcion,
            @PathVariable Integer IdPlantilla,
            @PathVariable Integer IdModuloEstado) {
        return serviceCPlantillaCorreoService.ConsultaPlantillaCorreo(bandera, Idioma,
                NombrePlantilla, IdTipoPlantilla, MomentoEnvio, Asunto, EmailRemitente,
                Estado, Descripcion, IdPlantilla, IdModuloEstado);
    }
    
    @PostMapping("/insertarplantillacorreo/{Bandera}/{Idioma}/{IdUsuarioC}")
    public String InsertarPlantillaCorreo(
            @RequestBody CPlantillaCorreoEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuarioC) {
        return serviceCPlantillaCorreoService.InsertarPlantillaCorreo(entidad, Bandera, Idioma, IdUsuarioC);
    }
    
    @PutMapping("/actualizarplantillacorreo/{Bandera}/{Idioma}/{IdUsuarioC}")
    public String ActualizarPlantillaCorreo(
            @RequestBody CPlantillaCorreoEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuarioC) {
        return serviceCPlantillaCorreoService.ActualizarPlantillaCorreo(entidad, Bandera, Idioma, IdUsuarioC);
    }
    
    @GetMapping("/consultacontactocontenido/{Bandera}/{IdRueda}")
    public List<CContactoContenidoEntity> ConsultaContactoContenido(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRueda) {
        return serviceCContactoContenidoService.ConsultaContactoContenido(Bandera, IdRueda);
    }
    
    @PostMapping("/insertarcontactocontenido/{Bandera}/{Idioma}/{IdUsuarioC}")
    public String InsertarContactoContenido(
            @RequestBody CContactoContenidoEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuarioC) {
        return serviceCContactoContenidoService.InsertarContactoContenido(entidad,
                Bandera, Idioma, IdUsuarioC);
    }
    
    @PutMapping("/actualizarcontactocontenido/{Bandera}/{Idioma}/{IdUsuarioC}")
    public String ActualizarContactoContenido(
            @RequestBody CContactoContenidoEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuarioC) {
        return serviceCContactoContenidoService.ActualizarContactoContenido(entidad,
                Bandera, Idioma, IdUsuarioC);
    }
    
    @GetMapping("/consultarfuente")
    public List<TtFuenteEntity> ConsultarFuente() {
        return serviceTtFuenteService.listar();
    }
    
    @GetMapping("/consultartamano")
    public List<TtTamañoEntity> ConsultarTamano() {
        return serviceTtTamañoService.listar();
    }
    
    @PostMapping("/insertarformulaplantillacorreo/{bandera}/{Idioma}")
    public String InsertarContactoContenido(
            @RequestBody CFormulaPlantillaModEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable String Idioma) {
        return serviceCFormulaPlantillaModService.InsertarPlantillaCorreo(entidad, bandera, Idioma);
    }
    
    @PutMapping("/actualizarformulaplantillacorreo/{bandera}/{Idioma}")
    public String ActualizarContactoContenido(
            @RequestBody CFormulaPlantillaModEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable String Idioma) {
        return serviceCFormulaPlantillaModService.ActualizarPlantillaCorreo(entidad, bandera, Idioma);
    }
    
    @GetMapping("/consultaprogramacioncorreo/{Bandera}/{Idioma}/{IdRueda}/{IdPlantilla}/{IdPerfil}/{IdPais}/{Departamento}/{Ciudad}/{IdEnvio}/{IdParticipante}")
    public List<CProgramacionCorreoEntity> ConsultaProgramacionCorreo(
            @RequestBody CProgramacionCorreoEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdRueda,
            @PathVariable Integer IdPlantilla,
            @PathVariable Integer IdPerfil,
            @PathVariable Integer IdPais,
            @PathVariable String Departamento,
            @PathVariable String Ciudad,
            @PathVariable Integer IdEnvio,
            @PathVariable Integer IdParticipante) {
        return serviceCProgramacionCorreoService.ConsultaProgramacionCorreo(entidad,
                Bandera, Idioma, IdRueda, IdPlantilla, IdPerfil, IdPais, Departamento,
                Ciudad, IdEnvio, IdParticipante);
    }
    
    @PostMapping("/insertarprogramacioncorreo/{bandera}/{Idioma}/{IdUsuarioC}")
    public String InsertarProgramacionCorreo(
            @RequestBody CProgramacionCorreoEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuarioC) {
        return serviceCProgramacionCorreoService.InsertarProgramacionCorreo(entidad,
                bandera, Idioma, IdUsuarioC);
    }
    
    @PutMapping("/actualizarprogramacioncorreo/{bandera}/{Idioma}/{IdUsuarioC}")
    public String ActualizarProgramacionCorreo(
            @RequestBody CProgramacionCorreoEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuarioC) {
        return serviceCProgramacionCorreoService.ActualizarProgramacionCorreo(entidad,
                bandera, Idioma, IdUsuarioC);
    }
    
    @GetMapping("/consultavigencia/{Bandera}")
    public List<CVigenciaEntity> ConsultaVigencia(
            @PathVariable Integer Bandera) {
        return serviceCVigenciaService.ConsultaVigencia(Bandera);
    }
    
    @GetMapping("/consultafiltroslinkrdn/{IdRuedaNegocio}/{IdLink}")
    public String FiltrosRdn(
            @PathVariable Integer IdRuedaNegocio,
            @PathVariable Integer IdLink) {
        return serviceCFiltrosLinkRdnService.FiltrosLinkRdn(IdRuedaNegocio, IdLink);
    }
    
    @GetMapping("/consultadministralinkrdn/{bandera}")
    public List<CAdministraLinkRdnEntity> ConsultaAdministraLinkRdn(
            @PathVariable Integer bandera) {
        return serviceCAdministraLinkRdnService.ConsultarAdministraLink(bandera);
    }
    
    @GetMapping("/consultaopcionesrtapregunta/{Bandera}/{IdRuedaNegocio}/{Idioma}/{IdParticipante}/{Origen}/{IdPregunta}")
    public String ConsultaOpcionesRtaPregunta(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRuedaNegocio,
            @PathVariable String Idioma,
            @PathVariable Integer IdParticipante,
            @PathVariable Integer Origen,
            @PathVariable Integer IdPregunta) {
        
        return servicePopcionesRtaPreguntaService.ConsultaOpcionesRta(Bandera,
                IdRuedaNegocio, Idioma, IdParticipante, Origen, IdPregunta);
    }
    
    @GetMapping("/consultavalidapermiso/{Bandera}/{Idioma}/{IdContacto}/{IdRueda}")
    public List<CValidaPermisoEntity> ConsultaValidaPermiso(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdContacto,
            @PathVariable Integer IdRueda) {
        return serviceCValidaPermisoService.ConsultaValidaPermisos(Bandera,
                Idioma, IdContacto, IdRueda);
    }
    
    @GetMapping("/consultapagenda/{Bandera}/{Idioma}/{IdUsuario}/{IdRuedaNegocio}/{IdPerfilRueda}/{IdEstadoCita}/{IdModulo}/{IdCita}")
    public List<PAgendaEntity> ConsultaPAgenda(
            @RequestBody PAgendaEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuario,
            @PathVariable Integer IdRuedaNegocio,
            @PathVariable Integer IdPerfilRueda,
            @PathVariable Integer IdEstadoCita,
            @PathVariable Integer IdModulo,
            @PathVariable Integer IdCita) {
        return servicePAgendaService.ConsultaPAgenda(entidad, Bandera, Idioma,
                IdUsuario, IdRuedaNegocio, IdPerfilRueda, IdEstadoCita, IdModulo, IdCita);
    }
    
    @PostMapping("/insertarpagendaservice/{Bandera}/{Aprueba}")
    public String InsertarPAgenda(
            @RequestBody PAgendaModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer Aprueba) {
        return servicePAgendaModService.InsertarPAgenda(entidad,
                Bandera, Aprueba);
    }
    
    @PutMapping("/actualizarpagendaservice/{Bandera}/{Aprueba}")
    public String ActualizarPAgenda(
            @RequestBody PAgendaModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer Aprueba) {
        return servicePAgendaModService.ActualizarPAgenda(entidad,
                Bandera, Aprueba);
    }
    
    @PostMapping("/consultaparticipante/{Bandera}/{IdRueda}/{NombreRueda}/{NoIdentificacion}/{TipoPerfil}/{Estado}/{Participante}/{IdPais}/{Departamento}/{Ciudad}/{NombreContacto}")
    public List<CParticipanteEntity> ConsultaParticipante(
            @RequestBody CParticipanteEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRueda,
            @PathVariable String NombreRueda,
            @PathVariable String NoIdentificacion,
            @PathVariable Integer TipoPerfil,
            @PathVariable Integer Estado,
            @PathVariable String Participante,
            @PathVariable Integer IdPais,
            @PathVariable String Departamento,
            @PathVariable String Ciudad,
            @PathVariable String NombreContacto) {
        return serviceCParticipanteService.ConsultaCParticipante(entidad, Bandera,
                IdRueda, NombreRueda, NoIdentificacion, TipoPerfil, Estado, Participante,
                IdPais, Departamento, Ciudad, NombreContacto);
    }
    
    @PutMapping("/actualizarparticipantecmod/{Bandera}")
    public String ActualizarParticipanteCMod(
            @RequestBody CParticipanteModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCParticipanteModService.ActualizarParticipante(entidad, Bandera);
    }
    
    @GetMapping("/consultadatosempresa/{Bandera}/{IdRueda}/{Participante}/{NoIdentificacion}/{IdParticipante}")
    public List<CDatosEmpresaEntity> ConsultaDatosEmpresa(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRueda,
            @PathVariable String Participante,
            @PathVariable String NoIdentificacion,
            @PathVariable Integer IdParticipante) {
        return serviceCDatosEmpresaService.ConsultaDatosEmpresa(Bandera, IdRueda,
                Participante, NoIdentificacion, IdParticipante);
    }
    
    @GetMapping("/consultadatoscontacto/{Bandera}/{IdRueda}/{Participante}/{NoIdentificacion}/{IdParticipante}/{IdContacto}")
    public List<CDatosContactoEntity> ConsultaDatosContacto(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRueda,
            @PathVariable String Participante,
            @PathVariable String NoIdentificacion,
            @PathVariable Integer IdParticipante,
            @PathVariable Integer IdContacto) {
        return serviceCDatosContactoService.ConsultaDatosContacto(Bandera, IdRueda,
                Participante, NoIdentificacion, IdParticipante, IdContacto);
    }
    
    @GetMapping("/consultasectorpart/{Bandera}/{IdRueda}/{Sector}/{Participante}/{Nit}")
    public List<CSectorPartEntity> ConsultaSectorPart(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRueda,
            @PathVariable String Sector,
            @PathVariable String Participante,
            @PathVariable String Nit) {
        return serviceCSectorPartService.ConsultaSectorPart(Bandera, IdRueda, Sector,
                Participante, Nit);
    }
    
    @GetMapping("/consultacatesectorpart/{Bandera}/{IdRueda}/{IdSector}/{IdParticipante}")
    public List<CCateSectorPartEntity> ConsultaCateSectorPart(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRueda,
            @PathVariable Integer IdSector,
            @PathVariable Integer IdParticipante) {
        return serviceCCateSectorPartService.ConsultaCateSectorPart(Bandera, IdRueda,
                IdSector, IdParticipante);
    }
    
    @GetMapping("/consultaproductoserviciospart/{Bandera}/{Idioma}/{NombreProducto}/{IdRueda}")
    public List<PProductosServiciosPartEntity> ConsultaProductoServiciosPart(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable String NombreProducto,
            @PathVariable Integer IdRueda) {
        return servicePProductosServiciosPartService.ConsultaProductoServicios(Bandera,
                Idioma, NombreProducto, IdRueda);
    }
    
    @GetMapping("/consultaformulaplantilla/{bandera}/{IdPlantilla}/{IdFormula}/{Idioma}")
    public List<CFormulaPlantillaEntity> ConsultaFormulaPlantilla(
            @PathVariable Integer bandera,
            @PathVariable Integer IdPlantilla,
            @PathVariable Integer IdFormula,
            @PathVariable String Idioma) {
        return serviceCFormulaPlantillaService.ConsultaFormulaPlantilla(bandera,
                IdPlantilla, IdFormula, Idioma);
    }
    
    @GetMapping("/consultasignagenda/{bandera}/{IdRuedaNegocio}/{FechaRdn}/{HoraInicio}/{HoraFin}/{IdHora}/{IdParticipanteS}/{IdParticipanteA}/{IdContacto}")
    public List<CAsignaAgendaEntity> ConsultaAsignaAgenda(
            @PathVariable Integer bandera,
            @PathVariable Integer IdRuedaNegocio,
            @PathVariable String FechaRdn,
            @PathVariable String HoraInicio,
            @PathVariable String HoraFin,
            @PathVariable Integer IdHora,
            @PathVariable Integer IdParticipanteS,
            @PathVariable Integer IdParticipanteA,
            @PathVariable Integer IdContacto) {
        return serviceCAsignaAgendaService.ConsultaAsignaAgenda(bandera, IdRuedaNegocio,
                FechaRdn, HoraInicio, HoraFin, IdHora, IdParticipanteS, IdParticipanteA,
                IdContacto);
    }
    
    @GetMapping("/consultalistaplantillacorreo/{bandera}/{IdPlantilla}/{NombrePlantilla}")
    public List<CListaPlantillaCorreoEntity> ConsultaListaPlantillaCorreo(
            @PathVariable Integer bandera,
            @PathVariable Integer IdPlantilla,
            @PathVariable String NombrePlantilla) {
        return serviceCListaPlantillaCorreoService.ConsultaListaPlantillaCorreo(bandera,
                IdPlantilla, NombrePlantilla);
    }
    
    @PostMapping("/insertarelaciondocenviocorreo/{Bandera}/{Idioma}")
    public String InsertarRelacionDocEnvioCorreo(
            @RequestBody CRelDocEnvioCorreoModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCRelDocEnvioCorreoModService.InsertarRelacionEnvioCorreoMod(entidad,
                Bandera, Idioma);
    }
    
    @DeleteMapping("/eliminarelaciondocenviocorreo/{Bandera}/{Idioma}")
    public String EliminarRelacionDocEnvioCorreo(
            @RequestBody CRelDocEnvioCorreoModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCRelDocEnvioCorreoModService.EliminarRelacionEnvioCorreoMod(entidad,
                Bandera, Idioma);
    }
    
    @GetMapping("/consultarelaciondocplantillacorreo/{Bandera}/{IdPlantilla}/{Documento}/{Id}/{Idioma}")
    public List<CRelDocEnvioCorreoModEntity> ConsultaRelDocEnvioCorreo(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdPlantilla,
            @PathVariable String Documento,
            @PathVariable Integer Id,
            @PathVariable String Idioma) {
        return serviceCRelDocEnvioCorreoModService.ConsultaRelacionDocEnvioCorreo(Bandera,
                IdPlantilla, Documento, Id, Idioma);
    }
    
    @GetMapping("/consultavisualizaparticipante/{Bandera}/{IdRueda}/{Vigencia}/{Participante}/{IdPais}/{Departamento}/{Ciudad}/{TipoPerfil}/{Estado}/{Sector}/{Categoria}/{Subcategoria}/{Nit}")
    public List<CVisualizaParticipanteEntity> ConsultaVisualizaParticipante(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRueda,
            @PathVariable Integer Vigencia,
            @PathVariable String Participante,
            @PathVariable Integer IdPais,
            @PathVariable String Departamento,
            @PathVariable String Ciudad,
            @PathVariable Integer TipoPerfil,
            @PathVariable Integer Estado,
            @PathVariable Integer Sector,
            @PathVariable Integer Categoria,
            @PathVariable Integer Subcategoria,
            @PathVariable String Nit) {
        return serviceCVisualizaParticipanteService.ConsultaVisualizaParticipante(Bandera,
                IdRueda, Vigencia, Participante, IdPais, Departamento, Ciudad, TipoPerfil,
                Estado, Sector, Categoria, Subcategoria, Nit);
    }
    
    @GetMapping("/consultarelempresaenviocorreo/{Bandera}/{Participante}/{IdParticipante}/{IdEnvioCorreo}")
    public List<CRelEmpresaEnvioCorreoEntity> ConsultaRelEmpresEnvioCorreo(
            @PathVariable Integer Bandera,
            @PathVariable String Participante,
            @PathVariable Integer IdParticipante,
            @PathVariable Integer IdEnvioCorreo) {
        return serviceCRelEmpresaEnvioCorreoService.ConsultaRelacionEnvioCorreo(Bandera,
                Participante, IdParticipante, IdEnvioCorreo);
    }
    
    @PostMapping("/insertarelacionempresaenviocorreo/{Bandera}")
    public String InsertarRelEmpresaEnvioCorreo(
            @RequestBody CRelEmpresaEnvioCorreoEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCRelEmpresaEnvioCorreoService.InsertarRelacionEnvioCorreo(entidad, Bandera);
    }
    
    @DeleteMapping("/eliminarelacionempresaenviocorreo/{Bandera}")
    public String EliminarRelacionEmpresaEnvioCorreo(
            @RequestBody CRelEmpresaEnvioCorreoEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCRelEmpresaEnvioCorreoService.EliminarRelacionEnvioCorreo(entidad, Bandera);
    }
    
    @GetMapping("/consultasubcategoriapart/{Bandera}/{IdRueda}/{IdCategoria}/{IdSubCategoria}/{IdParticipante}")
    public List<CSubCatePartEntity> ConsultaRelEmpresEnvioCorreo(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRueda,
            @PathVariable Integer IdCategoria,
            @PathVariable Integer IdSubCategoria,
            @PathVariable Integer IdParticipante) {
        return serviceCSubCatePartService.ConsultarSubCatePart(Bandera, IdRueda,
                IdCategoria, IdSubCategoria, IdParticipante);
    }
    
    @GetMapping("/consultapreguntaspart/{Bandera}/{IdRueda}/{IdParticipante}/{IdPerfil}")
    public List<CPreguntasPartEntity> ConsultaPreguntasPart(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRueda,
            @PathVariable Integer IdParticipante,
            @PathVariable Integer IdPerfil) {
        return serviceCPreguntasPartService.ConsultaPreguntasPart(Bandera, IdRueda,
                IdParticipante, IdPerfil);
    }
    
    @GetMapping("/consultaevaluacion/{Bandera}/{Idioma}/{IdUsuario}/{IdEvaluacion}/{RuedaNegocio}/{Estado}/{Vigencia}/{Nombre}/{FechaEvaluacion}/{TipoPerfil}/{TipoEva}")
    public List<CEvaluacionEntity> ConsultaEvaluacion(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuario,
            @PathVariable Integer IdEvaluacion,
            @PathVariable Integer RuedaNegocio,
            @PathVariable Integer Estado,
            @PathVariable String Vigencia,
            @PathVariable String Nombre,
            @PathVariable String FechaEvaluacion,
            @PathVariable Integer TipoPerfil,
            @PathVariable Integer TipoEva) {
        return serviceCEvaluacionService.ConsultaEvaluacion(Bandera, Idioma,
                IdUsuario, IdEvaluacion, RuedaNegocio, Estado, Vigencia, Nombre,
                FechaEvaluacion, TipoPerfil, TipoEva);
    }
    
    @PostMapping("/insertarevaluacionmod/{Bandera}/{Idioma}/{IdUsuario}/{IdEvaluacion}")
    public String InsertarEvaluacion(
            @RequestBody CEvaluacionModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuario,
            @PathVariable Integer IdEvaluacion) {
        return serviceCEvaluacionModService.InsertarEvaluacion(entidad, Bandera, Idioma, IdUsuario, IdEvaluacion);
    }
    
    @PutMapping("/actualizarevaluacionmod/{Bandera}/{Idioma}/{IdUsuario}/{IdEvaluacion}")
    public String ActualizarEvaluacion(
            @RequestBody CEvaluacionModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuario,
            @PathVariable Integer IdEvaluacion) {
        return serviceCEvaluacionModService.ActualizarEvaluacion(entidad, Bandera, Idioma, IdUsuario, IdEvaluacion);
    }
    
    @PostMapping("/insertarpreguntaevaluacion/{Bandera}/{Idioma}/{IdOrigen}")
    public String InsertarPreguntasEvaluacion(
            @RequestBody CPreguntaEvaluacionModeEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable String IdOrigen) {
        return serviceCPreguntaEvaluacionModService.InsertaPreguntasEvaluacion(entidad,
                Bandera, Idioma, Bandera);
    }
    
    @PutMapping("/actualizarpreguntaevaluacion/{Bandera}/{Idioma}/{IdOrigen}")
    public String ActualizarPreguntasEvaluacion(
            @RequestBody CPreguntaEvaluacionModeEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable String IdOrigen) {
        return serviceCPreguntaEvaluacionModService.ActualizarPreguntasEvaluacion(entidad,
                Bandera, Idioma, Bandera);
    }
    
    @GetMapping("/consultaencabezagendapdf/{Bandera}/{Idioma}/{IdContacto}/{IdRuedaNegocio}")
    public List<PEncabezaAgendaPdfEntity> ConsultaEncabezaAgendaPdf(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdContacto,
            @PathVariable Integer IdRuedaNegocio) {
        return servicePEncabezaAgendaPdfService.ConsultaEncabezaAgendaPdf(Bandera,
                Idioma, IdContacto, IdRuedaNegocio);
    }
    
    @GetMapping("/consultacitasagendapdf/{Bandera}/{Idioma}/{IdContacto}/{IdRuedaNegocio}")
    public List<PCitasAgendaPdfEntity> ConsultaCitasAgendaPdf(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdContacto,
            @PathVariable Integer IdRuedaNegocio) {
        return servicePCitasAgendaPdfService.ConsultaCitasAgendaPdf(Bandera, Idioma,
                IdContacto, IdRuedaNegocio);
    }
    
    @GetMapping("/consultapreguntasevaluacion/{Bandera}/{Idioma}/{IdUsuario}/{IdEvaluacion}/{Estado}")
    public List<CPreguntasEvaluacionEntity> ConsultaPreguntasEvaluacion(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuario,
            @PathVariable Integer IdEvaluacion,
            @PathVariable Integer Estado) {
        return serviceCPreguntasEvaluacionService.ConsultarPreguntasEvaluacion(Bandera,
                Idioma, IdUsuario, IdEvaluacion, Estado);
    }
    
    @GetMapping("/consultapreguntasevaluacionpop/{Bandera}/{Idioma}/{IdUsuario}/{IdEvaluacion}/{Estado}/{IdPregunta}")
    public List<CPreguntaEvaluacionPopEntity> ConsultaPreguntasEvaluacionPop(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuario,
            @PathVariable Integer IdEvaluacion,
            @PathVariable Integer Estado,
            @PathVariable Integer IdPregunta) {
        return serviceCPreguntaEvaluacionPopService.ConsultaPreguntaEvaluacionPop(Bandera,
                Idioma, IdUsuario, IdEvaluacion, Estado, IdPregunta);
    }
    
    @GetMapping("/consultatipoevaenc")
    public List<TtTipoEvaEncEntity> ConsultarTtTipoEvaEnc() {
        return serviceTtTipoEvaEncService.listar();
    }
    
    @GetMapping("/consultalistamomentoenvio/{Bandera}/{IdEstadoCita}/{Descripcion}")
    public List<CListaMomentoEnvioEntity> ConsultaListaMomentoEnvio(
            @PathVariable Integer Bandera,
            @PathVariable String IdEstadoCita,
            @PathVariable Integer Descripcion) {
        return serviceCListaMomentoEnvioService.ConsultaListaMomentoEnvio(Bandera,
                Descripcion, IdEstadoCita);
    }
    
    @GetMapping("/consultanotificacionesp/{Bandera}/{Idioma}/{IdNotificacion}/{Estado}/{IdContacto}/{Rueda}")
    public List<PNotificacionesEntity> ConsultaNotificacionesP(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdNotificacion,
            @PathVariable Integer Estado,
            @PathVariable Integer IdContacto,
            @PathVariable String Rueda) {
        return servicePNotificacionesService.ConsultaNotificaciones(Bandera,
                Idioma, IdNotificacion, Estado, IdContacto, Rueda);
    }
    
    @PutMapping("/actualizanotificacionp/{Bandera}/{Idioma}")
    public String ActualizaNotificacionP(
            @RequestBody PNotificacionModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return servicePNotificacionModService.ActualizaNotificacion(entidad, Bandera, Idioma);
    }
    
    @GetMapping("/consultaenviorealcorreo/{bandera}/{Idioma}/{IdEnvioCorreo}")
    public String ConsultaEnvioCorreo(
            @PathVariable Integer bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdEnvioCorreo) {
        return serviceCEnvioRealCorreoService.ConsultaEnvioRealCorreo(bandera, Idioma, IdEnvioCorreo);
    }
    
    @GetMapping("/consultaadministrachat/{Bandera}/{Idioma}/{RuedaNegocio}/{IdRuedaNegocio}/{TipoChat}/{IdJornada}/{IdChat}")
    public List<CChatEntity> ConsultaAdministraChat(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer RuedaNegocio,
            @PathVariable Integer IdRuedaNegocio,
            @PathVariable Integer TipoChat,
            @PathVariable Integer IdJornada,
            @PathVariable Integer IdChat) {
        return serviceCChatService.ConsultaChat(Bandera, Idioma, RuedaNegocio, IdRuedaNegocio, TipoChat, IdJornada, IdChat);
    }
    
    @PostMapping("/insertaradministrachat/{Bandera}/{Idioma}/{IdUsuario}")
    public String InsartarAdministraChat(
            @RequestBody CChatEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuario) {
        return serviceCChatService.InsertarChat(entidad, Bandera, Idioma, IdUsuario);
    }
    
    @PutMapping("/actualizaradministrachat/{Bandera}/{Idioma}/{IdUsuario}")
    public String ActualizarAdministraChat(
            @RequestBody CChatEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuario) {
        return serviceCChatService.ActualizarChat(entidad, Bandera, Idioma, IdUsuario);
    }
    
    @GetMapping("/consultausuariosenviocorreo/{bandera}/{IdEnvioCorreo}")
    public List<CusuariosEnvioCorreoEntity> ConsultaUsuariosEnvioCorreo(
            @PathVariable Integer bandera,
            @PathVariable Integer IdEnvioCorreo) {
        return serviceCusuariosEnvioCorreoService.ConsultaUsuariosEnvioCorreo(bandera, IdEnvioCorreo);
    }
    
    @GetMapping("/consultanotificacionc/{bandera}/{Idioma}/{NombreRueda}/{IdRueda}/{TipoPerfil}/{IdSector}/{Estado}/{Publicar}/{TituloNoti}/{IdNotifica}")
    public List<CNotificacionEntity> ConsultaAdministraChat(
            @RequestBody CNotificacionEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable String Idioma,
            @PathVariable String NombreRueda,
            @PathVariable Integer IdRueda,
            @PathVariable Integer TipoPerfil,
            @PathVariable Integer IdSector,
            @PathVariable Integer Estado,
            @PathVariable Integer Publicar,
            @PathVariable String TituloNoti,
            @PathVariable Integer IdNotifica) {
        return serviceCNotificacionService.ConsultaNotificacionesC(entidad, bandera, Idioma,
                NombreRueda, IdRueda, TipoPerfil, IdSector, Estado, Publicar,
                TituloNoti, IdNotifica);
    }
    
    @PostMapping("/insertarnotificacionc/{Bandera}/{Idioma}/{IdUsuario}")
    public String InsartarAdministraChat(
            @RequestBody CNotificacionEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuario) {
        return serviceCNotificacionService.InsertarNotificacionesC(entidad, Bandera,
                Idioma, IdUsuario);
    }
    
    @PutMapping("/actualizarnotificacionc/{Bandera}/{Idioma}/{IdUsuario}")
    public String ActualizarAdministraChat(
            @RequestBody CNotificacionEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdUsuario) {
        return serviceCNotificacionService.ActualizarNotificacionesC(entidad, Bandera,
                Idioma, IdUsuario);
    }
    
    @GetMapping("/consultartipocita")
    public List<TtTipoCitaEntity> ConsultaTipoCita() {
        return serviceTtTipoCitaService.listar();
    }
    
    @GetMapping("/consultamascara/{Bandera}/{Idioma}")
    public List<CMascaraEntity> ConsultaMascara(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCMascaraService.ConsultaMascara(Bandera, Idioma);
    }
    
    @PostMapping("/actualizamascara/{Bandera}/{Idioma}")
    public String ActualizarMascara(
            @RequestBody CMascaraEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return serviceCMascaraService.ActualizarMascara(entidad, Bandera, Idioma);
    }
    
    @GetMapping("/consultadatostablero/{Bandera}/{NombreCaja}/{IdGrupo}/{IdCaja}/{estado}")
    public List<CDatosTableroEntity> ConsultaDatosTablero(
            @PathVariable Integer Bandera,
            @PathVariable String NombreCaja,
            @PathVariable Integer IdGrupo,
            @PathVariable Integer IdCaja,
            @PathVariable Integer estado) {
        return serviceCDatosTableroService.ConsultaDatosTablero(Bandera,
                NombreCaja, IdGrupo, IdCaja, estado);
    }
    
    @PostMapping("/insertadatostablero/{Bandera}/{IdUsuarioC}")
    public String InsertaDatosTablero(
            @RequestBody CDatosTableroEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuarioC) {
        return serviceCDatosTableroService.InsertarDatosTablero(entidad, Bandera,
                IdUsuarioC);
    }
    
    @PutMapping("/actualizadatostablero/{Bandera}/{IdUsuarioC}")
    public String ActualizaDatosTablero(
            @RequestBody CDatosTableroEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuarioC) {
        return serviceCDatosTableroService.ActualizarDatosTablero(entidad, Bandera,
                IdUsuarioC);
    }
    
    @GetMapping("/consultajornadac/{bandera}/{Idioma}/{TipoEvento}/{TipoJornada}/{FechaDesde}/{IdRueda}/{NombreRueda}")
    public List<CConsultaJornadaEntity> ConsultaJornada(
            @PathVariable Integer bandera,
            @PathVariable String Idioma,
            @PathVariable String TipoEvento,
            @PathVariable Integer TipoJornada,
            @PathVariable String FechaDesde,
            @PathVariable Integer IdRueda,
            @PathVariable String NombreRueda) {
        return serviceCConsultaJornadaService.ConsultaJornada(bandera, Idioma, TipoEvento,
                TipoJornada, FechaDesde, IdRueda, NombreRueda);
    }
    
    @GetMapping("/consultarecintop/{bandera}/{IdRueda}/{Idioma}")
    public List<PRecintoEntity> ConsultaRecintoP(
            @PathVariable Integer bandera,
            @PathVariable Integer IdRueda,
            @PathVariable String Idioma) {
        return servicePRecintoService.ConsultaRecintoP(bandera, IdRueda, Idioma);
    }
    
    @GetMapping("/correomasivo/{bandera}/{Idioma}/{IdEnvioCorreo}")
    public String MasivoEnvioCorreo(
            @PathVariable Integer bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdEnvioCorreo) {
        return serviceEnvioMailService.EnviarCorreo(bandera, Idioma, IdEnvioCorreo);
    }
    
    @GetMapping("/correoindividual/{bandera}/{IdContacto}/{IdRueda}/{IdAgenda}/{IdModulo}/{IdEstado}/{Idioma}")
    public String IndividualEnvioCorreo(
            @PathVariable Integer bandera,
            @PathVariable Integer IdContacto,
            @PathVariable Integer IdRueda,
            @PathVariable Integer IdAgenda,
            @PathVariable Integer IdModulo,
            @PathVariable Integer IdEstado,
            @PathVariable String Idioma) {
        return serviceIndividualEnvioCorreoService.EnviarCorreoIndividual(bandera,
                IdContacto, IdRueda, IdAgenda, IdModulo, IdEstado, Idioma);
    }
    
    @GetMapping("/consultadatoscontactonuevo/{Bandera}/{IdRueda}/{IdParticipante}")
    public List<CRelDatosContactoEntity> IndividualEnvioCorreo(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRueda,
            @PathVariable Integer IdParticipante) {
        return serviceCRelDatosContactoService.ConsultaDatosContacto(Bandera, IdRueda,
                IdParticipante);
    }
    
    @GetMapping("/consultapruedanegocio/{bandera}/{Idioma}/{Idusuario}/{IdRuedaNegocio}/{NombreRdn}")
    public List<PRuedaNegocioEntity> ConsultaPRuedaNegocio(
            @PathVariable Integer bandera,
            @PathVariable String Idioma,
            @PathVariable Integer Idusuario,
            @PathVariable Integer IdRuedaNegocio,
            @PathVariable String NombreRdn) {
        return servicePRuedaNegocioService.ConsultaPRuedaNegocio(bandera, Idioma,
                Idusuario, IdRuedaNegocio, NombreRdn);
    }
    
    @GetMapping("/consultaevaluacionpartc/{Bandera}/{Idioma}/{IdEvaluacion}/{RuedaNegocio}/{TipoPerfil}/{IdParticipante}")
    public List<CEvaluacionPartEntity> ConsultaEvaluacionPartC(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdEvaluacion,
            @PathVariable Integer RuedaNegocio,
            @PathVariable Integer TipoPerfil,
            @PathVariable Integer IdParticipante) {
        return serviceCEvaluacionPartService.ConsultaCEvaluacionPart(Bandera,
                Idioma, IdEvaluacion, RuedaNegocio, TipoPerfil, IdParticipante);
    }
    
    @GetMapping("/consultagendapartc/{bandera}/{IdContactoS}/{IdContactoA}/{IdParticipanteS}/{IdRuedaNegocio}")
    public List<CAgendaPartEntity> ConsultaAgendaPartc(
            @PathVariable Integer bandera,
            @PathVariable Integer IdContactoS,
            @PathVariable Integer IdContactoA,
            @PathVariable Integer IdParticipanteS,
            @PathVariable Integer IdRuedaNegocio) {
        return serviceCAgendaPartService.ConsultaAgendaPart(bandera, IdContactoS, IdContactoA, IdParticipanteS, IdRuedaNegocio);
    }
    
    @GetMapping("/reporteevaenc/{Bandera}/{IdRuedaNegocio}/{NombreRdn}/{TipoEva}/{Nombreempresa}/{Nit}/{IdTipoPerfil}/{IdEvaluacion}")
    public List<CReporteEvaEncEntity> ReporteEvaEnc(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRuedaNegocio,
            @PathVariable String NombreRdn,
            @PathVariable Integer TipoEva,
            @PathVariable String Nombreempresa,
            @PathVariable String Nit,
            @PathVariable Integer IdTipoPerfil,
            @PathVariable Integer IdEvaluacion) {
        return serviceCReporteEvaEncService.ReporteEvaEncService(Bandera, IdRuedaNegocio,
                NombreRdn, TipoEva, Nombreempresa, Nit, IdTipoPerfil, IdEvaluacion);
    }
    
    @GetMapping("/reporteevapreguntas/{Bandera}/{IdEvaluacion}")
    public List<CRepEvaPreguntasEntity> ReporteEvaPreguntas(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdEvaluacion) {
        return serviceCRepEvaPreguntasService.ConsultaRepEvaPreguntas(Bandera, IdEvaluacion);
    }
    
    @GetMapping("/reportereprespuestas/{Bandera}/{IdEvaluacion}/{IdContacto}")
    public List<CRepRespuestasEntity> ReporteRepRespuestas(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdEvaluacion,
            @PathVariable Integer IdContacto) {
        return serviceCRepRespuestasService.ConsultaRepRespuestas(Bandera,
                IdEvaluacion, IdContacto);
    }
    
    @GetMapping("/reportesectorcatsub/{Bandera}/{IdSector}/{IdCategoria}/{IdSubCategoria}/{NombreSector}/{NombreCategoria}/{NombreSubCategoria}/{IdRueda}/{IdPerfil}")
    public List<CReporteSectorCatSubEntity> ReporteSecCatSub(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdSector,
            @PathVariable Integer IdCategoria,
            @PathVariable Integer IdSubCategoria,
            @PathVariable String NombreSector,
            @PathVariable String NombreCategoria,
            @PathVariable String NombreSubCategoria,
            @PathVariable Integer IdRueda,
            @PathVariable Integer IdPerfil) {
        return serviceCReporteSectorCatSubService.ReporteSectorCatSub(Bandera, IdSector, IdCategoria, IdSubCategoria,
                NombreSector, NombreCategoria, NombreSubCategoria, IdRueda, IdPerfil);
    }
    
    @GetMapping("/reporteparticipante/{Bandera}/{IdParticipante}/{NombreParticipante}/{IdPerfil}/{NombreRdn}/{FechaRegistro}/{IdRdn}")
    public List<CReporteParticipanteEntity> ReportePartticipante(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdParticipante,
            @PathVariable String NombreParticipante,
            @PathVariable Integer IdPerfil,
            @PathVariable String NombreRdn,
            @PathVariable String FechaRegistro,
            @PathVariable Integer IdRdn) {
        return serviceCReporteParticipanteService.ConsultaReporteParticipante(Bandera, IdParticipante,
                NombreParticipante, IdPerfil, NombreRdn, FechaRegistro, IdRdn);
    }
    
    @GetMapping("/reportedatostablerobb/{Bandera}/{IdCaja}/{IdTipoGrupo}")
    public List<CDatosTableroPPEntity> ReporteDatosTableroPP(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdCaja,
            @PathVariable Integer IdTipoGrupo) {
        return serviceCDatosTableroPPService.ConsultaDatosTableroPP(Bandera, IdCaja, IdTipoGrupo);
    }
    
    @GetMapping("/consultaclistaparticipantesrdn/{Bandera}/{IdRueda}/{IdParticipante}/{NombreEmpresa}/{Nit}/{IdPerfil}")
    public List<CListaParticipantesRDNEntity> ReporteCListaParticipantesRDN(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRueda,
            @PathVariable Integer IdParticipante,
            @PathVariable String NombreEmpresa,
            @PathVariable String Nit,
            @PathVariable Integer IdPerfil) {
        return serviceCListaParticipantesRDNService.ConsultaCListaParticipantesRDN(Bandera, IdRueda, IdParticipante, NombreEmpresa, Nit, IdPerfil);
    }
    
    @GetMapping("/consultaresgistrocontdoc/{Bandera}/{IdParticipante}/{NoIdentificacion}/{IdIdentificacion}/{IdRuedaNegocio}")
    public List<PRegistroContactoDocEntity> ReportePRegistroContactoDoc(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdParticipante,
            @PathVariable String NoIdentificacion,
            @PathVariable String IdIdentificacion,
            @PathVariable Integer IdRuedaNegocio) {
        return servicePRegistroContactoDocService.ConsultaPRegistroContactoDoc(Bandera, IdParticipante, NoIdentificacion, IdIdentificacion, IdRuedaNegocio);
    }
    
    @PostMapping("/insertarpreguntasegen/{Bandera}/{IdUsuario}")
    public String InsertarPreguntaSegEn(
            @RequestBody PRespuestaPreguntasSegEnEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return servicePRespuestaPreguntasSegEnService.InsertarPreguntaSegEn(entidad, Bandera, IdUsuario);
    }
    
    @PutMapping("/actualizapreguntasegen/{Bandera}/{IdUsuario}")
    public String ActualizarPreguntaSegEn(
            @RequestBody PRespuestaPreguntasSegEnEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return servicePRespuestaPreguntasSegEnService.ActualizarPreguntaSegEn(entidad, Bandera, IdUsuario);
    }
    
    @GetMapping("/consultavalidardncontservices/{Bandera}/{IdRdn}/{IdContacto}")
    public String ConsultaValidaRdnContactoServices(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRdn,
            @PathVariable Integer IdContacto) {
        return servicePValidaRdnContactoService.ConsultaValidaRdnContactoServices(Bandera, IdRdn, IdContacto);
    }
    
    @GetMapping("/consultapresppregsegen/{Bandera}/{Idioma}/{IdEvaluacion}/{IdRdn}/{IdTipoPerfil}/{IdParticipante}/{Participante}/{IdContacto}/{IdPregunta}")
    public List<PRespPregSegEnEntity> ConsultaPRespPregSegEn(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdEvaluacion,
            @PathVariable Integer IdRdn,
            @PathVariable Integer IdTipoPerfil,
            @PathVariable Integer IdParticipante,
            @PathVariable String Participante,
            @PathVariable Integer IdContacto,
            @PathVariable Integer IdPregunta) {
        return servicePRespPregSegEnService.ConsultaPRespPregSegEn(Bandera, Idioma, IdEvaluacion, IdRdn, IdTipoPerfil, IdParticipante, Participante, IdContacto, IdPregunta);
    }
    
    @GetMapping("/consultapcuentanotifica/{IdContacto}")
    public String ConsultaPCuentaNotifica(
            @PathVariable Integer IdContacto) {
        return servicePCuentaNotificaService.ConsultaPCuentaNotifica(IdContacto);
    }
    
    @GetMapping("/consultacevaluacioncons/{Bandera}/{Idioma}/{RuedaNegocio}/{TipoPerfil}/{Nombre}/{TipoEva}/{IdEvaluacion}")
    public List<CEvaluacionConsEntity> ConsultaCEvaluacionCons(
            @PathVariable Integer Bandera,
            @PathVariable String Idioma,
            @PathVariable Integer RuedaNegocio,
            @PathVariable Integer TipoPerfil,
            @PathVariable String Nombre,
            @PathVariable Integer TipoEva,
            @PathVariable Integer IdEvaluacion) {
        return serviceCEvaluacionConsService.ConsultaCEvaluacionCons(Bandera, Idioma, RuedaNegocio, TipoPerfil, Nombre, TipoEva, IdEvaluacion);
    }
    
    @GetMapping("/consultapcontactochat/{Bandera}/{IdRdn}/{IdContactoS}")
    public List<PConsultaContactoChatEntity> ConsultaPContactoChat(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRdn,
            @PathVariable Integer IdContactoS) {
        return servicePConsultaContactoChatService.ConsultaPContactoChat(Bandera, IdRdn, IdContactoS);
    }
    
    @GetMapping("/consultapchat/{Bandera}/{IdContactoS}/{IdContactoA}")
    public List<PConsultaChatEntity> ConsultaPChat(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdContactoS,
            @PathVariable Integer IdContactoA) {
        return servicePConsultaChatService.ConsultaPChat(Bandera, IdContactoS, IdContactoA);
    }
    
    @PostMapping("/insertarmesachat/{bandera}/{Estado}/{IdSala}")
    public String InsertarMesaChat(
            @RequestBody PMesaChatModEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable Integer Estado,
            @PathVariable Integer IdSala) {
        return servicePMesaChatModService.InsertarMesaChat(entidad, bandera, Estado, IdSala);
    }
    
    @PutMapping("/actualizamesachat/{bandera}/{Estado}/{IdSala}")
    public String ActualizarMesaChat(
            @RequestBody PMesaChatModEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable Integer Estado,
            @PathVariable Integer IdSala) {
        return servicePMesaChatModService.ActualizarMesaChat(entidad, bandera, Estado, IdSala);
    }
    
    @PostMapping("/insertarchatmensmod/{bandera}/{Id}")
    public String InsertarChatMensMod(
            @RequestBody PMesaChatMensModEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable Integer Id) {
        return servicePMesaChatMensModService.InsertarChatMensMod(entidad, bandera, Id);
    }
    
    @PutMapping("/actualizachatmensmod/{bandera}/{Id}")
    public String ActualizarChatMensMod(
            @RequestBody PMesaChatMensModEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable Integer Id) {
        return servicePMesaChatMensModService.ActualizarChatMensMod(entidad, bandera, Id);
    }
    
    @GetMapping("/consultareprespuestasgen/{Bandera}/{IdEvaluacion}/{IdContacto}/{IdRuedaNegocio}/{NombreRdn}/{TipoEva}/{Nombreempresa}/{Nit}/{IdTipoPerfil}")
    public List<CRepRespuestasGeneralEntity> ConsultaRepRespuestasGen(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdEvaluacion,
            @PathVariable Integer IdContacto,
            @PathVariable Integer IdRuedaNegocio,
            @PathVariable String NombreRdn,
            @PathVariable Integer TipoEva,
            @PathVariable String Nombreempresa,
            @PathVariable String Nit,
            @PathVariable Integer IdTipoPerfil) {
        return serviceCRepRespuestasGeneralService.ConsultaRepRespuestasGen(Bandera, IdEvaluacion, IdContacto, IdRuedaNegocio, NombreRdn, TipoEva, Nombreempresa, Nit, IdTipoPerfil);
    }
    
    @PostMapping("/insertarcchatmens/{bandera}")
    public String InsertarCChatMensMod(
            @RequestBody CChatMensModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCChatMensModService.InsertarCChatMensMod(entidad, bandera);
    }
    
    @PutMapping("/actualizacchatmens/{bandera}")
    public String ActualizarCChatMensMod(
            @RequestBody CChatMensModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCChatMensModService.ActualizarCChatMensMod(entidad, bandera);
    }
    
    @GetMapping("/consultachatmenscons/{Bandera}/{IdContactoC}/{IdContactoP}/{IdSoporte}/{Participante}/{NoDocPart}/{Usuario}/{Fecha}/{Estado}/{EstadoC}")
    public List<CChatMensConsEntity> ConsultaChatMensCons(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdContactoC,
            @PathVariable Integer IdContactoP,
            @PathVariable Integer IdSoporte,
            @PathVariable String Participante,
            @PathVariable String NoDocPart,
            @PathVariable String Usuario,
            @PathVariable String Fecha,
            @PathVariable Integer Estado,
            @PathVariable Integer EstadoC) {
        return serviceCChatMensConsService.ConsultaChatMensCons(Bandera, IdContactoC, IdContactoP, IdSoporte, Participante, NoDocPart, Usuario, Fecha, Estado, EstadoC);
    }
    
    @PutMapping("/actualizauditoriaserv/{Auditoria}")
    public String ActualizarAuditoriaServ(
            @RequestBody CActualizaAuditoriaEntity entidad,
            @PathVariable String Auditoria) {
        return serviceCActualizaAuditoriaService.ActualizarAuditoriaServ(entidad, Auditoria);
    }
    
    @GetMapping("/consultadefauditoria/{Bandera}/{Tabla}/{Auditada}/{Tipo}")
    public List<CDefinirAuditoriaEntity> ConsultaDefinirAuditoria(
            @PathVariable Integer Bandera,
            @PathVariable String Tabla,
            @PathVariable String Auditada,
            @PathVariable Integer Tipo) {
        return serviceCDefinirAuditoriaService.ConsultaDefinirAuditoria(Bandera, Tabla, Auditada, Tipo);
    }
    
    @GetMapping("/consultausuarioaudit/{Bandera}/{USUARIO}")
    public List<CListaUsuarioAuditoriaEntity> ConsultaUsuarioAudit(
            @PathVariable Integer Bandera,
            @PathVariable String USUARIO) {
        return serviceCListaUsuarioAuditoriaService.ConsultaUsuarioAudit(Bandera, USUARIO);
    }
    
    @PostMapping("/consultareporaudito/{ORIGEN}")
    public List<CReporteAuditoriaEntity> ConsultaReporteAuditoria(
            @RequestBody CReporteAuditoriaEntity entidad,
            @PathVariable String ORIGEN) {
        return serviceCReporteAuditoriaService.ConsultaReporteAuditoria(entidad, ORIGEN);
    }
    
    @GetMapping("/consterminopolit/{bandera}/{Idioma}/{IdRueda}/{IdParticipante}/{IdPerfil}")
    public List<PTerminoPoliticaEntity> ConsultaTerminoPolit(
            @PathVariable Integer bandera,
            @PathVariable String Idioma,
            @PathVariable Integer IdRueda,
            @PathVariable Integer IdParticipante,
            @PathVariable Integer IdPerfil) {
        return servicePTerminoPoliticaService.ConsultaTerminoPolit(bandera, Idioma, IdRueda, IdParticipante, IdPerfil);
    }
    
    @GetMapping("/conscuentachat/{IdContacto}")
    public String ConsultaCuentaChat(
            @PathVariable Integer IdContacto) {
        return servicePCuentaChatService.ConsultaCuentaChat(IdContacto);
    }
    
    @PostMapping("/reuniones")
    public String GenerarLinkMeet(@RequestBody meetwherebyEntity entidad) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setBearerAuth("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmFwcGVhci5pbiIsImF1ZCI6Imh0dHBzOi8vYXBpLmFwcGVhci5pbi92MSIsImV4cCI6OTAwNzE5OTI1NDc0MDk5MSwiaWF0IjoxNjQ2MTQyMDYyLCJvcmdhbml6YXRpb25JZCI6MTU0NDQ4LCJqdGkiOiI4ZGFjOTFkZi1kMzY2LTQ2ZWEtODJhZi1hY2QwZmYwNWViZTgifQ.oDssm1t-9MC-xCBroXHks_3KacTtWUvTJPlpDQF_Yss");
        HttpEntity<meetwherebyEntity> entity = new HttpEntity<meetwherebyEntity>(entidad, headers);
        RestTemplate rt = new RestTemplate();
        return rt.exchange(
                "https://api.whereby.dev/v1/meetings", HttpMethod.POST, entity, String.class).getBody();
    }
    
    @PutMapping("/actualizagendasalamod/{Bandera}")
    public String ActualizarAgendaSalaMod(
            @RequestBody PAgendaSalaModEntity entidad,
            @PathVariable Integer Bandera) {
        return servicePAgendaSalaModService.ActualizarAgendaSalaMod(entidad, Bandera);
    }
    
    @PostMapping("/consultapchat/{Bandera}/{Idioma}")
    public List<PChatEntity> ConsultaPChat(
            @RequestBody PChatEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String Idioma) {
        return servicePChatService.ConsultaPChat(entidad, Bandera, Idioma);
    }
    
    @GetMapping("/insertnotificacionescontact/{IdNotificacion}")
    public String InsertNotificacionContact(
            @PathVariable Integer IdNotificacion) {
        return serviceCNotificaContactoService.InsertNotificacionContact(IdNotificacion);
    }
    
    @GetMapping("/conscadminsalas/{Bandera}/{IdRuedaNegocio}")
    public List<CAdminSalasEntity> ConsultaCAdminSalas(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRuedaNegocio) {
        return serviceCAdminSalasService.ConsultaCAdminSalas(Bandera, IdRuedaNegocio);
    }
    
    @PostMapping("/insertacadminsalas/{Bandera}")
    public String InsertaAdminSalas(
            @RequestBody CAdminSalasModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCAdminSalasModService.InsertaAdminSalas(entidad, Bandera);
    }
    
    @PostMapping("/actualizacadminsalas/{Bandera}")
    public String ActualizaAdminSalas(
            @RequestBody CAdminSalasModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCAdminSalasModService.ActualizaAdminSalas(entidad, Bandera);
    }
    
    @PostMapping("/consrecupdatscontact/{Bandera}/{IdContacto}")
    public List<PRecuperaDatosContactoEntity> ConsultaRecupDatsContact(
            @RequestBody PRecuperaDatosContactoEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdContacto) {
        return servicePRecuperaDatosContactoService.ConsultaRecupDatsContact(entidad, Bandera, IdContacto);
    }
    
    @GetMapping("/conscadminsalaconf/{Bandera}/{IdRuedaNegocio}")
    public List<CAdminSalasConfigEntity> ConsultaCAdminSalaConf(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdRuedaNegocio) {
        return serviceCAdminSalasConfigService.ConsultaCAdminSalaConf(Bandera, IdRuedaNegocio);
    }
    
    @PostMapping("/consrecupdatuser/{Bandera}/{IdUsuario}")
    public List<CRecuperaDatosUsuarioEntity> ConsultaCRecDatosUser(
            @RequestBody CRecuperaDatosUsuarioEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return serviceCRecuperaDatosUsuarioService.ConsultaCRecDatosUser(entidad, Bandera, IdUsuario);
    }

    @PutMapping("/actualizatoken/{Bandera}")
    public String ActualizaToken(
            @RequestBody CActualizaTokenEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCActualizaTokenService.ActualizaToken(entidad, Bandera);
    }
}
