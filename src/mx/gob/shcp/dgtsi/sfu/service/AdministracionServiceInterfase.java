package mx.gob.shcp.dgtsi.sfu.service;

import java.util.List;

import mx.gob.shcp.dgtsi.sfu.proyectos.model.ClasifProyectoCat;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.TipoProyectoCat;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.UnidadMedidaCat;

public interface AdministracionServiceInterfase {

	List<ClasifProyectoCat> getClasificProyectos();

	List<TipoProyectoCat> getTiposProyecto();

	List<UnidadMedidaCat> getUnidadMedidas();

	boolean saveTipoProyecto(String desc);

	int getTipoProyectoByDesc(String desc);

	boolean removeTipoProyecto(int id);

	boolean editTipoProyecto(int id, String desc);

}
