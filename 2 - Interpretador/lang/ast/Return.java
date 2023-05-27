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

import java.util.ArrayList;
import java.util.List;

import lang.ast.Expression;

import lang.interpreter.Visitor;

public class Return extends Command {
    /**
     * ---- Regra
     * cmd: RETURN exp (COMMA exp)* SEMI  # Return
    */

    private List<Expression> exps = new ArrayList<>();

    public Return (int line, int column, List<Expression> exps){
        super(line, column);
        this.exps = exps;
    }

    public List<Expression> getExps() {
        return exps;
    }

    public void setExps(List<Expression> exps){
        this.exps = exps;
    }

    @Override
    public String toString(){
        String s = "";
        for (Expression expression : exps) {
            s += expression.toString() + ", " ;
        }
        s = "return " + s;
        if(exps.size() > 0){
            s = s.substring(0, s.length() - 2);
        }
        s += ";";
        return s;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
}
