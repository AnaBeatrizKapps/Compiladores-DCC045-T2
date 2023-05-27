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
public class TypeArray extends Type{
    /**
     * ---- Regra
     * type: type OPEN_BRACKET CLOSE_BRACKET   # TypeDeclaration   
     * -- tipo de array. Exemplo: Int[]
     */
    private Type type;

    public TypeArray(int line, int column, Type type) {
        super(line, column);
        this.type = type;
    }
    
    public Type getType() {
        return type;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return type.toString() + "[]";
    }
}
