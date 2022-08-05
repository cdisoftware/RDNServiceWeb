package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ListasDatosBancoEntity;
import com.cdi.com.Agroapoya2CDI.Services.ListasDatosBancoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ListasDatosBancoServiceImplementacion implements ListasDatosBancoService{
  @PersistenceContext
        private EntityManager repositorio;
    @Override
    public List<ListasDatosBancoEntity> ConsultaListasDatosBanco(Integer Bandera) {
     try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paT_ListasDatosBanco");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("Bandera", Bandera);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
}
