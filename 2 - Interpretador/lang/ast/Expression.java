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

public abstract class Expression extends Node {
    // Classe abstrata para tratar os nós derivados de 'exp' na gramática
    // Utilizado também para expressões que trabalham com um operador e dois operandos   

    private Expression expression;

    public Expression(int line, int column) {
        super(line, column);
    }

    public Expression(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
}