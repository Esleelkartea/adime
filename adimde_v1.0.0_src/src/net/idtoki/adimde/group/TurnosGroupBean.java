package net.idtoki.adimde.group;

import net.idtoki.adimde.model.TurnosPeer;
import net.idtoki.adimde.model.Turnos;

/**
 * The skeleton for this class was autogenerated by Torque on:
 *
 * [Mon Oct 02 10:34:00 CEST 2006]
 *
 *  You should add additional methods to this class to meet the
 *  application requirements.  This class will only be generated as
 *  long as it does not already exist in the output directory.
 */
public class TurnosGroupBean
    extends net.idtoki.adimde.group.BaseTurnosGroupBean
{
  public TurnosGroupBean(){
        this.dbField = TurnosPeer.IDTURNO;
        
//podemos fijar el numero de elementos por pagina recogiendo el entero de un archivo de configuracion
//this.setNumeroElementosPorPagina(int);
//si no se utiliza this.setNumeroElementosPorPagina(); el numero por defecto es 10

  }
}


