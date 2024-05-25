
public class Builder_pesonal extends Personal implements builder{
    Personal personal = new Personal();
    public Builder_pesonal(){}

    @Override
    public void addNombre(String nombre){
        personal.nombre = nombre;
    }

    public void addDepartament(tipo_departamento departamento){
        personal.departamento = departamento;
    }

    public void addrespondePorEl(tipo_departamento estaAcargoDeEl){
        personal.estaAcargoDeEl = estaAcargoDeEl;
    }

    public Personal build(){
        return personal;
    }

}