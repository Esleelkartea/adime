package net.idtoki.adimde.model.map;

import java.util.Date;
import java.math.BigDecimal;

import org.apache.torque.Torque;
import org.apache.torque.TorqueException;
import org.apache.torque.map.MapBuilder;
import org.apache.torque.map.DatabaseMap;
import org.apache.torque.map.TableMap;

/**
  *  This class was autogenerated by Torque on:
  *
  * [Tue Nov 14 13:12:16 CET 2006]
  *
  */
public class TurnosMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "net.idtoki.adimde.model.map.TurnosMapBuilder";


    /**
     * The database map.
     */
    private DatabaseMap dbMap = null;

    /**
     * Tells us if this DatabaseMapBuilder is built so that we
     * don't have to re-build it every time.
     *
     * @return true if this DatabaseMapBuilder is built
     */
    public boolean isBuilt()
    {
        return (dbMap != null);
    }

    /**
     * Gets the databasemap this map builder built.
     *
     * @return the databasemap
     */
    public DatabaseMap getDatabaseMap()
    {
        return this.dbMap;
    }

    /**
     * The doBuild() method builds the DatabaseMap
     *
     * @throws TorqueException
     */
    public void doBuild() throws TorqueException
    {
        dbMap = Torque.getDatabaseMap("ADIMDE-DB");

        dbMap.addTable("turnos");
        TableMap tMap = dbMap.getTable("turnos");

        tMap.setPrimaryKeyMethod(TableMap.NATIVE);

        // this might need upgrading based on what all the databases
        // need, but for now assume one parameter.
          tMap.setPrimaryKeyMethodInfo("turnos_idturno_seq");

              tMap.addPrimaryKey("turnos.IDTURNO", new Integer(0));
                    tMap.addColumn("turnos.DESCRIPCION", "");
          }
}
