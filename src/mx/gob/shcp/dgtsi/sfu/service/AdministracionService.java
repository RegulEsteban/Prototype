package mx.gob.shcp.dgtsi.sfu.service;

import java.util.ArrayList;
import java.util.List;

import mx.gob.shcp.dgtsi.sfu.proyectos.model.ClasifProyectoCat;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.ClasifProyectoCatExample;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.TipoProyectoCat;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.TipoProyectoCatExample;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.UnidadMedidaCat;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.UnidadMedidaCatExample;
import mx.gob.shcp.dgtsi.sfu.proyectos.repository.ClasifProyectoCatMapper;
import mx.gob.shcp.dgtsi.sfu.proyectos.repository.TipoProyectoCatMapper;
import mx.gob.shcp.dgtsi.sfu.proyectos.repository.UnidadMedidaCatMapper;

import org.springframework.beans.factory.annotation.Autowired;

public class AdministracionService implements AdministracionServiceInterfase {

	@Autowired
	private ClasifProyectoCatMapper clasifProyectoMapper;
	
	@Autowired
	private TipoProyectoCatMapper tiposProyectoMapper;
	
	@Autowired
	private UnidadMedidaCatMapper unidadMedidasMapper;
	
	@Override
	public List<ClasifProyectoCat> getClasificProyectos(){
		ClasifProyectoCatExample ex = new ClasifProyectoCatExample();
		ex.createCriteria();
		List<ClasifProyectoCat> lista = clasifProyectoMapper.selectByExample(ex); 
		return lista == null ? new ArrayList<ClasifProyectoCat>() : lista;
	}
	
	@Override
	public List<TipoProyectoCat> getTiposProyecto(){
		TipoProyectoCatExample ex = new TipoProyectoCatExample();
		ex.createCriteria();
		List<TipoProyectoCat> lista = tiposProyectoMapper.selectByExample(ex);
		return lista == null ? new ArrayList<TipoProyectoCat>() : lista;
	}
	
	
	@Override
	public List<UnidadMedidaCat> getUnidadMedidas(){
		UnidadMedidaCatExample ex = new UnidadMedidaCatExample();
		ex.createCriteria();
		List<UnidadMedidaCat> lista = unidadMedidasMapper.selectByExample(ex);
		return lista == null ? new ArrayList<UnidadMedidaCat>() : lista;
	}
	
	@Override
	public boolean saveTipoProyecto(String desc){
		TipoProyectoCat nuevoTipo = new TipoProyectoCat();
		nuevoTipo.setDescripcion(desc);
		
		if(tiposProyectoMapper.insert(nuevoTipo)==1){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public int getTipoProyectoByDesc(String desc){
		TipoProyectoCatExample ex = new TipoProyectoCatExample();
		ex.createCriteria().andDescripcionLike(desc);
		
		List<TipoProyectoCat> lista = tiposProyectoMapper.selectByExample(ex);
		if(lista != null && !lista.isEmpty()){
			return lista.get(0).getIdTipoProyecto();
		}
		return 0;
	}
	
	@Override
	public boolean removeTipoProyecto(int id){
		if(tiposProyectoMapper.deleteByPrimaryKey(new Integer(id))==1){
			return true;
		}
		return false;
	}
	
	@Override
	public boolean editTipoProyecto(int id, String desc){
		TipoProyectoCat obj = tiposProyectoMapper.selectByPrimaryKey(new Integer(id));
		if(obj!=null){
			obj.setDescripcion(desc);
			if(tiposProyectoMapper.updateByPrimaryKeySelective(obj)==1){
				return true;
			}
		}
		
		return false;
	}
}
