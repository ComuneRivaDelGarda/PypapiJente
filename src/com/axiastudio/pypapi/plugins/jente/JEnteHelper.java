/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.axiastudio.pypapi.plugins.jente;

import com.axiastudio.pypapi.plugins.jente.webservices.RichiestaGestioneProposte;
import com.axiastudio.pypapi.plugins.jente.webservices.RispostaGestioneProposte;
import com.axiastudio.pypapi.plugins.jente.webservices.JFinanziariaService;
import com.axiastudio.pypapi.plugins.jente.webservices.JFinanziariaServices;
import com.axiastudio.pypapi.plugins.jente.webservices.ChiaveBozzaOAtto;
import com.axiastudio.pypapi.plugins.jente.webservices.BozzaOAtto;
import com.axiastudio.pypapi.plugins.jente.webservices.Movimento;
import com.axiastudio.pypapi.plugins.jente.webservices.BozzaInAtto;
import com.axiastudio.pypapi.plugins.jente.webservices.RichiestaGestioneProposte.RichiestaEsisteBozzaOAtto;
import com.axiastudio.pypapi.plugins.jente.webservices.RichiestaGestioneProposte.RichiestaElencoMovimenti;
import com.axiastudio.pypapi.plugins.jente.webservices.RichiestaGestioneProposte.RichiestaInserimentoBozzaOAtto;
import com.axiastudio.pypapi.plugins.jente.webservices.RichiestaGestioneProposte.RichiestaCancellazioneBozzaOAtto;
import com.axiastudio.pypapi.plugins.jente.webservices.RichiestaGestioneProposte.RichiestaTrasformazioneBozzaInAtto;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AXIA Studio (http://www.axiastudio.com)
 */
public class JEnteHelper {
    
    private final String utente;

    public JEnteHelper(String utente) {
        this.utente = utente;
    }
    
    private static RispostaGestioneProposte gestioneProposte(RichiestaGestioneProposte richiesta) {
        JFinanziariaService service = new JFinanziariaService();
        JFinanziariaServices port = service.getJFinanziariaPort();
        RispostaGestioneProposte res = null;
        try {
            res = port.gestioneProposte(richiesta);
        } catch (Exception ex) {
            Logger.getLogger(JEnteHelper.class.getName()).log(Level.SEVERE, "Connessione al web service jEnte fallita.");
        }
        return res;
    }

    public Boolean chiamataRichiestaEsisteBozzaOAtto(String bozzaOAtto, String organoSettore, String anno, String numero){
        try {
            RichiestaGestioneProposte rec = new RichiestaGestioneProposte();
            rec.setUserName("JENTE");
            rec.setTipo("EBOA");
            rec.setRichiestaEsisteBozzaOAtto(new RichiestaEsisteBozzaOAtto());
            rec.getRichiestaEsisteBozzaOAtto().setChiaveBozzaOAtto(new ChiaveBozzaOAtto());
            rec.getRichiestaEsisteBozzaOAtto().getChiaveBozzaOAtto().setBozzaOAtto(bozzaOAtto);
            rec.getRichiestaEsisteBozzaOAtto().getChiaveBozzaOAtto().setOrganoSettore(organoSettore);
            rec.getRichiestaEsisteBozzaOAtto().getChiaveBozzaOAtto().setAnno(anno);
            rec.getRichiestaEsisteBozzaOAtto().getChiaveBozzaOAtto().setNumero(numero);
            RispostaGestioneProposte res = JEnteHelper.gestioneProposte(rec);
            if (res.isOk()) {
                return res.getRispostaEsisteBozzaOAtto().isEsiste();
            } else {
                Logger.getLogger(JEnteHelper.class.getName()).log(Level.SEVERE, "Consultazione fallita: {0}", res.getMessage());
                if( res.getRispostaElencoMovimenti() != null ){
                    Logger.getLogger(JEnteHelper.class.getName()).log(Level.SEVERE, "Consultazione fallita: {0}", res.getRispostaElencoMovimenti().getMessage());
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(JEnteHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Boolean chiamataRichiestaCancellazioneBozzaOAtto(String bozzaOAtto, String organoSettore, String anno, String numero){
        try {
            RichiestaGestioneProposte rec = new RichiestaGestioneProposte();
            rec.setUserName("JENTE");
            rec.setTipo("CBOA");
            rec.setRichiestaCancellazioneBozzaOAtto(new RichiestaCancellazioneBozzaOAtto());
            rec.getRichiestaCancellazioneBozzaOAtto().setChiaveBozzaOAtto(new ChiaveBozzaOAtto());
            rec.getRichiestaCancellazioneBozzaOAtto().getChiaveBozzaOAtto().setBozzaOAtto(bozzaOAtto);
            rec.getRichiestaCancellazioneBozzaOAtto().getChiaveBozzaOAtto().setOrganoSettore(organoSettore);
            rec.getRichiestaCancellazioneBozzaOAtto().getChiaveBozzaOAtto().setAnno(anno);
            rec.getRichiestaCancellazioneBozzaOAtto().getChiaveBozzaOAtto().setNumero(numero);
            rec.getRichiestaCancellazioneBozzaOAtto().setCancellaProvvedimento("S");
            RispostaGestioneProposte res = JEnteHelper.gestioneProposte(rec);
            if (res.isOk()) {
                return true;
            } else {
                Logger.getLogger(JEnteHelper.class.getName()).log(Level.SEVERE, "Cancellazione fallita: {0}", res.getMessage());
            }
        } catch (Exception ex) {
            Logger.getLogger(JEnteHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Boolean chiamataRichiestaInserimentoBozzaOAtto(String bozzaOAtto, String organoSettore, String anno, String numero,
                                                          String oggetto, String rProc, String dataBozzaOAtto,
                                                          String validoImpegni, String validoAccertamenti){
        try {
            RichiestaGestioneProposte rec = new RichiestaGestioneProposte();
            rec.setUserName("JENTE");
            rec.setTipo("IBOA");
            rec.setRichiestaInserimentoBozzaOAtto(new RichiestaInserimentoBozzaOAtto());
            rec.getRichiestaInserimentoBozzaOAtto().setBozzaOAtto(new BozzaOAtto());
            rec.getRichiestaInserimentoBozzaOAtto().getBozzaOAtto().setBozzaOAtto(bozzaOAtto);
            rec.getRichiestaInserimentoBozzaOAtto().getBozzaOAtto().setOrganoSettore(organoSettore);
            rec.getRichiestaInserimentoBozzaOAtto().getBozzaOAtto().setAnno(anno);
            rec.getRichiestaInserimentoBozzaOAtto().getBozzaOAtto().setNumero(numero);
            rec.getRichiestaInserimentoBozzaOAtto().getBozzaOAtto().setData(dataBozzaOAtto);
//            rec.getRichiestaInserimentoBozzaOAtto().getBozzaOAtto().setOggetto("Inserimento automatico: "+anno+" "+numero);
            rec.getRichiestaInserimentoBozzaOAtto().getBozzaOAtto().setOggetto(oggetto);
            rec.getRichiestaInserimentoBozzaOAtto().getBozzaOAtto().setValidoVariazioni("N");
            rec.getRichiestaInserimentoBozzaOAtto().getBozzaOAtto().setValidoImpegni(validoImpegni);
            rec.getRichiestaInserimentoBozzaOAtto().getBozzaOAtto().setValidoAccertamenti(validoAccertamenti);
            rec.getRichiestaInserimentoBozzaOAtto().getBozzaOAtto().setValidoAssegnazioni("N");
            rec.getRichiestaInserimentoBozzaOAtto().getBozzaOAtto().setResponsabileProcedimento(rProc);
            RispostaGestioneProposte res = JEnteHelper.gestioneProposte(rec);
            if (res.isOk()) {
                return true;
            } else {
                Logger.getLogger(JEnteHelper.class.getName()).log(Level.SEVERE, "Inserimento fallito: {0}", res.getMessage());
            }
        } catch (Exception ex) {
            Logger.getLogger(JEnteHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean chiamataRichiestaTrasformazioneBozzaInAtto(String bozzaOAtto, String organoSettoreBozza, String annoBozza,
                                                              String numeroBozza, String organoSettoreAtto, String annoAtto,
                                                              String numeroAtto, String dataAtto){
        try {
            if ( dataAtto == null ) {
                dataAtto = "31/12/2012"; // TODO: data atto
            }
            RichiestaGestioneProposte rec = new RichiestaGestioneProposte();
            rec.setUserName("JENTE");
            rec.setTipo("TBA");
            rec.setRichiestaTrasformazioneBozzaInAtto(new RichiestaTrasformazioneBozzaInAtto());
            rec.getRichiestaTrasformazioneBozzaInAtto().setBozzaInAtto(new BozzaInAtto());
            rec.getRichiestaTrasformazioneBozzaInAtto().getBozzaInAtto().setOrganoSettoreBozza(organoSettoreBozza);
            rec.getRichiestaTrasformazioneBozzaInAtto().getBozzaInAtto().setAnnoBozza(annoBozza);
            rec.getRichiestaTrasformazioneBozzaInAtto().getBozzaInAtto().setNumeroBozza(numeroBozza);
            rec.getRichiestaTrasformazioneBozzaInAtto().getBozzaInAtto().setOrganoSettoreAtto(organoSettoreAtto);
            rec.getRichiestaTrasformazioneBozzaInAtto().getBozzaInAtto().setAnnoAtto(annoAtto);
            rec.getRichiestaTrasformazioneBozzaInAtto().getBozzaInAtto().setNumeroAtto(numeroAtto);
            rec.getRichiestaTrasformazioneBozzaInAtto().getBozzaInAtto().setDataAtto(dataAtto);
            RispostaGestioneProposte res = JEnteHelper.gestioneProposte(rec);
            if (res.isOk()) {
                return true;
            } else {
                Logger.getLogger(JEnteHelper.class.getName()).log(Level.SEVERE, "Trasformazione fallita: {0}", res.getMessage());
                return false;
            }
        } catch (Exception ex) {
            Logger.getLogger(JEnteHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    public Boolean chiamataModificaEsecutivitaAtto(String bozzaOAtto, String organoSettore, String anno, String numero, String dataEsecutività, String tipoEsecutività){
        try {
            RichiestaGestioneProposte rec = new RichiestaGestioneProposte();
            rec.setUserName("JENTE");
            rec.setTipo("MBOA");
            rec.setRichiestaModificaBozzaOAtto(new RichiestaGestioneProposte.RichiestaModificaBozzaOAtto());
            rec.getRichiestaModificaBozzaOAtto().setBozzaOAttoModificato(new BozzaOAtto());
            rec.getRichiestaModificaBozzaOAtto().getBozzaOAttoModificato().setOrganoSettore(organoSettore);
            rec.getRichiestaModificaBozzaOAtto().getBozzaOAttoModificato().setAnno(anno);
            rec.getRichiestaModificaBozzaOAtto().getBozzaOAttoModificato().setNumero(numero);
            rec.getRichiestaModificaBozzaOAtto().getBozzaOAttoModificato().setBozzaOAtto(bozzaOAtto);
            rec.getRichiestaModificaBozzaOAtto().getBozzaOAttoModificato().setDataEsecutivita(dataEsecutività);
            rec.getRichiestaModificaBozzaOAtto().getBozzaOAttoModificato().setTipoEsecutivita(tipoEsecutività);
            RispostaGestioneProposte res = JEnteHelper.gestioneProposte(rec);
            if (res.isOk()) {
                return true;
            } else {
                Logger.getLogger(JEnteHelper.class.getName()).log(Level.SEVERE, "Modifica fallita: {0}", res.getMessage());
                return false;
            }
        } catch (Exception ex) {
            Logger.getLogger(JEnteHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    public List<Movimento> chiamataRichiestaElencoMovimenti(String bozzaOAtto, String organoSettore, String anno, String numero){
        List<Movimento> movimenti=null;
        try {
            RichiestaGestioneProposte rec = new RichiestaGestioneProposte();
            rec.setUserName("JENTE");
            rec.setTipo("EM");
            rec.setRichiestaElencoMovimenti(new RichiestaElencoMovimenti());
            rec.getRichiestaElencoMovimenti().setChiaveBozzaOAtto(new ChiaveBozzaOAtto());
            rec.getRichiestaElencoMovimenti().getChiaveBozzaOAtto().setBozzaOAtto(bozzaOAtto);
            rec.getRichiestaElencoMovimenti().getChiaveBozzaOAtto().setOrganoSettore(organoSettore);
            rec.getRichiestaElencoMovimenti().getChiaveBozzaOAtto().setAnno(anno);
            rec.getRichiestaElencoMovimenti().getChiaveBozzaOAtto().setNumero(numero);
            RispostaGestioneProposte res = JEnteHelper.gestioneProposte(rec);
            if( res != null ){
                if ( res.isOk()) {
                    return res.getRispostaElencoMovimenti().getMovimento();
                } else {
                    Logger.getLogger(JEnteHelper.class.getName()).log(Level.SEVERE, "Consultazione fallita: {0}", res.getMessage());
                    if( res.getRispostaElencoMovimenti() != null ){
                        Logger.getLogger(JEnteHelper.class.getName()).log(Level.SEVERE, "Consultazione fallita: {0}", res.getRispostaElencoMovimenti().getMessage());
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(JEnteHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
