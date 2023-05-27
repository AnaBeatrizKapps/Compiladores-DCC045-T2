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

import lang.ast.Node;
import lang.ast.Type;
import lang.interpreter.Visitor;

public class Declaration extends Node{
    /*********************************************
     *              Regra                        *
     *      decl: ID DOUBLE_COLON type SEMI      *
     *                                           *
     * Armazena o id e o tipo da variavel        *
    **********************************************/
    String id;   // Nome da variavel
    Type type;   // Tipo da variavel: Int, Char, Bool,...

    public Declaration(int line, int column, String id, Type type){
        super(line, column);
        this.id = id;
        this.type = type;
    }

    public String getId(){
        return id;
    }

    public Type getType(){
        return type;
    }

    @Override
    public String toString(){
        return id.toString() + " :: " + type.toString() + "; ";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
