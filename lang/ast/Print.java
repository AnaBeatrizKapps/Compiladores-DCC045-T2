/*

Grupo

Nome: Ana Beatriz Kapps dos Reis
Matrícula: 201835006

Nome: Marluce Aparecida Vitor
Matrícula: 201935500

*/
package lang.ast;

import lang.visitors.Visitor;

public class Print extends Cmd{

  private int line, column;
  private Expr exp;

  public Print(int line, int column, Expr exp) {
    this.line = line;
    this.column = column;
    this.exp = exp;
  }

  public int getLine() {
    return line;
  }

  public int getColumn() {
    return column;
  }

  public Expr getExpression() {
    return exp;
  }

  public void accept(Visitor v) { 
		v.visit(this); 
	}
}