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

import lang.ast.Type;
import lang.interpreter.Visitor;

public class TypeFloat extends Type{
    /**
     * ---- Regra
     * btype: FLOAT_TYPE    # BTypeFloat
    */
    public TypeFloat(int line, int column){
        super(line, column);
    }    

    @Override
    public String toString(){
        return "Float";
    }

    @Override
    public void accept(Visitor v){ 
        v.visit(this);
    }
}
