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

public class TypeChar extends Type{
    /**
     * ---- Regra
     * btype: CHAR_TYPE     # BTypeChar
    */

    public TypeChar(int line, int column){
        super(line, column);
    }    

    @Override
    public String toString(){
        return "Char";
    }

    @Override
    public void accept(Visitor v){ 
        v.visit(this);
    }
}
