package pe.edu.upeu.sysventas.model;

import lombok.Getter;
import lombok.Setter;
import pe.edu.upeu.sysventas.enums.TipoDocumento;
@Setter
@Getter
public class Cliente {
    String dniRuc;
    String nombres;
    String repLegal;
    String direccion;
    TipoDocumento tipoDocumento;
}
