/********************************************************
* Trabalho de Teoria dos Compiladores(DCC045)   *
*                                                       *
*        *
* Grupo

Nome: Ana Beatriz Kapps dos Reis
Matrícula: 201835006

Nome: Marluce Aparecida Vitor
Matrícula: 201935500
   *
*                                                       *
*********************************************************/
package lang.ast;

import lang.ast.LValue;
import lang.interpreter.Visitor;

public class DataAccess extends LValue{
    /**
     * ---- Regra
     * lValue: <assoc=left> lvalue DOT ID     # DataAccess
    */
    private LValue lvalue;
    private String id;              // Atributo do objeto
    private String dataId;          // Nome do objeto

    public DataAccess (int line, int column, LValue lvalue, String id, String dataId){
        super(line, column);
        this.lvalue = lvalue;
        this.id = id;
        this.dataId = dataId;
    }

    public LValue getLValue() {
        return lvalue;
    }

    public String getId() {
        return id;
    }

    public String getDataId() {
        return dataId;
    }

    @Override
    public String toString(){
        return lvalue.toString() + "." + id.toString();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
