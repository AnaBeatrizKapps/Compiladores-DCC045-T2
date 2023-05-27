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

import lang.ast.Expression;
import lang.interpreter.Visitor;
public class Null extends Expression {
    /**
     * ---- Regra
     * sexp: NULL  # Null
     *
    */

    private String value = null;
    
    public Null (int line, int column){
        super(line, column);
    }

    public String getValue(){
        return value;
    }

    @Override
    public String toString(){
        //return "null";
        return value.toString();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
