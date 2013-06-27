
package it.arezzo.infor.jente.jfinanziaria.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "JFinanziariaServices", targetNamespace = "http://infor.arezzo.it/jente/jfinanziaria/services")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface JFinanziariaServices {


    /**
     * 
     * @param richiesta
     * @return
     *     returns it.arezzo.infor.jente.jfinanziaria.services.RispostaGestioneProposte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "gestioneProposte", targetNamespace = "http://infor.arezzo.it/jente/jfinanziaria/services", className = "it.arezzo.infor.jente.jfinanziaria.services.GestioneProposte")
    @ResponseWrapper(localName = "gestioneProposteResponse", targetNamespace = "http://infor.arezzo.it/jente/jfinanziaria/services", className = "it.arezzo.infor.jente.jfinanziaria.services.GestioneProposteResponse")
    public RispostaGestioneProposte gestioneProposte(
        @WebParam(name = "richiesta", targetNamespace = "")
        RichiestaGestioneProposte richiesta);

}
