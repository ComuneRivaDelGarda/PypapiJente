/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.axiastudio.pypapi.plugins.jente;

import it.arezzo.infor.jente.jfinanziaria.services.RichiestaGestioneProposte;
import it.arezzo.infor.jente.jfinanziaria.services.RispostaGestioneProposte;
import it.arezzo.infor.jente.jfinanziaria.services.JFinanziariaService;
import it.arezzo.infor.jente.jfinanziaria.services.JFinanziariaServices;
import it.arezzo.infor.jente.jfinanziaria.services.ChiaveBozzaOAtto;
import it.arezzo.infor.jente.jfinanziaria.services.BozzaOAtto;
import it.arezzo.infor.jente.jfinanziaria.services.Movimento;
import it.arezzo.infor.jente.jfinanziaria.services.BozzaInAtto;
import it.arezzo.infor.jente.jfinanziaria.services.RichiestaGestioneProposte.RichiestaEsisteBozzaOAtto;
import it.arezzo.infor.jente.jfinanziaria.services.RichiestaGestioneProposte.RichiestaElencoMovimenti;
import it.arezzo.infor.jente.jfinanziaria.services.RichiestaGestioneProposte.RichiestaInserimentoBozzaOAtto;
import it.arezzo.infor.jente.jfinanziaria.services.RichiestaGestioneProposte.RichiestaCancellazioneBozzaOAtto;
import it.arezzo.infor.jente.jfinanziaria.services.RichiestaGestioneProposte.RichiestaTrasformazioneBozzaInAtto;
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
    
    public Boolean chiamataRichiestaInserimentoBozzaOAtto(String bozzaOAtto, String organoSettore, String anno, String numero, String rProc, String dataBozzaOAtto){
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
            rec.getRichiestaInserimentoBozzaOAtto().getBozzaOAtto().setOggetto("Inserimento automatico: "+anno+" "+numero);
            rec.getRichiestaInserimentoBozzaOAtto().getBozzaOAtto().setValidoVariazioni("N");
            rec.getRichiestaInserimentoBozzaOAtto().getBozzaOAtto().setValidoImpegni("S");
            rec.getRichiestaInserimentoBozzaOAtto().getBozzaOAtto().setValidoAccertamenti("N");
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

    public Boolean chiamataRichiestaTrasformazioneBozzaInAtto(String bozzaOAtto, String organoSettore, String anno, String numero){
        try {
            RichiestaGestioneProposte rec = new RichiestaGestioneProposte();
            rec.setUserName("JENTE");
            rec.setTipo("TBA");
            rec.setRichiestaTrasformazioneBozzaInAtto(new RichiestaTrasformazioneBozzaInAtto());
            rec.getRichiestaTrasformazioneBozzaInAtto().setBozzaInAtto(new BozzaInAtto());
            rec.getRichiestaTrasformazioneBozzaInAtto().getBozzaInAtto().setOrganoSettoreBozza(organoSettore);
            rec.getRichiestaTrasformazioneBozzaInAtto().getBozzaInAtto().setAnnoBozza(anno);
            rec.getRichiestaTrasformazioneBozzaInAtto().getBozzaInAtto().setNumeroBozza(numero);
            rec.getRichiestaTrasformazioneBozzaInAtto().getBozzaInAtto().setOrganoSettoreAtto(organoSettore);
            rec.getRichiestaTrasformazioneBozzaInAtto().getBozzaInAtto().setAnnoAtto(anno);
            rec.getRichiestaTrasformazioneBozzaInAtto().getBozzaInAtto().setNumeroAtto(numero);
            rec.getRichiestaTrasformazioneBozzaInAtto().getBozzaInAtto().setDataAtto("31/12/2012");
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
